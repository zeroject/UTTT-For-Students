package dk.easv.bll.bot;

import dk.easv.bll.game.IGameState;
import dk.easv.bll.move.IMove;

import java.util.List;

public class AutonomousPopulationRegulator implements IBot
{
    private static final String BOTNAME="Autonomous Population Regulator";

    @Override public IMove doMove(IGameState state)
    {
        return null;
    }

    @Override public String getBotName()
    {
        return BOTNAME;
    }
}
