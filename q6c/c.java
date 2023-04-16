package q6c.c;
import com.kwai.android.common.intercept.Interceptor;
import java.lang.Object;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.click.ClickChain;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.l0;
import com.kwai.android.common.bean.PushData;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import fg6.a;
import com.yxcorp.gifshow.push.model.ServerKeyData;
import com.google.gson.Gson;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import qrd.l1;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import f3b.u;
import java.lang.NullPointerException;
import java.lang.Exception;
import k2b.u1;
import a45.a;

public final class c implements Interceptor	// class@00223f
{

    public void c(){
       super();
    }
    public void intercept(Chain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "chain");
          ClickMetaData uClickMetaDa = new ClickMetaData().setType(1).setElementPackage(l0.c("click_push"));
          String str = "ClickMetaData\(\).setType\(¡­ateElement\(\"click_push\"\)\)";
          try{
             a.o(uClickMetaDa, str);
             PushData pushData = p0.getPushData();
             if (pushData != null) {
                ServerKeyData serverKeyDat = a.a.h(pushData.serverKey, ServerKeyData.class);
                String str1 = (serverKeyDat == null)? "": serverKeyDat.mKsOrderId;
                p0.getDeliverParam().put("ks_order_id", str1);
                if (!TextUtils.isEmpty(str1)) {
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.ksOrderInfoPackage = l0.a(str1);
                   uClickMetaDa.setContentPackage(uContentPack);
                }
                pushData = pushData.pushBack;
                if (pushData != null) {
                   uClickMetaDa.setInterStidContainer(u.b("st_push_id", pushData));
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
             }
          }catch(java.lang.Exception e1){
             e1.getMessage();
          }
          u1.B(uClickMetaDa);
          p0.proceed();
       }
       return;
    }
    public int supportProcess(){
       return a.a(this);
    }
}
