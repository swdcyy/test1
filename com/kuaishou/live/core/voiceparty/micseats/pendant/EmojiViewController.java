package com.kuaishou.live.core.voiceparty.micseats.pendant.EmojiViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import tu2.c;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import zu2.e;
import co2.f2;
import qu2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmojiViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmojiViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmojiViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.r;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmojiViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import av2.a;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import it2.s;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class EmojiViewController extends ViewController	// class@0015f5
{
    public final p j;
    public final f k;
    public final c l;
    public final MicSeatStyle m;
    public final e n;
    public final f2 o;
    public final a p;

    public void EmojiViewController(f p0,c p1,MicSeatStyle p2,LiveData p3,e p4,f2 p5,a p6){
       a.p(p0, "micSeatStateService");
       a.p(p1, "emojiDispatchService");
       a.p(p2, "style");
       a.p(p3, "micSeatId");
       a.p(p4, "emojiSenderViewFinder");
       a.p(p5, "voicePartyContext");
       a.p(p6, "liveContextWrapper");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p4;
       this.o = p5;
       this.p = p6;
       this.j = new ViewModelLazy(m0.d(r.class), new EmojiViewController$viewModelDelegate$$inlined$viewModels$2(new EmojiViewController$viewModelDelegate$$inlined$viewModels$1(this)), new EmojiViewController$$special$$inlined$viewModelDelegate$1(new EmojiViewController$viewModel$2(this, p3)));
    }
    public void F2(){
       EmojiViewController uEmojiViewCo = EmojiViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uEmojiViewCo, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16c3, StyleKt.b(this.m)));
       r or = PatchProxy.apply(objArray, this, uEmojiViewCo, "1");
       if (or == PatchProxyResult.class) {
          or = this.j.getValue();
       }
       if (!PatchProxy.applyVoidOneRefs(or, this, uEmojiViewCo, "3")) {
          or.x0().observe(this, new s(new a(this.A2(R.id.emoji_view), this.n, this.o, this.p)));
       }
       return;
    }
}
