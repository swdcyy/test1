package ek2.b0;
import android.view.View$OnClickListener;
import ek2.a0;
import com.kuaishou.live.core.show.stayinfo.StayInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.stayinfo.Content;
import com.kuaishou.live.core.show.stayinfo.ActionButton;
import kotlin.jvm.internal.a;
import t02.a0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public final class b0 implements View$OnClickListener	// class@002743
{
    public final a0 b;
    public final StayInfo c;
    public final View$OnClickListener d;
    public final View$OnClickListener e;

    public void b0(a0 p0,StayInfo p1,View$OnClickListener p2,View$OnClickListener p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b0.class, "1")) {
          return;
       }
       this.d.onClick(p0);
       String str = this.c.b().a().a();
       if (str != null) {
          a0 l = this.b.L;
          if (l == null) {
             a.S("mLivePlayCallerContext");
          }
          l.p2.r4(str, this.b.getContext());
       }
       PatchProxy.onMethodExit(b0.class, "1");
       return;
    }
}
