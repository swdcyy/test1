package com.yxcorp.gifshow.encode.RxExportApi$a;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RxExportApi$a	// class@000d09
{
    public EditorSdk2MvAsset a;
    public String b;
    public EditorSdk2$TimeRange c;
    public int d;
    public float e;
    public float f;
    public int g;
    public int h;

    public void RxExportApi$a(EditorSdk2MvAsset p0,String p1,EditorSdk2$TimeRange p2,int p3,float p4,float p5,int p6,int p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RxExportApi$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RxExportConfig{mMvAsset="+this.a+", mMediaPath=\'"+this.b+'''+", mClipRange="+this.c+", mTemplateGrade="+this.d+", mExportStartX="+this.e+", mExportStartY="+this.f+", mExportWidth="+this.g+", mExportHeight="+this.h+'}';
    }
}
