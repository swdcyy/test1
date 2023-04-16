package com.kwai.component.photo.detail.slide.negative.operation.common.BaseOperationFollowUnfollow;
import mf5.w0;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.negative.operation.common.BaseOperationFollowUnfollow$1;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;

public abstract class BaseOperationFollowUnfollow extends w0	// class@000a81
{

    public void BaseOperationFollowUnfollow(String p0,QPhoto p1){
       a.p(p0, "type");
       a.p(p1, "photo");
       super(p0);
       this.T(R.string.arg_RES_7f100f8f);
       this.l = 0x7f104f05;
       int i = (this.W())? 0x7f080b0b: 0x7f08053f;
       this.L(i);
       i = (this.W())? 0x7f080af4: 0x7f080575;
       this.P(i);
       this.O(new BaseOperationFollowUnfollow$1(p1));
       return;
    }
    public final boolean W(){
       Object obj = PatchProxy.apply(null, this, BaseOperationFollowUnfollow.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.d();
    }
}
