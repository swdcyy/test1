package e72.c;
import y8c.f$b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import java.lang.Boolean;
import java.lang.Object;
import e72.q;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import tkd.b;
import tkd.d;
import lm9.a;
import java.lang.String;
import rj3.c;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.autoplay.live.e;
import com.yxcorp.gifshow.autoplay.live.e$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import jj3.e;
import e72.m;
import java.util.Map;

public class c extends f$b	// class@002683
{
    public LiveDoubleListParam h;
    public f i;
    public final LiveAutoPlayModule j;
    public final PublishSubject k;
    public m l;
    public final Boolean m;
    public final String n;
    public final b o;

    public void c(f$b p0,BaseFeed p1,LiveDoubleListParam p2){
       super(p0);
       this.k = PublishSubject.g();
       Boolean fALSE = Boolean.FALSE;
       this.o = new b(fALSE);
       this.h = p2;
       this.m = Boolean.valueOf(q.a(p1));
       this.n = (p1 instanceof LiveStreamFeed && d.a(-1638991736).SW(p1, fALSE))? null: c.a(p1);
       e uoe = PatchProxy.applyOneRefs(p1, this, c.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          f$b tf = this.f;
          int i = (this.h.mType != 4)? 11: 10;
          e$a uoa = new e$a(p1, tf, i, ":ks-features:ft-live:live");
          uoa.d(true);
          uoa.e(true);
          uoa.g(e.b());
          uoa.k(this.n);
          uoa.i(5);
          uoa.h(52);
          uoa.a(8);
          uoe = uoa.b();
       }
       this.j = new LiveAutoPlayModule(uoe);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(c.class, new m());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
}
