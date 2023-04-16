package com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogSwitchTwoButtonFragment$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogSwitchTwoButtonFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$SwitchInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import crd.b;
import lnc.b9;
import l3c.e;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import com.kwai.framework.model.user.User;
import z5c.y1;
import brd.t;
import z5c.x1;

public class ProfileBottomDialogSwitchTwoButtonFragment$b extends m	// class@0012ee
{
    public final ProfileBottomDialogSwitchTwoButtonFragment c;

    public void ProfileBottomDialogSwitchTwoButtonFragment$b(ProfileBottomDialogSwitchTwoButtonFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       ProfileBottomDialogSwitchTwoButtonFragment$b tc;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBottomDialogSwitchTwoButtonFragment$b.class, "1")) {
          return;
       }
       this.c.dismissAllowingStateLoss();
       ProfileBottomDialogSwitchTwoButtonFragment w = this.c.w;
       if (w != null) {
          ProfileDialogInfo mSwitchInfo = w.mSwitchInfo;
          if (mSwitchInfo != null && !TextUtils.x(mSwitchInfo.mKey)) {
             b9.a(this.c.v);
             tc = this.c;
             tc.v = tc.th(tc.w.mSwitchInfo.mKey, true);
          }
       }
       tc = this.c;
       ProfileBottomDialogSwitchTwoButtonFragment w1 = tc.w;
       w = tc.x;
       Object obj = null;
       if (!PatchProxy.applyVoidTwoRefs(w1, w, obj, e.class, "7")) {
          g.e(KsLogProfileTag.COMMON_DIALOG.appendTag("ProfileDialogHelper"), "clickSwitchConfirm");
          y1.q(w, w1, "confirm", obj);
          x1.a(w.getId(), true, w1.mSubBizId, 3, w1.mExtParamsStatics).subscribe();
       }
       return;
    }
}
