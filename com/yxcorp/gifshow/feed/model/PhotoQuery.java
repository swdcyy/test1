package com.yxcorp.gifshow.feed.model.PhotoQuery;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public final class PhotoQuery implements Serializable	// class@000ffa
{
    public String mPhotoId;
    public String mServerExpTag;
    public static final long serialVersionUID = 0x35485f44d3b1b5ed;

    public void PhotoQuery(String p0,String p1){
       super();
       this.mPhotoId = p0;
       this.mServerExpTag = p1;
    }
}
