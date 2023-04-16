package com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewFragment$a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.article.imagepreview.f;
import java.util.Map;
import java.util.HashMap;

public class ImagePreviewFragment$a implements g	// class@001349
{
    public List b;
    public int c;
    public PublishSubject d;
    public QPhoto e;

    public void ImagePreviewFragment$a(){
       super();
       this.d = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImagePreviewFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ImagePreviewFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ImagePreviewFragment$a.class, new f());
       }else {
          obj.put(ImagePreviewFragment$a.class, null);
       }
       return obj;
    }
}
