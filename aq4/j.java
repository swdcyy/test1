package aq4.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import aq4.f;
import aq4.j$a;
import aq4.j$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import im8.f;
import java.lang.Integer;
import android.widget.TextView;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import aq4.c;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import aq4.g;
import aq4.i;
import erd.g;
import crd.b;
import brd.t;
import fq4.a;
import com.kuaishou.post.story.entrance.e;
import com.kuaishou.android.model.music.Music;
import gq4.a;
import aq4.h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import ekd.m1;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.view.View$OnClickListener;
import gq4.a$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;

public class j extends PresenterV2	// class@0002cb
{
    public a A;
    public View B;
    public PublishSubject C;
    public f D;
    public a$a E;
    public a F;
    public f G;
    public View$OnClickListener H;
    public MusicFragmentCreator I;
    public final s J;
    public BaseFragment p;
    public TextView q;
    public TextView r;
    public FrameLayout s;
    public FrameLayout t;
    public Fragment u;
    public BaseFragment v;
    public StoryDecorationContainerView w;
    public f x;
    public int y;
    public PublishSubject z;

    public void j(){
       super();
       this.F = new f(this);
       this.H = new j$a(this);
       this.J = new j$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       int i = 0;
       j oj = 2;
       if (this.y == oj) {
          this.B.setBackgroundResource(i);
       }else if(!this.x.get().intValue()){
          this.q.setVisibility(8);
       }
       GifshowActivity activity = this.getActivity();
       if (activity != null) {
          activity.F2(this.F);
       }
       this.t.setOnTouchListener(new c(this));
       this.X7(this.C.subscribe(new g(this), i.b));
       if (this.A.t.c.intValue() == oj) {
          if (this.A.e.a() != null) {
             i = true;
          }
          this.R8(i);
       }
       if (this.A.a() || this.A.b()) {
          this.X7(this.A.B.subscribe(new h(this, activity)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "6")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity != null) {
          activity.l3(this.F);
          j tp = this.p;
          if (tp != null && tp.isAdded()) {
             activity.getSupportFragmentManager().beginTransaction().u(this.p).m();
          }
          this.p = null;
          this.u = null;
       }
       this.t.setOnTouchListener(null);
       j tI = this.I;
       if (tI != null) {
          tI.c();
       }
       return;
    }
    public final void P8(int p0,Fragment p1,String p2){
       e uoe1;
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, j.class, "10")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       this.G.set(p2);
       int i = 0x7f0a0cac;
       int i1 = (p0 != i)? 0x7f01011a: 0x7f01011f;
       i = (p0 != i)? 0x7f01011b: 0x7f010123;
       if (("music").equals(p2)) {
          Fragment uFragment = activity.getSupportFragmentManager().findFragmentByTag(p2);
          this.D.set(Boolean.TRUE);
          if (uFragment != null && uFragment.isHidden()) {
             e uoe = activity.getSupportFragmentManager().beginTransaction();
             uoe.z(i1, 0, 0, i);
             uoe.E(uFragment).m();
             p1 = uFragment;
          }else {
             uoe1 = activity.getSupportFragmentManager().beginTransaction();
             uoe1.z(i1, 0, 0, i);
             uoe1.g(p0, p1, p2);
             uoe1.m();
          }
          this.u = p1;
       }else {
          uoe1 = activity.getSupportFragmentManager().beginTransaction();
          uoe1.z(i1, 0, 0, i);
          uoe1.g(p0, p1, p2);
          uoe1.j(p2);
          uoe1.m();
          this.u = p1;
       }
       this.D.set(Boolean.TRUE);
       this.z.onNext(Integer.valueOf(1));
       return;
    }
    public void R8(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "5")) {
          return;
       }
       oj = this.q;
       int i = (p0)? 0x7f081b78: 0x7f081b77;
       oj.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i, 0, 0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0cac);
       this.t = m1.f(p0, 0x7f0a402e);
       this.w = m1.f(p0, 0x7f0a0a6c);
       this.q = m1.f(p0, 0x7f0a2c6a);
       if (PostExperimentUtils.t()) {
          this.q.setText(R.string.arg_RES_7f103703);
       }
       this.B = m1.f(p0, 0x7f0a0471);
       this.r = m1.f(p0, 0x7f0a0c09);
       m1.a(p0, this.H, R.id.music_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.x = this.x8("INTENT_STORY_TYPE");
       this.y = this.r8("INTENT_STORY_SOURCE").intValue();
       this.z = this.r8("STORY_EDIT_BAR_ANIM_PUBLISHER");
       this.A = this.r8("STORY_EDIT_CONTEXT");
       this.C = this.r8("STORY_SHOW_PANEL_PUBLISHER");
       this.D = this.x8("STORY_SHOWING_PANEL");
       this.G = this.x8("STORY_PANEL_TAG");
       this.E = this.r8("STORY_SMART_MUSIC_PARAM");
       this.v = this.r8("FRAGMENT");
       return;
    }
    public final boolean onBackPressed(){
       j tu;
       GifshowActivity obj = PatchProxy.apply(null, this, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (this.D.get().booleanValue()) {
          tu = this.u;
          if (tu instanceof MusicRootFragment && (tu == this.p && (tu.isVisible() && tu.Hh()))) {
             tu.Jh();
             return true;
          }
       }
    label_0049 :
       if (this.D.get().booleanValue()) {
          this.z.onNext(Integer.valueOf(b));
          this.D.set(Boolean.FALSE);
          this.G.set("");
          tu = this.u;
          if (tu != null && (tu == this.p && tu.isVisible())) {
             e uoe = obj.getSupportFragmentManager().beginTransaction();
             uoe.z(R.anim.arg_RES_7f01011f, 0x7f010123, R.anim.arg_RES_7f01011f, 0x7f010123);
             uoe.s(tu).m();
             this.u = null;
             return true;
          }
       }
       return b;
    }
}
