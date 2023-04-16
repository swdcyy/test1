package com.yxcorp.gifshow.media.util.g$b;
import java.lang.Object;
import com.yxcorp.gifshow.media.util.f;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class g$b	// class@001d25
{
    public int a;
    public int b;
    public float c;

    public void g$b(){
       super();
    }
    public void g$b(f p0){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VideoSimpleParam{mWidth="+this.a+", mHeight="+this.b+", mFPS="+this.c+'}';
    }
}
