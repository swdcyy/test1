package com.yxcorp.gifshow.profile.dialog.ProfileBottomSwitchDialogFragment$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomSwitchDialogFragment;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$SwitchInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import crd.b;
import lnc.b9;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.profile.util.f;
import f3c.g;
import f3c.f;
import erd.g;

public class ProfileBottomSwitchDialogFragment$a implements SlipSwitchButton$a	// class@0012f1
{
    public final ProfileBottomSwitchDialogFragment b;

    public void ProfileBottomSwitchDialogFragment$a(ProfileBottomSwitchDialogFragment p0){
       this.b = p0;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       b uob;
       if (PatchProxy.isSupport(ProfileBottomSwitchDialogFragment$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, ProfileBottomSwitchDialogFragment$a.class, "1")) {
          return;
       }
       if (p2) {
          ProfileBottomSwitchDialogFragment o = this.b.o;
          if (o != null) {
             ProfileDialogInfo mSwitchInfo = o.mSwitchInfo;
             if (mSwitchInfo != null && !TextUtils.x(mSwitchInfo.mKey)) {
                b9.a(this.b.q);
                ProfileBottomSwitchDialogFragment$a tb = this.b;
                ProfileDialogInfo$SwitchInfo mKey = tb.o.mSwitchInfo.mKey;
                Objects.requireNonNull(tb);
                if (PatchProxy.isSupport(ProfileBottomSwitchDialogFragment.class)) {
                   uob = PatchProxy.applyThreeRefs(p0, mKey, Boolean.valueOf(p1), tb, ProfileBottomSwitchDialogFragment.class, "9");
                   if (uob != PatchProxyResult.class) {
                   label_0077 :
                      tb.q = uob;
                   }
                }
                uob = f.b(mKey, p1).subscribe(new g(tb, p0, p0.getSwitch()), new f(tb, p0));
                goto label_0077 ;
             }
          }
       }
       return;
    }
}
