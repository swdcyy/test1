package com.kuaishou.tuna.plc.a;
import java.lang.Runnable;
import com.kuaishou.tuna.plc.b;
import com.kwai.feature.plc.api.model.PlcRecoSignalInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.lang.String;
import java.util.List;
import by4.e;
import msd.a;
import c15.b;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.tuna.plc.PlcCorePluginImpl$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import java.lang.Integer;
import by4.f;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import k2b.e0;
import k2b.u1;

public final class a implements Runnable	// class@000fbe
{
    public final b b;
    public final PlcRecoSignalInfo c;
    public final ClientContent$ContentPackage d;
    public final FeedLogCtx e;

    public void a(b p0,PlcRecoSignalInfo p1,ClientContent$ContentPackage p2,FeedLogCtx p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       Objects.requireNonNull(tb);
       if (tc.mBizType == null) {
          b.d(KsLogTunaPlcTag.PLC.appendTag("PlcCorePluginImpl"), new e(tc));
       }else if(a.t().getValue("tunaPlcLinkRecoSignalBlackList", new PlcCorePluginImpl$1(tb).getType(), new ArrayList()).contains(Integer.valueOf(tc.mBizType))){
          b.d(KsLogTunaPlcTag.PLC.appendTag("PlcCorePluginImpl"), new f(tc));
       }else {
          h$b uob = h$b.e(7, "PLC_LINK_RECO_SIGNAL");
          uob.h(td);
          if (te != null) {
             uob.l(te);
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLC_LINK_RECO_SIGNAL";
          uElementPack.params = a.a.q(tc);
          uob.k(uElementPack);
          u1.p0("", null, uob);
       }
       return;
    }
}
