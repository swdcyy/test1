package com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl;
import lo2.b;
import yx2.i;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$Companion;
import nsd.u;
import lnc.a1;
import java.util.LinkedList;
import android.app.Activity;
import qu2.a;
import co2.f2;
import t02.a0;
import lo2.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$a;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$b;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyChannelInfo;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import d61.y;
import oq5.b;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl$c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import wr2.g;
import yx2.d;
import p91.m;

public final class VoicePartyChannelFeedServiceImpl extends i implements b	// class@001375
{
    public WeakReference d;
    public final Application$ActivityLifecycleCallbacks e;
    public final a f;
    public final Activity g;
    public final a h;
    public final f2 i;
    public final a0 j;
    public final d k;
    public static final int l;
    public static final Deque m;
    public static final VoicePartyChannelFeedServiceImpl$Companion n;

    static {
       VoicePartyChannelFeedServiceImpl.n = new VoicePartyChannelFeedServiceImpl$Companion(null);
       VoicePartyChannelFeedServiceImpl.l = a1.e(16.00f);
       VoicePartyChannelFeedServiceImpl.m = new LinkedList();
    }
    public void VoicePartyChannelFeedServiceImpl(Activity p0,a p1,f2 p2,a0 p3,d p4){
       a.p(p0, "activity");
       a.p(p1, "liveBaseContext");
       a.p(p2, "voicePartyContext");
       a.p(p3, "livePlayCallerContext");
       a.p(p4, "squareEntranceContext");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.d = new WeakReference(null);
       VoicePartyChannelFeedServiceImpl$a uoa = new VoicePartyChannelFeedServiceImpl$a();
       this.e = uoa;
       this.f = new VoicePartyChannelFeedServiceImpl$b(this);
       p0.getApplication().registerActivityLifecycleCallbacks(uoa);
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, VoicePartyChannelFeedServiceImpl.class, "1")) {
          return;
       }
       d0.e(this.d.get());
       this.g.getApplication().unregisterActivityLifecycleCallbacks(this.e);
       return;
    }
    public void g(LiveStreamMessages$VoicePartyChannelInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyChannelFeedServiceImpl.class, "2")) {
          return;
       }
       a.p(p0, "channel");
       VoicePartyChannelFeedServiceImpl tg = this.g;
       if (tg != null && !d0.k(tg)) {
          if (y.d(tg)) {
             a0 p1 = this.j.p1;
             if (p1 != null) {
                p1.d();
             }
          }
          d0.e(this.d.get());
          c$b uob = new c$b(tg);
          uob.F(d0.f());
          uob.N(d0.g());
          uob.A(true);
          uob.L(new VoicePartyChannelFeedServiceImpl$c(this, tg, p0));
          this.d = new WeakReference(uob.X());
          VoicePartyChannelFeedServiceImpl ti = this.i;
          a0 z2 = this.j.Z2;
          a.o(z2, "livePlayCallerContext.mLiveBasicContext");
          if (!PatchProxy.applyVoidTwoRefs(ti, z2, null, g.class, "1")) {
             a.p(ti, "voicePartyContext");
             a.p(z2, "liveBasicContext");
             new d("LIVE_VOICE_PARTY_CHANNEL_PANEL", ti, z2).g();
          }
       }
    label_008c :
       return;
    }
}
