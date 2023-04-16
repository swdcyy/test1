package com.kuaishou.live.locallife.presenter.f$a;
import a87.a;
import com.kuaishou.live.locallife.presenter.f;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ye3.h;
import java.util.Objects;
import ye3.j;
import com.kuaishou.live.bottombar.component.widget.d;
import java.lang.Boolean;

public class f$a implements a	// class@000c4e
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public View a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, f$a.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.c9();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, h.class, "8");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          j g = obj.b.g;
          if (g != null) {
             objArray = g.f();
          }
       }
       return objArray;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.c9().d;
    }
}
