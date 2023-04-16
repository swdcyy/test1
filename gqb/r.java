package gqb.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import ypb.a;
import zpb.a;
import gqb.r$a;
import android.view.View$OnClickListener;
import android.view.View;
import gqb.r$b;
import gqb.r$c;
import gqb.r$d;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import dqb.b;
import brd.z;
import io.reactivex.android.schedulers.a;
import gqb.r$e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import usd.k;
import usd.q;
import java.lang.Iterable;
import java.util.List;
import trd.t;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import ekd.m1;
import android.widget.ImageView;
import sy6.a;
import brd.y;

public final class r extends PresenterV2	// class@002b90
{
    public View p;
    public View q;
    public SlidePlayViewModel r;
    public ImageView s;
    public View t;
    public y u;
    public t v;
    public a w;

    public void r(){
       super();
    }
    public static final SlidePlayViewModel P8(r p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       a uoa = a.a(this.getActivity());
       this.w = uoa;
       if (uoa == null) {
          return;
       }
       r tp = this.p;
       if (tp == null) {
          a.S("mPlayNextBtn");
       }
       tp.setOnClickListener(new r$a(this));
       tp = this.q;
       if (tp == null) {
          a.S("mPlayPreBtn");
       }
       tp.setOnClickListener(new r$b(this));
       tp = this.t;
       if (tp == null) {
          a.S("mPlayBtn");
       }
       tp.setOnClickListener(new r$c(this));
       tp = this.v;
       if (tp != null) {
          b uob = tp.subscribe(new r$d(this));
          if (uob != null) {
             this.X7(uob);
          }
       }
       this.X7(RxBus.f.f(b.class).observeOn(a.c()).subscribe(new r$e(this)));
       return;
    }
    public final int R8(){
       Number number;
       r obj = PatchProxy.apply(null, this, r.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.r;
       String str = "mSlidePlayViewModel";
       if (obj == null) {
          a.S(str);
       }
       List list = t.l(q.n1(0, obj.Y0()));
       ListIterator listIterator = list.listIterator(list.size());
       while (true) {
          if (!listIterator.hasPrevious()) {
             throw new NoSuchElementException("List contains no element matching the predicate.");
          }
          number = listIterator.previous();
          int i = number.intValue();
          r tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          i = (i != tr.a0())? 1: 0;
          if (i) {
             break ;
          }
       }
       return number.intValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.music_radio_pre);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.music_radio_pre\)");
       this.q = view;
       view = m1.f(p0, R.id.music_radio_next);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.music_radio_next\)");
       this.p = view;
       view = m1.f(p0, R.id.music_radio_play_btn);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.music_radio_play_btn\)");
       this.t = view;
       p0 = m1.f(p0, R.id.music_radio_play_btn_img);
       a.o(p0, "ViewBindUtils.bindWidget¡­music_radio_play_btn_img\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       Object obj = this.q8(a.class);
       a.o(obj, "inject\(ISlidePlayProvider::class.java\)");
       this.r = obj;
       this.u = this.t8("MUSIC_RADIO_CHANGE_PLAYER_STATE_OBSERVER");
       this.v = this.t8("MUSIC_RADIO_PLAY_STATE_CHANGE_OBSERVABLE ");
       return;
    }
}
