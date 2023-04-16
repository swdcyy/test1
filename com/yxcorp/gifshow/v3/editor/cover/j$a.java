package com.yxcorp.gifshow.v3.editor.cover.j$a;
import im8.g;
import vl8.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.cover.a;
import java.util.Map;
import java.util.HashMap;

public class j$a extends c implements g	// class@000e72
{
    public final c c;
    public PublishSubject d;
    public Map e;
    public n0 f;

    public void j$a(c p0){
       super();
       this.c = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new a();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(j$a.class, new a());
       }else {
          obj.put(j$a.class, null);
       }
       return obj;
    }
}
