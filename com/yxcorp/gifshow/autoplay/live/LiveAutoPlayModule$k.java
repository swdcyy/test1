package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$k;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u99.d;

public final class LiveAutoPlayModule$k implements g	// class@001c08
{
    public static final LiveAutoPlayModule$k b;

    static {
       LiveAutoPlayModule$k.b = new LiveAutoPlayModule$k();
    }
    public void LiveAutoPlayModule$k(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule$k.class, "1")) {
       }else if(p0 != null){
          d.a("LiveAutoPlayModule", "startInsertToStreamTimer error", p0);
       }
       return;
    }
}
