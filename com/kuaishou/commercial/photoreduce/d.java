package com.kuaishou.commercial.photoreduce.d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import com.kuaishou.commercial.photoreduce.d$b;
import nsd.u;
import java.lang.Object;
import android.graphics.Rect;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.photoreduce.AdReducePopupPresenterV2;
import ky.c0;
import rkd.b;
import yf5.o;
import im8.c;
import o07.n;
import ky.z;
import java.util.Map;
import java.util.HashMap;

public final class d implements PopupInterface$f, g	// class@001524
{
    public QPhoto b;
    public Rect c;
    public Rect d;
    public List e;
    public View$OnClickListener f;
    public boolean g;
    public boolean h;
    public boolean i;
    public a j;
    public PresenterV2 k;
    public static final d$b l;

    static {
       d.l = new d$b(null);
    }
    public void d(){
       super();
       this.d = new Rect();
       this.g = true;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, d.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       boolean b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d1135, p2, b);
       PresenterV2 presenterV2 = new PresenterV2();
       this.k = presenterV2;
       presenterV2.U7(new AdReducePopupPresenterV2());
       d tk = this.k;
       String str = "mPresenter";
       if (tk == null) {
          a.S(str);
       }
       tk.U7(new c0());
       if (b.g()) {
          tk = this.k;
          if (tk == null) {
             a.S(str);
          }
          tk.U7(new o());
       }
       tk = this.k;
       if (tk == null) {
          a.S(str);
       }
       tk.f(view);
       tk = this.k;
       if (tk == null) {
          a.S(str);
       }
       Object[] objArray = new Object[]{this,new c("PHOTO_REDUCE_POPUP", p0)};
       tk.i(objArray);
       a.o(view, "view");
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new z();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new z());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
}
