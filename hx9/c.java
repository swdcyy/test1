package hx9.c;
import com.kwai.component.tabs.panel.h$b;
import hx9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.tabs.panel.h;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hx9.c$b;
import android.view.View$OnClickListener;
import com.kuaishou.android.model.mix.PhotoMeta;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import hx9.c$c;
import erd.o;
import hx9.c$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;

public final class c extends h$b	// class@002727
{
    public QPhoto w;
    public TabsPanelHostFragment x;

    public void c(b p0){
       a.p(p0, "tabsPanelPageBuilder");
       super(p0);
    }
    public static final QPhoto b9(c p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.E8();
       this.Y8(new c$b(this));
       this.c9();
       c tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       PhotoMeta photoMeta = tw.getPhotoMeta();
       if (photoMeta != null) {
          c tx = this.x;
          if (tx == null) {
             a.S("mCommentPanelHostFragment");
          }
          photoMeta.startSyncWithFragment(tx.m());
          this.X7(photoMeta.observable().distinctUntilChanged(c$c.b).subscribe(new c$a(this), Functions.d()));
       }
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       this.W8((long)tw.numberOfLike(), a1.p(R.string.arg_RES_7f10085c));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
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
