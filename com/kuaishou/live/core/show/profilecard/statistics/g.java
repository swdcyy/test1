package com.kuaishou.live.core.show.profilecard.statistics.g;
import a51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f82.d;
import sf2.u;
import erd.g;
import crd.b;
import eoc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wj2.r;
import sf2.s;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import sf2.t;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.profilecard.b;
import ne2.k;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import android.view.ViewGroup;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserSettingOption;
import android.view.View;
import ekd.m1;
import sf2.r;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;

public class g extends c	// class@000dfc
{
    public ViewGroup A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public boolean H;
    public r v;
    public LiveProfileParams w;
    public k x;
    public GifshowActivity y;
    public Fragment z;
    public static String sLivePresenterClassName = "LiveProfileStatisticsInfoPresenter";

    public void g(){
       super();
       this.H = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       super.E8();
       this.X7(f.a(d.class, new u(this)));
       g tv = this.v;
       tv.n.observe(tv.e, new s(this));
       tv = this.v;
       tv.o.observe(tv.e, new t(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       super.J8();
       this.H = false;
       return;
    }
    public final String S8(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (p0 == -1)? "0": b.d(p0);
       return str;
    }
    public final void V8(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "8")) {
          return;
       }
       if (this.H != null) {
          return;
       }
       this.H = true;
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.x.r(p0[i]);
       }
       return;
    }
    public final void W8(){
       int b;
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, og, "6")) {
          return;
       }
       UserProfile userProfile = this.w.getUserProfile();
       LiveUserProfileExtraInfo value = this.v.o.getValue();
       if (value == null) {
          return;
       }
       int i = 0;
       if (value.mAudienceConsumptionModule == null) {
          this.A.setVisibility(i);
       }else {
          this.A.setVisibility(8);
       }
       UserProfile mOwnerCount = userProfile.mOwnerCount;
       int i1 = 1;
       if (value.mProfileCardStatisticsInfoType == 2) {
          String[] stringArray = new String[]{"LIKE","FANS","FANS_GROUP"};
          this.V8(stringArray);
          this.B.setText(b.e(value));
          this.C.setText(R.string.arg_RES_7f102a89);
          this.D.setText(this.S8(mOwnerCount.mFan));
          this.E.setText(R.string.arg_RES_7f101036);
          if (value.mDisableFansGroup != null) {
             this.F.setTextSize(i1, 14.00f);
             this.F.setText(R.string.arg_RES_7f102a90);
             this.G.setText(R.string.arg_RES_7f102128);
          }else {
             this.F.setText(b.d(value.mFansGroupMemberCount));
             this.G.setText(R.string.arg_RES_7f102a85);
          }
       }else {
          String[] stringArray1 = new String[]{"FOLLOW","FANS","WORK_NUM"};
          this.V8(stringArray1);
          this.B.setText(this.S8(mOwnerCount.mFollow));
          this.C.setText(R.string.arg_RES_7f100f8f);
          this.D.setText(this.S8(mOwnerCount.mFan));
          this.E.setText(R.string.arg_RES_7f101036);
          UserProfile obj = PatchProxy.applyOneRefs(userProfile, this, og, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = userProfile.mUserSettingOption;
             b = (obj != null && obj.isPrivacyUser != null)? 1: 0;
             if (userProfile.isFollowingOrFollowRequesting() || !b) {
                i1 = 0;
             }
             b = i1;
          }
          if (!b) {
             i = mOwnerCount.mPublicPhoto;
          }
          this.F.setText(this.S8(i));
          this.G.setText(R.string.arg_RES_7f103bfd);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a23bd);
       this.B = m1.f(p0, 0x7f0a23c0);
       this.C = m1.f(p0, 0x7f0a23bf);
       this.D = m1.f(p0, 0x7f0a23c3);
       this.E = m1.f(p0, 0x7f0a23c2);
       this.F = m1.f(p0, 0x7f0a23c6);
       this.G = m1.f(p0, 0x7f0a23c5);
       m1.a(p0, new r(this), R.id.live_profile_statistics_info_container);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.v = this.q8(r.class);
       this.w = this.q8(LiveProfileParams.class);
       this.x = this.q8(k.class);
       this.y = this.q8(GifshowActivity.class);
       this.z = this.q8(Fragment.class);
       return;
    }
}
