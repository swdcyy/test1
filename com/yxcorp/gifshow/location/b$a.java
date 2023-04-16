package com.yxcorp.gifshow.location.b$a;
import ml8.d;
import y8c.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import ekd.m1;
import android.widget.TextView;
import j2b.j;
import android.view.View$OnClickListener;

public class b$a extends r implements d	// class@001ae0
{
    public TextView i;
    public TextView j;

    public void b$a(){
       super();
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       this.doBindView(this.y());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.j = m1.f(p0, 0x7f0a0198);
       this.i = m1.f(p0, 0x7f0a2d1e);
       m1.a(p0, new j(this), R.id.item_root);
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "3")) {
          return;
       }
       this.j.setVisibility(8);
       this.i.setVisibility(0);
       this.i.setText(R.string.arg_RES_7f104767);
       return;
    }
}
