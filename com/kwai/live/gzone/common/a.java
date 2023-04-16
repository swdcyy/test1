package com.kwai.live.gzone.common.a;
import erd.g;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import qvb.i;
import java.lang.Object;
import com.kwai.live.gzone.common.a$a;
import com.kwai.live.gzone.common.a$b;
import android.content.Context;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$r;
import qvb.a;
import qvb.q;
import y8c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.q;
import g9c.a;
import qvb.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import java.lang.Boolean;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import g9c.d;

public abstract class a implements g	// class@000cad
{
    public final RecyclerView b;
    public final g c;
    public final i d;
    public int e;
    public boolean f;
    public int g;
    public RecyclerView$r h;
    public q i;

    public void a(RecyclerView p0,g p1,i p2){
       super();
       this.e = -1;
       this.h = new a$a(this);
       this.i = new a$b(this);
       this.g = n.u(p0.getContext());
       this.b = p0;
       this.c = p1;
       this.d = p2;
       p0.addOnScrollListener(this.h);
       p2.h(this.i);
    }
    public abstract boolean a(Object p0,int p1);
    public void accept(Object p0){
       c a;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
       }else {
          a = p0.a;
          boolean b = true;
          if (a != b) {
             if (a != 4) {
                if (a != 5) {
                   if (a == 6 && (p0.b != null && !p0.c.g7().R0())) {
                      this.c();
                      this.e = -1;
                   }
                }else if(PatchProxy.applyVoid(null, this, uoa, "4")){
                   this.b.removeOnScrollListener(this.h);
                   this.d.f(this.i);
                }
             }else {
                this.f = b;
                this.c();
             }
          }else {
             this.f = false;
          }
       }
       return;
    }
    public abstract void b(Object p0,int p1);
    public void c(){
       int i1;
       boolean b1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecyclerView$LayoutManager obj = PatchProxy.apply(objArray, this, uoa, "1");
       int i = 0;
       boolean b = -1;
       if (obj != patchProxyRe) {
          i1 = obj.intValue();
       }else {
          obj = this.b.getLayoutManager();
          if (obj instanceof LinearLayoutManager) {
             int i3 = obj.c();
             while (i3 >= 0) {
                View view = obj.findViewByPosition(i3);
                if (view != null) {
                   int[] obj2 = PatchProxy.applyOneRefs(view, this, uoa, "2");
                   if (obj2 != patchProxyRe) {
                      b1 = obj2.booleanValue();
                   }else {
                      obj2 = new int[2];
                      view.getLocationOnScreen(obj2);
                      b1 = (this.g > obj2[1])? true: false;
                   }
                   if (b1) {
                      break ;
                   }
                }
                i3 = i3 - 1;
             }
             i1 = i3;
          }else {
             i1 = -1;
          }
       }
       i1 = Math.max(i1, this.e);
       this.e = i1;
       if (i1 != b && this.b.getAdapter() != null) {
          List list = this.c.Q0();
          int i2 = Math.min(this.e, (this.b.getAdapter().getItemCount() - 1));
          if (this.b.getAdapter() instanceof d) {
             i2 = i2 - this.b.getAdapter().b1();
          }
          i2 = Math.min(i2, (list.size() - 1));
          while (i <= i2) {
             Object obj1 = list.get(i);
             if (!this.a(obj1, i)) {
                this.b(obj1, i);
                this.d(obj1, i, 1);
             }
             i = i + 1;
          }
       }
       return;
    }
    public abstract void d(Object p0,int p1,boolean p2);
}
