package com.sparta.memoproject.dto;

import com.sparta.memoproject.model.Comment;
import com.sparta.memoproject.model.Memo;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class MemoSoloDto {

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private Long id;
    private String title;
    private String contents;
    private String memberName;
    private int commentCnt;
    private int heartCnt;

    private List<Comment> commentList;


    public MemoSoloDto(Memo memo){
        this.createdAt = memo.getCreatedAt();
        this.modifiedAt = memo.getModifiedAt();
        this.id = memo.getId();
        this.title = memo.getTitle();
        this.contents = memo.getContents();
        this.memberName = memo.getMemberName();
        this.commentCnt = memo.getCommentList().size();
        this.heartCnt = memo.getHeartList().size();
        this.commentList = memo.getCommentList();
    }
}
