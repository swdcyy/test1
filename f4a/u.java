package f4a.u;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import g4a.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.detail.plc.helper.ad.a;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.URLUtil;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import android.app.Activity;
import z1.a;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.framework.model.feed.BaseFeed;
import nl9.f;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import android.content.Context;
import java.lang.Integer;

public final class u	// class@0022b9
{

    public void u(){
       super();
    }
    public static String a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PlcEntryDataAdapter plcEntryData = c.a(p0);
       if (plcEntryData == null) {
          return "";
       }
       if (plcEntryData.getActionType() != 2) {
          return plcEntryData.getActionUrl();
       }
       if (a.l(plcEntryData.getPlcEntryStyleInfo())) {
          return a.m(plcEntryData.getPlcEntryStyleInfo());
       }
       return "";
    }
    public static boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PlcEntryStyleInfo plcEntryStyl = p0.getPlcEntryStyleInfo();
       boolean b = true;
       if (plcEntryStyl == null || plcEntryStyl.mBizType != b) {
          b = false;
       }
       return b;
    }
    public static boolean c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PlcEntryStyleInfo plcEntryStyl = p0.getPlcEntryStyleInfo();
       if (plcEntryStyl != null) {
          plcEntryStyl = plcEntryStyl.mAdData;
          if (plcEntryStyl != null) {
             return plcEntryStyl.mHalfLandPage;
          }
       }
       return false;
    }
    public static boolean d(QPhoto p0){
       PhotoAdvertisement obj = PatchProxy.applyOneRefs(p0, null, u.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = k.B(p0);
       boolean b = false;
       if (obj == null) {
          return b;
       }
       obj = obj.mAdData;
       if (obj == null) {
          return b;
       }
       PhotoAdvertisement$AdData mH5ControlIn = obj.mH5ControlInfo;
       if (mH5ControlIn == null) {
          return b;
       }
       String str = u.a(p0);
       if (!u.c(p0) && (u.b(p0) && (TextUtils.isEmpty(str) || (URLUtil.isNetworkUrl(str) && mH5ControlIn.mH5PreloadType != null)))) {
          b = true;
       }
    label_0048 :
       return b;
    }
    public static boolean e(Activity p0,String p1,QPhoto p2,a p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, u.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!URLUtil.isNetworkUrl(p1)) {
          return false;
       }
       int i = -1694791652;
       if (u.c(p2)) {
          d.a(i).ST(p0, p2.mEntity, p1, null, null);
       }else if(u.f(p2)){
          d.a(i).RQ(p0, p2.mEntity, p1);
       }
       p3.accept(Integer.valueOf(13));
       return true;
    }
    public static boolean f(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (u.b(p0) && (u.d(p0) && d.a(-1694791652).rN(p0)))? true: false;
       return b;
    }
}
