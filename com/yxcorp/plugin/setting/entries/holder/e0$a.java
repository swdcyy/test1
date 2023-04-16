package com.yxcorp.plugin.setting.entries.holder.e0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.plugin.setting.entries.holder.e0$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.f3;
import lnc.i3;
import com.yxcorp.plugin.setting.entries.holder.e0;
import k2b.e0;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;

public final class e0$a extends PresenterV2	// class@00084e
{
    public final GifshowActivity p;
    public final j q;
    public TextView r;
    public final View$OnClickListener s;

    public void e0$a(GifshowActivity p0,j p1){
       super();
       this.s = new e0$a$a(this);
       this.p = p0;
       this.q = p1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e0$a.class, "2")) {
          return;
       }
       f3 uof3 = f3.l("3312936", "PHOTO_VIEW_RECORD_BUTTON");
       i3 oi3 = i3.f();
       String str = (e0.b())? "open": "close";
       oi3.d("status", str);
       uof3.m(oi3.e());
       uof3.h(this.p);
       this.r.setVisibility(0);
       j.d(this.r, e0.b());
       this.m8().setOnClickListener(this.s);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$a.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
