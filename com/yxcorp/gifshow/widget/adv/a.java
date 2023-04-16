package com.yxcorp.gifshow.widget.adv.a;
import com.yxcorp.gifshow.widget.adv.Action;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.adv.c;

public class a extends Action	// class@001919
{
    public final EditorSdk2$TimeRange j;

    public void a(Action$Type p0,int p1,double p2,double p3,EditorSdk2$TimeRange p4){
       super(p0, p1, null, p2, p3);
       this.j = p4;
    }
    public Object clone(){
       return this.n();
    }
    public void g(double p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, a.class, "1")) {
          return;
       }
       super.g(p0);
       this.j.setStart(p0);
       return;
    }
    public void h(double p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, a.class, "2")) {
          return;
       }
       super.h(p0);
       this.j.setDuration(p0);
       return;
    }
    public Action i(){
       return this.n();
    }
    public a n(){
       Object[] objArray = null;
       Action obj = PatchProxy.apply(objArray, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.i();
       a tj = this.j;
       if (tj != null) {
          objArray = tj.clone();
       }
       tj = new a(obj.e(), obj.l(), obj.c(), obj.d(), objArray);
       return objArray;
    }
}
