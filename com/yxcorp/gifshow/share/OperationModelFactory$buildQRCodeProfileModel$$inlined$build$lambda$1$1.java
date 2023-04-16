package com.yxcorp.gifshow.share.OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1;
import mhc.x;
import java.lang.Object;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import com.yxcorp.gifshow.share.OperationModelFactory;
import xv8.b;
import com.yxcorp.gifshow.model.CDNUrl;

public final class OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1$1 extends Lambda implements l	// class@001b69
{
    public final x $forward;
    public final OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1 this$0;

    public void OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1$1(OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1 p0,x p1){
       this.this$0 = p0;
       this.$forward = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SharePlatformData$ShareConfig p0){
       CDNUrl mUrl;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       String str = (a.g(this.this$0.$user$inlined.getId(), mE.getId()))? a1.p(R.string.arg_RES_7f104634): a1.r(R.string.arg_RES_7f104799, this.this$0.$user$inlined.getName());
       p0.mTitle = str;
       p0.mSubTitle = OperationModelFactory.j(this.this$0.$user$inlined.getText());
       p0.mShareUrl = b.e(this.$forward.y0(), this.$forward.f0(), this.this$0.$user$inlined);
       OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1 $user$inline = this.this$0.$user$inlined;
       User mAvatars = $user$inline.mAvatars;
       if (mAvatars != null) {
          object oobject = mAvatars[0];
          if (oobject != null) {
             mUrl = oobject.mUrl;
             if (mUrl != null) {
             label_007a :
                p0.mCoverUrl = mUrl;
                PatchProxy.onMethodExit(OperationModelFactory$buildQRCodeProfileModel$$inlined$build$lambda$1$1.class, "1");
                return;
             }
          }
       }
       mUrl = $user$inline.mAvatar;
       goto label_007a ;
    }
}
