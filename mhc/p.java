package mhc.p;
import mhc.m2;
import com.kwai.framework.model.feed.BaseFeed;
import uo7.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.model.ShareAnyResponse;
import l66.c;
import dda.l;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import mhc.d2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import m66.a;

public class p extends m2	// class@003599
{
    public final BaseFeed a;

    public void p(BaseFeed p0){
       super();
       this.a = p0;
    }
    public void b(k p0,ShareInitResponse$SharePanelElement p1){
       ShareAnyResponse$ShareAnyData mShareChanne;
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "1")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "element");
       if (this.a != null && p0.r() != null) {
          c uoc = c.a();
          p ta = this.a;
          ShareAnyResponse shareAnyResp = p0.r();
          Object obj = null;
          if (shareAnyResp != null) {
             shareAnyResp = shareAnyResp.mShareAnyData;
             if (shareAnyResp != null) {
                mShareChanne = shareAnyResp.mShareChannel;
             label_0036 :
                obj = PatchProxy.applyOneRefs(mShareChanne, obj, d2.class, "5");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else if(mShareChanne == null){
                   switch (mShareChanne.hashCode()){
                       case 0x98617f26:
                         if (mShareChanne.equals("WECHAT")) {
                         label_0097 :
                            i = 3;
                         }
                         break;
                       case 0x9d96ea3a:
                         if (mShareChanne.equals("WECHAT_MOMENTS")) {
                            i = 2;
                         }
                         break;
                       case 2340:
                         if (mShareChanne.equals("IM")) {
                            i = 1;
                         }
                         break;
                       case 2592:
                         if (mShareChanne.equals("QQ")) {
                            i = 4;
                         }
                         break;
                       case 0x4a0079d:
                         if (mShareChanne.equals("QZone")) {
                            i = 5;
                         }
                         break;
                       case 0x4ea74c8:
                         if (mShareChanne.equals("WEIBO")) {
                            i = 6;
                         }
                         break;
                       case 0x7fcdfbe6:
                         if (mShareChanne.equals("WECHAT_WOW")) {
                            goto label_0097 ;
                         }
                         break;
                       default:
                   }
                }
                i = 0;
                uoc.b(new l(ta, i));
             }
          }
          mShareChanne = obj;
          goto label_0036 ;
       }
       super.b(p0, p1);
       return;
    }
}
