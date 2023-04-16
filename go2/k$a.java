package go2.k$a;
import hp2.s;
import go2.k;
import java.lang.Object;
import hp2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import co2.f2;
import hp2.r;
import hp2.g;
import android.graphics.drawable.GradientDrawable;
import android.content.res.Resources;
import android.content.Context;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import hp2.h;
import hp2.f;
import hp2.m;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import hp2.n;
import android.graphics.Color;

public final class k$a implements s	// class@002b62
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void K(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "5")) {
          return;
       }
       a.p(p0, "reason");
       k$a tb = this.b;
       tb.g(tb.h.d());
       return;
    }
    public void L(c p0){
       r.j(this, p0);
    }
    public void R(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "3")) {
          return;
       }
       a.p(p0, "reason");
       k$a tb = this.b;
       tb.g(tb.h.d());
       return;
    }
    public void S(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "4")) {
          return;
       }
       a.p(p0, "gridChatParam");
       GradientDrawable gradientDraw = new GradientDrawable();
       int[] ointArray = new int[]{this.b.g.getResources().getColor(0x7f0605ef),this.b.g.getResources().getColor(0x7f0605f2)};
       gradientDraw.setColors(ointArray);
       gradientDraw.setOrientation(GradientDrawable$Orientation.TOP_BOTTOM);
       this.b.f(gradientDraw);
       return;
    }
    public void T(h p0){
       r.e(this, p0);
    }
    public void U(c p0){
       r.n(this, p0);
    }
    public void V(c p0){
       r.l(this, p0);
    }
    public void Y(f p0){
       r.c(this, p0);
    }
    public void d0(m p0){
       r.f(this, p0);
    }
    public void g0(c p0){
       r.m(this, p0);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       b.c0(LiveVoicePartyLogTag.OTHER, "onCommonInfoUpdate", "isDynamicBgLowDevice", Boolean.valueOf(this.b.c));
       LiveStreamMessages$VoicePartyCommonInfo voicePartyCo = this.b.h.d();
       if (voicePartyCo != null) {
          this.b.k(voicePartyCo);
       }
       return;
    }
    public void l(n p0){
       r.g(this, p0);
    }
    public void m(){
       r.b(this);
    }
    public void o(c p0){
       r.i(this, p0);
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "2")) {
          return;
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       int[] ointArray = new int[]{Color.parseColor("#FF1C274B"),Color.parseColor("#FF1D102D")};
       gradientDraw.setColors(ointArray);
       gradientDraw.setOrientation(GradientDrawable$Orientation.RIGHT_LEFT);
       this.b.f(gradientDraw);
       return;
    }
}
