package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$onCreate$7;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import java.lang.Number;
import com.kuaishou.live.viewcontroller.ViewController;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import hu2.k;
import hu2.i;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import hu2.g;
import co2.e2;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;
import android.net.Uri;
import android.content.Context;
import vq5.d;

public final class VoicePartyAudienceViewController$onCreate$7 extends Lambda implements p	// class@001847
{
    public final VoicePartyAudienceViewController this$0;

    public void VoicePartyAudienceViewController$onCreate$7(VoicePartyAudienceViewController p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.intValue(), p1);
       return l1.a;
    }
    public final void invoke(int p0,ViewController p1){
       if (PatchProxy.isSupport(VoicePartyAudienceViewController$onCreate$7.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VoicePartyAudienceViewController$onCreate$7.class, "1")) {
          return;
       }
       VoicePartyAudienceViewController$onCreate$7 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       VoicePartyAudienceViewController voicePartyAu = VoicePartyAudienceViewController.class;
       if (!PatchProxy.isSupport(voicePartyAu) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, tthis$0, voicePartyAu, "7")) {
          if (p0 != tthis$0.F) {
             if (!PatchProxy.isSupport(voicePartyAu) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tthis$0, voicePartyAu, "6") && p0)) {
                boolean b = false;
                voicePartyAu = (p0 == 2 || p0 == 7)? 1: null;
                if (!voicePartyAu) {
                   tthis$0.H.e().i().b(b);
                }
             }
          label_0066 :
             tthis$0.F = p0;
             VoicePartyAudienceViewController g = tthis$0.G;
             if (g != null) {
                tthis$0.O2(g);
             }
             tthis$0.G = p1;
          }
          if (p1 != null) {
             g n = tthis$0.H.b().n;
             if (n != null && (!PatchProxy.applyVoid(null, n, e2.class, "2") && !n.b.isEmpty())) {
                Iterator iterator = n.b.values().iterator();
                while (iterator.hasNext()) {
                   Iterator iterator1 = iterator.next().iterator();
                   while (iterator1.hasNext()) {
                      n.c.r4(iterator1.next().toString(), n.d);
                   }
                }
                n.b.clear();
             }
          }
       }
    label_00c9 :
       return;
    }
}
