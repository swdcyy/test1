package com.kuaishou.live.livestage.h;
import ee3.h0;
import java.lang.Object;
import java.lang.String;
import fe3.a;
import com.kuaishou.live.livestage.VideoScaleMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class h implements h0	// class@000bef
{

    public void h(){
       super();
    }
    public VideoScaleMode a(String p0,a p1,a p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "windowSize");
       a.p(p2, "videoSize");
       return VideoScaleMode.CENTER_CROP;
    }
    public String toString(){
       return "ALL_CENTER_CROP";
    }
}
