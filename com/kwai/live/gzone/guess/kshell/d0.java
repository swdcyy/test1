package com.kwai.live.gzone.guess.kshell.d0;
import erd.g;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import com.kwai.live.gzone.guess.kshell.d0$a;
import android.content.Context;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import java.lang.Boolean;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import g9c.a;

public abstract class d0 implements g	// class@000d2e
{
    public final RecyclerView b;
    public final g c;
    public ClientContent$LiveStreamPackage d;
    public int e;
    public boolean f;
    public int g;
    public Activity h;
    public RecyclerView$r i;

    public void d0(Activity p0,RecyclerView p1,g p2,ClientContent$LiveStreamPackage p3){
       super();
       this.e = -1;
       this.i = new d0$a(this);
       this.h = p0;
       this.g = n.u(p1.getContext());
       this.b = p1;
       this.c = p2;
       this.d = p3;
       p1.addOnScrollListener(this.i);
    }
    public abstract boolean a(Object p0,int p1);
    public void accept(Object p0){
       d0 uod0 = d0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod0, "5")) {
       }else {
          int i = p0.intValue();
          if (i != 1) {
             if (i == 5 && !PatchProxy.applyVoid(null, this, uod0, "4")) {
                this.b.removeOnScrollListener(this.i);
             }
          }else {
             this.f = false;
             this.e = -1;
             this.c();
          }
       }
       return;
    }
    public abstract void b(Object p0,int p1);
    public void c(){
       int i1;
       boolean b1;
       d0 uod0 = d0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod0, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecyclerView$LayoutManager obj = PatchProxy.apply(objArray, this, uod0, "1");
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
                   int[] obj2 = PatchProxy.applyOneRefs(view, this, uod0, "2");
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
          int i2 = Math.min(Math.min(this.e, (this.b.getAdapter().getItemCount() - 1)), (list.size() - 1));
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
