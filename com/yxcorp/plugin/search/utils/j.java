package com.yxcorp.plugin.search.utils.j;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import nfd.c0;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import java.lang.Object;
import nfd.e0;
import com.yxcorp.plugin.search.utils.j$a;
import com.yxcorp.plugin.search.utils.j$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$o;
import qvb.i;
import qvb.q;
import qvb.j;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import nfd.d0;
import erd.g;
import crd.b;
import java.lang.Runnable;
import ekd.k1;
import lnc.b9;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import g9c.d;
import java.lang.Math;
import g9c.a;
import java.util.Objects;
import s2b.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;

public class j	// class@0007a9
{
    public final RecyclerView a;
    public final g b;
    public RecyclerFragment c;
    public final BaseFragment d;
    public b e;
    public Runnable f;
    public c0 g;
    public int h;
    public RecyclerView$o i;
    public q j;

    public void j(RecyclerFragment p0,c0 p1,RecyclerView p2,g p3){
       super();
       this.f = new e0(this);
       this.h = -1;
       this.i = new j$a(this);
       this.j = new j$b(this);
       this.g = p1;
       this.a = p2;
       this.b = p3;
       this.c = p0;
       this.d = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.a.addOnChildAttachStateChangeListener(this.i);
       j tc = this.c;
       if (tc != null && tc.q() != null) {
          this.c.q().h(this.j);
       }
       this.e = this.d.m().subscribe(new d0(this));
       k1.r(this.f, 100);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.a.removeOnChildAttachStateChangeListener(this.i);
       j tc = this.c;
       if (tc != null && tc.q() != null) {
          this.c.q().f(this.j);
       }
       b9.a(this.e);
       k1.m(this.f);
       return;
    }
    public void c(){
       j obj;
       int i2;
       int i3;
       c0 uoc0 = c0.class;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "3")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, oj, "4")) {
          obj = this.a;
          if (obj != null && obj.getAdapter() != null) {
             RecyclerView$LayoutManager layoutManage = this.a.getLayoutManager();
             int i1 = -1;
             if (layoutManage instanceof GridLayoutManager) {
                i2 = layoutManage.c();
             }else if(layoutManage instanceof LinearLayoutManager){
                i2 = layoutManage.c();
             }else if(layoutManage instanceof StaggeredGridLayoutManager){
                int[] ointArray = layoutManage.findLastVisibleItemPositions(objArray);
                i3 = ointArray.length;
                j oj1 = -1;
                int i5 = 0;
                while (i5 < i3) {
                   int i6 = ointArray[i5];
                   if (i6 > oj1) {
                      oj1 = i6;
                   }
                   i5 = i5 + 1;
                }
                i2 = oj1;
             }else {
                i2 = -1;
             }
             i3 = (this.a.getAdapter() instanceof d)? this.a.getAdapter().b1(): 0;
             int i4 = Math.max(i2, this.h);
             this.h = i4;
             i3 = Math.min((i4 - i3), (this.b.getItemCount() + i1));
             this.h = i3;
             i2 = Math.max(i2, i3);
             this.h = i2;
             this.h = Math.min(i2, (this.b.getItemCount() + i1));
          }
       }
       if (PatchProxy.applyVoid(objArray, this, oj, "5") || (this.h < null || (this.a != null && this.b != null))) {
          while (i <= this.h) {
             obj = this.b.O0(i);
             if (!PatchProxy.applyVoidOneRefs(obj, this, oj, "6")) {
                j tg = this.g;
                Objects.requireNonNull(tg);
                if (!PatchProxy.applyVoidOneRefs(obj, tg, uoc0, "2") && tg.b(obj)) {
                   tg.a.add(obj);
                }
             }
             i = i + 1;
          }
       }
    label_00e2 :
       oj = this.g;
       Objects.requireNonNull(oj);
       if (!PatchProxy.applyVoid(objArray, oj, uoc0, "3")) {
          uoc0 = oj.a;
          _monitor_enter(uoc0);
          if (!q.f(oj.a)) {
             oj.a(new ArrayList(oj.a));
             oj.a.clear();
          }
          _monitor_exit(uoc0);
       }
       return;
    }
}
