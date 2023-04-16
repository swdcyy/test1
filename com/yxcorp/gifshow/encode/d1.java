package com.yxcorp.gifshow.encode.d1;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportHandlerListener;
import com.yxcorp.gifshow.encode.RxExportApi$a;
import pr3.d;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.clipkit.ClipImportException;
import java.lang.Integer;
import java.lang.Throwable;
import brd.g;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;
import java.lang.Double;
import java.lang.Math;
import java.io.File;
import java.lang.IllegalArgumentException;

public class d1 implements ClipImportHandler$ClipImportHandlerListener	// class@000d15
{
    public final RxExportApi$a a;
    public final d b;
    public final v c;

    public void d1(RxExportApi$a p0,d p1,v p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onClipImportCanceled(){
       if (PatchProxy.applyVoid(null, this, d1.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RxExportApi", "rxSdkTemplateExportHandlerTask onClipImportCanceled mediaPath="+this.a.b, objArray);
       return;
    }
    public void onClipImportError(int p0,ClipImportException p1){
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod1, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("RxExportApi", "rxSdkTemplateExportHandlerTask onClipImportError: "+p1, objArray);
       this.c.onError(p1);
       return;
    }
    public void onClipImportFinish(ClipImportHandler$ClipImportResult p0){
    }
    public void onClipImportProgress(int p0,double p1,double p2){
       if (PatchProxy.isSupport(d1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), this, d1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RxExportApi", "rxSdkTemplateExportHandlerTask onClipImportProgress: mediaPath="+this.a.b+" progress="+p1, objArray);
       if (Math.abs((p1 - 0x3ff0000000000000)) - 0x3eb0c6f7a0b5ed8d < 0) {
          this.b.e(0x3fefae147ae147ae);
       }else {
          this.b.e(p1);
       }
       this.c.onNext(this.b);
       return;
    }
    public void onClipImportSuccess(int p0,String p1){
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod1, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RxExportApi", "rxSdkTemplateExportHandlerTask onClipImportSuccess: exportPath="+p1, objArray);
       if (!new File(p1).exists()) {
          this.c.onError(new IllegalArgumentException("rxSdkTemplateExportHandlerTask onClipImportSuccess: exportPath "+p1+" does not exist"));
          return;
       }else {
          d1 tb = this.b;
          tb.c = p1;
          tb.d(100);
          this.c.onNext(this.b);
          this.c.onComplete();
          return;
       }
    }
}
