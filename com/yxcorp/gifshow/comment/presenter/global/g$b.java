package com.yxcorp.gifshow.comment.presenter.global.g$b;
import qvb.q;
import com.yxcorp.gifshow.comment.presenter.global.g;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.comment.log.a;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import yk9.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.SystemClock;
import yk9.d;
import el9.d0;
import java.lang.Runnable;

public class g$b implements q	// class@0010f7
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(g$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, g$b.class, "1")) {
          return;
       }
       if (p0) {
          this.b.t.g();
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       g$b uob = g$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "2")) {
          return;
       }
       g$b tb = this.b;
       if (tb.y != null) {
          g t = tb.t;
          Objects.requireNonNull(t);
          if (!PatchProxy.applyVoid(null, t, a.class, "4")) {
             t.a.h0().getViewTreeObserver().addOnGlobalLayoutListener(new b(t));
          }
       }
       if (p0) {
          g$b tb1 = this.b;
          if (tb1.z - null > 0) {
             tb1.g = SystemClock.elapsedRealtime() - this.b.z;
          }
       }
       this.b.p.h0().postDelayed(new d0(this), 1000);
       return;
    }
}
