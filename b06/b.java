package b06.b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Application;
import o56.a;
import tkd.b;
import tkd.d;
import ou5.b;
import b06.a;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kwai.component.misc.report.ReportInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vca.i;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kwai.component.misc.report.ReportActivity;
import wkd.b;
import l66.a;
import dda.j;
import m66.a;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.action.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;

public final class b	// class@0003dd
{

    public void b(){
       super();
    }
    public static void a(GifshowActivity p0,QPhoto p1,boolean p2,String p3,String p4){
       String str;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       b uob = b.class;
       Object obj = null;
       int i = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, obj, uob, "1")) {
             return;
          }
       }
       if (p2 && !QCurrentUser.ME.isLogined()) {
          GifshowActivity gifshowActiv = p0;
          a uoa = new a(gifshowActiv, p1, p2, p3, p4);
          d.a(-1712118428).ne(gifshowActiv, p1.getFullSource(), "photo_report", 11, a.b().getString(R.string.arg_RES_7f103078), oobject1.mEntity, 0, 0, v14);
          return;
       }else {
          ReportInfo reportInfo = new ReportInfo();
          reportInfo.mRefer = p0.getUrl();
          reportInfo.mPreRefer = p0.U2();
          reportInfo.mReportedUserId = p1.getUserId();
          if (!TextUtils.x(p4)) {
             reportInfo.mSourceType = oobject3;
          }else if(i.d(p1)){
             str = "pay_course";
          }else {
             str = "photo";
          }
          reportInfo.mSourceType = str;
          reportInfo.mPhotoId = p1.getPhotoId();
          reportInfo.mPhoto = oobject1.mEntity;
          if (!TextUtils.x(p3)) {
             reportInfo.mReportSource = oobject2;
          }
          if (TextUtils.n("SHARE_PANNEL", reportInfo.mReportSource)) {
             reportInfo.mNegativeSource = "5";
          }
          ReportActivity.P3(p0, WebEntryUrls.k, reportInfo);
          b.a(0x6d2a4fdd).b(new j(oobject1.mEntity));
          RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
          uExtParams.mNegativeType = 6;
          c.b(9, oobject1.mEntity, uExtParams);
          if (!PatchProxy.applyVoidTwoRefs(oobject1, oobject2, obj, uob, "2")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(oobject1.mEntity);
             if (!TextUtils.x(p1.getUserId())) {
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                uContentPack.userPackage = userPackage;
                userPackage.identity = p1.getUserId();
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.type = i;
             uElementPack.action = 815;
             uElementPack.name = "report";
             if (oobject2 != null) {
                i3 oi3 = i3.f();
                oi3.d("source", oobject2);
                uElementPack.params = oi3.e();
             }
             u1.u(i, uElementPack, uContentPack);
          }
          return;
       }
    }
}
