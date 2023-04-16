package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import java.lang.Object;
import k3a.o;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import sz9.u;
import j3a.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityItemModel;
import lnc.a1;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityMode;
import nsd.u;
import java.util.ArrayList;
import i3a.b;
import sz9.i;
import java.lang.Enum;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$3$1;

public final class SlidePlayerPanelManager$createPlayerPanel$1$3 extends Lambda implements l	// class@0014e1
{
    public final SlidePlayerPanelManager$createPlayerPanel$1 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$3(SlidePlayerPanelManager$createPlayerPanel$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(o p0){
       int b2;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SlidePlayerPanelManager$createPlayerPanel$1$3.class, "1")) {
          return;
       }
       a.p(obj1, "$receiver");
       SlidePlayerPanelManager$createPlayerPanel$1 this$0 = obj.this$0.this$0;
       String str = null;
       boolean b = (this$0.q.V0 != null && this$0.r.h())? true: false;
       obj1.e(b);
       this$0 = obj.this$0.this$0;
       Objects.requireNonNull(this$0);
       ArrayList uArrayList = PatchProxy.apply(null, this$0, SlidePlayerPanelManager.class, "23");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          String str1 = a1.p(R.string.arg_RES_7f103ccd);
          a.o(str1, "CommonUtil.string\(R.stri¡­yer_panel_quality_higher\)");
          QualityMode higher = QualityMode.higher;
          QualityItemModel qualityItemM = new QualityItemModel(str1, "1080P/720P", higher, false, 8, null);
          String str2 = a1.p(R.string.arg_RES_7f103ccf);
          a.o(str2, "CommonUtil.string\(R.stri¡­ayer_panel_quality_lower\)");
          str1 = a1.p(R.string.arg_RES_7f103cd0);
          a.o(str1, "CommonUtil.string\(R.stri¡­l_quality_save_discharge\)");
          QualityMode lower = QualityMode.lower;
          QualityItemModel qualityItemM1 = new QualityItemModel(str2, str1, lower, false, 8, null);
          String str3 = a1.p(R.string.arg_RES_7f103ccb);
          a.o(str3, "CommonUtil.string\(R.stri¡­layer_panel_quality_auto\)");
          String str4 = a1.p(R.string.arg_RES_7f103ccc);
          a.o(str4, "CommonUtil.string\(R.stri¡­anel_quality_auto_adjust\)");
          QualityItemModel qualityItemM2 = new QualityItemModel(str3, str4, QualityMode.auto, false, 8, null);
          ArrayList uArrayList1 = new ArrayList();
          if (this$0.r.e()) {
             boolean b1 = (b.e() == higher)? true: false;
             uArrayList.setSelected$detail_release(b1);
             uArrayList1.add(uArrayList);
          }
          if (this$0.r.f()) {
             b2 = (b.e() == lower)? true: false;
             qualityItemM.setSelected$detail_release(b2);
             uArrayList1.add(qualityItemM);
          }
          b2 = i.c[b.e().ordinal()];
          if (b2 != 1) {
             if (b2 != 2 || !this$0.r.f()) {
             label_0110 :
                str = true;
             }
          }else if(!this$0.r.e()){
             goto label_0110 ;
          }
          str1.setSelected$detail_release(str);
          uArrayList1.add(str1);
          uArrayList = uArrayList1;
       }
       if (!PatchProxy.applyVoidOneRefs(uArrayList, obj1, o.class, "2")) {
          a.p(uArrayList, "<set-?>");
          obj1.f = uArrayList;
       }
       obj1.g = new SlidePlayerPanelManager$createPlayerPanel$1$3$1(obj);
       return;
    }
}
