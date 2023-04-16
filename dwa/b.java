package dwa.b;
import y8c.f$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.autoplay.live.e;
import com.yxcorp.gifshow.autoplay.live.e$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.model.feed.BaseFeed;
import dwa.a;
import dwa.h;
import java.util.Map;

public class b extends f$b	// class@00258b
{
    public QPhoto h;
    public String i;
    public LiveAutoPlayModule j;
    public m k;

    public void b(f$b p0,QPhoto p1){
       super(p0);
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p1, this, uob, "1")) {
       }else {
          this.h = p1;
          b th = this.h;
          e uoe = PatchProxy.applyOneRefs(th, this, uob, "2");
          if (uoe != PatchProxyResult.class) {
          }else {
             e$a uoa = new e$a(th.mEntity, this.f, 26, ":ks-features:ft-feed:trending");
             uoa.i(0);
             uoa.h(326);
             uoa.k("hot_spot_card");
             uoe = uoa.b();
          }
          this.j = new LiveAutoPlayModule(uoe);
          this.i = "hot_spot_card";
          this.k = new a(this);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(b.class, new h());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
