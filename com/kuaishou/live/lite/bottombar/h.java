package com.kuaishou.live.lite.bottombar.h;
import z1.a;
import com.kuaishou.live.lite.bottombar.i;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.live.lite.bottombar.i$a;
import i93.k;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;

public final class h implements a	// class@001ed2
{
    public final i a;

    public void h(i p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       h ta = this.a;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(ta);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), ta, oi, "3")) {
          if (b) {
             if (!PatchProxy.applyVoid(null, ta, oi, "4")) {
                if (ta.n == null) {
                   ta.n = new i$a(ta, new k(ta));
                }
                ta.j.a(ta.n);
             }
          }else if(PatchProxy.applyVoid(null, ta, oi, "5")){
             b = ta.n;
             if (b != null) {
                ta.j.c(b);
             }
          }
       }
       return;
    }
}
