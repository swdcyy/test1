package com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogSwitchTwoButtonFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogSwitchTwoButtonFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import com.kwai.framework.model.user.User;
import l3c.e;

public class ProfileBottomDialogSwitchTwoButtonFragment$a extends m	// class@0012ed
{
    public final ProfileBottomDialogSwitchTwoButtonFragment c;

    public void ProfileBottomDialogSwitchTwoButtonFragment$a(ProfileBottomDialogSwitchTwoButtonFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBottomDialogSwitchTwoButtonFragment$a.class, "1")) {
          return;
       }
       this.c.dismissAllowingStateLoss();
       ProfileBottomDialogSwitchTwoButtonFragment$a tc = this.c;
       e.a(this.c.getActivity(), tc.w, tc.x);
       return;
    }
}
