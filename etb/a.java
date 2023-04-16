package etb.a;
import k07.h;
import etb.b;
import java.lang.Object;
import com.kwai.library.widget.popup.bubble.a;
import android.view.View;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import ctb.f;
import java.util.List;
import ctb.g;
import htb.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import lnc.i3;
import java.lang.Number;
import k2b.h;
import k2b.e0;

public final class a implements h	// class@0027e7
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(a p0,View p1,int p2){
       a ta = this.a;
       Objects.requireNonNull(ta);
       p0.o();
       ta.P8(p2);
       b q = ta.q;
       b p = ta.p;
       f mTabId = p.mTabId;
       g mMenuId = p.mTabMenus.get(p2).mMenuId;
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(q, Long.valueOf(mTabId), Long.valueOf(mMenuId), null, c.class, "10")) {
          i3 oi3 = i3.f();
          oi3.c("tab_id", Long.valueOf(mTabId));
          oi3.c("menu_id", Long.valueOf(mMenuId));
          String str = oi3.e();
          h oh = h.m(null, "NOTIFICATION_BOX_LIST_TAB_MENU");
          oh.n(str);
          oh.i(q);
       }
       return;
    }
}
