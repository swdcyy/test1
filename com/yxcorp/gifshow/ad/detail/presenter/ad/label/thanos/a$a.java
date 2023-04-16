package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.a$a;
import n49.o$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.a;
import java.lang.Object;
import n49.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.gifshow.ad.util.i;
import java.lang.CharSequence;
import java.lang.Long;
import g59.p;

public class a$a implements o$b	// class@0015ca
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       p.f(this);
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "3")) {
          return;
       }
       a$a ta = this.a;
       if (ta.z != null) {
          i.a(ta.r, ta.q, ta.P8());
       }else {
          ta.q.setText(ta.P8());
       }
       this.a.R8();
       return;
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.a.y = 100;
       this.b();
       return;
    }
    public void onPause(){
       p.b(this);
    }
    public void onProgress(long p0,long p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.y = (int)(p.a(p0, p1) * 100.00f);
       this.b();
       return;
    }
    public void onResume(){
       p.d(this);
    }
    public void onStart(){
       p.e(this);
    }
}
