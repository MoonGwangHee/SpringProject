package wedatalab.bulletinboard.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wedatalab.bulletinboard.domain.Board;
import wedatalab.bulletinboard.mapper.BoardMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;

    public int boardCount() {
        return boardMapper.boardCount(); // 게시글 수 반환
    }

    public List<Board> boardList() {
        return boardMapper.getList();
    }

    public Board getBoard(Long boardId) {
        return boardMapper.getBoard(boardId);
    }

    @Transactional
    public void uploadBoard(Board board) {
        boardMapper.uploadBoard(board);
    }

    @Transactional
    public Object updateBoard(Board board) {
        return boardMapper.updateBoard(board);
    }

    @Transactional
    public void deleteBoard(Long boardId) {
        boardMapper.deleteBoard(boardId);
    }
}

