package com.kuaishou.live.core.show.robot.core.a;
import java.lang.StringBuilder;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.lang.String;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.io.FileNotFoundException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import si2.g;
import java.lang.Runnable;
import java.util.concurrent.Future;
import si2.h;

public class a	// class@000fcb
{
    public ExecutorService a;
    public FileOutputStream b;
    public boolean c;
    public static final String d;

    static {
       a.d = b.a(-1504323719).d("live_arya_recorded_sound").getAbsolutePath()+"/";
    }
    public void a(String p0,String p1){
       try{
          super();
          this.b = new FileOutputStream(p0);
          this.a = c.f("LiveMmuSoundWrapperAudioDataSaver"+p1);
          this.c = true;
          return;
       }catch(java.io.FileNotFoundException e2){
          e2.printStackTrace();
          this.c = false;
          return;
       }
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       this.c = false;
       this.a.submit(new g(this));
       return;
    }
    public void b(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       this.a.submit(new h(this, p0));
       return;
    }
}
