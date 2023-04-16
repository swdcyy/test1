package com.yxcorp.gifshow.share.history.ShareHistoryFragment$a;
import y8c.f$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.history.f;
import java.util.Map;

public class ShareHistoryFragment$a extends f$b	// class@001bac
{
    public ReplaySubject h;
    public List i;
    public PublishSubject j;
    public PublishSubject k;

    public void ShareHistoryFragment$a(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareHistoryFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ShareHistoryFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ShareHistoryFragment$a.class, new f());
       }else {
          obj.put(ShareHistoryFragment$a.class, null);
       }
       return obj;
    }
}
