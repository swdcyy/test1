package com.yxcorp.gifshow.qrcode.model.QrDataWrapper;
import im8.g;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u7c.f;
import java.util.Map;
import java.util.HashMap;

public class QrDataWrapper extends SyncableProvider implements g	// class@0016e0
{
    public BaseFeed mBaseFeed;
    public User mUser;
    public static final long serialVersionUID = 0x5946582016e862b1;

    public void QrDataWrapper(BaseFeed p0){
       super();
       this.mBaseFeed = p0;
    }
    public void QrDataWrapper(User p0){
       super();
       this.mUser = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QrDataWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, QrDataWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(QrDataWrapper.class, new f());
       }else {
          obj.put(QrDataWrapper.class, null);
       }
       return obj;
    }
}
