package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mIsMine$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import z5c.d3;

public final class ProfileHeaderBackgroundImagePresenterV3$mIsMine$2 extends Lambda implements a	// class@0014b1
{
    public final ProfileHeaderBackgroundImagePresenterV3 this$0;

    public void ProfileHeaderBackgroundImagePresenterV3$mIsMine$2(ProfileHeaderBackgroundImagePresenterV3 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundImagePresenterV3$mIsMine$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d3.a(ProfileHeaderBackgroundImagePresenterV3.a9(this.this$0));
    }
}
