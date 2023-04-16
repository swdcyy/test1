package com.kuaishou.android.live.doublelist.danmaku.LiveSimpleDanmakuView$a;
import android.view.Choreographer$FrameCallback;
import com.kuaishou.android.live.doublelist.danmaku.LiveSimpleDanmakuView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import android.widget.FrameLayout;
import android.view.Choreographer;

public class LiveSimpleDanmakuView$a implements Choreographer$FrameCallback	// class@0007c5
{
    public final LiveSimpleDanmakuView b;

    public void LiveSimpleDanmakuView$a(LiveSimpleDanmakuView p0){
       this.b = p0;
       super();
    }
    public void doFrame(long p0){
       if (PatchProxy.isSupport(LiveSimpleDanmakuView$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveSimpleDanmakuView$a.class, "1")) {
          return;
       }
       LiveSimpleDanmakuView$a tb = this.b;
       if (tb.j == null) {
          return;
       }
       if (tb.getChildCount() > 0) {
          this.b.c();
          this.b.h.postFrameCallback(this);
       }else {
          tb = this.b;
          if (tb.k != null) {
             tb.j();
          }else {
             tb.g();
          }
       }
       return;
    }
}
