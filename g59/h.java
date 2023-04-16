package g59.h;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import l29.d;
import tw.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yx.j0;
import tkd.b;
import tkd.d;
import nl9.u;
import android.content.Context;
import com.kwai.component.misc.report.ReportInfo;
import mxb.h0;
import vca.i;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kwai.component.misc.report.ReportActivity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public class h	// class@002403
{

    public void h(){
       super();
    }
    public static void a(GifshowActivity p0,BaseFeed p1,PhotoAdvertisement p2){
       String str;
       h oh = h.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "1")) {
          return;
       }
       if (d.a(new QPhoto(p1))) {
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, oh, "4")) {
             str = f.b("https://activity.e.kuaishou.com/pages/report?layoutType=4", 6);
             if (TextUtils.x(str)) {
                Object[] objArray = new Object[0];
                j0.l("AdReportUtil", "openReportActivityWhenExp url is empty", objArray);
             }else {
                d.a(-1694791652).RQ(p0, p1, str);
                d.b(new QPhoto(p1), 6);
             }
          }
       }else if(PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "3")){
          ReportInfo reportInfo = new ReportInfo();
          reportInfo.mRefer = p0.getUrl();
          reportInfo.mPreRefer = p0.U2();
          if (h0.f(p2)) {
             reportInfo.mSourceType = "ad";
          }else if(i.c(p1)){
             str = "pay_course";
          }else {
             str = "photo";
          }
          reportInfo.mSourceType = str;
          if (p1 != null) {
             reportInfo.mPhotoId = p1.getId();
             reportInfo.mPhoto = p1;
          }
          ReportActivity.P3(p0, WebEntryUrls.k, reportInfo);
          if (!PatchProxy.applyVoidOneRefs(p1, null, oh, "2")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(p1);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.type = 1;
             uElementPack.action = 815;
             uElementPack.name = "report";
             u1.u(1, uElementPack, uContentPack);
          }
          d.b(new QPhoto(p1), 6);
       }
       return;
    }
}
