package com.kuaishou.live.lite.util.viewupdater.LiteTouchEventConsumeAwareLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import z1.a;
import va1.a;
import java.util.Map;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vd3.d;
import ok.x;
import d61.r;
import android.view.ViewGroup;
import java.lang.IllegalStateException;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.view.View$OnTouchListener;
import java.lang.UnsupportedOperationException;

public class LiteTouchEventConsumeAwareLayout extends FrameLayout	// class@000b9e
{
    public boolean b;
    public a c;
    public static final int d;

    public void LiteTouchEventConsumeAwareLayout(Context p0){
       super(p0, null);
    }
    public void LiteTouchEventConsumeAwareLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiteTouchEventConsumeAwareLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
       this.c = a.a();
       this.setClickable(false);
    }
    public static LiteTouchEventConsumeAwareLayout a(Map p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiteTouchEventConsumeAwareLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r.b(p0, p1, new d(p1));
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteTouchEventConsumeAwareLayout.class, "3")) {
          return;
       }
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("LiteTouchEventConsumeAwareLayout only can has one child");
       }
       super.addView(p0);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteTouchEventConsumeAwareLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getActionMasked()) {
          this.b = false;
       }
       boolean b = super.dispatchTouchEvent(p0);
       this.b = this.b | b;
       if (p0.getActionMasked() != 1 || (this.b != null && !PatchProxy.applyVoid(null, this, LiteTouchEventConsumeAwareLayout.class, "5"))) {
          this.c.accept(null);
       }
    label_0041 :
       return b;
    }
    public void setOnTouchListener(View$OnTouchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteTouchEventConsumeAwareLayout.class, "2")) {
          return;
       }
       throw new UnsupportedOperationException("LiteTouchEventConsumeAwareLayout do not support setTouchListener");
    }
    public void setTouchEventConsumedListener(a p0){
       this.c = p0;
    }
}
