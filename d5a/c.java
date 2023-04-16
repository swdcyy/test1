package d5a.c;
import xjd.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import d5a.a;
import d5a.b;
import tkd.b;
import tkd.d;
import pt5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xjd.a$a;
import com.kwai.robust.PatchProxyResult;
import d5a.g;
import java.util.Map;
import java.util.HashMap;

public final class c extends PresenterV2 implements a, g	// class@001e7c
{
    public final c p;
    public PublishSubject q;

    public void c(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.p = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.q = publishSubje;
       this.U7(new LandscapeEntranceVMPresenter());
       this.U7(new a());
       this.U7(new b());
       d.a(0x60b9226c).fb(this);
    }
    public boolean G(){
       return false;
    }
    public void J7(BaseFragment p0,SlidePlayViewModel p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "3")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p2, "listener");
       a$a.b(this, p0, p1, p2);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new g());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void s5(BaseFragment p0,SlidePlayViewModel p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "2")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p2, "listener");
       a$a.a(this, p0, p1, p2);
       return;
    }
}
