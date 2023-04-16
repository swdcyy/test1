package com.kuaishou.live.core.voiceparty.micmanager.a$a;
import qvb.q;
import com.kuaishou.live.core.voiceparty.micmanager.a;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import g9c.d;
import ps2.j;
import android.view.View$OnClickListener;

public class a$a implements q	// class@00155d
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!q.f(this.b.p.q().getItems())) {
          a$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, a.class, "4")) {
             if (tb.q == null) {
                tb.q = a.i(tb.p.h0(), 0x7f0d0e4f);
             }
             if (!tb.p.ia().T0(tb.q)) {
                tb.q.setOnClickListener(new j(tb));
                tb.p.ia().L0(tb.q);
             }
          }
       }
       return;
    }
}
