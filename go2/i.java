package go2.i;
import com.kuaishou.live.viewcontroller.ViewController;
import go2.j;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.View;
import go2.k;
import co2.f2;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import brd.x;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import go2.i$a;
import erd.g;
import crd.b;
import java.util.Objects;

public final class i extends ViewController	// class@002b60
{
    public final String j;
    public k k;
    public final boolean l;
    public final j m;
    public final t n;

    public void i(boolean p0,j p1,t p2){
       a.p(p1, "dependence");
       a.p(p2, "bgAnimationObservable");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.j = "VoicePartyBgController";
    }
    public void F2(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, this.j+" onCreate");
       LiveMultiLayerView liveMultiLay = new LiveMultiLayerView(this.m.a());
       liveMultiLay.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       this.R2(liveMultiLay);
       k ok = new k(this.l, this.m.a(), this.m.b(), this.m.c, liveMultiLay);
       this.k = v2;
       v2.j();
       if (!PatchProxy.applyVoid(objArray, this, oi, "5")) {
          LiveStreamMessages$VoicePartyCommonInfo voicePartyCo = this.m.b().d();
          if (voicePartyCo != null) {
             i tk = this.k;
             if (tk == null) {
                a.S("bgManager");
             }
             tk.k(voicePartyCo);
          }
       }
       this.n.compose(AutoDisposeKt.a(this)).subscribe(new i$a(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, this.j+" onDestroy");
       i tk = this.k;
       if (tk == null) {
          a.S("bgManager");
       }
       tk.b();
       return;
    }
    public void M2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, this.j+" onStart");
       i tk = this.k;
       if (tk == null) {
          a.S("bgManager");
       }
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, k.class, "9")) {
          tk.j.d();
       }
       return;
    }
    public void N2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, this.j+" onStop");
       i tk = this.k;
       if (tk == null) {
          a.S("bgManager");
       }
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, k.class, "10")) {
          tk.j.c();
       }
       return;
    }
}
