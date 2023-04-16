package a4c.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.b;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import a4c.b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import kob.p;
import a4c.e;
import com.kuaishou.android.model.music.Music;
import a4c.a;
import android.view.View$OnClickListener;
import android.content.Context;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import a4c.h$a;

public class h extends PresenterV2	// class@000072
{
    public Music p;
    public CollectAnimationView q;
    public h$a r;
    public b s;

    public void h(){
       super();
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       if (b.h() > 0) {
          this.q.setVisibility(8);
          return;
       }else {
          this.q.i(R.drawable.arg_RES_7f081c7b, 0x7f081c7b, R.drawable.arg_RES_7f080dca, 0x7f080dca, false);
          if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
             this.X7(this.p.observable().subscribe(new b(this)));
             this.X7(RxBus.f.f(p.class).subscribe(new e(this)));
          }
          this.P8(this.p);
          if (!this.p.isOffline()) {
             this.q.setOnClickListener(new a(this));
          }else {
             this.q.setClickable(false);
          }
          return;
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       h ts = this.s;
       if (ts != null && !ts.isDisposed()) {
          this.s.dispose();
       }
       return;
    }
    public final void P8(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "5")) {
          return;
       }
       if (this.p.equals(p0)) {
          if (p0.isOffline()) {
             this.q.h();
          }else {
             this.q.setFavoriteState(p0.isFavorited());
             h tq = this.q;
             Context context = this.getContext();
             int i = (p0.isFavorited())? 0x7f10003d: 0x7f10003c;
             tq.setContentDescription(context.getString(i));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0dec);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.q8(Music.class);
       this.r = this.s8(h$a.class);
       return;
    }
}
