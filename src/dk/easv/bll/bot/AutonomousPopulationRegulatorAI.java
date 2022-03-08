package dk.easv.bll.bot;

import dk.easv.bll.game.IGameState;
import dk.easv.bll.move.IMove;

public class AutonomousPopulationRegulatorAI implements IBot
{
    private static final String BOTNAME="Autonomous Population Regulator A.I.";

    @Override public IMove doMove(IGameState state)
    {
        return null;
    }

    @Override public String getBotName()
    {
        return BOTNAME;
    }
}
