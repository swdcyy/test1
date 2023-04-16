package com.yxcorp.gifshow.v3.editor.text.tts.e;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.tts.e$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zt7.d;
import java.io.FileOutputStream;
import faa.a;
import q87.c;
import java.io.OutputStream;
import ekd.p;
import java.io.IOException;
import java.io.File;
import java.lang.StringBuilder;
import qkd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hvc.m;
import com.google.protobuf.MessageLite;
import o75.j0;
import com.kwai.chat.kwailink.data.PacketData;
import com.yxcorp.gifshow.v3.editor.text.tts.e$b;
import com.kwai.chat.sdk.signal.f;

public class e	// class@0014f9
{
    public d a;
    public FileOutputStream b;
    public File c;
    public float d;
    public e e;

    public void e(){
       super();
       this.e = new e$a(this);
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
       }else {
          this.a = new d();
       }
       return;
    }
    public void a(FileOutputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsBaseManager", "closeFile: ", objArray);
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.io.IOException e0){
             e0.printStackTrace();
          }
          p.d(p0);
       }
       return;
    }
    public void b(FileOutputStream p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsBaseManager", "deleteFile: file = "+p1, objArray);
       if (p0 != null) {
          try{
             p0.close();
             b.q(p1);
          }catch(java.io.IOException e6){
             e6.printStackTrace();
          }
          p.d(p0);
       }
       return;
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       File uFile = m.d(p0);
       this.c = uFile;
       return uFile.exists();
    }
    public FileOutputStream d(File p0){
       FileOutputStream obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsBaseManager", "openFile: file = "+p0, objArray);
       try{
          obj = 0;
          obj = b.c0(p0);
       }catch(java.io.IOException e5){
          e5.printStackTrace();
       }
       return obj;
    }
    public void e(MessageLite p0,Class p1,j0 p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsBaseManager", "sendMessage2IM: ", objArray);
       super();
       this.t(p3);
       this.w(p0.toByteArray());
       f.e().p(this, 0x2710, 0, new e$b(this, p2), true);
       return;
    }
    public void f(FileOutputStream p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsBaseManager", "writeFile: ", objArray);
       if (p0 == null) {
          return;
       }
       try{
          p0.write(p1, 0, p1.length);
       }catch(java.io.IOException e6){
          e6.printStackTrace();
       }
       return;
    }
}
