package com.yxcorp.gifshow.model.Lyrics$Meta;
import java.io.Serializable;
import java.lang.Object;

public class Lyrics$Meta implements Serializable	// class@001e43
{
    public int mDuration;
    public int mStart;
    public final int mStartTextIndex;
    public static final long serialVersionUID = 0xa8947e908ae09561;

    public void Lyrics$Meta(int p0){
       super();
       this.mStartTextIndex = p0;
    }
    public Lyrics$Meta deepClone(){
       Lyrics$Meta meta = new Lyrics$Meta(this.mStartTextIndex);
       meta.mStart = this.mStart;
       meta.mDuration = this.mDuration;
       return meta;
    }
}
