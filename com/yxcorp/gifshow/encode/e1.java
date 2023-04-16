package com.yxcorp.gifshow.encode.e1;
import com.kwai.video.editorsdk2.ExportEventListener;
import java.lang.String;
import pr3.d;
import brd.v;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.yxcorp.gifshow.encode.RxExportApi$RxExportException;
import java.lang.Throwable;
import brd.g;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import java.io.File;
import qkd.b;
import jv7.f;
import java.lang.Double;
import java.lang.Math;

public class e1 implements ExportEventListener	// class@000d18
{
    public final String a;
    public final d b;
    public final String c;
    public final v d;

    public void e1(String p0,d p1,String p2,v p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e1.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RxExportApi", "rxSdkExport onCancelled: exportFilePath="+this.a, objArray);
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e1.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("RxExportApi", "rxSdkExport onError: "+p0.getError(), objArray);
       this.d.onError(new RxExportApi$RxExportException("export error "+p0.getError()));
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e1.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("RxExportApi", "rxSdkExport onFinished: exportFilePath="+this.a, objArray);
       File uFile = new File(this.a);
       File uFile1 = new File(p0.getFilePath());
       if (uFile.exists()) {
          Object[] objArray1 = new Object[i];
          a.D().A("RxExportApi", "rxSdkExport onFinished: des exist\(\) remove "+uFile, objArray1);
          if (!uFile.delete()) {
             Object[] objArray2 = new Object[i];
             a.D().A("RxExportApi", "rxSdkExport onFinished: remove failed "+uFile, objArray2);
          }
       }
       try{
          b.W(uFile1, uFile);
          p0.c = this.a;
       }catch(java.io.IOException e6){
          a.D().z("RxExportApi", "rxSdkExport onFinished: failed ", e6);
          p0.c = this.c;
       }
       this.b.d(100);
       this.d.onNext(this.b);
       this.d.onComplete();
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       e1 uoe1 = e1.class;
       if (PatchProxy.isSupport(uoe1) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoe1, "2")) {
          return;
       }
       if (Math.abs((p1 - 0x3ff0000000000000)) - 0x3eb0c6f7a0b5ed8d < 0) {
          this.b.e(0x3fefae147ae147ae);
       }else {
          this.b.e(p1);
       }
       this.d.onNext(this.b);
       return;
    }
}
