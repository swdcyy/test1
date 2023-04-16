package com.yxcorp.gifshow.prettify.body.ui.a$d;
import a17.b$b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.prettify.body.ui.a;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingPanelItem;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import y0c.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import y0c.f$a;
import java.lang.NullPointerException;

public final class a$d implements b$b	// class@00113c
{
    public final FragmentActivity a;
    public final a b;
    public final int c;
    public final BodySlimmingPanelItem d;

    public void a$d(FragmentActivity p0,a p1,int p2,BodySlimmingPanelItem p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(c p0,View p1,int p2){
       f$a a;
       if (PatchProxy.isSupport2(a$d.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, a$d.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       a = f.a;
       a$d ta = this.a;
       if (ta != null) {
          a.b(ta, "confirm");
          this.b.J0(this.c, this.d);
          PatchProxy.onMethodExit(a$d.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(a$d.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       }
    }
}
