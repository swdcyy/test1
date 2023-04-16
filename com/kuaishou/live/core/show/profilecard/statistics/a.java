package com.kuaishou.live.core.show.profilecard.statistics.a;
import a51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import android.widget.FrameLayout;
import sf2.a;
import android.view.View$OnClickListener;
import sf2.b;
import sf2.c;
import sf2.d;
import ne2.k;
import wj2.r;
import sf2.e;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import sf2.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import com.kuaishou.live.core.show.profilecard.b;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.profilecard.statistics.LiveAnchorStatisticInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sf2.o;

public class a extends c	// class@000df6
{
    public ViewStub A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public FrameLayout H;
    public TextView I;
    public TextView J;
    public r v;
    public LiveProfileParams w;
    public LiveAnchorStatisticInfo x;
    public o y;
    public k z;
    public static String sLivePresenterClassName = "LiveProfileAnchorStatisticsInfoPresenter";

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          this.A.setLayoutResource(R.layout.arg_RES_7f0d0d46);
          View view = this.A.inflate();
          if (!PatchProxy.applyVoidOneRefs(view, this, uoa, "5")) {
             this.D = m1.f(view, 0x7f0a23c0);
             this.B = m1.f(view, 0x7f0a23c3);
             this.C = m1.f(view, 0x7f0a23b7);
             this.E = m1.f(view, 0x7f0a23c6);
             this.F = m1.f(view, 0x7f0a23b6);
             this.G = m1.f(view, 0x7f0a23c5);
             this.H = m1.f(view, 0x7f0a23c4);
             this.I = m1.f(view, 0x7f0a23bc);
             this.J = m1.f(view, 0x7f0a23ba);
             m1.a(view, new a(this), R.id.live_profile_statistics_info_group_1_container);
             m1.a(view, new b(this), R.id.live_profile_statistics_info_group_2_container);
             m1.a(view, new c(this), R.id.live_profile_statistics_info_group_3_container);
             m1.a(view, new d(this), R.id.live_profile_statistics_get_gift_container);
          }
       }
       this.Y8();
       this.z.r("LIKE");
       this.z.r("FANS");
       this.z.r("FANS_GROUP");
       this.z.r("GIFT");
       uoa = this.v;
       uoa.n.observe(uoa.e, new e(this));
       uoa = this.v;
       uoa.o.observe(uoa.e, new f(this));
       return;
    }
    public final int S8(){
       UserProfile obj = PatchProxy.apply(null, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.w.getUserProfile().mOwnerCount;
       int i = -1;
       if (obj != null) {
          UserOwnerCount mFan = obj.mFan;
          if (mFan != i) {
             i = mFan;
          }
       }
       return i;
    }
    public final int V8(){
       LiveUserProfileExtraInfo obj = PatchProxy.apply(null, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.v.o.getValue();
       int i = (obj == null)? -1: obj.mFansGroupMemberCount;
       return i;
    }
    public final String W8(){
       Object obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.e(this.v.o.getValue());
    }
    public final int X8(){
       LiveUserProfileExtraInfo obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.v.o.getValue();
       int i = (obj == null)? -1: obj.mTotalReceivedGiftCount;
       return i;
    }
    public final void Y8(){
       int i2;
       int i3;
       LiveAnchorStatisticInfo mFansGroupMe;
       int i4;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          this.D.setText(this.W8());
       }
       int i = 8;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "9")) {
          i2 = this.S8();
          if (i2 != -1) {
             mFansGroupMe = this.x.mFansCount;
             b.d0(LiveLogTag.LIVE_PROFILE, "updateFansCount", "base", Integer.valueOf(mFansGroupMe), "current", Integer.valueOf(i2));
             if (mFansGroupMe == -1) {
                this.x.mFansCount = i2;
                i4 = i2;
             }
             i3 = i2 - i4;
             if (i3 <= 0) {
                this.x.mFansCount = i2;
                this.C.setVisibility(i);
                this.B.setText(b.d(i2));
             }else {
                this.C.setVisibility(0);
                this.C.setText("+"+b.d(i3));
                this.B.setText(b.d(i4));
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          i2 = this.V8();
          if (i2 != -1) {
             LiveUserProfileExtraInfo value = this.v.o.getValue();
             i3 = 1;
             if (value != null && value.mDisableFansGroup != null) {
                this.H.setEnabled(0);
                this.F.setVisibility(i);
                this.E.setTextSize(i3, 14.00f);
                this.E.setText(R.string.arg_RES_7f102a90);
                this.G.setText(R.string.arg_RES_7f102128);
             }else {
                this.G.setText(R.string.arg_RES_7f102a85);
                this.H.setEnabled(i3);
                mFansGroupMe = this.x.mFansGroupMemberCount;
                b.d0(LiveLogTag.LIVE_PROFILE, "updateFansGroupCount", "base", Integer.valueOf(mFansGroupMe), "current", Integer.valueOf(i2));
                if (mFansGroupMe == -1) {
                   this.x.mFansGroupMemberCount = i2;
                   mFansGroupMe = i2;
                }
                i3 = i2 - mFansGroupMe;
                if (i3 <= 0) {
                   this.x.mFansGroupMemberCount = i2;
                   this.F.setVisibility(i);
                   this.E.setText(b.d(i2));
                }else {
                   this.F.setVisibility(0);
                   this.F.setText("+"+b.d(i3));
                   this.E.setText(b.d(mFansGroupMe));
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          int i1 = this.X8();
          if (i1 != -1) {
             LiveAnchorStatisticInfo mTotalReceiv = this.x.mTotalReceivedGiftCount;
             b.d0(LiveLogTag.LIVE_PROFILE, "updateGiftCount", "base", Integer.valueOf(mTotalReceiv), "current", Integer.valueOf(i1));
             if (mTotalReceiv == -1) {
                this.x.mTotalReceivedGiftCount = i1;
                mTotalReceiv = i1;
             }
             i2 = i1 - mTotalReceiv;
             if (i2 <= 0) {
                this.x.mTotalReceivedGiftCount = i1;
                this.J.setVisibility(i);
                this.I.setText(b.d(i1));
             }else {
                this.J.setVisibility(0);
                this.J.setText("+"+b.d(i2));
                this.I.setText(b.d(mTotalReceiv));
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a2355);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.v = this.q8(r.class);
       this.w = this.q8(LiveProfileParams.class);
       this.x = this.q8(LiveAnchorStatisticInfo.class);
       this.y = this.s8(o.class);
       this.z = this.q8(k.class);
       return;
    }
}
