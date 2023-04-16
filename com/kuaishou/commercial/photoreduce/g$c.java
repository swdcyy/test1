package com.kuaishou.commercial.photoreduce.g$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.photoreduce.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.commercial.photoreduce.a$a;
import com.kwai.framework.ui.daynight.DayNightCompatImageView;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import ky.o0;
import android.view.View$OnClickListener;
import im8.f;

public class g$c extends PresenterV2	// class@00152a
{
    public f p;
    public a$a q;
    public View r;
    public DayNightCompatImageView s;
    public TextView t;
    public TextView u;
    public ImageView v;
    public final g w;

    public void g$c(g p0){
       this.w = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g$c.class, "3")) {
          return;
       }
       this.s.setPlaceHolderImage(new ColorDrawable(a1.a(R.color.arg_RES_7f060bcc)));
       this.s.L(this.q.f);
       this.t.setText(TextUtils.I(this.q.b));
       int i = 0;
       if (TextUtils.x(this.q.c)) {
          this.u.setVisibility(8);
       }else {
          this.u.setVisibility(i);
          this.u.setText(TextUtils.I(this.q.c));
       }
       this.v.setVisibility(i);
       this.r.setBackgroundResource(R.drawable.arg_RES_7f081aef);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0945);
       this.v = m1.f(p0, 0x7f0a0239);
       this.s = m1.f(p0, 0x7f0a130c);
       this.t = m1.f(p0, 0x7f0a3430);
       this.u = m1.f(p0, 0x7f0a3bca);
       m1.a(p0, new o0(this), R.id.content);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g$c.class, "1")) {
          return;
       }
       this.q = this.q8(a$a.class);
       this.p = this.x8("ADAPTER_POSITION");
       return;
    }
}
