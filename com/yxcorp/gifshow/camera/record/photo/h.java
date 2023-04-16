package com.yxcorp.gifshow.camera.record.photo.h;
import java.lang.Object;
import com.yxcorp.gifshow.media.model.ImageConfig;
import q46.l;
import oe6.a;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import java.lang.Float;
import n65.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.camerasdk.videoCapture.CameraController;
import qi9.c;
import android.widget.FrameLayout;
import x8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;
import com.kwai.video.westeros.models.EffectPerformance;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import java.lang.Number;
import java.io.File;
import com.yxcorp.gifshow.camera.record.photo.h$a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.media.MediaPlayer;
import va9.a;
import java.lang.Throwable;
import w46.b;
import com.kwai.camerasdk.models.DisplayLayout;
import hg9.n;
import k2b.e0;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;

public class h	// class@000eae
{
    public MediaPlayer a;
    public int b;
    public int c;
    public h$a d;

    public void h(){
       super();
       this.b = l.a().getSingleImageLongSide();
       this.c = a.n();
    }
    public static k a(q p0,CameraView p1,boolean p2,boolean p3,int p4,Float p5){
       Object[] objArray;
       k obj;
       int i;
       String str;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, null, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p0.getPreviewSize();
       if (p3 && (p0.n().r > null && p0.n().s > null)) {
          obj = new k(p0.n().s, p0.n().r);
       }
    label_005e :
       int height = p1.getHeight();
       if (obj == null || !height) {
          return new k(0, 0);
       }else {
          int width = p1.getWidth();
          float f = (p5 != null && p5.floatValue())? p5.floatValue(): ((float)width * 0x3f800000) / (float)height;
          objArray = new Object[0];
          a.D().w("PictureCapture", "targetSize:"+obj.d()+"x"+obj.c()+" , displaySize:"+width+"x"+height+" , ratio:"+f, objArray);
          if ((p0.getCameraOrientation() % 180) == 90) {
             i = obj.d();
             width = obj.c();
          }else {
             i = obj.c();
             width = obj.d();
          }
          if (p3) {
             height = width;
             str = null;
          }else {
             height = 0;
             str = i;
          }
          if (i && Math.abs((f - ((float)width / (float)i))) - 0x3a83126f < 0) {
             if (!p3) {
             label_0111 :
                i = str;
             label_0112 :
                Object[] objArray1 = new Object[0];
                a.D().w("PictureCapture", "cropSize:"+width+"x"+i, objArray1);
                if (p4 > 0 && (p4 < Math.max(width, i) && p2)) {
                   if (width > i) {
                      i = (Math.round((((float)i * (float)p4) / (float)width)) + 1) & 0xfe;
                      width = p4;
                   }else {
                      width = (Math.round((((float)width * (float)p4) / (float)i)) + 1) & 0xfe;
                      i = p4;
                   }
                }
                Object[] objArray2 = new Object[0];
                a.D().w("PictureCapture", "final cropSize:"+width+"x"+i+", mImageMaxSize:"+p4, objArray2);
                return new k(width, i);
             }
          }else if(p3){
             if (f) {
                i = ((int)((float)height / f) / 4) * 4;
             }
          }else {
             width = ((int)((float)str * f) / 4) * 4;
             goto label_0111 ;
          }
          width = height;
          goto label_0112 ;
       }
    }
    public static TakePictureSource d(EffectPerformance p0){
       TakePictureSource sOURCE_PREVI = (p0 != EffectPerformance.kEffectPerformanceLow && (p0 == EffectPerformance.kEffectPerformanceLow360p || p0 == EffectPerformance.kEffectPerformanceLow540p))? TakePictureSource.SOURCE_PREVIEW_FRAME: TakePictureSource.SOURCE_UNDEFINE;
       return sOURCE_PREVI;
    }
    public int b(EffectPerformance p0,TakePictureSource p1,boolean p2,q p3,CameraView p4,int p5,int p6){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,Integer.valueOf(p5),Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, this, oh, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }else {
          int i = this;
       }
       return this.c(p0, p1, p2, p3, p4, p5, p6, true);
    }
    public int c(EffectPerformance p0,TakePictureSource p1,boolean p2,q p3,CameraView p4,int p5,int p6,boolean p7){
       boolean i;
       int i1;
       int i2;
       int i3;
       h oh = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       h oh1 = h.class;
       if (PatchProxy.isSupport(oh1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),oobject2,p4,Integer.valueOf(p5),Integer.valueOf(p6),Boolean.valueOf(p7)};
          Object obj = PatchProxy.apply(objArray, this, oh1, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p2) {
          return p5;
       }else if(!p3.U(p1)){
          if (oobject == EffectPerformance.kEffectPerformanceNormal1080p) {
             i = p3.n().j();
          label_0060 :
             i1 = i;
          }else {
          label_0091 :
             i1 = 720;
          }
       }else if(oobject != EffectPerformance.kEffectPerformanceLow && (oobject == EffectPerformance.kEffectPerformanceLow360p || oobject == EffectPerformance.kEffectPerformanceLow540p)){
          goto label_0091 ;
       }else if(p3.getPictureSize() != null && (p3.n().r > null && p3.n().s > null)){
          i = p3.n().r;
          goto label_0060 ;
       }else {
          i1 = 1080;
       }
       boolean b = false;
       i = p3.U(p1);
       h b1 = oh.b;
       Float uFloat = (p6 == 1 && p7)? Float.valueOf(0x3f100000): 0;
       k ok = h.a(p3, p4, b, i, b1, uFloat);
       if ((p3.getCameraOrientation() % 180) == 90) {
          i2 = ok.d();
          i3 = ok.c();
       }else {
          i2 = ok.c();
          i3 = ok.d();
       }
       if (i2 < i1 || !i2) {
          return p5;
       }else {
          return ((((i1 * i3) / i2) + 1) & 0xfe);
       }
    }
    public File e(){
       h td = this.d;
       h$a y = (td != null)? td.y: null;
       return y;
    }
    public void f(){
       String str = "PictureCapture";
       if (PatchProxy.applyVoid(null, this, h.class, "10")) {
          return;
       }
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          a.D().w(str, "playSound", objArray);
          if (this.a == null) {
             MediaPlayer mediaPlayer = MediaPlayer.create(a.a().a(), R.raw.arg_RES_7f0f0005);
             this.a = mediaPlayer;
             mediaPlayer.setAudioStreamType(3);
          label_0033 :
             this.a.seekTo(i);
             this.a.start();
          }else {
             goto label_0033 ;
          }
       }catch(java.lang.Exception e3){
          Object[] objArray1 = new Object[2];
          objArray1[i] = str;
          objArray1[1] = "paly click sound error";
          if (!PatchProxy.applyVoidTwoRefs(e3, objArray1, null, a.class, "2")) {
             a.D().u("[camera]", e3, objArray1);
          }
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       h ta = this.a;
       if (ta != null) {
          ta.release();
          this.a = null;
       }
       return;
    }
    public h h(int p0,int p1){
       this.b = p0;
       this.c = p1;
       return this;
    }
    public void i(q p0,CameraView p1,DisplayLayout p2,TakePictureSource p3,n p4,File p5,boolean p6,int p7,boolean p8,int p9,e0 p10){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = p10;
          if (PatchProxy.applyVoid(objArray, this, oh, "2")) {
             return;
          }
       }else {
          int i = this;
       }
       this.j(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, 1);
       return;
    }
    public void j(q p0,CameraView p1,DisplayLayout p2,TakePictureSource p3,n p4,File p5,boolean p6,int p7,boolean p8,int p9,e0 p10,boolean p11){
       Object[] objArray;
       h$a uoa;
       Void[] voidArray;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p3;
       h oh = h.class;
       int i = 11;
       int i1 = 10;
       int i2 = 9;
       int i3 = 8;
       int i4 = 7;
       int i5 = 0;
       int i6 = 1;
       if (PatchProxy.isSupport(oh)) {
          objArray = new Object[12];
          objArray[i5] = oobject;
          objArray[i6] = p1;
          objArray[2] = p2;
          objArray[3] = oobject1;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Boolean.valueOf(p6);
          objArray[i4] = Integer.valueOf(p7);
          objArray[i3] = Boolean.valueOf(p8);
          objArray[i2] = Integer.valueOf(p9);
          objArray[i1] = p10;
          objArray[i] = Boolean.valueOf(p11);
          if (PatchProxy.applyVoid(objArray, obj, oh, "3")) {
             return;
          }
       }
       if (obj.d != null || (p1 != null && oobject != null)) {
          boolean b = true;
          int b1 = oobject.U(oobject1);
          h b2 = obj.b;
          Float uFloat = (p9 == i6 && p11)? Float.valueOf(0x3f100000): 0;
          i1 = 0;
          k ok = h.a(p0, p1, b, b1, b2, uFloat);
          b1 = ok.d();
          i6 = ok.c();
          if (PatchProxy.isSupport(oh)) {
             objArray = new Object[i];
             objArray[i1] = oobject;
             objArray[1] = Integer.valueOf(b1);
             objArray[2] = Integer.valueOf(i6);
             objArray[3] = p2;
             objArray[4] = oobject1;
             objArray[5] = p4;
             objArray[6] = p5;
             objArray[i4] = Boolean.valueOf(p6);
             objArray[i3] = Integer.valueOf(p7);
             objArray[i2] = Boolean.valueOf(p8);
             objArray[10] = p10;
             if (!PatchProxy.applyVoid(objArray, obj, oh, "4")) {
             }
          }else {
          }
       }
    label_00f5 :
       return;
    }
}
