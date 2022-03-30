package domain.piece.unit;

import domain.piece.property.Team;
import domain.position.Position;
import domain.piece.property.Direction;
import java.util.List;

public interface Piece {

    boolean checkSameTeam(final Team Team);

    boolean availableMove(final Position source, final Position target);

    boolean isPawn();

    List<Position> calculateRoute(final Position target);

    String getSymbolByTeam();

    String symbol();

    List<Direction> getDirections();

    Direction getDirection(Position target);
}
