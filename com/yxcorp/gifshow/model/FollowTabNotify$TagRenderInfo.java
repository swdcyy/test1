package com.yxcorp.gifshow.model.FollowTabNotify$TagRenderInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.j$b;
import ok.j;

public class FollowTabNotify$TagRenderInfo implements Serializable, Cloneable	// class@001e19
{
    public int mHeight;
    public String mUrl;
    public int mWidth;
    public static final long serialVersionUID = 0x2976673fcb6edd73;

    public void FollowTabNotify$TagRenderInfo(){
       super();
    }
    public FollowTabNotify$TagRenderInfo clone(){
       FollowTabNotify$TagRenderInfo obj = PatchProxy.apply(null, this, FollowTabNotify$TagRenderInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FollowTabNotify$TagRenderInfo();
       obj.mUrl = this.mUrl;
       obj.mHeight = this.mHeight;
       obj.mWidth = this.mWidth;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, FollowTabNotify$TagRenderInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.c("mUrl", this.mUrl);
       obj.a("mWidth", this.mWidth);
       obj.a("mHeight", this.mHeight);
       return obj.toString();
    }
}
