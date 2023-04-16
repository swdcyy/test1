package com.yxcorp.gifshow.v3.editor.frame_v2.network.EditCanvasBackgroundDownloadHelperV2$a;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditCanvasBackgroundDownloadHelperV2;
import wqc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.AdvEditUtil;
import arc.a;
import java.util.List;

public final class EditCanvasBackgroundDownloadHelperV2$a extends DownloadConfig	// class@000f99
{
    public b a;
    public final EditCanvasBackgroundDownloadHelperV2 b;

    public void EditCanvasBackgroundDownloadHelperV2$a(EditCanvasBackgroundDownloadHelperV2 p0,b p1){
       a.p(p1, "backgroundData");
       this.b = p0;
       super();
       this.a = p1;
    }
    public String getBizType(){
       return "CANVAS";
    }
    public File getFileFolder(){
       Object obj = PatchProxy.apply(null, this, EditCanvasBackgroundDownloadHelperV2$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdvEditUtil.e();
    }
    public String getFileName(){
       Object obj = PatchProxy.apply(null, this, EditCanvasBackgroundDownloadHelperV2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.b(this.a);
    }
    public String getMd5(){
       Object obj = PatchProxy.apply(null, this, EditCanvasBackgroundDownloadHelperV2$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.h;
    }
    public boolean getNeedUnzip(){
       return false;
    }
    public String getProjectName(){
       return ":ks-features:ft-post:edit";
    }
    public List getResourceUrls(){
       Object obj = PatchProxy.apply(null, this, EditCanvasBackgroundDownloadHelperV2$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c();
    }
}
