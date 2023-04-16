package com.yxcorp.plugin.setting.stencil.d;
import java.lang.Object;
import java.util.HashMap;
import vgd.w;
import com.yxcorp.plugin.setting.stencil.d$a;
import com.yxcorp.plugin.setting.stencil.config.SettingPage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import mrd.a;
import java.util.Map;
import brd.t;
import wgd.a;
import com.yxcorp.plugin.setting.stencil.c;
import erd.o;
import com.yxcorp.plugin.setting.stencil.b;
import erd.g;
import vgd.s;
import vgd.t;
import crd.b;

public class d	// class@0008fd
{
    public final Map a;

    public void d(){
       super();
       this.a = new HashMap();
    }
    public void d(w p0){
       super();
       this.a = new HashMap();
    }
    public static d b(){
       return d$a.a;
    }
    public final String a(SettingPage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return QCurrentUser.ME.getId()+"_setting_stencil_page_key_"+p0.getPageKey();
    }
    public final a c(SettingPage p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       String obj = PatchProxy.applyOneRefs(p0, this, uod, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a(p0);
       a uoa = this.a.get(obj);
       if (uoa != null && !uoa.e()) {
          return uoa;
       }
       uoa = a.g();
       this.a.put(obj, uoa);
       t ot = PatchProxy.applyOneRefs(p0, this, uod, "6");
       if (ot != patchProxyRe) {
       }else {
          ot = a.b(p0).map(c.b).doOnNext(new b(this, p0));
       }
       ot.subscribe(new s(uoa), new t(uoa));
       return uoa;
    }
}
