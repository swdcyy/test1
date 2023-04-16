package com.facebook.react.views.text.ReactTextShadowNode$b;
import lg.a;
import com.facebook.react.views.text.ReactTextShadowNode;
import java.lang.Object;
import lg.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import od.a;
import android.text.Spannable;
import com.facebook.yoga.YogaMeasureMode;
import android.text.Layout;

public class ReactTextShadowNode$b implements a	// class@00140d
{
    public final ReactTextShadowNode a;

    public void ReactTextShadowNode$b(ReactTextShadowNode p0){
       this.a = p0;
       super();
    }
    public float a(g p0,float p1,float p2){
       if (PatchProxy.isSupport(ReactTextShadowNode$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, ReactTextShadowNode$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.floatValue();
          }
       }
       ReactTextShadowNode a = this.a.A;
       a.d(a, "Spannable element has not been prepared in onBeforeLayout");
       Layout layout = this.a.f(a, p1, YogaMeasureMode.EXACTLY);
       return (float)layout.getLineBaseline((layout.getLineCount() - 1));
    }
}
