package m4a.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kwai.framework.model.feed.BaseFeed;
import kp.w1;
import kp.r1;
import com.kuaishou.android.model.mix.w;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Configuration;
import com.kuaishou.android.model.mix.ShareToFollowModel;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ChatPackage;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import e4a.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import com.yxcorp.gifshow.detail.plc.error.exception.PlcExceptionHandler;

public class d	// class@002f2c
{

    public void d(){
       super();
    }
    public static ClientContent$ContentPackage a(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = null;
       ClientContent$ContentPackage obj1 = PatchProxy.applyOneRefs(p0, obj, uod, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = new ClientContent$ContentPackage();
       Object obj2 = PatchProxy.applyOneRefs(p0, obj, uod, "3");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else if(p0 == null){
          obj = w1.f(p0.mEntity);
          obj.shareIdentify = p0.isShareToFollow();
          boolean b = false;
          boolean b1 = (r1.D3(p0.getEntity()) && w.P(p0.getEntity()))? true: false;
          obj.supportLandscapeMode = b1;
          Activity uActivity = ActivityContext.g().e();
          if (uActivity != null) {
             if (uActivity.getResources().getConfiguration().orientation == 2) {
                b = true;
             }
             obj.landscapeScreenDisplay = b;
          }
       }
       obj1.photoPackage = obj;
       if (p0 != null && p0.isShareToFollow()) {
          ShareToFollowModel shareToFollo = p0.getShareToFollowModel();
          if (shareToFollo != null) {
             ClientContent$ChatPackage uChatPackage = new ClientContent$ChatPackage();
             uChatPackage.sendUserId = shareToFollo.getSharerUserIds();
             obj1.chatPackage = uChatPackage;
          }
       }
       return obj1;
    }
    public static ClientContent$ContentPackage b(QPhoto p0,PhotoDetailLogger p1){
       ClientContent$ContentPackage uContentPack;
       a obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          uContentPack = (p1 != null)? p1.buildContentPackage(): d.a(p0);
       }catch(java.lang.Exception e3){
          obj = new a();
          obj.b(3);
          a uoa = obj.d(e3);
          PlcExceptionHandler.a(uoa.c("plc global event error, when [plcLogHelper] create contentPackage!").a(), "PlcLogUtils");
          uContentPack = new ClientContent$ContentPackage();
       }
       return uContentPack;
    }
}
