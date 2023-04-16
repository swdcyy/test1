package cm2.p;
import k51.c;
import cm2.p$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cm2.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.kuaishou.live.core.show.vote.widget.LiveVoteCircularProgressView;
import android.content.Context;
import ekd.r;
import cm2.q;
import java.lang.Integer;
import java.lang.Boolean;
import cm2.o;
import erd.g;
import crd.b;
import brd.t;
import cm2.n;
import dm2.s;
import java.lang.Long;
import lnc.a1;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import f37.o0;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import java.util.Objects;
import java.util.List;
import g9c.a;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import com.kuaishou.live.core.show.vote.model.LiveUserVote;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import ekd.m1;
import android.graphics.Typeface;
import ekd.d0;
import com.kwai.library.widget.specific.misc.LoadingView;
import cm2.l;
import android.view.View$OnClickListener;
import cm2.m;
import p91.m;
import mrd.c;

public class p extends c	// class@000569
{
    public c A;
    public c B;
    public a C;
    public b D;
    public long E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;
    public p$b J;
    public b$a K;
    public RecyclerView p;
    public LoadingView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public View w;
    public LiveVoteCircularProgressView x;
    public m y;
    public q z;
    public static String sLivePresenterClassName = "LiveVotePopupPresenter";

    public void p(){
       super();
       this.F = false;
       this.G = true;
       this.I = false;
       this.K = new p$a(this);
    }
    public void E8(){
       p tD;
       p tv;
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "5")) {
          return;
       }
       b uob = new b();
       this.D = uob;
       uob.D = this.K;
       this.p.setAdapter(uob);
       if (!PatchProxy.applyVoid(objArray, this, op, "9")) {
          this.q.f(true, R.string.loading);
          int i = 0;
          this.q.setVisibility(i);
          this.D.r1();
          int i1 = 8;
          if (this.I != null) {
             this.w.setVisibility(i1);
             this.s.setVisibility(i);
          }else if(y.d(this.getActivity())){
             this.w.setVisibility(i1);
          }else {
             this.s.setVisibility(i1);
             this.x.setStrokeWidth(15);
             this.x.setColor(r.b(this.getContext(), R.color.arg_RES_7f060752));
             this.x.setProgressBgColor(r.b(this.getContext(), R.color.arg_RES_7f060c85));
          }
          if (!PatchProxy.applyVoid(objArray, this, op, "8")) {
             p tz = this.z;
             if (tz != null) {
                q h = tz.h;
                if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(h), this, op, "19")) {
                   tv = this.D;
                   if (tv != null) {
                      tv.G = h;
                   }
                }
                tz = this.z;
                this.J = tz.a;
                h = tz.c;
                if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(h), this, op, "13")) {
                   this.G = h;
                   tv = this.v;
                   if (h == null) {
                      i = 8;
                   }
                   tv.setVisibility(i);
                }
                h = this.z.e;
                if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(h), this, op, "15")) {
                   tD = this.D;
                   if (tD != null) {
                      tD.E = h;
                   }
                }
                h = this.z.f;
                if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(h), this, op, "16")) {
                   tD = this.D;
                   if (tD != null) {
                      tD.F = h;
                   }
                }
                h = this.z.g;
                if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(h), this, op, "17")) {
                   tD = this.D;
                   if (tD != null) {
                      tD.H = h;
                   }
                }
                h = this.z.d;
                if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(h), this, op, "14")) {
                   tD = this.D;
                   if (tD != null) {
                      tD.y = h;
                   }
                }
                h = this.z.i;
                if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(h), this, op, "18")) {
                   tD = this.D;
                   if (tD != null) {
                      tD.I = h;
                   }
                }
             }
          }
       }
    label_0168 :
       if (!PatchProxy.applyVoid(objArray, this, op, "6")) {
          this.X7(this.A.subscribe(new o(this)));
          this.X7(this.B.subscribe(new n(this)));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       this.U7(new s());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "20")) {
          return;
       }
       this.F = false;
       this.H = 0;
       this.J = null;
       this.D.r1();
       return;
    }
    public final void P8(long p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, op, "22")) {
          return;
       }
       boolean b = false;
       if ((v3 = p0) > 0) {
          this.F = b;
       }
       int i = 0x7f102e93;
       if (!v3) {
          this.u.setText(a1.p(i));
          int i1 = 8;
          if (this.I != null) {
             this.v.setVisibility(i1);
             this.s.setVisibility(b);
             this.s.setText(a1.p(i));
          }else {
             this.s.setVisibility(i1);
             p tv = this.v;
             if (this.G != null) {
                i1 = 0;
             }
             tv.setVisibility(i1);
          }
       }
       if (y.d(this.getActivity())) {
          this.s.setVisibility(b);
          String str = (!v3)? a1.p(i): a1.p(0x7f1008ee)+" "+o0.h(p0);
          this.s.setText(str);
       }else if(this.I == null){
          op = this.H;
          if (p0 - op <= 0) {
             this.x.setProgress((float)(((double)p0 * 0x3ff0000000000000) / (double)op));
          }
          this.r.setText(o0.h(p0));
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, p.class, "23")) {
          return;
       }
       this.F = true;
       this.P8(0);
       return;
    }
    public final void S8(LiveVoterResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "21")) {
          return;
       }
       if (p0 != null) {
          LiveVoterResponse mVote = p0.mVote;
          if (mVote != null) {
             LiveVoterResponse mServerTime = p0.mServerTime;
             if (mServerTime - this.E < 0) {
                return;
             }else {
                this.H = mVote.mVoteDuration;
                this.E = mServerTime;
                if (mVote.isViteStop()) {
                   this.R8();
                }
                p tD = this.D;
                LiveVoteContext mQuestion = p0.mVote.mQuestion;
                Objects.requireNonNull(tD);
                b uob = b.class;
                if (!PatchProxy.applyVoidTwoRefs(p0, mQuestion, tD, uob, "1")) {
                   tD.Q0().clear();
                   if (!TextUtils.x(mQuestion)) {
                      LiveVoteOption liveVoteOpti = new LiveVoteOption();
                      liveVoteOpti.mOptionId = -2;
                      tD.Q0().add(liveVoteOpti);
                   }
                   tD.z = mQuestion;
                   tD.B = p0;
                   mServerTime = p0.mUserVote;
                   if (mServerTime != null) {
                      LiveUserVote mOptionId = mServerTime.mOptionId;
                      if (mOptionId != null) {
                         tD.A = mOptionId;
                      }
                   }
                   if (p0.mVote != null) {
                      tD.Q0().addAll(p0.mVote.mOptions);
                      tD.k0();
                   }
                   if (!PatchProxy.applyVoid(null, tD, uob, "4")) {
                      List list = tD.Q0();
                      tD.w = 0;
                      if (!q.f(list)) {
                         Iterator iterator = list.iterator();
                         while (iterator.hasNext()) {
                            LiveVoteOption mCount = iterator.next().mCount;
                            int i = tD.w + mCount;
                            tD.w = i;
                            if (tD.x < mCount) {
                               tD.x = mCount;
                            }
                         }
                      }
                   }
                   tD.u1();
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1a5b);
       this.r.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       this.u = m1.f(p0, 0x7f0a1a59);
       this.p = m1.f(p0, 0x7f0a1a54);
       this.q = m1.f(p0, 0x7f0a1a53);
       this.s = m1.f(this.m8(), 0x7f0a1a5d);
       this.w = m1.f(this.m8(), 0x7f0a1a56);
       TextView textView = m1.f(this.m8(), R.id.live_audience_vote_stop_text_view);
       this.t = textView;
       textView.setVisibility(8);
       m1.a(p0, new l(this), R.id.live_audience_vote_stop_text_view);
       this.x = m1.f(this.m8(), 0x7f0a1a5c);
       textView = m1.f(this.m8(), R.id.live_audience_vote_bottom_tips_text_view);
       this.v = textView;
       textView.setVisibility(0);
       m1.a(p0, new m(this), R.id.live_audience_vote_close_image_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.y = this.r8("LIVE_BASIC_CONTEXT");
       this.z = this.q8(q.class);
       this.A = this.r8("VOTE_INFO_UPDATE_SUBJECT");
       this.B = this.r8("VOTE_TIME_UPDATE_SUBJECT");
       return;
    }
}
