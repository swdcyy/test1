package bhd.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bhd.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import ihc.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.view.View;
import ekd.m1;
import android.widget.Button;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem;

public final class e extends PresenterV2	// class@000266
{
    public Button p;
    public BaseFragment q;
    public BindPhoneItem r;
    public final Observer s;

    public void e(){
       super();
       this.s = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tr = this.r;
       if (tr == null) {
          a.S("item");
       }
       MutableLiveData status = tr.getStatus();
       e tq = this.q;
       if (tq == null) {
          a.S("fragment");
       }
       status.observe(tq.getViewLifecycleOwner(), this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       e tr = this.r;
       if (tr == null) {
          a.S("item");
       }
       tr.getStatus().removeObserver(this.s);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.button);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.button\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.q8(BindPhoneItem.class);
       a.o(obj, "inject\(BindPhoneItem::class.java\)");
       this.r = obj;
       return;
    }
}
