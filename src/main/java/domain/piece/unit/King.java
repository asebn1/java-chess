package domain.piece.unit;

import static domain.utils.Direction.allDirections;

import domain.piece.property.PieceSymbol;
import domain.piece.property.Team;
import domain.utils.Direction;
import java.util.List;

public final class King extends SpecificMovablePiece {

    private static final List<Direction> directions;

    static {
        directions = allDirections();
    }

    public King(final Team Team) {
        super(Team, PieceSymbol.King);
    }

    @Override
    protected List<Direction> directions() {
        return directions;
    }
}
