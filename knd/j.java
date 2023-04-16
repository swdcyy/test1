package knd.j;
import java.lang.Object;
import zt7.d;
import knd.j$b;
import java.io.FileOutputStream;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import java.io.OutputStream;
import ekd.p;
import java.io.IOException;
import java.io.File;
import java.lang.StringBuilder;
import qkd.b;
import j85.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.google.protobuf.MessageLite;
import o75.j0;
import com.kwai.chat.kwailink.data.PacketData;
import knd.j$c;
import com.kwai.chat.sdk.signal.f;

public class j	// class@0017e9
{
    public final d a;
    public FileOutputStream b;
    public File c;
    public float d;
    public e e;

    public void j(){
       super();
       this.a = new d();
       this.e = new j$b(this);
    }
    public void a(FileOutputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSBaseManagerV2", "closeFile: ", objArray);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSBaseManagerV2", "deleteFile: file = "+p1, objArray);
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
    public final File c(){
       return this.c;
    }
    public final FileOutputStream d(){
       return this.b;
    }
    public final e e(){
       return this.e;
    }
    public final d f(){
       return this.a;
    }
    public final float g(){
       return this.d;
    }
    public final boolean h(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "filePath");
       obj = new File(p0);
       this.c = obj;
       return obj.exists();
    }
    public FileOutputStream i(File p0){
       FileOutputStream obj = PatchProxy.applyOneRefs(p0, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "file");
       Object[] objArray = new Object[0];
       a.D().w("TTSBaseManagerV2", "openFile: file = "+p0, objArray);
       try{
          obj = 0;
          obj = b.c0(p0);
       }catch(java.io.IOException e5){
          e5.printStackTrace();
       }
       return obj;
    }
    public final void j(MessageLite p0,Class p1,j0 p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, j.class, "2")) {
          return;
       }
       a.p(p0, "messageV3");
       a.p(p2, "sendRequestListener");
       Object[] objArray = new Object[0];
       a.D().w("TTSBaseManagerV2", "sendMessage2IM: ", objArray);
       super();
       this.t(p3);
       this.w(p0.toByteArray());
       f.e().p(this, 0x2710, 0, new j$c(p2), true);
       return;
    }
    public final void k(FileOutputStream p0){
       this.b = p0;
    }
    public void l(FileOutputStream p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "7")) {
          return;
       }
       a.p(p1, "data");
       Object[] objArray = new Object[0];
       a.D().w("TTSBaseManagerV2", "writeFile: ", objArray);
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
