package eja.e1;
import ja5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eja.e1$a;
import android.view.View$OnClickListener;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import y8c.d;
import y0b.i;

public final class e1 extends c	// class@0026bf
{
    public i A;
    public View B;
    public BaseFragment C;
    public BaseFeed D;
    public QPhoto E;
    public View F;
    public d z;

    public void e1(int p0){
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e1.class, "4")) {
          return;
       }
       this.F.setOnClickListener(new e1$a(this, true));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e1.class, "3")) {
          return;
       }
       this.F = this.m8();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e1.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a3105);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e1.class, "1")) {
          return;
       }
       super.j8();
       this.C = this.r8("FRAGMENT");
       this.D = this.r8("feed");
       this.E = this.q8(QPhoto.class);
       this.z = this.r8("ADAPTER_POSITION_GETTER");
       this.A = this.t8("COMPONENT_MODULE");
       return;
    }
}
