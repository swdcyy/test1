package com.yxcorp.gifshow.homepage.kcube.presenter.a$b;
import lr6.d;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import android.view.MotionEvent;
import wq6.h;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import dta.l0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import android.view.GestureDetector$OnDoubleTapListener;
import zq6.b;
import wq6.f;
import bo5.a;
import zq6.p;

public class a$b implements d	// class@00174e
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(MotionEvent p0,h p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$b.class, "2")) {
          return;
       }
       a$b ta = this.a;
       ta.q.a(p0, ta.W8(p1));
       return;
    }
    public boolean b(MotionEvent p0,h p1,View p2){
       boolean b;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a$b.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2.booleanValue();
       }
       a$b ta = this.a;
       a q = ta.q;
       List list = ta.W8(p1);
       Objects.requireNonNull(q);
       ta = PatchProxy.applyTwoRefs(p0, list, q, l0.class, "3");
       if (ta != PatchProxyResult.class) {
          b = ta.booleanValue();
       }else if(!q.f(list)){
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().onDoubleTapEvent(p0)) {
                   b = true;
                   break ;
                }
             }
          }
       }
       b = false;
       return b;
    }
    public boolean c(MotionEvent p0,h p1,View p2){
       boolean b;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a$b.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2.booleanValue();
       }
       a$b ta = this.a;
       a q = ta.q;
       List list = ta.W8(p1);
       Objects.requireNonNull(q);
       ta = PatchProxy.applyTwoRefs(p0, list, q, l0.class, "4");
       if (ta != PatchProxyResult.class) {
          b = ta.booleanValue();
       }else if(!q.f(list)){
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().onDoubleTap(p0)) {
                   b = true;
                   break ;
                }
             }
          }
       }
       b = false;
       return b;
    }
    public boolean d(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Boolean.TRUE.equals(this.a.p.y().e(p0, a.v));
    }
}
