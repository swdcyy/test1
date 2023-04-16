package com.yxcorp.gifshow.v3.editor.clip_v3.view.ClipRootLayout;
import com.yxcorp.gifshow.widget.MultiFingeredAndDoubleClickInterceptLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import com.yxcorp.utility.RomUtils;
import android.graphics.Paint;
import android.widget.LinearLayout;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;

public class ClipRootLayout extends MultiFingeredAndDoubleClickInterceptLinearLayout	// class@000e13
{
    public boolean c;

    public void ClipRootLayout(Context p0){
       super(p0);
       this.c = false;
    }
    public void ClipRootLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = false;
    }
    public void ClipRootLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = false;
    }
    public void buildDrawingCache(boolean p0){
       if (PatchProxy.isSupport(ClipRootLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ClipRootLayout.class, "1")) {
          return;
       }
       super.buildDrawingCache(p0);
       if (RomUtils.s()) {
          this.setLayerType(0, null);
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipRootLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.onInterceptTouchEvent(p0) || this.c != null)? true: false;
       return b;
    }
    public void setInterceptAllEvent(boolean p0){
       this.c = p0;
    }
}
