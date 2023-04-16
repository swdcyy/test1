package ba2.x;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.hourlytrank.f;
import ka2.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiteTextNotice;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.r1;
import t02.a0;
import z12.x;
import k2b.e0;
import xp5.i;
import xp5.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ba2.i;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DistrictRankPackage;
import k2b.u1;
import ka2.d;

public class x extends m	// class@0003b5
{
    public final e c;
    public final f d;

    public void x(f p0,e p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(this.c.i.routeUrl)) {
          x td = this.d;
          x.K(this.c.i.routeUrl, this.d.getContext(), td.s, td.r);
          e0 page = this.d.v.getPage();
          boolean b = this.d.w.e();
          ClientContent$LiveStreamPackage liveStreamPa = this.d.v.a();
          String str = this.d.w.d();
          String liveStreamId = this.d.w.getLiveStreamId();
          String str1 = this.d.P8(this.c.i.bizType);
          i oi = i.class;
          if (PatchProxy.isSupport(oi)) {
             Object[] objArray = new Object[]{page,Boolean.valueOf(b),liveStreamPa,str,liveStreamId,str1};
             if (PatchProxy.applyVoid(objArray, null, oi, "25")) {
             label_00ab :
                x tc = this.c;
                e b1 = tc.b;
                String str2 = tc.a();
                ClientContent$LiveStreamPackage liveStreamPa1 = this.d.v.a();
                if (!PatchProxy.applyVoidThreeRefs(b1, str2, liveStreamPa1, null, d.class, "2")) {
                   u1.u(1, d.b(str2), d.a(b1, liveStreamPa1));
                }
             }
          }
          ClientEvent$ElementPackage uElementPack = i.c(str1);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$DistrictRankPackage uDistrictRan = new ClientContent$DistrictRankPackage();
          uDistrictRan.anchorUserId = str;
          uDistrictRan.liveStreamId = liveStreamId;
          uContentPack.districtRankPackage = uDistrictRan;
          uContentPack.liveStreamPackage = liveStreamPa;
          String str3 = (b)? "2965658": "2965631";
          u1.L(str3, page, 1, uElementPack, uContentPack);
          goto label_00ab ;
       }
       return;
    }
}
