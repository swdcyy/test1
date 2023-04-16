package com.yxcorp.gifshow.camerasdk.j$k;
import com.kwai.camerasdk.stats.StatsListener;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import qi9.g1;
import com.kwai.robust.PatchProxyResult;
import qi9.c;
import java.lang.Boolean;
import v16.b;
import qi9.a;
import com.kwai.camerasdk.models.PreviewStats;
import qi9.t1;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.camerasdk.models.SessionStats;

public class j$k implements StatsListener	// class@001024
{
    public final j a;

    public void j$k(j p0){
       this.a = p0;
       super();
    }
    public void OnPipelineInfo(String p0){
    }
    public void onDebugInfo(String p0){
       j g;
       if (PatchProxy.applyVoidOneRefs(p0, this, j$k.class, "1")) {
          return;
       }
       if (this.a.D != null) {
          if (p0 != null) {
             StringBuilder str = p0+"\nOpenGLSync: ";
             g = this.a.G;
             String str1 = PatchProxy.applyOneRefs(g, null, g1.class, "3");
             if (str1 != PatchProxyResult.class) {
             }else if(g == null || g.h != null){
                Boolean uBoolean = b.h();
                if (uBoolean == null) {
                   str1 = "Auto";
                }else if(uBoolean.booleanValue()){
                   str1 = "On";
                }
             }
             str1 = "Off";
             g = str+str1+"\n"+this.a.F;
          }
          if (this.a.k0 != null) {
             g = g+this.a.k0;
          }
          this.a.D.a(g);
       }
       return;
    }
    public void onPreviewStats(PreviewStats p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$k.class, "3")) {
          return;
       }
       j e = this.a.E;
       if (e != null) {
          e.a(p0);
       }
       return;
    }
    public void onReportJsonStats(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$k.class, "2")) {
          return;
       }
       PostUtils.x("DaenerysStats", p0);
       return;
    }
    public void onSessionSegmentStats(SessionStats p0){
    }
}
