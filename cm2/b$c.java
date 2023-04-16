package cm2.b$c;
import k51.c;
import cm2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cm2.d;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import lnc.a1;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.vote.widget.LiveVotePercentProgressbar;
import android.widget.ProgressBar;
import cm2.b$a;
import cm2.c;
import android.view.View$OnClickListener;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Typeface;
import ekd.m1;
import java.lang.Integer;
import mrd.c;

public class b$c extends c	// class@000557
{
    public LiveVoteOption p;
    public int q;
    public c r;
    public LiveVotePercentProgressbar s;
    public TextView t;
    public TextView u;
    public View v;
    public final b w;
    public static String sLivePresenterClassName = "LiveVoteOptionAdapter$VoteOptionPresenter";

    public void b$c(b p0){
       this.w = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "3")) {
          return;
       }
       this.X7(this.r.subscribe(new d(this)));
       this.P8();
       return;
    }
    public void P8(){
       b$c uoc = b$c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       LinearLayout$LayoutParams layoutParams = this.u.getLayoutParams();
       b$c tw = this.w;
       boolean b = false;
       if (tw.H != null || tw.t1()) {
          this.v.setVisibility(8);
          this.u.setGravity(19);
          layoutParams.leftMargin = a1.e(16.00f);
          this.u.setLayoutParams(layoutParams);
       }else {
          this.v.setVisibility(b);
          this.u.setGravity(17);
          layoutParams.leftMargin = b;
          this.u.setLayoutParams(layoutParams);
       }
       this.u.setText(this.p.mContent);
       this.t.setText(this.p.mDisplayCount);
       this.s.setProgressColor(this.w.G);
       this.s.setSelectLeftColor(this.w.E);
       this.s.setSelectRightColor(this.w.F);
       this.s.setMax(this.w.w);
       this.s.setProgress(this.p.mCount);
       this.s.setSelected(this.p.isHighLight);
       this.s.setHighLight(this.p.isHighLight);
       b d = this.w.D;
       if (d != null && (!d.b() || (this.w.t1() || this.w.I != null))) {
          this.s.setShowProgress(true);
       }
       this.m8().setOnClickListener(new c(this));
       b$c tw1 = this.w;
       b$c uoc1 = (tw1.A == this.q)? 1: null;
       if (uoc1) {
          this.m8().setSelected(true);
          this.s.setSelected(true);
       }else if(!tw1.s1()){
          this.m8().setSelected(b);
          this.s.setSelected(b);
       }
       uoc1 = this.p;
       if (this.w.A == uoc1.mOptionId) {
          uoc1.isHighLight = true;
       }
       this.m8().setSelected(this.p.isHighLight);
       this.s.setSelectable(this.w.s1());
       tw1 = this.s;
       uoc1 = this.w;
       Objects.requireNonNull(uoc1);
       Object obj = PatchProxy.apply(objArray, uoc1, b.class, "11");
       boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): uoc1.t1() ^ true;
       tw1.setEnabled(b1);
       b1 = this.s.isSelected();
       boolean b2 = this.w.t1();
       boolean b3 = this.w.s1();
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b1), Boolean.valueOf(b2), Boolean.valueOf(b3), this, b$c.class, "5")) {
          if (b2 && b1) {
             this.u.setTypeface(Typeface.DEFAULT_BOLD);
             this.t.setTypeface(Typeface.DEFAULT_BOLD);
          }
          if (b3 || b1) {
             b = true;
          }
          this.u.setEnabled(b);
          this.t.setEnabled(b);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1a55);
       this.t = m1.f(p0, 0x7f0a1a51);
       this.u = m1.f(p0, 0x7f0a1a57);
       this.v = m1.f(p0, 0x7f0a1a52);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       this.p = this.q8(LiveVoteOption.class);
       this.q = this.r8("ADAPTER_POSITION").intValue();
       this.r = this.r8("LIVE_VOTE_ITEM_CHANGE_EVENT");
       return;
    }
}
