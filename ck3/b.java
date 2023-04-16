package ck3.b;
import im8.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import xk3.b;
import java.util.Map;
import uk3.a;
import java.lang.Object;
import tyc.q0;
import pp.d;
import ck3.a;
import pp.d$a;
import com.yxcorp.gifshow.autoplay.live.e$a;
import z99.d;
import jj3.e;
import com.kuaishou.live.basic.player.LivePlayerNetworkRetryConfig;
import o51.b;
import com.kuaishou.live.playeradapter.model.LiveStatusQueryBizType;
import oj3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import com.yxcorp.gifshow.autoplay.live.g;
import com.yxcorp.gifshow.autoplay.live.e;
import jl3.b;
import io.reactivex.subjects.PublishSubject;
import ck3.n;
import ck3.m;
import java.util.HashMap;

public class b implements g	// class@000578
{
    public g b;
    public b c;
    public boolean d;
    public PublishSubject e;
    public String f;
    public n$h g;
    public final b h;
    public final a i;
    public final d j;
    public final q0 k;

    public void b(BaseFeed p0,BaseFragment p1,String p2,b p3,Map p4,int p5,a p6){
       super();
       this.k = new q0();
       d uod = new d(new a(p0, p5));
       this.j = uod;
       e$a uoa = new e$a(p0, p1, 4, ":ks-features:ft-live:live-external:live-collection");
       uoa.i(14);
       uoa.c(d.a(p1));
       uoa.k(p2);
       boolean b = false;
       uoa.d(b);
       uoa.g(e.b());
       uoa.e(b);
       uoa.q = true;
       uoa.u = b.a().mPreviewScene;
       uoa.a(11);
       uoa.j = LiveStatusQueryBizType.PREVIEW_LIVE.mValue;
       boolean b1 = a.a();
       e$a uoa1 = e$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(b1), uoa, uoa1, "1");
          if (obj != PatchProxyResult.class) {
             uoa = obj;
          label_007a :
             uoa.v = p4;
             uoa.y = p6.b();
             uoa.f = p6.c();
             uod.j(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "create play module", "reuseToken", p2, "retryScene", b.a().mPreviewScene);
             this.i = p6;
             this.b = new g(uoa.b());
             this.c = new b(p1);
             this.e = PublishSubject.g();
             this.f = p2;
             this.h = p3;
             return;
          }
       }
       if (b1 && a.a()) {
          b = true;
       }
       uoa.k = b;
       goto label_007a ;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new n();
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(b.class, new n());
       }else if(p0.equals("provider")){
          obj.put(b.class, new m());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
