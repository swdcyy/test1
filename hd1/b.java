package hd1.b;
import jd1.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import s51.c;
import lp3.c;
import lp3.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo$ContainerInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import nc1.k;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo$ButtonInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;

public class b implements e	// class@002670
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public void a(LiveRouterNoticeInfo p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       p0 = p0.mContainerInfo;
       Objects.requireNonNull(ta);
       c obj = PatchProxy.applyOneRefs(p0, ta, a.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 == null){
          b = false;
       }else {
          obj = ta.e.a(c.class);
          if (!TextUtils.isEmpty(p0.mRouterUrl) && obj.P0(p0.mRouterUrl)) {
             obj.r4(p0.mRouterUrl, ta.f);
             b = true;
          }else {
             b = ta.e(p0.mWebUrl, p0.mHeightPercent);
          }
       }
       if (b) {
          this.a.e.a(k.class).D6();
       }
       return;
    }
    public void b(LiveRouterNoticeInfo p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b ta = this.a;
       LiveRouterNoticeInfo mButtonInfo = p0.mButtonInfo;
       Objects.requireNonNull(ta);
       c obj = PatchProxy.applyOneRefs(mButtonInfo, ta, a.class, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(mButtonInfo == null){
          b = false;
       }else {
          obj = ta.e.a(c.class);
          if (!TextUtils.isEmpty(mButtonInfo.mRouterUrl) && obj.P0(mButtonInfo.mRouterUrl)) {
             obj.r4(mButtonInfo.mRouterUrl, ta.f);
             b = true;
          }else {
             b = ta.e(mButtonInfo.mWebUrl, mButtonInfo.mHeightPercent);
          }
       }
       if (b) {
          this.a.e.a(k.class).D6();
       }
       a.c(this.a.d.a(), String.valueOf(p0.mNoticeType), p0.mBizId, this.a.d(p0.mExtraInfoStr));
       return;
    }
}
