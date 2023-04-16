package com.kuaishou.tuna_core.plugin.g;
import xx5.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.tuna_core.plugin.n;
import qmc.a;
import com.kuaishou.tuna_core.plugin.m;
import com.kuaishou.tuna_core.plugin.n$a;
import android.app.Activity;
import brd.t;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter;
import f05.d;
import io.reactivex.g;
import pmc.b;
import com.yxcorp.download.DownloadTask;
import vz4.d;
import java.util.Map;
import java.lang.Number;
import ekd.q;
import java.lang.Long;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import com.kuaishou.tuna_core.button.TunaButton;
import pmc.a;
import vz4.c;

public class g implements a	// class@00111b
{

    public void g(){
       super();
    }
    public boolean G10(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return n.a.b(p0);
    }
    public boolean IU(int p0){
       boolean b = (p0)? true: false;
       return b;
    }
    public a M5(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m(p0);
    }
    public void Mv(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       n.a.a("tuna_profile", null, false);
       return;
    }
    public t gq(Activity p0){
       p0 = PatchProxy.applyOneRefs(p0, this, g.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       TunaQigsawPluginReporter tunaQigsawPl = new TunaQigsawPluginReporter("tuna_profile");
       tunaQigsawPl.a();
       return t.create(new d(this, tunaQigsawPl));
    }
    public boolean isAvailable(){
       return true;
    }
    public void rP(String p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "9")) {
          return;
       }
       n.a.a(p0, null, p1);
       return;
    }
    public DownloadTask s40(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b(p0);
    }
    public long t20(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          long l = 0;
          if (!q.h(p0)) {
             p0 = p0.get("tuna_button_event_code");
             if (p0 != null) {
                l = Long.parseLong(p0.toString());
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public int u7(Activity p0,TunaButtonModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TunaButton.b(p0, p1);
    }
    public a ur(Activity p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(p0, p1);
    }
}
