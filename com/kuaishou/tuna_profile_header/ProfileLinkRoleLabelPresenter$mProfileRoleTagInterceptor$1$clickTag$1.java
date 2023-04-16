package com.kuaishou.tuna_profile_header.ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.common.model.TagLabel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$1 extends Lambda implements a	// class@001171
{
    public final TagLabel $tagLabel;

    public void ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$1(TagLabel p0){
       this.$tagLabel = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "extra json error : "+this.$tagLabel.mExtraInfo;
    }
}
