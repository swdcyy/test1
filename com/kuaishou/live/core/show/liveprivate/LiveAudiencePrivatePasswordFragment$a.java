package com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import xa2.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.library.widget.edittext.SettingPasswordEdit;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import xa2.d;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;

public class LiveAudiencePrivatePasswordFragment$a extends m	// class@000c83
{
    public final LiveAudiencePrivatePasswordFragment c;

    public void LiveAudiencePrivatePasswordFragment$a(LiveAudiencePrivatePasswordFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePrivatePasswordFragment$a.class, "1")) {
          return;
       }
       LiveAudiencePrivatePasswordFragment$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, LiveAudiencePrivatePasswordFragment.class, "9")) {
          LiveAudiencePrivatePasswordFragment j = tc.j;
          if (!PatchProxy.applyVoidOneRefs(j, objArray, j.class, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "JOIN_BUTTON";
             u1.G("бн", 1, uElementPack, j.a(j));
          }
          if (tc.j.mLiveStreamModel != null && !TextUtils.x(tc.q.getPassword())) {
             if (!QCurrentUser.me().isLogined()) {
                y.a(tc.getActivity(), tc.getUrl(), "live_private_audience_enter", 0, null, tc.j, null, null, new d(tc));
             }else {
                tc.s.setEnabled(false);
                tc.ch();
             }
          }
       }
    label_007b :
       return;
    }
}
