package gqb.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gqb.p$a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import ypb.a;
import zpb.a;
import gqb.p$b;
import android.view.View$OnClickListener;
import android.view.View;
import gqb.p$c;
import erd.g;
import crd.b;
import brd.t;
import androidx.lifecycle.MutableLiveData;
import wpb.q;
import kob.h;
import android.content.SharedPreferences;
import java.util.Objects;
import com.yxcorp.gifshow.music.radio.backplay.MusicRadioPlayModel;
import xw6.a;
import android.database.DataSetObserver;
import gqb.p$d;
import ew6.b;
import ekd.m1;
import sy6.a;

public final class p extends PresenterV2	// class@002b89
{
    public View p;
    public SlidePlayViewModel q;
    public e r;
    public a s;
    public t t;
    public b u;
    public a v;
    public DataSetObserver w;

    public void p(){
       super();
       this.w = new p$a(this);
    }
    public static final SlidePlayViewModel P8(p p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void E8(){
       MusicRadioPlayModel lIST;
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       a uoa = a.a(this.getActivity());
       this.v = uoa;
       if (uoa == null) {
          return;
       }
       p tp = this.p;
       if (tp == null) {
          a.S("mFeedListDialogBtn");
       }
       tp.setOnClickListener(new p$b(this));
       tp = this.t;
       if (tp != null) {
          b uob = tp.subscribe(new p$c(this));
          if (uob != null) {
             this.X7(uob);
          }
       }
       tp = this.v;
       if (tp != null) {
          MutableLiveData mutableLiveD = tp.r0();
          if (mutableLiveD != null) {
             int intx = h.a.getInt("music_radio_play_model", 0);
             Objects.requireNonNull(q.a);
             if (intx != 1) {
                lIST = (intx != 2)? MusicRadioPlayModel.LIST: MusicRadioPlayModel.RANDOM;
             }else {
                lIST = MusicRadioPlayModel.SINGLE;
             }
             mutableLiveD.setValue(lIST);
          }
       }
       tp = this.q;
       String str = "mSlidePlayViewModel";
       if (tp == null) {
          a.S(str);
       }
       if (tp.N0() != null) {
          tp = this.q;
          if (tp == null) {
             a.S(str);
          }
          tp.registerDataSetObserver(this.w);
       }else {
          this.u = new p$d(this);
          tp = this.q;
          if (tp == null) {
             a.S(str);
          }
          tp.R(this.u);
       }
       return;
    }
    public void J8(){
       p tq;
       if (PatchProxy.applyVoid(null, this, p.class, "5")) {
          return;
       }
       String str = "mSlidePlayViewModel";
       if (this.u != null) {
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          tq.O(this.u);
       }
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.unregisterDataSetObserver(this.w);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       p0 = m1.f(p0, R.id.music_radio_feed_list_btn);
       a.o(p0, "ViewBindUtils.bindWidget¡­usic_radio_feed_list_btn\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       Object obj = this.q8(a.class);
       a.o(obj, "inject\(ISlidePlayProvider::class.java\)");
       this.q = obj;
       this.t = this.t8("MUSIC_RADIO_PLAY_STATE_CHANGE_OBSERVABLE ");
       return;
    }
}
