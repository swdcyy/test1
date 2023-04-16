package com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyChannelInfo;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.graphics.drawable.GradientDrawable;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import lo2.d;
import fq5.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.f2;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import qu2.a;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedFragment;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import com.kuaishou.live.core.basic.utils.a;
import qrd.l1;

public final class VoicePartyChannelFeedServiceImpl$c implements PopupInterface$f	// class@001374
{
    public Fragment b;
    public a c;
    public final VoicePartyChannelFeedServiceImpl d;
    public final RxFragmentActivity e;
    public final LiveStreamMessages$VoicePartyChannelInfo f;

    public void VoicePartyChannelFeedServiceImpl$c(VoicePartyChannelFeedServiceImpl p0,RxFragmentActivity p1,LiveStreamMessages$VoicePartyChannelInfo p2){
       this.d = p0;
       this.e = p1;
       this.f = p2;
       super();
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int l;
       VoicePartyChannelFeedFragment voicePartyCh;
       VoicePartyChannelFeedServiceImpl$c uoc = this;
       Object obj = p1;
       VoicePartyChannelFeedServiceImpl obj1 = p2;
       View obj2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, VoicePartyChannelFeedServiceImpl$c.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(p0, "popup");
       a.p(obj, "inflater");
       a.p(obj1, "container");
       boolean b = false;
       int i = 2;
       obj2 = a.h(obj, R.layout.arg_RES_7f0d0e3e, obj1, b, i);
       a.o(obj2, "rootView");
       ViewGroup$LayoutParams layoutParams = obj2.getLayoutParams();
       layoutParams.height = (int)((float)n.j(uoc.e) * 0x3f4ccccd);
       obj2.setLayoutParams(layoutParams);
       GradientDrawable gradientDraw = new GradientDrawable();
       float[] uofloatArray = new float[]{(float)l,(float)l,(float)l,(float)l,0,0,0,0};
       l = VoicePartyChannelFeedServiceImpl.l;
       int i1 = 1;
       int i2 = 6;
       gradientDraw.setCornerRadii(uofloatArray);
       gradientDraw.setColor(ContextCompat.getColor(obj2.getContext(), R.color.arg_RES_7f06076a));
       obj2.setBackground(gradientDraw);
       VoicePartyChannelFeedServiceImpl$c d = uoc.d;
       String VoicePartyChannelFeedServiceImpl uofloatArray1 = d.k;
       obj1 = d.i;
       VoicePartyChannelFeedServiceImpl j = d.j;
       Objects.requireNonNull(uofloatArray1);
       if (!PatchProxy.applyVoidTwoRefs(obj1, j, uofloatArray1, d.class, "1")) {
          uofloatArray1.h = j.b().a();
          uofloatArray1.d = obj1.r();
          String str1 = "";
          uofloatArray1.e = TextUtils.i(obj1.y(), str1);
          uofloatArray1.f = obj1.t();
          uofloatArray1.g = TextUtils.i(obj1.o(), str1);
       }
       e0 uoe0 = uoc.d.h.c();
       uofloatArray1 = uoc.d.h.getLiveStreamId();
       String str = uoc.d.i.y();
       int i3 = (int)uoc.f.channelId;
       VoicePartyChannelFeedServiceImpl$c d1 = uoc.d;
       VoicePartyChannelFeedServiceImpl k = d1.k;
       VoicePartyChannelFeedServiceImpl f = d1.f;
       if (PatchProxy.isSupport(VoicePartyChannelFeedFragment.class)) {
          Object[] objArray = new Object[i2];
          objArray[b] = uoe0;
          objArray[i1] = uofloatArray1;
          objArray[i] = str;
          objArray[3] = Integer.valueOf(i3);
          objArray[4] = k;
          objArray[5] = f;
          voicePartyCh = PatchProxy.apply(objArray, null, VoicePartyChannelFeedFragment.class, "1");
          if (voicePartyCh != PatchProxyResult.class) {
          label_0146 :
             e uoe = uoc.e.getSupportFragmentManager().beginTransaction();
             uoe.w(R.id.voice_party_channel_feed_container, voicePartyCh, voicePartyCh.getClass().getSimpleName());
             a.o(uoe, "activity.supportFragment¡­.simpleName\n            \)");
             a uoa = new a(uoe);
             uoa.b();
             uoc.c = uoa;
             uoc.b = voicePartyCh;
             return obj2;
          }
       }
       voicePartyCh = new VoicePartyChannelFeedFragment();
       Bundle uBundle = new Bundle();
       uBundle.putString("keyLiveStreamId", uofloatArray1);
       uBundle.putString("keyVoicePartyId", str);
       uBundle.putInt("keyChannelId", i3);
       uBundle.putString("voicePartyFeedEnterSourceType", "chat_room_live");
       voicePartyCh.setArguments(uBundle);
       voicePartyCh.F = f;
       voicePartyCh.M = uoe0;
       voicePartyCh.L = k;
       goto label_0146 ;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyChannelFeedServiceImpl$c.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       VoicePartyChannelFeedServiceImpl$c tc = this.c;
       if (tc != null) {
          tc.a();
       }
       tc = this.b;
       if (tc != null) {
          this.e.getSupportFragmentManager().beginTransaction().u(tc).m();
       }
       return;
    }
}
