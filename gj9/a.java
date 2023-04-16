package gj9.a;
import hn5.e;
import java.lang.Object;
import java.lang.Class;
import com.yxcorp.gifshow.channel.stagger.HotChannelFragment;
import com.yxcorp.gifshow.channel.stagger.HotChannelWebContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.channel.HotChannel;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rj9.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import y8c.q;
import b9c.u;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import java.lang.Boolean;
import oj9.a;

public class a implements e	// class@0024af
{

    public void a(){
       super();
    }
    public Class Do(){
       return HotChannelFragment.class;
    }
    public Class G20(){
       return HotChannelWebContainerFragment.class;
    }
    public BaseFragment HM(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HotChannelFragment();
    }
    public BaseFragment Lo(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HotChannelWebContainerFragment();
    }
    public Bundle Sk(HotChannel p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Bundle obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, HotChannelFragment.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = new Bundle();
          SerializableHook.putSerializable(obj, "key_channel", p0);
       }
       return obj;
    }
    public PresenterV2 Uo(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "4");
       return new f();
    }
    public List b5(RecyclerFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u.a(p0);
    }
    public boolean isAvailable(){
       return true;
    }
    public i mu(BaseFragment p0,QPhoto p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 instanceof HotChannelFragment) {
          return new a(p0.N, p1, p2);
       }else {
          return null;
       }
    }
}
