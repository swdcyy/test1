package com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment$c;
import im8.g;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.previewer.ktv.f;
import java.util.Map;
import java.util.HashMap;

public class KtvBaseEditPreviewFragment$c implements g	// class@0015a9
{
    public KtvInfo b;

    public void KtvBaseEditPreviewFragment$c(KtvInfo p0){
       super();
       this.b = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvBaseEditPreviewFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, KtvBaseEditPreviewFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(KtvBaseEditPreviewFragment$c.class, new f());
       }else {
          obj.put(KtvBaseEditPreviewFragment$c.class, null);
       }
       return obj;
    }
}
