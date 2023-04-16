package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$3$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$3;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityItemModel;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import p5a.e;
import de5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import sz9.u;
import p5a.d;
import crd.b;
import lnc.b9;
import java.lang.Boolean;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$3$1$a;
import erd.g;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityMode;
import i3a.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Set;
import java.util.Objects;
import sz9.w;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.util.rx.RxBus;
import am6.a;
import kotlin.Pair;
import sz9.i;
import java.lang.Enum;
import sz9.t;
import qrd.r0;
import java.util.HashMap;
import trd.t0;

public final class SlidePlayerPanelManager$createPlayerPanel$1$3$1 extends Lambda implements p	// class@0014e0
{
    public final SlidePlayerPanelManager$createPlayerPanel$1$3 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$3$1(SlidePlayerPanelManager$createPlayerPanel$1$3 p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(View p0,QualityItemModel p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayerPanelManager$createPlayerPanel$1$3$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "model");
       if (this.this$0.this$0.this$0.s.getPlayer() != null && d.a(this.this$0.this$0.this$0.r.a()) == 9) {
          b9.a(this.this$0.this$0.this$0.c);
          p0.c = t.just(Boolean.TRUE).delay(2, TimeUnit.SECONDS).observeOn(a.c()).subscribe(new SlidePlayerPanelManager$createPlayerPanel$1$3$1$a(this, p1));
       }
       SlidePlayerPanelManager j = this.this$0.this$0.this$0.j;
       int value = p1.getQualityMode().getValue();
       QPhoto qPhoto = this.this$0.this$0.this$0.r.a();
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(value), qPhoto, null, uob, "14");
          if (obj != PatchProxyResult.class) {
             value = obj.intValue();
          }else {
          label_00a5 :
             a.p(qPhoto, "photo");
             Log.g("PlayerPanelHelper", "getAvailableQualitySwitchCode,clickSwitchCode="+value);
             if (!b.k(qPhoto).contains(String.valueOf(value))) {
                value = QualityMode.auto.getValue();
             }
          }
       }else {
          goto label_00a5 ;
       }
       Objects.requireNonNull(j);
       w ow = w.class;
       if (!PatchProxy.isSupport(ow) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(value), j, ow, "7")) {
          j.d.onNext(Integer.valueOf(value));
       }
       RxBus.f.b(new a(p1.getQualityMode().getValue()));
       SlidePlayerPanelManager$createPlayerPanel$1 this$0 = this.this$0.this$0.this$0;
       value = 1;
       Pair[] pairArray = new Pair[value];
       int i = i.b[p1.getQualityMode().ordinal()];
       if (i != value) {
          str = (i != 2)? "video_auto_button": "video_saveflow_button";
       }else {
          str = "video_fhd_button";
       }
       pairArray[0] = r0.a(str, t.d(value));
       this$0.j(t0.M(pairArray));
       return;
    }
}
