package com.yxcorp.gifshow.encode.i$a;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.yxcorp.gifshow.encode.i;
import brd.v;
import com.yxcorp.gifshow.encode.i$b;
import com.yxcorp.gifshow.encode.g;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import q87.c;
import brd.g;
import java.lang.Exception;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.Throwable;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.io.File;
import qkd.b;
import jv7.f;
import java.lang.Double;

public final class i$a implements ExportEventListener	// class@000d23
{
    public v a;
    public i$b b;
    public final i c;

    public void i$a(i p0,v p1,i$b p2,g p3){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AssetExportManager", "onCancelled", objArray);
       this.c.d(p0);
       this.a.onComplete();
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("AssetExportManager", "onError", objArray);
       this.c.d(p0);
       this.a.onError(new Exception(p0.getError().message()));
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("AssetExportManager", "onFinished "+p0.getFilePath(), objArray);
       String filePath = p0.getFilePath();
       String str = "_exp_.mp4";
       if (filePath.endsWith(str)) {
          Object[] objArray1 = new Object[i];
          a.D().w("AssetExportManager", "onFinished: need rename file", objArray1);
          str = filePath.replace(str, "");
          File uFile = new File(str);
          if (uFile.exists()) {
             Object[] objArray2 = new Object[i];
             a.D().A("AssetExportManager", "onFinished: des exist\(\) remove "+uFile, objArray2);
             if (!uFile.delete()) {
                Object[] objArray3 = new Object[i];
                a.D().A("AssetExportManager", "onFinished: remove failed "+uFile, objArray3);
             }
          }
          try{
             File uFile1 = new File(filePath);
             b.W(uFile1, uFile);
             this.a.onNext(str);
          }catch(java.io.IOException e0){
             a.D().z("AssetExportManager", "onFinished: failed ", e0);
             this.a.onNext(filePath);
          }
       }else {
          this.a.onNext(filePath);
       }
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoa, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AssetExportManager", "progress: "+p1, objArray);
       i$a tb = this.b;
       if (tb != null) {
          tb.onProgress(p1);
       }
       return;
    }
}
