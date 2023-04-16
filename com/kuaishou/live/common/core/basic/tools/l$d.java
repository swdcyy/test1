package com.kuaishou.live.common.core.basic.tools.l$d;
import ub.a;
import msd.l;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.graphics.drawable.Animatable;
import bd.f;
import hc.a;

public class l$d extends a	// class@000efc
{
    public final l b;
    public final Runnable c;

    public void l$d(l p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l$d.class, "2")) {
          return;
       }
       b.B(LiveLogTag.LIVE_ERROR_LOG_TAG, "loading failed when binding controlFile webp");
       l$d tc = this.c;
       if (tc != null) {
          tc.run();
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l$d.class, "1")) {
       }else if(p2 instanceof a){
          l$d tb = this.b;
          if (tb != null) {
             tb.invoke(p2);
          }
       }
       return;
    }
}
