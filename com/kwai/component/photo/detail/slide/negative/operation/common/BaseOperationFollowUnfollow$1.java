package com.kwai.component.photo.detail.slide.negative.operation.common.BaseOperationFollowUnfollow$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import kotlin.jvm.internal.a;

public final class BaseOperationFollowUnfollow$1 extends Lambda implements a	// class@000a80
{
    public final QPhoto $photo;

    public void BaseOperationFollowUnfollow$1(QPhoto p0){
       this.$photo = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       User obj = PatchProxy.apply(null, this, BaseOperationFollowUnfollow$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.$photo.getUser();
       a.o(obj, "photo.user");
       return obj.isFollowingOrFollowRequesting();
    }
}
