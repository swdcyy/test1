package ik0.j;
import android.view.View;
import com.kuaishou.krn.model.LaunchModel;
import ik0.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kk0.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import android.app.Activity;
import android.view.ViewParent;
import java.util.Objects;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import android.os.Bundle;
import com.kuaishou.krn.title.ButtonParams;
import com.kuaishou.krn.title.ButtonParams$PositionId;
import com.kuaishou.krn.title.ButtonParams$Icon;

public final class j	// class@002915
{
    public View a;
    public LaunchModel b;
    public k c;

    public void j(View p0,LaunchModel p1,k p2){
       a.p(p0, "mErrorView");
       a.p(p1, "mLaunchModel");
       a.p(p2, "mTopBarManagerProvider");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       if (this.b.n()) {
          return;
       }
       this.c.m1().c(8);
       return;
    }
    public final void b(){
       boolean b;
       Object[] objArray1;
       int height;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "1")) {
          return;
       }
       if (this.b.n()) {
          return;
       }
       Context obj = PatchProxy.apply(objArray, this, oj, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = this.a.getContext();
          if (!obj instanceof Activity) {
             objArray1 = objArray;
          }
          a.m(objArray1);
          if (this.a.getParent() == null) {
             height = this.a.getHeight();
          }else {
             ViewParent parent = this.a.getParent();
             Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
             height = parent.getHeight();
          }
          if (height < (n.j(objArray1) - n.A(objArray1))) {
             b = true;
          }else {
             b = false;
          }
       }
       if (b) {
          oj = this.b;
          Objects.requireNonNull(oj);
          Object obj1 = PatchProxy.apply(objArray, oj, LaunchModel.class, "20");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): oj.d.getBoolean("showErrorBackIconInHalf", false);
          if (!b1) {
             return;
          }
       }
       ButtonParams uButtonParam = new ButtonParams();
       uButtonParam.buttonId = ButtonParams$PositionId.LEFT1;
       uButtonParam.image = ButtonParams$Icon.BACK.value;
       this.c.m1().d(uButtonParam);
       return;
    }
}
