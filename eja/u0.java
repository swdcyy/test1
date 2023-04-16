package eja.u0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import eja.u0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import nga.h;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.framework.model.feed.BaseFeed;
import im8.f;

public class u0 extends PresenterV2	// class@0026fd
{
    public h p;
    public RecyclerFragment q;
    public BaseFeed r;
    public f s;
    public View$OnAttachStateChangeListener t;

    public void u0(){
       super();
       this.t = new u0$a(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, u0.class, "2")) {
          return;
       }
       this.m8().addOnAttachStateChangeListener(this.t);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, u0.class, "3")) {
          return;
       }
       this.m8().removeOnAttachStateChangeListener(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u0.class, "1")) {
          return;
       }
       this.p = this.t8("HOME_FOLLOW_PAGE_LIST_WRAPPER");
       this.q = this.r8("FRAGMENT");
       this.r = this.q8(BaseFeed.class);
       this.s = this.x8("ADAPTER_POSITION");
       return;
    }
}
