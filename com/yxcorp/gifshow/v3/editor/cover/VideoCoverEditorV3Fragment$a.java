package com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.cover.p1;
import java.util.Map;
import java.util.HashMap;

public class VideoCoverEditorV3Fragment$a implements g	// class@000e33
{
    public VideoCoverEditorV3Fragment b;
    public String c;
    public f d;
    public FontViewModel e;
    public EditCoverSeekBar$c f;
    public EditDecorationContainerView g;
    public ExpandFoldHelperView h;
    public PublishSubject i;
    public final VideoCoverEditorV3Fragment j;

    public void VideoCoverEditorV3Fragment$a(VideoCoverEditorV3Fragment p0){
       this.j = p0;
       super();
       this.c = "videoCover";
       this.f = null;
       this.h = null;
       this.i = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoCoverEditorV3Fragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, VideoCoverEditorV3Fragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(VideoCoverEditorV3Fragment$a.class, new p1());
       }else {
          obj.put(VideoCoverEditorV3Fragment$a.class, null);
       }
       return obj;
    }
}
