package com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenSurfaceData;
import java.io.Serializable;
import cr5.a;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenSurfaceData$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import fr5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveFloatingScreenSurfaceData implements Serializable, a	// class@000b0c
{
    public int surfaceDecorTailHeight;
    public int surfaceDecorTailMarginStart;
    public CDNUrl[] surfaceDecorTailPicUrl;
    public int surfaceDecorTailResId;
    public int surfaceDecorTailWidth;
    public static final LiveFloatingScreenSurfaceData$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFloatingScreenSurfaceData.Companion = new LiveFloatingScreenSurfaceData$a(null);
    }
    public void LiveFloatingScreenSurfaceData(){
       super();
    }
    public final int getSurfaceDecorTailHeight(){
       return this.surfaceDecorTailHeight;
    }
    public final int getSurfaceDecorTailMarginStart(){
       return this.surfaceDecorTailMarginStart;
    }
    public final CDNUrl[] getSurfaceDecorTailPicUrl(){
       return this.surfaceDecorTailPicUrl;
    }
    public final int getSurfaceDecorTailResId(){
       return this.surfaceDecorTailResId;
    }
    public final int getSurfaceDecorTailWidth(){
       return this.surfaceDecorTailWidth;
    }
    public void registerResourceToPreload(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenSurfaceData.class, "1")) {
          return;
       }
       a.p(p0, "preload");
       LiveFloatingScreenSurfaceData tsurfaceDeco = this.surfaceDecorTailPicUrl;
       int i = 0;
       if (tsurfaceDeco != null) {
          int i1 = (!tsurfaceDeco.length)? 1: 0;
          if (!i1) {
          label_001f :
             if (!i) {
                p0.b(tsurfaceDeco);
             }
             return;
          }
       }
       i = 1;
       goto label_001f ;
    }
    public final void setSurfaceDecorTailHeight(int p0){
       this.surfaceDecorTailHeight = p0;
    }
    public final void setSurfaceDecorTailMarginStart(int p0){
       this.surfaceDecorTailMarginStart = p0;
    }
    public final void setSurfaceDecorTailPicUrl(CDNUrl[] p0){
       this.surfaceDecorTailPicUrl = p0;
    }
    public final void setSurfaceDecorTailResId(int p0){
       this.surfaceDecorTailResId = p0;
    }
    public final void setSurfaceDecorTailWidth(int p0){
       this.surfaceDecorTailWidth = p0;
    }
}
