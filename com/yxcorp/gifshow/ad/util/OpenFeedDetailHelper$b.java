package com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;

public final class OpenFeedDetailHelper$b extends Accessor	// class@00186f
{

    public void OpenFeedDetailHelper$b(){
       super();
    }
    public Object get(){
       User user = PatchProxy.apply(null, this, OpenFeedDetailHelper$b.class, "1");
       if (user != PatchProxyResult.class) {
       }else {
          user = new User();
       }
       return user;
    }
}
