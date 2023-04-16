package dw2.c;
import dw2.c$a;
import nsd.u;
import android.app.Activity;
import android.view.ViewGroup;
import qu2.a;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import brd.t;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.kuaishou.live.core.voiceparty.theater.player.VoicePartyTheaterPlayerView;
import com.yxcorp.gifshow.image.KwaiImageView;
import op2.f;
import rw2.b;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tw2.a;

public final class c	// class@0025b0
{
    public final KwaiImageView a;
    public final VoicePartyTheaterPlayerView b;
    public final b c;
    public final ViewGroup d;
    public final a e;
    public final VoicePartyPlayerController f;
    public final t g;
    public final l h;
    public static final c$a i;

    static {
       c.i = new c$a(null);
    }
    public void c(Activity p0,ViewGroup p1,a p2,VoicePartyPlayerController p3,t p4,l p5){
       a.p(p0, "activity");
       a.p(p1, "playerViewContainer");
       a.p(p2, "liveContext");
       a.p(p3, "livePlayerController");
       a.p(p4, "appBackgroundSignal");
       a.p(p5, "onCreatePlayerController");
       super();
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       LayoutInflater.from(p1.getContext()).inflate(R.layout.arg_RES_7f0d16e7, p1);
       View view = p1.findViewById(R.id.voice_party_theater_player_view);
       a.o(view, "playerViewContainer.find¡­arty_theater_player_view\)");
       this.b = view;
       View view1 = p1.findViewById(R.id.live_voice_party_theater_blur_cover_view);
       a.o(view1, "playerViewContainer.find¡­_theater_blur_cover_view\)");
       this.a = view1;
       this.a(null);
       b uob = new b(p0, view);
       this.c = uob;
       uob.c(TheaterDisplayMode.HALF_SCREEN);
    }
    public final void a(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       a.a(this.a, p0);
       return;
    }
}
