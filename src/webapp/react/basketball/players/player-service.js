const PLAYER_URL = 'http://localhost:8080/api/players'

const findAllPlayers = () => {
  return fetch(PLAYER_URL).then((response) => {
    return response.json()
  })
}

const findPlayerById = (pid) => {
  return fetch('${PLAYER_URL}/${pid}').then((response) => {
    return response.json()
  })
}

const updatePlayer = (pid, newPlayerName) => {
  return fetch('${PLAYER_URL}/${pid}/name/${newPlayerName}').then(
      (response) => {
        return response.json()
      })
}

const deletePlayer = (pid) => {
  return fetch('${PLAYER_URL}/${pid}').then(
      (response) => {
        return response.json()
      })
}

export default  {
  findAllPlayers,
  findPlayerById,
  updatePlayer,
  deletePlayer
}