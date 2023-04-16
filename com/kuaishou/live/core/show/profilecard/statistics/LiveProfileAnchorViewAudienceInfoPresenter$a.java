package com.kuaishou.live.core.show.profilecard.statistics.LiveProfileAnchorViewAudienceInfoPresenter$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.show.profilecard.statistics.LiveProfileAnchorViewAudienceInfoPresenter;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.ViewGroup;
import wj2.r;
import ne2.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo$AudienceConsumptionModule;
import java.util.List;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;
import sf2.q;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo$InteractionItem;
import i2b.a;
import sf2.p;
import java.lang.CharSequence;

public final class LiveProfileAnchorViewAudienceInfoPresenter$a implements Observer	// class@000df3
{
    public final LiveProfileAnchorViewAudienceInfoPresenter b;

    public void LiveProfileAnchorViewAudienceInfoPresenter$a(LiveProfileAnchorViewAudienceInfoPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       LiveProfileAnchorViewAudienceInfoPresenter g;
       LiveProfileAnchorViewAudienceInfoPresenter liveProfileA = LiveProfileAnchorViewAudienceInfoPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileAnchorViewAudienceInfoPresenter$a.class, "1")) {
       }else {
          UserProfile userProfile = p0.component1();
          p0 = p0.component2();
          LiveProfileAnchorViewAudienceInfoPresenter$a tb = this.b;
          a.o(userProfile, "userProfile");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(userProfile, tb, liveProfileA, "5")) {
             LiveProfileAnchorViewAudienceInfoPresenter f = tb.F;
             if (f == null) {
                a.S("userAvatarView");
             }
             HeadImageSize sMALL = HeadImageSize.SMALL;
             g.d(f, userProfile.mProfile, sMALL);
             LiveProfileAnchorViewAudienceInfoPresenter e = tb.E;
             if (e == null) {
                a.S("anchorAvatarView");
             }
             g.a(e, QCurrentUser.ME, sMALL);
          }
          tb = this.b;
          userProfile = userProfile.mProfile;
          a.o(userProfile, "userProfile.mProfile");
          a.o(p0, "extraInfo");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidTwoRefs(userProfile, p0, tb, liveProfileA, "6")) {
             p0 = p0.mAudienceConsumptionModule;
             String str = "partContainer";
             if (p0 != null) {
                LiveProfileAnchorViewAudienceInfoPresenter y = tb.y;
                if (y == null) {
                   a.S(str);
                }
                int i = 0;
                y.setVisibility(i);
                y = tb.x;
                if (y == null) {
                   a.S("liveProfileCardLogger");
                }
                LiveProfileAnchorViewAudienceInfoPresenter w = tb.w;
                if (w == null) {
                   a.S("profileCallerContext");
                }
                r c = w.c;
                Objects.requireNonNull(y);
                if (!PatchProxy.applyVoidOneRefs(c, y, k.class, "40")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "PERSONAL_CARD_DATA";
                   u1.B0(new ShowMetaData().setLogPage(c).setElementPackage(uElementPack).setContentPackage(y.a()));
                }
                String str1 = "detailJumpView";
                String str2 = "detailView";
                String str3 = "partTopContainer";
                if (p0.mInteractionItems.isEmpty()) {
                   g = tb.G;
                   if (g == null) {
                      a.S("infoContainer");
                   }
                   g.setVisibility(8);
                   g = tb.H;
                   if (g == null) {
                      a.S("infoHintTextView");
                   }
                   g.setVisibility(i);
                   liveProfileA = tb.C;
                   if (liveProfileA == null) {
                      a.S(str2);
                   }
                   liveProfileA.setVisibility(8);
                   liveProfileA = tb.B;
                   if (liveProfileA == null) {
                      a.S(str1);
                   }
                   liveProfileA.setVisibility(8);
                   liveProfileA = tb.z;
                   if (liveProfileA == null) {
                      a.S(str3);
                   }
                   liveProfileA.setOnClickListener(null);
                }else {
                   y = tb.z;
                   if (y == null) {
                      a.S(str3);
                   }
                   y.setOnClickListener(new q(tb, p0, userProfile));
                   y = tb.C;
                   if (y == null) {
                      a.S(str2);
                   }
                   y.setVisibility(i);
                   y = tb.B;
                   if (y == null) {
                      a.S(str1);
                   }
                   y.setVisibility(i);
                   y = tb.G;
                   if (y == null) {
                      a.S("infoContainer");
                   }
                   y.setVisibility(i);
                   LiveUserProfileExtraInfo$AudienceConsumptionModule mInteraction = p0.mInteractionItems;
                   a.o(mInteraction, "audienceConsumptionModule.mInteractionItems");
                   if (!PatchProxy.applyVoidThreeRefs(mInteraction, userProfile, p0, tb, LiveProfileAnchorViewAudienceInfoPresenter.class, "7")) {
                      y = tb.G;
                      if (y == null) {
                         a.S("infoContainer");
                      }
                      y.removeAllViews();
                      ArrayList uArrayList = new ArrayList(u.Y(mInteraction, 10));
                      Iterator iterator = mInteraction.iterator();
                      while (iterator.hasNext()) {
                         LiveUserProfileExtraInfo$InteractionItem interactionI = iterator.next();
                         LiveProfileAnchorViewAudienceInfoPresenter g1 = tb.G;
                         if (g1 == null) {
                            a.S("infoContainer");
                         }
                         View view = a.i(g1, R.layout.arg_RES_7f0d0d48);
                         view.setOnClickListener(new p(interactionI, tb, userProfile, p0));
                         View view1 = view.findViewById(R.id.live_profile_anchor_view_audience_cell_name);
                         a.o(view1, "findViewById<TextView>\(\n¡­ience_cell_name\n        \)");
                         view1.setText(interactionI.mDes);
                         view1 = view.findViewById(R.id.live_profile_anchor_view_audience_cell_value);
                         a.o(view1, "findViewById<TextView>\(\n¡­ence_cell_value\n        \)");
                         view1.setText(interactionI.mContent);
                         view1 = view.findViewById(R.id.live_profile_anchor_view_audience_cell_unit);
                         a.o(view1, "findViewById<TextView>\(\n¡­ience_cell_unit\n        \)");
                         view1.setText(interactionI.mUnit);
                         uArrayList.add(view);
                      }
                      iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         View view2 = iterator.next();
                         y = tb.G;
                         if (y == null) {
                            a.S("infoContainer");
                         }
                         y.addView(view2);
                      }
                   }
                   liveProfileA = tb.H;
                   if (liveProfileA == null) {
                      a.S("infoHintTextView");
                   }
                   liveProfileA.setVisibility(8);
                }
                liveProfileA = tb.A;
                if (liveProfileA == null) {
                   a.S("titleView");
                }
                liveProfileA.setText(p0.mInteractionPartTitle);
             }else {
                p0 = tb.y;
                if (p0 == null) {
                   a.S(str);
                }
                p0.setVisibility(8);
             }
          }
       }
       return;
    }
}
