package com.kuaishou.live.core.show.profilecard.statistics.LiveProfileAnchorViewAudienceInfoPresenter;
import a51.c;
import ne2.k;
import java.lang.String;
import kotlin.jvm.internal.a;
import wj2.r;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.profilecard.statistics.LiveProfileAnchorViewAudienceInfoPresenter$onBind$1;
import androidx.lifecycle.LiveData;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.core.show.profilecard.statistics.LiveProfileAnchorViewAudienceInfoPresenter$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo$AudienceConsumptionModule;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo$InteractionItem;
import org.json.JSONObject;
import java.util.Collection;
import org.json.JSONArray;
import java.lang.StringBuilder;
import sf2.o;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.LinearLayout;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class LiveProfileAnchorViewAudienceInfoPresenter extends c	// class@000df5
{
    public TextView A;
    public View B;
    public TextView C;
    public View D;
    public KwaiImageView E;
    public KwaiImageView F;
    public LinearLayout G;
    public TextView H;
    public LiveProfileParams v;
    public r w;
    public k x;
    public ViewGroup y;
    public ViewGroup z;
    public static String sLivePresenterClassName = "LiveProfileAnchorViewAudienceInfoPresenter";

    public void LiveProfileAnchorViewAudienceInfoPresenter(){
       super();
    }
    public static final k S8(LiveProfileAnchorViewAudienceInfoPresenter p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("liveProfileCardLogger");
       }
       return p0;
    }
    public static final r V8(LiveProfileAnchorViewAudienceInfoPresenter p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("profileCallerContext");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveProfileAnchorViewAudienceInfoPresenter.class, "3")) {
          return;
       }
       super.E8();
       LiveProfileAnchorViewAudienceInfoPresenter tw = this.w;
       String str = "profileCallerContext";
       if (tw == null) {
          a.S(str);
       }
       r n = tw.n;
       a.o(n, "profileCallerContext.mUserProfileLiveData");
       LiveProfileAnchorViewAudienceInfoPresenter tw1 = this.w;
       if (tw1 == null) {
          a.S(str);
       }
       r o = tw1.o;
       a.o(o, "profileCallerContext.mUs¡­fileLiveExtraInfoLiveData");
       LiveData liveData = LiveDataOperators.e(n, o, LiveProfileAnchorViewAudienceInfoPresenter$onBind$1.INSTANCE);
       liveData.observe(this, new LiveProfileAnchorViewAudienceInfoPresenter$a(this));
       return;
    }
    public final void W8(String p0,UserInfo p1,LiveUserProfileExtraInfo$AudienceConsumptionModule p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveProfileAnchorViewAudienceInfoPresenter.class, "8")) {
          return;
       }
       String str = "UTF-8";
       String str1 = URLEncoder.encode(p1.mHeadUrl, str);
       p2 = p2.mInteractionItems;
       a.o(p2, "audienceConsumptionModule.mInteractionItems");
       ArrayList uArrayList = new ArrayList(u.Y(p2, 10));
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("tabType", iterator.next().mTabType);
          uArrayList.add(jSONObject);
       }
       JSONArray jSONArray = new JSONArray();
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          jSONArray.put(iterator1.next());
       }
       p0 = p0+"&audienceId="+p1.mId+"&userName="+p1.mName+"&userAvatarUrl="+str1+"&tabList="+URLEncoder.encode(jSONArray.toString(), str);
       LiveProfileAnchorViewAudienceInfoPresenter tw = this.w;
       if (tw == null) {
          a.S("profileCallerContext");
       }
       r k = tw.k;
       if (k != null) {
          k.d(p0);
       }
       return;
    }
    public void doBindView(View p0){
       LiveProfileAnchorViewAudienceInfoPresenter liveProfileA = LiveProfileAnchorViewAudienceInfoPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveProfileA, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.live_profile_anchor_avatar_icon);
       a.o(view, "ViewBindUtils.bindWidget¡­_anchor_avatar_icon\n    \)");
       this.E = view;
       view = m1.f(p0, R.id.live_profile_anchor_view_audience_info_top);
       a.o(view, "ViewBindUtils.bindWidget¡­w_audience_info_top\n    \)");
       this.z = view;
       view = m1.f(p0, R.id.live_profile_user_avatar_icon);
       a.o(view, "ViewBindUtils.bindWidget¡­le_user_avatar_icon\n    \)");
       this.F = view;
       view = m1.f(p0, R.id.live_profile_anchor_view_audience_container);
       a.o(view, "ViewBindUtils.bindWidget¡­_audience_container\n    \)");
       this.y = view;
       view = m1.f(p0, R.id.live_profile_anchor_view_audience_info_title);
       a.o(view, "ViewBindUtils.bindWidget¡­audience_info_title\n    \)");
       this.A = view;
       view = m1.f(p0, R.id.live_profile_anchor_view_audience_info_detail);
       a.o(view, "ViewBindUtils.bindWidget¡­udience_info_detail\n    \)");
       this.C = view;
       view = m1.f(p0, R.id.live_profile_anchor_view_audience_info_detail_jump);
       a.o(view, "ViewBindUtils.bindWidget¡­ce_info_detail_jump\n    \)");
       this.B = view;
       view = m1.f(p0, R.id.live_profile_anchor_view_audience_info_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ence_info_container\n    \)");
       this.G = view;
       view = m1.f(p0, R.id.live_profile_anchor_view_audience_info_hint);
       a.o(view, "ViewBindUtils.bindWidget¡­_audience_info_hint\n    \)");
       this.H = view;
       p0 = m1.f(p0, R.id.live_profile_anchor_view_audience_divider);
       a.o(p0, "ViewBindUtils.bindWidget¡­ew_audience_divider\n    \)");
       this.D = p0;
       if (!PatchProxy.applyVoid(null, this, liveProfileA, "4")) {
          LiveProfileAnchorViewAudienceInfoPresenter ty = this.y;
          if (ty == null) {
             a.S("partContainer");
          }
          b uob = new b();
          uob.v(a1.a(R.color.arg_RES_7f060617));
          uob.x(0x3f000000);
          int i = 0x7f060610;
          uob.w(a1.a(i));
          uob.g(KwaiRadiusStyles.R8);
          ty.setBackground(uob.a());
          ty = this.D;
          if (ty == null) {
             a.S("dividerView");
          }
          uob = new b();
          uob.v(a1.a(i));
          ty.setBackground(uob.a());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveProfileAnchorViewAudienceInfoPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(LiveProfileParams.class);
       a.o(obj, "inject\(LiveProfileParams::class.java\)");
       this.v = obj;
       obj = this.q8(r.class);
       a.o(obj, "inject\(LiveProfileCallerContext::class.java\)");
       this.w = obj;
       obj = this.q8(k.class);
       a.o(obj, "inject\(LiveProfileCardLogger::class.java\)");
       this.x = obj;
       return;
    }
}
