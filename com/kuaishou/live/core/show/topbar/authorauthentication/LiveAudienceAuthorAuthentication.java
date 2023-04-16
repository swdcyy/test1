package com.kuaishou.live.core.show.topbar.authorauthentication.LiveAudienceAuthorAuthentication;
import java.io.Serializable;
import java.lang.Object;
import ms5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ms5.a$a;
import com.yxcorp.gifshow.model.CDNUrl;

public class LiveAudienceAuthorAuthentication implements Serializable	// class@0011d2
{
    public int mEnterDelay;
    public int mEnterDuration;
    public int mExitDuration;
    public CDNUrl[] mImageUrlV2;
    public int mShowDuration;
    public static final long serialVersionUID = 0xe05c6a797a5149bd;

    public void LiveAudienceAuthorAuthentication(){
       super();
    }
    public a convertToReinforceItem(){
       a$a obj = PatchProxy.apply(null, this, LiveAudienceAuthorAuthentication.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a(this.mImageUrlV2);
       obj.d((long)this.mEnterDelay);
       obj.f((long)this.mShowDuration);
       return obj.a();
    }
}
