package com.yxcorp.gifshow.video.b$c;
import com.yxcorp.gifshow.video.c$e;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Object;
import com.kwai.video.editorsdk2.VideoEditorSession;
import com.yxcorp.gifshow.video.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.video.b$c$b;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.yxcorp.gifshow.video.c$c;
import com.yxcorp.gifshow.video.b$c$a;
import com.yxcorp.gifshow.video.c$g;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.yxcorp.gifshow.video.b$e;

public class b$c implements c$e	// class@00168d
{
    public ExportTask a;
    public VideoEditorSession b;

    public void b$c(ExportTask p0){
       super();
       this.a = p0;
    }
    public void b$c(ExportTask p0,VideoEditorSession p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "2")) {
          return;
       }
       this.a.setExportEventListener(new b$c$b(this, p0));
       return;
    }
    public void b(c$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       this.a.setExportEventListener(new b$c$a(this, p0));
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "5")) {
          return;
       }
       this.a.cancel();
       return;
    }
    public c$g getError(){
       Object[] objArray = null;
       EditorSdk2$EditorSdkError obj = PatchProxy.apply(objArray, this, b$c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getError();
       if (obj == null) {
          return objArray;
       }
       return new b$e(obj);
    }
    public String getFilePath(){
       Object obj = PatchProxy.apply(null, this, b$c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getFilePath();
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "3")) {
          return;
       }
       this.a.release();
       b$c tb = this.b;
       if (tb != null) {
          tb.release();
       }
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "4")) {
          return;
       }
       this.a.run();
       return;
    }
}
