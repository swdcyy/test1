package com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$b;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.cover.h0;
import java.util.Map;
import java.util.HashMap;

public class PhotosCoverEditorV3Fragment$b implements g	// class@000e29
{
    public PhotosCoverEditorV3Fragment b;
    public String c;
    public PublishSubject d;
    public f e;
    public PublishSubject f;
    public FontViewModel g;
    public PictureSelectView$d h;
    public boolean i;
    public EditDecorationContainerView j;
    public PublishSubject k;
    public PublishSubject l;

    public void PhotosCoverEditorV3Fragment$b(){
       super();
       this.c = "photosCover";
       this.d = PublishSubject.g();
       this.f = PublishSubject.g();
       this.h = null;
       this.i = false;
       this.k = PublishSubject.g();
       this.l = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotosCoverEditorV3Fragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PhotosCoverEditorV3Fragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PhotosCoverEditorV3Fragment$b.class, new h0());
       }else {
          obj.put(PhotosCoverEditorV3Fragment$b.class, null);
       }
       return obj;
    }
}
