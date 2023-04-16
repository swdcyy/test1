package bl4.g;
import cl4.a;
import java.lang.String;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionJumpWithBackupPayloadInfo;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionJumpWithBackupPayloadInfo$Action;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.util.x0;
import o56.a;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.Exception;
import tkd.b;
import tkd.d;
import vs3.a;
import android.app.Activity;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;

public class g extends a	// class@000392
{

    public void g(){
       super();
    }
    public String e(){
       return "MerchantActionJumpWithBackupEvent";
    }
    public void onEvent(EventPayloadInfo p0,Map p1){
       g og = g.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, og, "1")) {
          return;
       }
       if (!this.f() && p0 instanceof ActionJumpWithBackupPayloadInfo) {
          ActionJumpWithBackupPayloadInfo mAction1 = (SystemUtil.M(this.d(), p0.mName))? p0.mAction1: p0.mAction2;
          if (mAction1 != null) {
             ActionJumpWithBackupPayloadInfo$Action mType = mAction1.mType;
             boolean b = true;
             if (mType != b) {
                if (mType != 2) {
                   if (mType == 3) {
                      i.d(R.style.arg_RES_7f11066a, mAction1.mMsg);
                   }
                }else if(PatchProxy.applyVoidOneRefs(mAction1, null, og, "2")){
                   try{
                      Application b1 = a.B;
                      WXLaunchMiniProgram$Req req = new WXLaunchMiniProgram$Req();
                      req.userName = x0.a(mAction1.mId);
                      req.path = mAction1.mUrl;
                      WXAPIFactory.createWXAPI(b1, SystemUtil.p(b1, "WECHAT_APP_ID"), b).sendReq(req);
                   }catch(java.lang.Exception e5){
                      e5.printStackTrace();
                   }
                }
             }else {
                d.a(0x7074b578).LK(this.d(), mAction1.mUrl, b);
             }
          }
       }
    label_0088 :
       return;
    }
}
