package com.kuaishou.tuna_core.plugin.b;
import com.kwai.plugin.dva.install.a;
import com.kuaishou.tuna_core.plugin.a$b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import java.lang.Number;
import android.content.SharedPreferences;
import com.kwai.sdk.switchconfig.a;
import com.kwai.plugin.dva.install.PluginUrlManager;
import o56.a;
import android.content.Context;
import java.lang.Integer;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.tuna_logger.KsLogTunaCodDynamicLogTag;
import java.util.List;
import f05.c;
import msd.a;
import c15.b;

public class b implements a	// class@001116
{
    public final a$b a;

    public void b(a$b p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       boolean b;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$b uob = a$b.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, str)) {
          return;
       }
       String str1 = "tuna_cod_container";
       if (!TextUtils.n(p0, str1)) {
          return;
       }
       b ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, ta, uob, str);
       int i = (obj != patchProxyRe)? obj.intValue(): ta.a.getInt("pre_plugin_load_type", 2);
       ta = this.a;
       Objects.requireNonNull(ta);
       Object obj1 = PatchProxy.apply(objArray, ta, uob, "3");
       b = false;
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else if(a.t().d("tunaCodPlugin", b)){
          i1 = 1;
       }else {
          i1 = 2;
       }
       boolean b1 = PluginUrlManager.a.g(a.B, str1, i1);
       if (b1) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), ta, uob, "2")) {
             g.a(ta.a.edit().putInt("pre_plugin_load_type", i1));
          }
       }
       if (i == 2 && (i1 == 1 && b1)) {
          b = 1;
       }
    label_008f :
       if (b) {
          try{
             c uoc = Dva.instance().getPluginInstallManager().s(p0);
             if (uoc != null) {
                uoc.c();
             }
          }catch(java.lang.Exception e12){
             ExceptionHandler.handleCaughtException(new Throwable("deletePluginData local cod plugin Failed!", e12));
          }
       }
    }
}
