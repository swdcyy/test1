package dha.l;
import vga.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dha.l$b;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.util.Objects;
import dha.j;
import erd.g;
import eda.l;
import dha.k;

public final class l implements b	// class@0024ae
{
    public final BaseFragment a;
    public final PublishSubject b;
    public l$b c;
    public b d;
    public b e;

    public void l(BaseFragment p0){
       super();
       this.a = p0;
       this.b = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       if (this.c != null) {
          b9.a(this.d);
          b9.a(this.e);
          this.c = null;
       }
       return;
    }
    public t b(){
       RxBus obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.isDetached() || this.a.getActivity() == null) {
          this.a();
          return t.empty();
       }else if(this.c == null){
          this.c = new l$b(this);
          obj = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          l tc = this.c;
          Objects.requireNonNull(tc);
          this.d = obj.g(n.class, mAIN).subscribe(new j(tc));
          t ot = obj.g(l.class, mAIN);
          l tc1 = this.c;
          Objects.requireNonNull(tc1);
          this.e = ot.subscribe(new k(tc1));
       }
       return this.b;
    }
}
