package com.kwai.video.clipkit.utils.Lyrics$Meta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class Lyrics$Meta implements Serializable	// class@001af8
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
       Lyrics$Meta obj = PatchProxy.apply(null, this, Lyrics$Meta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Lyrics$Meta(this.mStartTextIndex);
       obj.mStart = this.mStart;
       obj.mDuration = this.mDuration;
       return obj;
    }
}
