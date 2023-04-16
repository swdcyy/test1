package com.tachikoma.core.component.e$b;
import android.view.View$OnLayoutChangeListener;
import com.tachikoma.core.component.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tachikoma.core.component.e$b$a;
import java.lang.Runnable;
import com.tkruntime.v8.V8Function;
import iq8.n;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class e$b implements View$OnLayoutChangeListener	// class@000d69
{
    public final boolean b;
    public final e c;

    public void e$b(e p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       Object[] objArray;
       if (PatchProxy.isSupport(e$b.class)) {
          objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, e$b.class, "1")) {
             return;
          }
       }
       this.c.getView().removeOnLayoutChangeListener(this);
       e$b tc = this.c;
       tc.mHasLayoutListener = false;
       e mLayoutObser = tc.mLayoutObserverRef;
       if (mLayoutObser != null && y.a(mLayoutObser.get())) {
          p7 = p3 - p1;
          p8 = p4 - p2;
          if (this.b != null) {
             e$b$a uob$a = new e$b$a(this, p1, p2, p7, p8);
             this.c.getView().post(objArray);
          }else {
             Object[] objArray1 = new Object[]{Integer.valueOf(n.f(p1)),Integer.valueOf(n.f(p2)),Integer.valueOf(n.f(p7)),Integer.valueOf(n.f(p8))};
             this.c.mLayoutObserverRef.get().call(null, objArray1);
             y.c(this.c.mLayoutObserverRef);
          }
       }
       return;
    }
}
