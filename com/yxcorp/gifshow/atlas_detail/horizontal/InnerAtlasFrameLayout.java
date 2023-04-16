package com.yxcorp.gifshow.atlas_detail.horizontal.InnerAtlasFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.View;

public final class InnerAtlasFrameLayout extends FrameLayout	// class@001bb3
{
    public boolean b;

    public void InnerAtlasFrameLayout(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = true;
    }
    public void InnerAtlasFrameLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = true;
    }
    public void InnerAtlasFrameLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = true;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InnerAtlasFrameLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b == null && this.isShown()) {
          return true;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InnerAtlasFrameLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b != null && this.isShown()) {
          return true;
       }
       return super.onTouchEvent(p0);
    }
    public final void setTouchAble(boolean p0){
       this.b = p0;
    }
}
