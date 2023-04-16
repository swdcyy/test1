package ihc.c;
import ihc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.settings.stencil.item.SettingStencilOfflineBasicItem$create$1;
import androidx.lifecycle.LifecycleObserver;
import gr8.b;
import com.kwai.robust.PatchProxyResult;
import com.trello.rxlifecycle3.android.FragmentEvent;
import com.trello.rxlifecycle3.components.support.RxFragment;

public class c extends a	// class@002b3a
{
    public final BaseFragment r;

    public void c(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.r = p0;
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
       }else {
          LifecycleOwner viewLifecycl = p0.getViewLifecycleOwner();
          a.o(viewLifecycl, "targetFragment.viewLifecycleOwner");
          viewLifecycl.getLifecycle().addObserver(new SettingStencilOfflineBasicItem$create$1(this, viewLifecycl));
       }
       return;
    }
    public final b l(){
       b obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r.Ug(FragmentEvent.DESTROY_VIEW);
       a.o(obj, "targetFragment.bindUntil¡­agmentEvent.DESTROY_VIEW\)");
       return obj;
    }
    public final b m(){
       b obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r.Ug(FragmentEvent.DESTROY_VIEW);
       a.o(obj, "targetFragment.bindUntil¡­agmentEvent.DESTROY_VIEW\)");
       return obj;
    }
    public void n(){
    }
    public void o(){
    }
}
