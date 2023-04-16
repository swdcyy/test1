package com.kuaishou.commercial.photoreduce.g$d;
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
import java.util.Collection;
import ekd.q;
import android.view.View;
import ekd.m1;
import ky.p0;
import android.view.View$OnClickListener;
import im8.f;

public class g$d extends PresenterV2	// class@00152b
{
    public a$a p;
    public f q;
    public View r;
    public DayNightCompatImageView s;
    public TextView t;
    public View u;
    public final g v;

    public void g$d(g p0){
       this.v = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g$d.class, "3")) {
          return;
       }
       this.s.setPlaceHolderImage(new ColorDrawable(a1.a(R.color.arg_RES_7f060bcc)));
       this.s.L(this.p.f);
       this.t.setText(TextUtils.I(this.p.b));
       g$d tu = this.u;
       int i = (q.f(this.p.i))? 8: 0;
       tu.setVisibility(i);
       this.r.setBackgroundResource(R.drawable.arg_RES_7f081aef);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$d.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a130c);
       this.u = m1.f(p0, 0x7f0a0239);
       this.r = m1.f(p0, 0x7f0a0945);
       this.t = m1.f(p0, 0x7f0a3430);
       m1.a(p0, new p0(this), R.id.content);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g$d.class, "1")) {
          return;
       }
       this.p = this.q8(a$a.class);
       this.q = this.x8("ADAPTER_POSITION");
       return;
    }
}
