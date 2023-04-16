package com.kuaishou.commercial.photoreduce.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.photoreduce.g;
import com.kuaishou.commercial.photoreduce.e;
import rkd.b;
import yf5.o;
import im8.c;
import ky.o;
import java.util.Map;
import java.util.HashMap;

public class c implements PopupInterface$f, g	// class@001521
{
    public QPhoto b;
    public Rect c;
    public boolean d;
    public View$OnClickListener e;
    public List f;
    public ReduceMode g;
    public a h;
    public boolean i;
    public final float j;
    public final float k;
    public final long l;
    public PresenterV2 m;

    public void c(){
       super();
       this.j = 0x3f4ccccd;
       this.k = 0x3f000000;
       this.l = 200;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       boolean b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d006c, p2, b);
       PresenterV2 presenterV2 = new PresenterV2();
       this.m = presenterV2;
       presenterV2.U7(new g());
       this.m.U7(new e());
       if (b.g()) {
          this.m.U7(new o());
       }
       this.m.f(view);
       Object[] objArray = new Object[]{this,new c("PHOTO_REDUCE_POPUP", p0)};
       this.m.i(objArray);
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.m.destroy();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new o());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
}
