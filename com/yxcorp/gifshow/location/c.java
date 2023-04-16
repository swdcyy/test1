package com.yxcorp.gifshow.location.c;
import ml8.d;
import y8c.r;
import com.yxcorp.gifshow.location.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import j2b.p;
import android.view.View$OnClickListener;
import ekd.m1;

public class c extends r implements d	// class@001ae3
{
    public final b i;

    public void c(b p0){
       super();
       this.i = p0;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.doBindView(this.y());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       m1.a(p0, new p(this), R.id.item_root);
       return;
    }
}
