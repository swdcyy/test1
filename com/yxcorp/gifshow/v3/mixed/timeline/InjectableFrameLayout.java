package com.yxcorp.gifshow.v3.mixed.timeline.InjectableFrameLayout;
import im8.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import vl8.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class InjectableFrameLayout extends FrameLayout implements a	// class@001559
{
    public final b b;

    public void InjectableFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new b(this);
    }
    public boolean available(){
       Object obj = PatchProxy.apply(null, this, InjectableFrameLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.available();
    }
    public final void reset(){
       if (PatchProxy.applyVoid(null, this, InjectableFrameLayout.class, "3")) {
          return;
       }
       this.b.reset();
       return;
    }
    public final void u(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InjectableFrameLayout.class, "2")) {
          return;
       }
       this.b.u(p0);
       return;
    }
    public void x(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InjectableFrameLayout.class, "1")) {
          return;
       }
       this.b.x(p0);
       return;
    }
}
