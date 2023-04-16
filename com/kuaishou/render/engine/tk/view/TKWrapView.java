package com.kuaishou.render.engine.tk.view.TKWrapView;
import com.kuaishou.tachikoma.TKViewContainerWrapView;
import android.content.Context;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.kuaishou.render.engine.tk.view.TKWrapView$a;
import java.lang.Object;
import java.util.Objects;
import tx4.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import av4.a;
import com.kuaishou.tachikoma.TKViewContainerWrapView$b;
import java.lang.Throwable;
import tx4.w;
import java.lang.Runnable;
import sx4.e;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Boolean;
import av4.b;
import java.lang.Integer;

public class TKWrapView extends TKViewContainerWrapView	// class@000ef8
{
    public int g;
    public int h;
    public int i;
    public int j;
    public final List k;
    public String l;
    public String m;
    public Runnable n;
    public boolean o;
    public TKViewContainerWrapView$b p;

    public void TKWrapView(Context p0,String p1,String p2){
       super(p0);
       this.k = Collections.synchronizedList(new ArrayList());
       this.l = "";
       this.m = "";
       this.o = false;
       this.p = new TKWrapView$a(this);
       this.l = p2;
       this.m = p1;
    }
    public static void g(TKWrapView p0,Object[] p1){
       Objects.requireNonNull(p0);
       Object[] objArray = new Object[]{p1[0],p1[1]};
       super.setData(objArray);
    }
    public static void h(TKWrapView p0,String p1,String p2,h p3){
       super.b(p1, p2, p3);
    }
    public Object b(String p0,String p1,h p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TKWrapView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getChildCount()) {
          return super.b(p0, p1, p2);
       }
       this.k.add(new a(this, p0, p1, p2));
       this.f(this.p);
       return null;
    }
    public void d(Throwable p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKWrapView.class, "2")) {
          return;
       }
       super.d(p0, p1);
       this.i();
       TKWrapView tn = this.n;
       if (tn != null) {
          tn.run();
          this.n = null;
       }
       return;
    }
    public void e(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKWrapView.class, "1")) {
          return;
       }
       super.e(p0);
       this.i();
       if (this.getChildCount() > 0) {
          int i = 0;
          if (this.getChildAt(i) instanceof ViewGroup) {
             this.getChildAt(i).setClipChildren(i);
             this.getChildAt(i).setClipToPadding(i);
          }
       }
       TKWrapView tn = this.n;
       if (tn != null) {
          tn.run();
          this.n = null;
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, TKWrapView.class, "6")) {
          return;
       }
       if (this.getChildCount() > 0) {
          this.getChildAt(0).setPadding(this.g, this.h, this.i, this.j);
       }
       return;
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, TKWrapView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.c() && !this.a())? true: false;
       return b;
    }
    public void setData(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKWrapView.class, "3")) {
          return;
       }
       this.o = false;
       this.k.clear();
       this.k.add(new b(this, p0));
       if (this.c()) {
          this.o = true;
       }
       this.f(this.p);
       return;
    }
    public void setPadding(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKWrapView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKWrapView.class, "5")) {
          return;
       }
       this.g = p0;
       this.i = p2;
       this.h = p1;
       this.j = p3;
       this.i();
       return;
    }
}
