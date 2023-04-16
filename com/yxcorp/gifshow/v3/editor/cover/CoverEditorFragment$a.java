package com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment;
import java.lang.Object;
import java.util.HashSet;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.cover.g;
import java.util.Map;
import java.util.HashMap;

public class CoverEditorFragment$a implements g	// class@000e25
{
    public int b;
    public String c;
    public Set d;
    public PublishSubject e;
    public final CoverEditorFragment f;

    public void CoverEditorFragment$a(CoverEditorFragment p0){
       this.f = p0;
       super();
       this.b = 9;
       this.d = new HashSet();
       this.e = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoverEditorFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, CoverEditorFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(CoverEditorFragment$a.class, new g());
       }else {
          obj.put(CoverEditorFragment$a.class, null);
       }
       return obj;
    }
}
