package com.yxcorp.plugin.search.widget.HideInputPanFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;
import android.view.ViewGroup;

public class HideInputPanFrameLayout extends FrameLayout	// class@0007c6
{
    public final Rect b;
    public final List c;

    public void HideInputPanFrameLayout(Context p0){
       super(p0);
       this.b = new Rect();
       this.c = new ArrayList();
    }
    public void HideInputPanFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Rect();
       this.c = new ArrayList();
    }
    public void HideInputPanFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Rect();
       this.c = new ArrayList();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HideInputPanFrameLayout.class, "3")) {
          return;
       }
       this.c.add(p0);
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HideInputPanFrameLayout.class, "4")) {
          return;
       }
       this.c.remove(p0);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, HideInputPanFrameLayout.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!p0.getAction()) {
          obj = PatchProxy.applyOneRefs(p0, this, HideInputPanFrameLayout.class, "2");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(q.f(this.c)){
             Iterator iterator = this.c.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   this.b.set(0, 0, 0, 0);
                   iterator.next().getGlobalVisibleRect(this.b);
                   if (this.b.contains((int)p0.getRawX(), (int)p0.getRawY())) {
                      b = true;
                      break ;
                   }
                }
             }
          }
          b = false;
          if (!b) {
             Activity uActivity = a.b(this.getContext());
             if (uActivity != null) {
                n.C(uActivity);
             }
          }
       }
    label_0073 :
       return super.dispatchTouchEvent(p0);
    }
}
