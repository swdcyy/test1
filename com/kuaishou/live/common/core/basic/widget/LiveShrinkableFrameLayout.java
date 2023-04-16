package com.kuaishou.live.common.core.basic.widget.LiveShrinkableFrameLayout;
import ya1.a0;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import android.view.View;
import msd.p;

public final class LiveShrinkableFrameLayout extends FrameLayout implements a0	// class@000f26
{
    public p b;

    public void LiveShrinkableFrameLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveShrinkableFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveShrinkableFrameLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void LiveShrinkableFrameLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public boolean a(int p0,int p1){
       Iterator obj;
       boolean b1;
       if (PatchProxy.isSupport(LiveShrinkableFrameLayout.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveShrinkableFrameLayout.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = ViewGroupKt.b(this).iterator();
       boolean b = false;
    label_002e :
       int i = 0;
       while (true) {
          if (obj.hasNext()) {
             View view = obj.next();
             if (view instanceof a0) {
                if (view.a(p0, p1) || i) {
                   i = 1;
                }else {
                   goto label_002e ;
                }
             }
          }else {
             LiveShrinkableFrameLayout tb = this.b;
             if (tb != null) {
                Boolean uBoolean = tb.invoke(Integer.valueOf(p0), Integer.valueOf(p1));
                if (uBoolean != null) {
                   b1 = uBoolean.booleanValue();
                label_0066 :
                   if (b1 || i) {
                      b = true;
                      break ;
                   }
                   break ;
                }
             }
             b1 = false;
             goto label_0066 ;
          }
       }
       return b;
    }
    public final p getTryShrinkListener(){
       return this.b;
    }
    public final void setTryShrinkListener(p p0){
       this.b = p0;
    }
}
