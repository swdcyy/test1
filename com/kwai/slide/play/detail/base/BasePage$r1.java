package com.kwai.slide.play.detail.base.BasePage$r1;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq7.a;
import android.view.ViewGroup;
import qp7.e;
import kotlin.jvm.internal.a;
import android.view.View;
import hs7.c;
import sp7.b;

public final class BasePage$r1 implements Observer	// class@001784
{
    public final BasePage b;

    public void BasePage$r1(BasePage p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePage$r1.class, "1")) {
       }else {
          ViewGroup viewGroup = this.b.N().u();
          a.o(p0, "scale");
          this.b.W0(viewGroup, p0.floatValue(), 0, viewGroup.getHeight());
          viewGroup = this.b.c0().u();
          this.b.W0(viewGroup, p0.floatValue(), viewGroup.getWidth(), viewGroup.getHeight());
          viewGroup = this.b.v().u();
          this.b.W0(viewGroup, p0.floatValue(), 0, viewGroup.getHeight());
       }
       return;
    }
}
