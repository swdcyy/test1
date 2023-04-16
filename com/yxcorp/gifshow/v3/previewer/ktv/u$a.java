package com.yxcorp.gifshow.v3.previewer.ktv.u$a;
import im8.g;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.previewer.ktv.t;
import java.util.Map;
import java.util.HashMap;

public class u$a implements g	// class@0015d2
{
    public c b;
    public KtvInfo c;

    public void u$a(KtvInfo p0,c p1){
       super();
       this.b = p1;
       this.c = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, u$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(u$a.class, new t());
       }else {
          obj.put(u$a.class, null);
       }
       return obj;
    }
}
