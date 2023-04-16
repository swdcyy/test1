package knd.k$b;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import knd.k;
import java.lang.String;
import jod.d;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import knd.k$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import faa.a;
import q87.c;
import knd.j;
import java.io.File;
import com.yxcorp.gifshow.media.util.c;
import java.lang.StringBuilder;
import wnc.a;
import w46.b;
import java.io.FileOutputStream;
import zt7.d;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
import com.kwai.robust.PatchProxyResult;

public final class k$b extends PostTaskManager$a	// class@0017eb
{
    public final CountDownLatch d;
    public final k$a e;
    public final k f;

    public void k$b(k p0,String p1,d p2){
       a.p(p1, "taskId");
       a.p(p2, "taskData");
       this.f = p0;
       super(p1, p2, null);
       this.d = new CountDownLatch(1);
       this.e = new k$a(null, 0);
    }
    public Object b(){
       return this.e;
    }
    public void e(){
       File uFile;
       Object[] objArray1;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$b.class, "1")) {
          return;
       }
       String str = "TTSDownloadManagerV2";
       int i = 0;
       if (this.f.i.get()) {
          objArray = new Object[i];
          a.D().w(str, "processing: cancel downloadTask", objArray);
          return;
       }else {
          k$b tf = this.f;
          tf.g = this;
          String str1 = " taskId = ";
          String str2 = " identifier = ";
          String str3 = " text = ";
          String str4 = " languageType = ";
          double d = 0x408f400000000000;
          if (tf.h(this.c().a())) {
             uFile = this.f.c();
             a.m(uFile);
             this.e.c(uFile.getAbsolutePath());
             uFile = this.f.c();
             a.m(uFile);
             this.e.d(((double)c.i(uFile.getAbsolutePath()) / d));
             objArray1 = new Object[i];
             a.D().w(str, "processing: task file already exists speakerId = "+this.c().d()+str4+this.c().c()+str3+this.c().g()+str2+this.c().b()+str1+this.d(), objArray1);
          }else if(!a.a()){
             objArray1 = new Object[i];
             a.D().t(str, "processing :network disconnected", objArray1);
             this.e.c(objArray);
             this.e.d(0);
             return;
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w(str, "processing: need run task to download speech speakerId = "+this.c().d()+str4+this.c().c()+str3+this.c().g()+str2+this.c().b()+str1+this.d(), objArray2);
             tf = this.f;
             uFile = tf.c();
             a.m(uFile);
             tf.k(tf.i(uFile));
             this.f.f().n(this.c().d());
             this.f.f().m(this.c().c());
             d uod = this.f.f();
             String str5 = this.c().g();
             try{
                uod.g(str5);
                objArray2 = new Object[i];
                a.D().w(str, "processing: block in mCountDownLatch", objArray2);
                b = this.d.await(0x2710, TimeUnit.MILLISECONDS);
                try{
                   Object[] objArray3 = new Object[i];
                   a.D().w(str, "processing: mCountDownLatch has released after await", objArray3);
                label_01bd :
                   objArray3 = new Object[i];
                   a.D().w(str, "processing: mCountDownLatch has released isSuccessful = "+b, objArray3);
                   if (!this.f.i.get() && b) {
                      uFile = this.f.c();
                      a.m(uFile);
                      this.e.c(uFile.getAbsolutePath());
                      uFile = this.f.c();
                      a.m(uFile);
                      this.e.d(((double)c.i(uFile.getAbsolutePath()) / d));
                   }else if(!b){
                      objArray = new Object[i];
                      a.D().w(str, "processing: time out", objArray);
                      tf = this.f;
                      tf.b(tf.d(), this.f.c());
                   }
                }catch(java.lang.InterruptedException e1){
                }
                e1.printStackTrace();
                goto label_01bd ;
             }catch(java.lang.InterruptedException e1){
                b = false;
                goto label_01ba ;
             }
          }
          return;
       }
    }
    public final CountDownLatch h(){
       return this.d;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, k$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TTSDownloadTask taskId = + "+this.d()+" taskData = "+this.c()+" mCountDownLatch = "+this.d+" mAudioPath = "+this.e.a()+" mDuration = "+this.e.b();
    }
}
