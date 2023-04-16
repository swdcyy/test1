package com.yxcorp.gifshow.photo.download.task.z;
import com.kwai.video.videoprocessor.JpegBuilderEventListener;
import exb.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import k2b.e0;
import java.util.ArrayList;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ixb.g1;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import com.yxcorp.gifshow.photo.download.task.a0;
import com.kwai.video.videoprocessor.JpegBuilderException;
import java.lang.Exception;
import com.yxcorp.gifshow.photo.download.utils.c;
import ixb.j1;
import o56.c;
import o56.a;
import android.content.Context;
import jxb.a;
import ixb.h1;
import com.yxcorp.plugin.kwaitoken.KwaiToken;
import java.lang.Double;
import ixb.i1;

public class z implements JpegBuilderEventListener	// class@000f1f
{
    public final b a;
    public final boolean b;
    public final QPhoto c;
    public final StatModel d;
    public final e0 e;
    public final ArrayList f;
    public final File g;

    public void z(b p0,boolean p1,QPhoto p2,StatModel p3,e0 p4,ArrayList p5,File p6){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, z.class, "4")) {
          return;
       }
       k1.o(new g1(this.c, this.d, this.e));
       a0.f(this.f);
       return;
    }
    public void onError(JpegBuilderException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       if (this.b != null) {
          c.f(this.c, 8, p0.getMessage(), this.d, this.e, "PHOTO_DOWNLOAD_IMAGE_DIALOG_LONG_BUTTON");
       }else {
          c.e(this.c, 8, this.d);
       }
       a0.f(this.f);
       k1.o(new j1(this.a, p0));
       return;
    }
    public void onFinished(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       a.c(a.a().f(), this.g);
       if (this.b != null) {
          c.f(this.c, 7, null, this.d, this.e, "PHOTO_DOWNLOAD_IMAGE_DIALOG_LONG_BUTTON");
       }else {
          c.e(this.c, 7, this.d);
       }
       a0.f(this.f);
       k1.o(new h1(this.a));
       KwaiToken.k().F1(this.g.getName());
       return;
    }
    public void onProgress(double p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, oz, "1")) {
          return;
       }
       k1.o(new i1(this.a, (int)((p0 * 0x3fe999999999999a) + 20.00f)));
       return;
    }
}
