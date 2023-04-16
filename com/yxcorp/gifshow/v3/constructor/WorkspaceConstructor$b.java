package com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$b;
import im8.g;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.constructor.g;
import java.util.Map;
import java.util.HashMap;

public class WorkspaceConstructor$b implements g	// class@000d3d
{
    public c b;
    public Intent c;
    public Pair d;
    public d e;
    public PublishSubject f;
    public final WorkspaceConstructor g;

    public void WorkspaceConstructor$b(WorkspaceConstructor p0){
       this.g = p0;
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WorkspaceConstructor$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, WorkspaceConstructor$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(WorkspaceConstructor$b.class, new g());
       }else {
          obj.put(WorkspaceConstructor$b.class, null);
       }
       return obj;
    }
}
