package com.yxcorp.gifshow.share.OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.OperationModelFactory$buildProfileModel$$inlined$build$lambda$1;
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

public final class OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$1 extends Lambda implements l	// class@001b66
{
    public final x $forward;
    public final OperationModelFactory$buildProfileModel$$inlined$build$lambda$1 this$0;

    public void OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$1(OperationModelFactory$buildProfileModel$$inlined$build$lambda$1 p0,x p1){
       this.this$0 = p0;
       this.$forward = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SharePlatformData$ShareConfig p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       String str = (a.g(this.this$0.$user$inlined.getId(), mE.getId()))? a1.p(R.string.arg_RES_7f104634): a1.r(R.string.arg_RES_7f104799, this.this$0.$user$inlined.getName());
       p0.mTitle = str;
       p0.mSubTitle = OperationModelFactory.j(this.this$0.$user$inlined.getText());
       p0.mShareUrl = b.e(this.$forward.y0(), this.$forward.f0(), this.this$0.$user$inlined);
       OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$1 tthis$0 = this.this$0;
       OperationModelFactory$buildProfileModel$$inlined$build$lambda$1 $bigHeadUrl$ = tthis$0.$bigHeadUrl$inlined;
       if ($bigHeadUrl$ == null) {
          User mAvatars = tthis$0.$user$inlined.mAvatars;
          if (mAvatars != null) {
             int i = (mAvatars.length > 0)? 1: 0;
             if (!i) {
                mAvatars = null;
             }
             if (mAvatars != null) {
                object oobject = mAvatars[0];
                if (oobject != null) {
                   $bigHeadUrl$ = oobject.mUrl;
                }
             }
          }
       label_0088 :
          $bigHeadUrl$ = null;
       }
       if ($bigHeadUrl$ == null) {
          $bigHeadUrl$ = tthis$0.$user$inlined.mAvatar;
       }
       p0.mCoverUrl = $bigHeadUrl$;
       PatchProxy.onMethodExit(OperationModelFactory$buildProfileModel$$inlined$build$lambda$1$1.class, "1");
       return;
    }
}
