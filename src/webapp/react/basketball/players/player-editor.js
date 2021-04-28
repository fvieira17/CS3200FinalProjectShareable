import service from "./player-service.js"

const {useEffect,useState} = React
const {useParams} = ReactRouterDOM

const playerEditor = () => {
  const [player, setPlayer] = useState([])
  const {pid} = useParams()
  useEffect(()=> {
    service.findPlayerById(pid).then((player) => {
      setPlayer(player)
    })
  }, [])
  const updatePlayerFirstName = () => {
    service.updatePlayerFirstName(player.id, player.name)
  }
  const deletePlayer = () => {
    service.deletePlayer(player.id)
  }
  return (
      <div>
        <h2>Player Editor</h2>
        <label>ID</label>
        <input value={player.id} className="form-control"/>
        <label>Name</label>
        <input
            onChange={(e) => {
              const newValue = e.target.value
              setPlayer({...player,id: newValue})
            }}
            value={player.id} className="form-control"/>
        {JSON.stringify(player)}
        <button onClick={deletePlayer}>Delete</button>
        <button onClick={updatePlayerFirstName}>Save</button>
        <button>Create</button>
        <button>Cancel</button>
      </div>
  )
}

export default PlayerEditor;