package gqb.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gqb.k$a;
import android.view.View$OnClickListener;
import android.view.View;
import crd.b;
import lnc.b9;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wpb.q;
import ekd.m1;
import sy6.a;
import brd.y;

public final class k extends PresenterV2	// class@002b7d
{
    public TextView p;
    public b q;
    public View r;
    public y s;
    public e t;
    public SlidePlayViewModel u;

    public void k(){
       super();
    }
    public static final TextView P8(k p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mCountDownTextView");
       }
       return p0;
    }
    public static final SlidePlayViewModel R8(k p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       k tr = this.r;
       if (tr == null) {
          a.S("mCountDownBtn");
       }
       tr.setOnClickListener(new k$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       b9.a(this.q);
       return;
    }
    public final long S8(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "7");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return ((long)(q.a.a(p0) * 60) * 1000);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.music_radio_count_down);
       a.o(view, "ViewBindUtils.bindWidget¡­d.music_radio_count_down\)");
       this.p = view;
       p0 = m1.f(p0, R.id.music_radio_count_down_dialog_btn);
       a.o(p0, "ViewBindUtils.bindWidget¡­io_count_down_dialog_btn\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       Object obj = this.q8(a.class);
       a.o(obj, "inject\(ISlidePlayProvider::class.java\)");
       this.u = obj;
       this.s = this.t8("MUSIC_RADIO_CHANGE_PLAYER_STATE_OBSERVER");
       return;
    }
}
