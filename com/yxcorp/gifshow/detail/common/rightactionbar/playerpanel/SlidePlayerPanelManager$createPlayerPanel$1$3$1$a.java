package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$3$1$a;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$3$1;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityItemModel;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$3;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityMode;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import java.lang.Integer;
import lnc.a1;
import kotlin.jvm.internal.a;

public final class SlidePlayerPanelManager$createPlayerPanel$1$3$1$a implements g	// class@0014df
{
    public final SlidePlayerPanelManager$createPlayerPanel$1$3$1 b;
    public final QualityItemModel c;

    public void SlidePlayerPanelManager$createPlayerPanel$1$3$1$a(SlidePlayerPanelManager$createPlayerPanel$1$3$1 p0,QualityItemModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$createPlayerPanel$1$3$1$a.class, "1")) {
       }else {
          p0 = this.b.this$0.this$0.this$0;
          int value = this.c.getQualityMode().getValue();
          Objects.requireNonNull(p0);
          SlidePlayerPanelManager slidePlayerP = SlidePlayerPanelManager.class;
          if (!PatchProxy.isSupport(slidePlayerP) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(value), p0, slidePlayerP, "13")) {
             if (value == QualityMode.higher.getValue()) {
                str = a1.p(R.string.arg_RES_7f103cd4);
             }else if(value == QualityMode.lower.getValue()){
                str = a1.p(R.string.arg_RES_7f103cd5);
             }else {
                str = a1.p(R.string.arg_RES_7f103cd3);
             }
             a.o(str, "text");
             p0.l(str);
          }
       }
       return;
    }
}
