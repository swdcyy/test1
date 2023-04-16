package com.kuaishou.live.tuna.model.TunaLiveExplainMessage$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.livestream.message.nano.SCLiveEcoExplainCardSignal;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.tuna.util.LiveTunaUtils;
import fg6.a;
import com.kuaishou.live.tuna.model.ExplainBundleInfo;
import com.google.gson.Gson;
import tp3.a;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class TunaLiveExplainMessage$a	// class@000fbb
{

    public void TunaLiveExplainMessage$a(){
       super();
    }
    public void TunaLiveExplainMessage$a(u p0){
       super();
    }
    public final TunaLiveExplainMessage a(SCLiveEcoExplainCardSignal p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, TunaLiveExplainMessage$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       TunaLiveExplainMessage tunaLiveExpl = new TunaLiveExplainMessage();
       tunaLiveExpl.setMSignalType(p0.signalType);
       SCLiveEcoExplainCardSignal title = p0.title;
       a.o(title, "pb.title");
       tunaLiveExpl.setMTitle(title);
       tunaLiveExpl.setMIconUrls(LiveTunaUtils.d(p0.icon));
       title = p0.actionUrl;
       a.o(title, "pb.actionUrl");
       tunaLiveExpl.setMActionUrl(title);
       title = p0.buttonText;
       a.o(title, "pb.buttonText");
       tunaLiveExpl.setMButtonText(title);
       title = p0.topLeftTips;
       a.o(title, "pb.topLeftTips");
       tunaLiveExpl.setMTopLeftTips(title);
       tunaLiveExpl.setMTopLeftIconUrls(LiveTunaUtils.d(p0.topLeftIcon));
       tunaLiveExpl.setMShowClose(p0.showClose);
       title = p0.bizType;
       a.o(title, "pb.bizType");
       tunaLiveExpl.setMBizType(title);
       title = p0.ext;
       a.o(title, "pb.ext");
       try{
          tunaLiveExpl.setMExtParams(title);
          ExplainBundleInfo uExplainBund = a.a.h(p0.bundleInfo, ExplainBundleInfo.class);
          obj = PatchProxy.applyOneRefs(uExplainBund, obj, a.class, "4");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(uExplainBund != null && !TextUtils.x(uExplainBund.getMBundleId())){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             tunaLiveExpl.setMBundleInfo(uExplainBund);
          }
          return tunaLiveExpl;
       }catch(java.lang.Exception e0){
       }
    }
}
