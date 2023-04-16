package com.yxcorp.gifshow.comment.common.c$a;
import android.view.ViewStub;
import java.lang.Object;
import com.yxcorp.gifshow.comment.common.c$a$a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import java.util.List;
import java.lang.Runnable;

public class c$a	// class@0010a2
{
    public final ViewStub a;
    public final c$a$a b;
    public final List c;
    public int d;

    public void c$a(ViewStub p0){
       super();
       this.b = new c$a$a();
       this.c = new ArrayList();
       this.d = Integer.MIN_VALUE;
       this.a = p0;
    }
    public void a(c$a$a p0,int p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       if (!p1 && (!PatchProxy.applyVoid(null, this, uoa, "2") && this.b.a() == null)) {
          this.b.b(this.a.inflate());
          this.b(this.b.a());
          if (this.d != Integer.MIN_VALUE) {
             this.b.a().getLayoutParams().height = this.d;
          }
          this.b.a().requestLayout();
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
          }
       }
       if (p0.a() != null) {
          p0.a().setVisibility(p1);
       }
       return;
    }
    public void b(View p0){
    }
    public void c(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "4")) {
          return;
       }
       if (this.b.a() == null) {
          this.c.add(p0);
       }else {
          p0.run();
       }
       return;
    }
    public void d(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0 == this.d) {
          return;
       }
       this.d = p0;
       if (this.b.a() != null && this.b.a().getVisibility() != 8) {
          this.b.a().getLayoutParams().height = p0;
          this.b.a().requestLayout();
       }
       return;
    }
}
