package com.yxcorp.gifshow.log.realtime.CommentShow;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class CommentShow	// class@001b2a
{
    public byte[] content;
    public String expTag;
    public Long id;
    public String photoId;
    public String userId;

    public void CommentShow(){
       super();
    }
    public void CommentShow(Long p0){
       super();
       this.id = p0;
    }
    public void CommentShow(Long p0,String p1,String p2,String p3,byte[] p4){
       super();
       this.id = p0;
       this.expTag = p1;
       this.photoId = p2;
       this.userId = p3;
       this.content = p4;
    }
    public byte[] getContent(){
       return this.content;
    }
    public String getExpTag(){
       return this.expTag;
    }
    public Long getId(){
       return this.id;
    }
    public String getPhotoId(){
       return this.photoId;
    }
    public String getUserId(){
       return this.userId;
    }
    public void setContent(byte[] p0){
       this.content = p0;
    }
    public void setExpTag(String p0){
       this.expTag = p0;
    }
    public void setId(Long p0){
       this.id = p0;
    }
    public void setPhotoId(String p0){
       this.photoId = p0;
    }
    public void setUserId(String p0){
       this.userId = p0;
    }
}
