package com.yxcorp.gifshow.video.b$b;
import com.yxcorp.gifshow.video.c$d;
import com.yxcorp.gifshow.video.b;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class b$b implements c$d	// class@00168a
{
    public EditorSdk2$ExportOptions a;
    public final b b;

    public void b$b(b p0,EditorSdk2$ExportOptions p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void a(int p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "9")) {
          return;
       }
       this.a.setVideoGopSize(p0);
       return;
    }
    public void b(boolean p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.a.setNoFastStart(p0);
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "7")) {
          return;
       }
       this.a.setX264Params(p0);
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "10")) {
          return;
       }
       this.a.setAudioProfile(p0);
       return;
    }
    public void e(long p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "8")) {
          return;
       }
       this.a.setVideoBitrate(p0);
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "6")) {
          return;
       }
       this.a.setX264Preset(p0);
       return;
    }
    public int getHeight(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.height();
    }
    public int getWidth(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.width();
    }
    public void r(int p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       this.a.setWidth(p0);
       return;
    }
    public void u(int p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
          return;
       }
       this.a.setWidth(p0);
       return;
    }
}
