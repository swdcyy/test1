package com.yxcorp.gifshow.v3.editor.text.tts.g$c;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import com.yxcorp.gifshow.v3.editor.text.tts.g;
import java.lang.String;
import jod.g;
import java.lang.Object;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import com.yxcorp.gifshow.v3.editor.text.tts.g$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
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

public class g$c extends PostTaskManager$a	// class@0014fe
{
    public CountDownLatch d;
    public g$b e;
    public final g f;

    public void g$c(g p0,String p1,g p2){
       this.f = p0;
       super(p1, p2, null);
       this.d = new CountDownLatch(1);
       this.e = new g$b(p0, null, 0);
    }
    public Object b(){
       return this.e;
    }
    public void e(){
       Object[] objArray1;
       e a;
       g c;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g$c.class, "1")) {
          return;
       }
       String str = "TtsDownloadManager";
       int i = 0;
       if (this.f.i.get()) {
          objArray = new Object[i];
          a.D().w(str, "processing: cancel downloadTask", objArray);
          return;
       }else {
          g$c tf = this.f;
          tf.g = this;
          String str1 = " taskId = ";
          String str2 = " identifier = ";
          String str3 = " text = ";
          String str4 = " languageType = ";
          double d = 0x408f400000000000;
          if (tf.c(this.d())) {
             this.e.a = this.f.c.getAbsolutePath();
             this.e.b = (double)c.i(this.f.c.getAbsolutePath()) / d;
             objArray1 = new Object[i];
             a.D().w(str, "processing: task file already exists speakerId = "+this.c().a+str4+this.c().b+str3+this.c().c+str2+this.c().d+str1+this.d(), objArray1);
          }else if(!a.a()){
             objArray1 = new Object[i];
             a.D().t(str, "processing :network disconnected", objArray1);
             tf = this.e;
             tf.a = objArray;
             tf.b = 0;
             return;
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w(str, "processing: need run task to download speech speakerId = "+this.c().a+str4+this.c().b+str3+this.c().c+str2+this.c().d+str1+this.d(), objArray2);
             tf = this.f;
             tf.b = tf.d(tf.c);
             this.f.a.n(this.c().a);
             this.f.a.m(this.c().b);
             a = this.f.a;
             c = this.c().c;
             try{
                a.g(c);
                objArray2 = new Object[i];
                a.D().w(str, "processing: block in mCountDownLatch", objArray2);
                b = this.d.await(0x2710, TimeUnit.MILLISECONDS);
                try{
                   Object[] objArray3 = new Object[i];
                   a.D().w(str, "processing: mCountDownLatch has released after await", objArray3);
                label_0185 :
                   objArray3 = new Object[i];
                   a.D().w(str, "processing: mCountDownLatch has released isSuccessful = "+b, objArray3);
                   if (!this.f.i.get() && b) {
                      this.e.a = this.f.c.getAbsolutePath();
                      this.e.b = (double)c.i(this.f.c.getAbsolutePath()) / d;
                   }else if(!b){
                      objArray = new Object[i];
                      a.D().w(str, "processing: time out", objArray);
                      tf = this.f;
                      tf.b(tf.b, tf.c);
                   }
                }catch(java.lang.InterruptedException e1){
                }
                e1.printStackTrace();
                goto label_0185 ;
             }catch(java.lang.InterruptedException e1){
                b = false;
                goto label_0182 ;
             }
          }
          return;
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TtsDownloadTask taskId = + "+this.d()+" taskData = "+this.c()+" mCountDownLatch = "+this.d+" mAudioPath = "+this.e.a+" mDuration = "+this.e.b;
    }
}
