package ohc.h;
import mhc.n1;
import uo7.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import ohc.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Integer;
import uo7.h0;
import mhc.d2;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import android.util.Log;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareEvent;
import mhc.j2;
import k2b.u1;
import zic.f;
import zic.x0;

public abstract class h extends n1	// class@00395a
{

    public void h(){
       super();
    }
    public void l(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "4")) {
       }else {
          a.p(p0, "conf");
          a.p(p1, "panelElement");
          p1 = p1.mActionUrl;
          a.o(p1, "panelElement.mActionUrl");
          this.q(p0, 3, p1, null);
       }
       return;
    }
    public void m(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "3")) {
       }else {
          a.p(p0, "conf");
          a.p(p1, "panelElement");
          a.p(p2, "err");
          p1 = p1.mActionUrl;
          a.o(p1, "panelElement.mActionUrl");
          this.q(p0, 4, p1, p2);
       }
       return;
    }
    public void o(k p0,ShareInitResponse$SharePanelElement p1){
       this.r(p0, p1);
    }
    public void p(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "2")) {
       }else {
          a.p(p0, "conf");
          a.p(p1, "panelElement");
          p1 = p1.mActionUrl;
          a.o(p1, "panelElement.mActionUrl");
          this.q(p0, 2, p1, null);
       }
       return;
    }
    public final void q(l p0,int p1,String p2,Throwable p3){
       ShareAnyResponse$ShareAnyData mShareChanne;
       ShareAnyResponse$ShareObject mShareUrl;
       String str2;
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, h.class, "5")) {
          return;
       }
       int i = d2.a(new h0(p2).c());
       if (p0.p() && i != 23) {
          ShareAnyResponse shareAnyResp = p0.r();
          ShareAnyResponse$ShareAnyData shareAnyData = null;
          if (shareAnyResp != null) {
             shareAnyResp = shareAnyResp.mShareAnyData;
             if (shareAnyResp != null) {
                mShareChanne = shareAnyResp.mShareChannel;
             label_0047 :
                String str = d2.b(mShareChanne);
                shareAnyResp = p0.r();
                if (shareAnyResp != null) {
                   shareAnyResp = shareAnyResp.mShareAnyData;
                   if (shareAnyResp != null) {
                      shareAnyData = shareAnyResp.mShareMethod;
                   }
                }
                int i1 = d2.c(shareAnyData);
                shareAnyResp = p0.r();
                String str1 = "";
                if (shareAnyResp != null) {
                   shareAnyResp = shareAnyResp.mShareAnyData;
                   if (shareAnyResp != null) {
                      mShareChanne = shareAnyResp.mShareObject;
                      if (mShareChanne != null) {
                         mShareUrl = mShareChanne.mShareUrl;
                         if (mShareUrl != null) {
                         label_0071 :
                            if (p3 != null) {
                               String stackTraceSt = Log.getStackTraceString(p3);
                               if (stackTraceSt != null) {
                                  str2 = stackTraceSt;
                               label_007c :
                                  a.o(str2, "throwable?.let { Log.get\x20\x02ckTraceString\(it\) } ?: \"\"\x00");
                                  QPhoto mEntity = p0.K().mEntity;
                                  a.o(mEntity, "conf.photo.mEntity");
                                  u1.f0(j2.b(mEntity, mShareUrl, "", 1, p1, i, i1, str2));
                                  f.d(p0.K().mEntity, mShareUrl, str, p1, false, false, str2);
                               }
                            }
                            str2 = str1;
                            goto label_007c ;
                         }
                      }
                   }
                }
                mShareUrl = str1;
                goto label_0071 ;
             }
          }
          mShareChanne = shareAnyData;
          goto label_0047 ;
       }
       return;
    }
    public void r(l p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       x0.b(p1);
       p1 = p1.mActionUrl;
       a.o(p1, "panelElement.mActionUrl");
       this.q(p0, 1, p1, null);
       return;
    }
}
