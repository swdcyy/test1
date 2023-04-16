package com.kuaishou.commercial.photoreduce.g$f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.photoreduce.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.photoreduce.a$a;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import im8.f;
import java.lang.Integer;
import java.util.List;
import android.view.View;
import ekd.m1;
import ky.q0;
import android.view.View$OnClickListener;

public class g$f extends PresenterV2	// class@00152d
{
    public a$a p;
    public f q;
    public a$a r;
    public TextView s;
    public final g t;

    public void g$f(g p0){
       this.t = p0;
       super();
    }
    public void E8(){
       g$f uof = g$f.class;
       if (PatchProxy.applyVoid(null, this, uof, "3")) {
          return;
       }
       this.s.setText(TextUtils.I(this.r.b));
       int i = this.q.get().intValue();
       int i1 = this.p.i.size();
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), this, uof, "5")) {
          if (i == (i1 - 1)) {
             this.s.setBackgroundResource(R.drawable.arg_RES_7f081aee);
          }else {
             this.s.setBackgroundResource(R.drawable.arg_RES_7f081aef);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$f.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3430);
       m1.a(p0, new q0(this), R.id.reason);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g$f.class, "1")) {
          return;
       }
       this.p = this.r8("PHOTO_REDUCE_FIRST_REASON");
       this.q = this.x8("ADAPTER_POSITION");
       this.r = this.q8(a$a.class);
       return;
    }
}
