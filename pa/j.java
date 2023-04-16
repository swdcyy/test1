package pa.j;
import ql9.e;
import pa.j$a;
import nsd.u;
import android.app.Activity;
import yl9.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yx.j0;
import com.yxcorp.gifshow.commercial.api.ImpExtData;
import java.util.HashMap;
import pa.i;
import ql9.a;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import uh5.e;
import ox8.a;
import ox8.a$a;
import wkd.b;
import u49.c;
import brd.t;
import o49.h;
import o49.f;
import p49.c;
import p49.c$a;
import com.example.commercial.diversead.banner.DiverseAdRequester$getInstreamApi$1;
import com.example.commercial.diversead.banner.DiverseAdRequester$getInstreamApi$2;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import msd.l;
import com.kwai.framework.model.feed.BaseFeed;
import brd.x;
import pa.f;
import erd.g;
import cjd.e;
import erd.o;
import pa.g;
import pa.h;
import pa.j$b;
import erd.r;
import pa.j$c;
import brd.a0;
import pa.j$d;
import pa.j$e;
import crd.b;
import java.lang.StringBuilder;
import com.example.commercial.diversead.banner.AdTKBannerView;
import ql9.e$c;
import ql9.e$a;

public final class j implements e	// class@002903
{
    public QPhoto a;
    public e$c b;
    public e$a c;
    public AdTKBannerView d;
    public boolean e;
    public Activity f;
    public a g;
    public static final j$a h;

    static {
       j.h = new j$a(null);
    }
    public void j(Activity p0,a p1){
       a.p(p0, "mActivity");
       a.p(p1, "adParamsConfig");
       super();
       this.f = p0;
       this.g = p1;
    }
    public void a(Activity p0){
       j oj = this;
       t obj = p0;
       a.p(obj, "activity");
       Object[] objArray = new Object[0];
       j0.f("KsBannerAdControl", "requestShowAd", objArray);
       oj.f = obj;
       ImpExtData impExtData = new ImpExtData();
       impExtData.setBookId(String.valueOf(oj.g.b().get("book_id")));
       BrowseStyle uBrowseStyle = e.d();
       a.o(uBrowseStyle, "BrowseStyleUtils.getBrowseStyle\(\)");
       a uoa = new a(oj.g.a(), oj.g.c(), 0, 0, 0, uBrowseStyle.getParamType(), impExtData, null);
       i oi = new i(v3);
       f uof = new f(c.Z.k(), null, DiverseAdRequester$getInstreamApi$1.INSTANCE, DiverseAdRequester$getInstreamApi$2.INSTANCE, 2, null);
       h oh = new h(null, oi.b.a(), oi.b.b(), v10, null, 17, null);
       t ot = b.a(0x3a268c29).q(a.a.b(oi.b)).compose(impExtData).doOnNext(f.b).map(new e()).map(g.b).onErrorReturn(h.b);
       a.o(ot, "Singleton.get\(Commercial\x20\x02e ?: \"\"\n        \)\n      }\x00");
       obj = ot.filter(new j$b(obj));
       obj.filter(j$c.b).singleOrError().R(new j$d(oj), new j$e(oj));
    }
    public void b(){
       Object[] objArray = new Object[0];
       j0.f("KsBannerAdControl", " «Â¿Ìcontrol "+this, objArray);
       this.e = true;
       this.b = null;
       j td = this.d;
       if (td != null) {
          td.a();
       }
       return;
    }
    public void c(e$c p0){
       this.b = p0;
    }
    public void d(e$a p0){
       this.c = p0;
    }
}
