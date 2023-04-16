package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$d;
import lr6.e;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.f;
import wq6.h;
import com.kwai.kcube.TabIdentifier;
import wq6.g;
import android.os.Handler;
import lr6.a;
import zq6.b;
import bo5.a;
import kotlin.jvm.internal.a;
import zq6.p;
import co5.g;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.bubble.a;
import java.lang.ref.WeakReference;
import com.kwai.library.widget.popup.common.c;

public final class a$d implements e	// class@001717
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$d.class, "1")) {
          return;
       }
       if (!a.R8(this.a).O(a.S8(this.a).M2())) {
          return;
       }
       this.a.y.removeMessages(1001);
       a$d ta = this.a;
       ta.x = a.P8(ta).k();
       this.a.y.sendEmptyMessageDelayed(1001, (long)100);
       p w = a.w;
       a.o(w, "HomeTopStateId.TAB_BUBBLE");
       g og = a.R8(this.a).y().e(a.S8(this.a), w);
       if (og != null) {
          Object obj = PatchProxy.apply(objArray, og, g.class, "3");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             og = og.j;
             if (og != null) {
                objArray = og.get();
             }
          }
       }
       if (objArray != null && objArray.K()) {
          objArray.o();
       }
       return;
    }
}
