package com.kwai.component.photo.reduce.m$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.reduce.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bg5.a;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import yf5.u1;
import android.view.View$OnClickListener;

public class m$b extends PresenterV2	// class@000af2
{
    public a p;
    public TextView q;
    public ImageView r;
    public final m s;

    public void m$b(m p0){
       this.s = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m$b.class, "3")) {
          return;
       }
       this.q.setText(this.p.c);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$b.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3435);
       this.r = m1.f(p0, 0x7f0a06ca);
       m1.a(p0, new u1(this), R.id.reduce_reason_root);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m$b.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       return;
    }
}
