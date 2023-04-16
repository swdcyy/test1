package com.yxcorp.gifshow.camera.record.album.s$c;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.camera.record.album.s;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.camera.record.album.s$b;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.util.List;
import com.yxcorp.gifshow.model.MultiplePhotosProject;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.camera.record.album.t;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager;
import com.yxcorp.gifshow.util.y;
import java.util.concurrent.CountDownLatch;
import java.lang.InterruptedException;
import android.content.Intent;
import lnc.r5;

public class s$c extends d	// class@001cca
{
    public s$b A;
    public final s B;
    public QMedia[] y;
    public List z;
    public static final int C;

    public void s$c(s p0,QMedia[] p1,s$b p2){
       this.B = p0;
       super(p0.a);
       this.z = new ArrayList();
       this.y = p1;
       this.A = p2;
    }
    public Object b(Object[] p0){
       y oy = PatchProxy.applyOneRefs(p0, this, s$c.class, "2");
       if (oy != PatchProxyResult.class) {
       }else {
          s$c ty = this.y;
          int len = ty.length;
          int i = 0;
          int i1 = 0;
          while (i1 < len) {
             object oobject = ty[i1];
             b0 uob0 = BitmapUtil.E(oobject.path);
             if (uob0.a >= 1 && uob0.b >= 1) {
                this.z.add(oobject);
             }
             i1 = i1 + 1;
          }
          ty.d = new MultiplePhotosProject(MultiplePhotosProject.c());
          b.m(this.B.d.e());
          this.B.d.a();
          String[] stringArray = new String[i];
          String[] stringArray1 = q.g(this.z, t.a).toArray(stringArray);
          this.B.d.mPhotosSignStr = MultiplePhotosProject.b(stringArray1);
          MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf = new MultiplePhotosWorkManager$CropWorkInfo(this.B.d.e(), stringArray1);
          ty = this.B;
          long l = MultiplePhotosWorkManager.f().c(uCropWorkInf, this.B.d, null);
          try{
             ty.b = l;
             this.B.c.await();
          }catch(java.lang.InterruptedException e8){
             e8.printStackTrace();
          }
          oy = null;
       }
       return oy;
    }
    public void j(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$c.class, "3")) {
       }else {
          super.j(p0);
          p0 = new Intent();
          p0.putExtra("PHOTOS_CROP_WORK_ID_ONCE_DATA_HUB", r5.b().c(this.B.d));
          this.A.a(p0);
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, s$c.class, "1")) {
          return;
       }
       super.k();
       this.B.c = new CountDownLatch(1);
       return;
    }
}
