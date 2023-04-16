package kg9.f;
import hg9.n;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import j8c.a;
import java.lang.StringBuilder;
import w46.b;
import com.kuaishou.ax2c.PreLoader;
import com.yxcorp.gifshow.camera.record.base.d;
import q87.c;
import android.os.MessageQueue;
import android.os.Looper;
import kg9.a;
import android.os.MessageQueue$IdleHandler;
import java.io.File;
import android.graphics.Bitmap;
import hg9.m;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import ig9.b;
import kg9.b;
import erd.g;
import crd.b;

public class f extends d0 implements n	// class@002c89
{
    public TakePictureType o;
    public final int[] p;

    public void f(CameraPageType p0,b p1){
       super(p0, p1);
       this.o = TakePictureType.SHOOT_IMAGE;
       int[] ointArray = new int[]{0x7f0d1282};
       this.p = ointArray;
    }
    public void n0(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("TakePicturePreload", "onCaptureFailed:"+p0, objArray);
       PreLoader.getInstance().clear(this.p);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       super.onDestroyView();
       PreLoader.getInstance().clear(this.p);
       return;
    }
    public void onResume(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, uof, "7")) {
          objArray = new Object[0];
          a.D().w("TakePicturePreload", "initEditSession", objArray);
          Looper.myQueue().addIdleHandler(new a(this));
       }
       return;
    }
    public void t0(File p0,Bitmap p1,int p2){
       m.a(this, p0, p1, p2);
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.w1(p0);
       Bundle arguments = this.f.getArguments();
       if (arguments != null) {
          String str = "TakePictureType";
          if (arguments.containsKey(str)) {
             this.o = SerializableHook.getSerializable(arguments, str);
          }
       }
       f to = this.o;
       if (to == TakePictureType.SHARE || to == TakePictureType.MIX) {
          this.d.l(b.class, new b(this));
       }
       return;
    }
    public void x0(File p0,Bitmap p1,int p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, f.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TakePicturePreload", "onCaptureAndSaveFileSuccess:"+p0, objArray);
       return;
    }
}
