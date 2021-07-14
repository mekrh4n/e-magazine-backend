package com.oftekfak.emagazine.model.post;

import com.oftekfak.emagazine.entity.AppUser;
import com.oftekfak.emagazine.entity.PostEntity;
import com.oftekfak.emagazine.utils.ObjectUtils;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PostModel {
    private Long postId;
    private Long userId;
    private String userName;
    private String fullName;
    private Long userProfilePic;
    private String title;
    private String content;
    private String picUrl;
    private int likeCount;
    private int commentCount;
    private List<CommentModel> comments;
    private Date createdDate;
    private Boolean isLiked;

    public PostModel() {
    }

    public PostModel(PostEntity postEntity) {
        if (Objects.nonNull(postEntity)) {
            postId = postEntity.getId();
            userId = postEntity.getUserId();
            title = postEntity.getTitle();
            content = postEntity.getContent();
            createdDate = postEntity.getCreatedAt();
        }
    }

    public PostModel(PostEntity postEntity, AppUser appUser) {
        if (Objects.nonNull(postEntity)) {
            postId = postEntity.getId();
            userId = postEntity.getUserId();
            title = postEntity.getTitle();
            content = postEntity.getContent();
            createdDate = postEntity.getCreatedAt();
        }

        if (Objects.nonNull(appUser)) {
            userId = appUser.getId();
            userName = appUser.getUsername();
            fullName = ObjectUtils.getFullNameFromAppUser(appUser);
        }
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getUserProfilePic() {
        return userProfilePic;
    }

    public void setUserProfilePic(Long userProfilePic) {
        this.userProfilePic = userProfilePic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public List<CommentModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentModel> comments) {
        this.comments = comments;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getLiked() {
        return isLiked;
    }

    public void setLiked(Boolean liked) {
        isLiked = liked;
    }
}
