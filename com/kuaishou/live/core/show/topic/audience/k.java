package com.kuaishou.live.core.show.topic.audience.k;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.topic.audience.k$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.topic.audience.m;
import java.util.Map;
import java.util.HashMap;

public class k extends c implements g	// class@001209
{
    public final k$b p;
    public static String sLivePresenterClassName = "LiveAudienceTopicDetailHeaderDescriptionPresenter";

    public void k(){
       super();
       this.p = new k$a(this);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new m());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
}
