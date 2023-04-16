package com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$d;
import lf3.g;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveEcoExplainCardSignal;
import tp3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$1;
import msd.a;
import c15.b;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$2;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$3;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage$a;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$4;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$5;
import tkd.b;
import tkd.d;
import ju5.g;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Boolean;
import qp3.a;
import qp3.b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a;
import qrd.p;
import fq5.b;
import vq5.d;
import qp3.a$a;
import lf3.f;

public final class BaseLiveTunaExplainPresenter$d implements g	// class@000fc2
{
    public final BaseLiveTunaExplainPresenter b;

    public void BaseLiveTunaExplainPresenter$d(BaseLiveTunaExplainPresenter p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       boolean b;
       a uoa = a.class;
       BaseLiveTunaExplainPresenter uBaseLiveTun = BaseLiveTunaExplainPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveTunaExplainPresenter$d.class, "1")) {
       }else {
          String str = "BaseLiveTunaExplainPresenter";
          if (p0 == null) {
             b.d(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag(str), new BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$1(this));
          }else if(!this.b.S8()){
             b.d(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag(str), new BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$2(this, p0));
          }else {
             KsgLogTunaLiveTag eXPLAIN_CARD = KsgLogTunaLiveTag.EXPLAIN_CARD;
             eXPLAIN_CARD.appendTag(str);
             b.f(eXPLAIN_CARD, new BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$3(this, p0));
             TunaLiveExplainMessage tunaLiveExpl = TunaLiveExplainMessage.Companion.a(p0);
             if (tunaLiveExpl == null) {
                eXPLAIN_CARD.appendTag(str);
                b.d(eXPLAIN_CARD, new BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$4(this));
             }else {
                BaseLiveTunaExplainPresenter$d tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(tunaLiveExpl, tb, uBaseLiveTun, "4")) {
                   tb.B.set(tunaLiveExpl);
                }
                if (this.b.V8() == null) {
                   eXPLAIN_CARD.appendTag(str);
                   b.d(eXPLAIN_CARD, new BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$5(this));
                }else {
                   BaseLiveTunaExplainPresenter$d tb1 = this.b;
                   tb1.G = true;
                   tunaLiveExpl = tb1.V8();
                   int i = 0;
                   if (!PatchProxy.applyVoidOneRefs(tunaLiveExpl, null, uoa, "8") && tunaLiveExpl != null) {
                      String mActionUrl = tunaLiveExpl.getMActionUrl();
                      if (mActionUrl != null) {
                         PatchProxyResult patchProxyRe = (mActionUrl.length() > 0)? 1: null;
                         if (!patchProxyRe) {
                            mActionUrl = null;
                         }
                         if (mActionUrl != null) {
                            g og = d.a(0x6ea0c3d0);
                            if (og != null && og.rM(mActionUrl)) {
                               og.t9(mActionUrl, "TunaButton");
                            }
                         }
                      }
                   }
                label_00cc :
                   tb1 = this.b;
                   Objects.requireNonNull(tb1);
                   if (!PatchProxy.applyVoid(null, tb1, uBaseLiveTun, "13")) {
                      int i1 = (tb1.v != null && a1.i(tb1.getActivity()))? 1: 0;
                      if (i1) {
                         TunaLiveExplainMessage tunaLiveExpl1 = tb1.V8();
                         if (tunaLiveExpl1 != null) {
                            BaseLiveTunaExplainPresenter obj = PatchProxy.applyOneRefs(tunaLiveExpl1, null, uoa, "1");
                            if (obj != PatchProxyResult.class) {
                               b = obj.booleanValue();
                            }else if(!tunaLiveExpl1.getMSignalType()){
                               i = 1;
                            }
                            b = i;
                            if (b) {
                               tb1.Y8(true);
                            }else if(tb1.A == null){
                               obj = tb1.F;
                               if (obj != null) {
                                  obj.destroy();
                                  tb1.F = null;
                               }
                               b uob = new b();
                               tb1.F = uob;
                               BaseLiveTunaExplainPresenter v = tb1.v;
                               a.m(v);
                               BaseLiveTunaExplainPresenter y = tb1.y;
                               Activity activity = tb1.getActivity();
                               a.m(activity);
                               a.o(activity, "activity!!");
                               Object obj1 = PatchProxy.apply(null, tb1, uBaseLiveTun, "5");
                               BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a omTunaLiveEx = (obj1 != PatchProxyResult.class)? obj1: tb1.I.getValue();
                               uob.f(v, y, tunaLiveExpl1, activity, omTunaLiveEx);
                            }else {
                               BaseLiveTunaExplainPresenter f = tb1.F;
                               if (f != null) {
                                  f.e(tunaLiveExpl1);
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
