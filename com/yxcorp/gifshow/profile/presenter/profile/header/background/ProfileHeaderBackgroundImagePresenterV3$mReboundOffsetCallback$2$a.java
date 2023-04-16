package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2$a;
import sj.k;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import kotlin.jvm.internal.a;
import android.view.View;

public final class ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2$a implements k	// class@0014b5
{
    public final ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2 a;

    public void ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2$a(ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2 p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,float p1,int p2){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2$a.class, "1")) {
          return;
       }
       ProfileHeaderBackgroundImagePresenterV3$mReboundOffsetCallback$2 this$0 = this.a.this$0;
       ProfileHeaderBackgroundImagePresenterV3 q = this$0.q;
       if (q == null) {
          a.S("mUserInfoContainer");
       }
       this$0.l9(q, (this.a.this$0.c9() + p2));
       this$0 = this.a.this$0;
       q = this$0.P;
       if (q != null) {
          this$0.l9(q, p2);
       }
       return;
    }
}
