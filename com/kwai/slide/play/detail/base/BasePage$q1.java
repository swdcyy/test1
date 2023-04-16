package com.kwai.slide.play.detail.base.BasePage$q1;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq7.a;
import android.view.ViewGroup;
import qp7.e;
import android.view.View;
import com.kwai.slide.play.detail.utils.c;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import kotlin.jvm.internal.a;

public final class BasePage$q1 implements Observer	// class@001781
{
    public final BasePage b;

    public void BasePage$q1(BasePage p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePage$q1.class, "1")) {
       }else if(!this.b.t0() && (this.b.s0() || this.b.w0())){
          ViewGroup viewGroup = this.b.N().u();
          c.a(viewGroup);
          c.d(viewGroup, (p0.booleanValue() ^ 1), 1);
          PlcStrongGroup plcStrongGro = this.b.Y();
          if (plcStrongGro != null) {
             viewGroup = plcStrongGro.u();
             if (viewGroup != null) {
                c.a(viewGroup);
                a.o(p0, "showStrong");
                c.d(viewGroup, p0.booleanValue(), 1);
             }
          }
       }
       return;
    }
}
