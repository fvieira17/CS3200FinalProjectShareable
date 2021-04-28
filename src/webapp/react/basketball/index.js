import PlayerList from "./players/player-list";
import PlayerEditor from "./players/player-editor"

const {HashRouter, Link, Route} = window.ReactRouterDOM;

const App = () => {
  return (
      <div className="container-fluid">
        <h1>Player Database</h1>
        <HashRouter>
          <Route path={["/players","/"]} exact={true}>
            <PlayerList/>
          </Route>
          <Route path="/players/:pid" exact={true}>
            <PlayerEditor/>
          </Route>
        </HashRouter>
      </div>
  );
}

export default App;