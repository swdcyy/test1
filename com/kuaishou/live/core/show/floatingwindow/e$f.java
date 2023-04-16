package com.kuaishou.live.core.show.floatingwindow.e$f;
import q12.b;
import com.kuaishou.live.core.show.floatingwindow.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import t02.a0;
import com.kuaishou.live.core.show.floatingwindow.z;

public class e$f implements b	// class@000b80
{
    public final e a;

    public void e$f(e p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       boolean b;
       e$f obj = PatchProxy.apply(null, this, e$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (e.m(this.a.getActivity())) {
          obj = this.a;
          if (z.g(obj.w, obj.getActivity())) {
             b = true;
          label_0031 :
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
}
