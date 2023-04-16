package pa.d;
import y49.f;
import com.example.commercial.diversead.banner.AdTKBannerView;
import java.lang.String;
import msd.l;
import org.json.JSONObject;
import a59.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import yx.j0;
import a59.a$a;
import java.util.Objects;
import xx6.e;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import com.kwai.component.photo.detail.core.log.PhotoDetailLoggerFieldProvider;
import wd5.m;
import wd5.b;
import yd5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import lnc.i3;
import java.lang.Enum;
import java.lang.Integer;
import java.lang.Number;
import xd5.c;
import xd5.a;
import wd5.r;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.yxcorp.gifshow.log.model.StatMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import a59.e;

public final class d extends f	// class@0028f8
{
    public final AdTKBannerView d;

    public void d(AdTKBannerView p0,String p1,l p2){
       this.d = p0;
       super(p1, p2);
    }
    public Object c(JSONObject p0,a p1){
       a.p(p0, "data");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "AdTKBannerView";
       j0.f(str, "report VSE", objArray);
       Integer integer = null;
       p1 = (p1 != null)? a$a.a(p1, integer, integer, 2, integer): integer;
       d td = this.d;
       Objects.requireNonNull(td);
       if (p1 instanceof e) {
          Object[] objArray1 = new Object[i];
          j0.f(str, "onSessionReport", objArray1);
          ClientStat$VideoStatEvent videoStatEve = new ClientStat$VideoStatEvent();
          PhotoDetailLoggerFieldProvider photoDetailL = new PhotoDetailLoggerFieldProvider();
          photoDetailL.bindDataSaver(new m(p1));
          a uoa = new a(p1);
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 89;
          PhotoAdvertisement photoAdverti = k.B(td.m);
          if (photoAdverti != null) {
             i3 oi3 = i3.f();
             PhotoAdvertisement mAdGroup = photoAdverti.mAdGroup;
             if (mAdGroup != null) {
                integer = Integer.valueOf(mAdGroup.ordinal());
             }
             oi3.c("ad_type", integer);
             oi3.c("ad_source_type", Integer.valueOf(photoAdverti.mSourceType));
             urlPackage.params = oi3.e();
          }
          AdTKBannerView m = td.m;
          a.m(m);
          r.a(m, photoDetailL, uoa, urlPackage).b(videoStatEve);
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          statPackage.videoStatEvent = videoStatEve;
          AdTKBannerView m1 = td.m;
          a.m(m1);
          u1.F0(new StatMetaData().setStatPackage(statPackage).setFeedLogCtx(m1.getFeedLogCtx()));
       }
       return this.e();
    }
}
