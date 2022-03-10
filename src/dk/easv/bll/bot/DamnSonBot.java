package dk.easv.bll.bot;

import dk.easv.bll.game.IGameState;
import dk.easv.bll.move.IMove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DamnSonBot implements  IBot{
    private static final String BOTNAME="IBreakTheGame";

    @Override public IMove doMove(IGameState state)
    {
        List<IMove> miniBoardMoves = state.getField().getAvailableMoves();
        return miniBoardMoves.get(0);
    }

    @Override public String getBotName()
    {
        return BOTNAME;
    }
}
