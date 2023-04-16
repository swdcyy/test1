package b21.c;
import erd.g;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer;
import java.lang.Object;
import kotlin.Triple;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import oe3.h;
import fe3.a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import aq5.d;

public final class c implements g	// class@00030c
{
    public final LiveAudienceMultiChatPlayerViewTransformer b;

    public void c(LiveAudienceMultiChatPlayerViewTransformer p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       AudienceBizRelation cHAT_VIDEO_S;
       c tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          Integer integer = p0.component1();
          p0 = p0.component3();
          p0 = p0.component2().a();
          int i = 0;
          boolean b = (integer != null && integer.intValue() == 1)? true: false;
          boolean b1 = (p0 != null && p0.c() == 1)? true: false;
          int i1 = 2;
          boolean b2 = (p0 != null && p0.c() == i1)? true: false;
          if (b || b1) {
             this.b.e = p0;
          }
          Object[] objArray = new Object[]{"isOldSideLayout",Boolean.valueOf(b),"isNewSideLayout",Boolean.valueOf(b1),"isNewCenterLayout",Boolean.valueOf(b2)};
          this.b.j("overlay layout state", objArray);
          if (!b && (b1 || b2)) {
             cHAT_VIDEO_S = AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW;
             if (!this.b.r.r2(cHAT_VIDEO_S)) {
                objArray = new Object[i];
                this.b.j("enableVideoChatBiz", objArray);
                tb = this.b;
                tb.c = true;
                a[] uoaArray = new a[]{cHAT_VIDEO_S};
                tb.r.L8(uoaArray);
             }
          }else {
             cHAT_VIDEO_S = AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW;
             if (this.b.r.r2(cHAT_VIDEO_S)) {
                objArray = new Object[i];
                this.b.j("disableVideoChatBiz", objArray);
                tb = this.b;
                tb.c = i;
                tb.r.yj(cHAT_VIDEO_S);
             }
          }
          tb = this.b;
          if (b || b1) {
             i = true;
          }
          tb.h(i, b2, p0);
       }
       return;
    }
}
