package hx9.d;
import com.kwai.component.tabs.panel.h$b;
import com.kwai.component.tabs.panel.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hx9.d$b;
import android.view.View$OnClickListener;
import com.kuaishou.android.model.mix.PhotoMeta;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import hx9.d$c;
import erd.o;
import hx9.d$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;

public final class d extends h$b	// class@00272b
{
    public QPhoto w;
    public TabsPanelHostFragment x;

    public void d(h p0){
       a.p(p0, "tabsPanelPageBuilder");
       super(p0);
    }
    public static final QPhoto b9(d p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       super.E8();
       this.c9();
       this.Y8(new d$b(this));
       d tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       PhotoMeta photoMeta = tw.getPhotoMeta();
       if (photoMeta != null) {
          d tx = this.x;
          if (tx == null) {
             a.S("mCommentPanelHostFragment");
          }
          photoMeta.startSyncWithFragment(tx.m());
          this.X7(photoMeta.observable().distinctUntilChanged(d$c.b).subscribe(new d$a(this), Functions.d()));
       }
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       this.W8(tw.numberOfCollects(), a1.p(R.string.arg_RES_7f100729));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.w = obj;
       obj = this.q8(TabsPanelHostFragment.class);
       a.o(obj, "inject\(TabsPanelHostFragment::class.java\)");
       this.x = obj;
       return;
    }
}
