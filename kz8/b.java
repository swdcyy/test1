package kz8.b;
import agc.e;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import java.util.Map;
import agc.d;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import n49.e;
import wkd.b;
import my.a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import yx.j0;
import java.lang.Throwable;

public class b implements e	// class@002c57
{

    public void b(){
       super();
    }
    public String a(){
       return "ad";
    }
    public boolean b(Uri p0,Map p1){
       return d.b(this, p0, p1);
    }
    public String c(){
       return "kwai";
    }
    public void d(Activity p0,Map p1,Map p2){
       int i1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2")) {
          return;
       }
       QPhoto qPhoto = null;
       PhotoAdDataWrapper obj = (p2 == null)? qPhoto: p2.get("PLC_VIEW_STYLE");
       if (SystemUtil.I()) {
          Objects.requireNonNull(obj, "ªÒ»°PlcViewStyle ß∞‹£°");
       }
       if (p2 != null) {
          qPhoto = p2.get("QPhoto");
       }
       int i = 0;
       if (qPhoto == null || !qPhoto.isAd()) {
          Object[] objArray = new Object[i];
          j0.f("AdSoftPlcActionSchemeImpl", "photo or ad is null", objArray);
          return;
       }else if(obj instanceof Integer){
          i1 = obj.intValue();
       }else {
          i1 = 0;
       }
       if (i1 == 2) {
          obj = PatchProxy.applyOneRefs(qPhoto, this, b.class, "3");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else {
             PlcEntryStyleInfo plcEntryStyl = qPhoto.getPlcEntryStyleInfo();
             if (plcEntryStyl != null) {
                plcEntryStyl = plcEntryStyl.mStyleInfo;
                if (plcEntryStyl != null && plcEntryStyl.mStrongStyleTemplateInfo != null) {
                   i = qPhoto.getPlcEntryStyleInfo().mStyleInfo.mStrongStyleTemplateInfo.isSecondaryStrongStyle();
                }
             }
          }
          if (i) {
             i = 29;
          }else {
             i = 89;
          }
       }else {
          i = 1;
       }
       obj = new PhotoAdDataWrapper(qPhoto.mEntity);
       obj.setItemClickType(i);
       b.a(0x1f7421d5).c(p0, obj, new e(i));
       return;
    }
    public String getPath(){
       return "/plc_conversion";
    }
}
