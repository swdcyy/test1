package com.kuaishou.tuna_core.plugin.m;
import qmc.a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter$PluginState;
import java.util.Objects;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter$a;

public class m implements a	// class@001121
{
    public TunaQigsawPluginReporter a;

    public void m(String p0){
       super();
       this.a = new TunaQigsawPluginReporter(p0);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.a.c();
       return;
    }
    public void b(int p0){
       TunaQigsawPluginReporter$a obj;
       m om = m.class;
       String str = "2";
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, str)) {
          return;
       }
       om = this.a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TunaQigsawPluginReporter tunaQigsawPl = TunaQigsawPluginReporter.class;
       if (PatchProxy.isSupport(tunaQigsawPl)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, tunaQigsawPl, "6");
          if (obj != patchProxyRe) {
          }else {
          label_0033 :
             obj = TunaQigsawPluginReporter.f;
             Objects.requireNonNull(obj);
             TunaQigsawPluginReporter$a uoa = TunaQigsawPluginReporter$a.class;
             if (PatchProxy.isSupport(uoa)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoa, str);
                if (obj1 != patchProxyRe) {
                   obj = obj1;
                }
             }
             TunaQigsawPluginReporter$PluginState[] pluginStateA = TunaQigsawPluginReporter$PluginState.values();
             int len = pluginStateA.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   object oobject = pluginStateA[i];
                   if (oobject.getValue() == p0) {
                      obj = oobject;
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else {
                   obj = TunaQigsawPluginReporter$PluginState.UNKNOWN;
                   break ;
                }
             }
          }
       }else {
          goto label_0033 ;
       }
       om.b(obj);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.a.a();
       return;
    }
}
