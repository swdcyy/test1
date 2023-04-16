package cf4.a;
import ye4.c;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import android.content.Context;
import android.view.View;
import xm4.a;
import ssd.e;
import ssd.f;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import cf4.a$a;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;

public abstract class a extends c	// class@000500
{
    public SelectShapeConstraintLayout e;
    public Activity f;

    public void a(Activity p0){
       super(p0);
       this.f = p0;
    }
    public final void b(Object p0){
       View view1;
       ConstraintLayout$LayoutParams layoutParams1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a te = this.e;
       if (te == null) {
          a.S("mBorderContainer");
       }
       te.removeAllViews();
       p0 = this.j(p0);
       if (p0 != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          int i = 0;
          boolean b = true;
          while (iterator.hasNext()) {
             View view = a.a(this.f, this.i());
             int i1 = i + 100;
             view.setId(f.a(i1).l(100));
             this.l(i, view, iterator.next(), p0.size());
             a$a uoa = new a$a();
             uoa.a = view;
             uoa.b = new ConstraintLayout$LayoutParams(0, -2);
             if (p0.size() == b) {
                uoa.e(b);
                uoa.h(null);
                uoa.f(b);
                uoa.g(null);
                uArrayList.add(uoa);
                break ;
             }else if(!i){
                uoa.e(b);
                uoa.h(null);
             }else {
                int i2 = p0.size() - b;
                if (i != i2) {
                   b = false;
                }
                uoa.f(b);
                uoa.g(null);
                i2 = i - 1;
                if (i2 < uArrayList.size()) {
                   a$a uoa2 = uArrayList.get(i2);
                   uoa.h(uoa2.d());
                   uoa2.g(view);
                }
             }
             uArrayList.add(uoa);
             i = i + 1;
          }
          p0 = uArrayList.iterator();
          while (p0.hasNext()) {
             a$a uoa1 = p0.next();
             ConstraintLayout$LayoutParams layoutParams = uoa1.b();
             if (layoutParams != null) {
                layoutParams.F = 0x3f800000;
             }
             if (uArrayList.size() == b) {
                layoutParams = uoa1.b();
                if (layoutParams != null) {
                   layoutParams.q = 0;
                }
                layoutParams = uoa1.b();
                if (layoutParams != null) {
                   layoutParams.s = 0;
                }
             }else if(uoa1.e != null){
                layoutParams = uoa1.b();
                if (layoutParams != null) {
                   layoutParams.q = 0;
                }
                view1 = uoa1.a();
                if (view1 != null) {
                   layoutParams1 = uoa1.b();
                   if (layoutParams1 != null) {
                      layoutParams1.r = view1.getId();
                   }
                }
             }else if(uoa1.f != null){
                layoutParams = uoa1.b();
                if (layoutParams != null) {
                   layoutParams.s = 0;
                }
                view1 = uoa1.c();
                if (view1 != null) {
                   layoutParams1 = uoa1.b();
                   if (layoutParams1 != null) {
                      layoutParams1.p = view1.getId();
                   }
                }
             }else {
                view1 = uoa1.c();
                if (view1 != null) {
                   layoutParams1 = uoa1.b();
                   if (layoutParams1 != null) {
                      layoutParams1.p = view1.getId();
                   }
                }
                view1 = uoa1.a();
                if (view1 != null) {
                   layoutParams1 = uoa1.b();
                   if (layoutParams1 != null) {
                      layoutParams1.r = view1.getId();
                   }
                }
             }
          label_0143 :
             layoutParams = uoa1.b();
             if (layoutParams != null) {
                layoutParams.h = 0;
             }
             layoutParams = uoa1.b();
             if (layoutParams != null) {
                layoutParams.k = 0;
             }
             a te1 = this.e;
             if (te1 == null) {
                a.S("mBorderContainer");
             }
             te1.addView(uoa1.d(), uoa1.b());
          }
          this.k();
       }
       return;
    }
    public int c(){
       return 0x7f0d026b;
    }
    public void g(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.e = this.h(p0);
       return;
    }
    public SelectShapeConstraintLayout h(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m1.f(p0, 0x7f0a0384);
    }
    public abstract int i();
    public abstract List j(Object p0);
    public void k(){
    }
    public abstract void l(int p0,View p1,Object p2,int p3);
}
