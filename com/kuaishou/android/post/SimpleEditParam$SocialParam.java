package com.kuaishou.android.post.SimpleEditParam$SocialParam;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class SimpleEditParam$SocialParam implements Serializable	// class@000ea8
{
    public final boolean mDualCamera;
    public final String title;
    public final Integer titleIcon;
    public static final long serialVersionUID = 0x248b9b3a16130019;

    public void SimpleEditParam$SocialParam(boolean p0,Integer p1,String p2){
       super();
       this.mDualCamera = p0;
       this.titleIcon = p1;
       this.title = p2;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SimpleEditParam$SocialParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SocialParam{mDualCamera="+this.mDualCamera+'}';
    }
}
