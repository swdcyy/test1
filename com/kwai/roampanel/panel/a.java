package com.kwai.roampanel.panel.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uw5.b$a;
import uw5.b;
import krb.a;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import mm7.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import com.kwai.robust.PatchProxyResult;
import mm7.e;
import java.util.Map;
import java.util.HashMap;
import mrd.a;

public class a extends PresenterV2 implements g	// class@0013d9
{
    public b p;
    public d q;
    public a r;

    public void a(){
       super();
       b$a uoa = new b$a();
       uoa.b(false);
       this.p = uoa.a();
       this.q = a.b().a(LocalDelegateType.ACTIVITY_LOCAL);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.X7(this.r.hide().subscribe(new a(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.q.b(new CityInfo(""));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new e());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.r8("local_city_panel_element_picked");
       return;
    }
}
