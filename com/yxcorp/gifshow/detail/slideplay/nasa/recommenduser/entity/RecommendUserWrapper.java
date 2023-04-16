package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserWrapper;
import java.io.Serializable;
import java.lang.Object;

public class RecommendUserWrapper implements Serializable	// class@001763
{
    public QPhoto mFeed;
    public boolean mShowed;
    public User mUser;
    public static final long serialVersionUID = 0x3957d39bc58758f7;

    public void RecommendUserWrapper(){
       super();
    }
    public boolean isShowed(){
       return this.mShowed;
    }
    public void setShowed(boolean p0){
       this.mShowed = p0;
    }
}
