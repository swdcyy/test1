package com.yxcorp.plugin.search.widget.HideInputPanRefreshLayout;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.content.Context;
import java.util.HashSet;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.Set;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;
import com.kwai.library.widget.refresh.RefreshLayout;

public class HideInputPanRefreshLayout extends CustomRefreshLayout	// class@0007c7
{
    public final Set h1;

    public void HideInputPanRefreshLayout(Context p0){
       super(p0);
       this.h1 = new HashSet();
    }
    public void HideInputPanRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h1 = new HashSet();
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, HideInputPanRefreshLayout.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!p0.getAction()) {
          obj = PatchProxy.applyOneRefs(p0, this, HideInputPanRefreshLayout.class, "5");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             Rect rect = new Rect();
             obj = this.h1.iterator();
             while (true) {
                if (obj.hasNext()) {
                   obj.next().getGlobalVisibleRect(rect);
                   if (rect.contains((int)p0.getRawX(), (int)p0.getRawY())) {
                      b = true;
                   }
                }else {
                   b = false;
                }
             }
          }
          if (!b) {
             Activity uActivity = a.b(this.getContext());
             if (uActivity != null) {
                n.C(uActivity);
             }
          }
       }
       return super.dispatchTouchEvent(p0);
    }
}
