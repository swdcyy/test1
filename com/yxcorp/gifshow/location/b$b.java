package com.yxcorp.gifshow.location.b$b;
import j2b.q;
import com.yxcorp.gifshow.location.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import ekd.m1;
import android.widget.ImageView;
import j2b.k;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public class b$b extends q	// class@001ae1
{
    public ImageView o;

    public void b$b(b p0){
       super(p0);
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       super.A();
       this.doBindView(this.y());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.o = m1.f(p0, 0x7f0a06d1);
       m1.a(p0, new k(this), R.id.item_root);
       return;
    }
    public void z(){
       b$b uob = b$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       super.z();
       if (TextUtils.isEmpty(this.l.getText()) && !PatchProxy.applyVoid(objArray, this, uob, "5")) {
          RelativeLayout$LayoutParams layoutParams = this.o.getLayoutParams();
          layoutParams.topMargin = 0;
          layoutParams.removeRule(10);
          layoutParams.addRule(15);
       }
       this.o.setVisibility(0);
       return;
    }
}
