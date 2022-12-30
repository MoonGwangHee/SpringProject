package wedatalab.bulletinboard.mapper;

import org.springframework.stereotype.Repository;
import wedatalab.bulletinboard.domain.Board;

import java.util.List;

@Repository
public interface BoardMapper {

    int boardCount();
    List<Board> getList();

    Board getBoard(Long boardId);

    void uploadBoard(Board board);

    Object updateBoard(Board board);

    void deleteBoard(Long boardId);

}
