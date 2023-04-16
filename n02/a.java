package n02.a;
import im8.g;
import k51.c;
import java.util.HashSet;
import n02.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import n02.a$b;
import androidx.fragment.app.c$b;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import n02.h;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends c implements g	// class@00326a
{
    public Set p;
    public BaseFragment q;
    public b r;
    public static String sLivePresenterClassName = "FragmentLifecycleDispatcherPresenter";

    public void a(){
       super();
       this.p = new HashSet();
       this.r = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.PLAY_FRAGMENT, "FragmentLifecycleDispatcherPresenter onBind");
       c fragmentMana = this.q.getFragmentManager();
       fragmentMana.registerFragmentLifecycleCallbacks(new a$b(this, fragmentMana), false);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.PLAY_FRAGMENT, "FragmentLifecycleDispatcherPresenter onUnbind");
       this.p.clear();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new h());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_FRAGMENT");
       return;
    }
}
