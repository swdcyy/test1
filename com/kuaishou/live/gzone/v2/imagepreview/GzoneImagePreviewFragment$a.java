package com.kuaishou.live.gzone.v2.imagepreview.GzoneImagePreviewFragment$a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.gzone.v2.imagepreview.e;
import java.util.Map;
import java.util.HashMap;

public class GzoneImagePreviewFragment$a implements g	// class@001cc3
{
    public List b;
    public int c;
    public PublishSubject d;

    public void GzoneImagePreviewFragment$a(){
       super();
       this.d = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GzoneImagePreviewFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, GzoneImagePreviewFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(GzoneImagePreviewFragment$a.class, new e());
       }else {
          obj.put(GzoneImagePreviewFragment$a.class, null);
       }
       return obj;
    }
}
