package goa.d$d;
import erd.g;
import goa.d;
import java.lang.Object;
import com.yxcorp.gifshow.growth.model.response.PopupsUserResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.growth.model.response.PopupsUserResponse$PopupConfig;
import ioa.d;
import java.util.Objects;
import wkd.b;
import ioa.b;
import java.lang.Runnable;
import ekd.k1;
import cra.w;
import q87.c;

public final class d$d implements g	// class@002b3e
{
    public final d b;

    public void d$d(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PopupsUserResponse mPopupConfig;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$d.class, "1")) {
       }else if(p0 != null){
          mPopupConfig = p0.mPopupConfigs;
       }else {
          mPopupConfig = null;
       }
       if (mPopupConfig == null || p0.mResult - 1) {
          Object[] objArray = new Object[0];
          w.C().t("GrowthModule", "response.mPopupConfigs is empty", objArray);
       }else {
          p0 = p0.mPopupConfigs.iterator();
          while (p0.hasNext()) {
             PopupsUserResponse$PopupConfig popupConfig = p0.next();
             if (popupConfig.mId != 2) {
                continue ;
             }else {
                d c = d.c;
                Objects.requireNonNull(c);
                if (PatchProxy.applyVoidOneRefs(popupConfig, c, d.class, "3")) {
                   continue ;
                }else if(popupConfig.mAllowPop == null){
                   b.a(0x56d4a121).a(popupConfig.mInviteCode, popupConfig.mSourceType, popupConfig.mTraceDetail);
                }else {
                   k1.o(new b(popupConfig));
                }
             }
          }
       }
       return;
    }
}
