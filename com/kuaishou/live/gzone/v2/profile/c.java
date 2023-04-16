package com.kuaishou.live.gzone.v2.profile.c;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneProfileParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$GuildData;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$GuildInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView;
import java.util.Collection;
import ekd.q;
import java.util.List;
import android.widget.ImageView;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$GuildMedal;
import e63.e1;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import e63.p;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import java.util.Iterator;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$Tag;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$TradeTag;
import t02.a0;
import y43.a;
import k53.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import dz1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import e63.f1;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView$c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class c implements g	// class@001cdc
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       ClientContent$LiveStreamPackage liveStreamPa;
       c tb = this.b;
       if (!tb.r.isGzoneAuthorAuthenticationTagEnabled()) {
       }else {
          LiveGzoneAuthorAuthenticationTagResponse mGuildData = p0.mGuildData;
          int i = 8;
          if (!PatchProxy.applyVoidOneRefs(mGuildData, tb, e.class, "7") && tb.s1 != null) {
             if (mGuildData != null) {
                LiveGzoneAuthorAuthenticationTagResponse$GuildData mGuildInfo = mGuildData.mGuildInfo;
                if (mGuildInfo != null && !TextUtils.x(mGuildInfo.mViewName)) {
                   KwaiImageView kwaiImageVie = tb.s1.findViewById(R.id.live_gzone_profile_guild_medal_image);
                   View view = tb.s1.findViewById(R.id.live_gzone_profile_guild_medal_divider);
                   tb.s1.setVisibility(0);
                   LiveGzoneProfileTagsView.b(tb.s1.findViewById(R.id.live_gzone_profile_guild_name_text), mGuildData.mGuildInfo.mViewName, "https://static.yximgs.com/udata/pkg/kwai-client-image/gzone_verified_guild_icon_new.png", 0);
                   if (q.f(mGuildData.mGuildMedalList) || mGuildData.mGuildMedalList.get(0) == null) {
                      kwaiImageVie.setVisibility(i);
                      view.setVisibility(i);
                   }else {
                      kwaiImageVie.setVisibility(0);
                      view.setVisibility(0);
                      kwaiImageVie.a0(mGuildData.mGuildMedalList.get(0).mMedalIcon, new e1(tb, kwaiImageVie));
                      LiveGzoneAuthorAuthenticationTagResponse$GuildMedal mMedalLink = mGuildData.mGuildMedalList.get(0).mMedalLink;
                      if (!TextUtils.x(mMedalLink)) {
                         kwaiImageVie.setOnClickListener(new p(tb, mMedalLink));
                      }
                   }
                }
             }
             tb.s1.setVisibility(i);
          }
       label_00b0 :
          p0 = p0.mTags;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, e.class, "8") && tb.q1 != null) {
             if (q.f(p0)) {
                tb.q1.setVisibility(i);
                tb.r1.setVisibility(i);
             }else {
                tb.q1.setVisibility(0);
                tb.q1.setTags(p0);
                tb.r1.setVisibility(0);
             }
             p0 = p0.iterator();
             while (p0.hasNext()) {
                LiveGzoneAuthorAuthenticationTagResponse$Tag tag = p0.next();
                if (tag instanceof LiveGzoneAuthorAuthenticationTagResponse$TradeTag) {
                   e b = tb.B;
                   if (b != null) {
                      b.D.c.b(tag.mLink, tag.mIsDynamicLink);
                      liveStreamPa = tb.B.Z2.a();
                      if (PatchProxy.applyVoidOneRefs(liveStreamPa, null, a.class, "49")) {
                         continue ;
                      }
                   }
                }
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "STREAMER_TAB_WZRY_STORE_ENTRANCE";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.u0(6, uElementPack, uContentPack);
             }
             tb.q1.setLinkListener(new f1(tb));
          }
          if (!PatchProxy.applyVoid(null, tb, e.class, "6")) {
             p0 = tb.s1;
             if (p0 != null && !p0.getVisibility()) {
                p0 = tb.q1;
                if (p0 != null && !p0.getVisibility()) {
                   p0 = tb.q1.getLayoutParams();
                   p0.topMargin = 0;
                   tb.q1.setLayoutParams(p0);
                }
             }
          }
       }
    label_0166 :
       return;
    }
}
