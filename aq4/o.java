package aq4.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import aq4.n;
import cq4.n;
import aq4.l;
import aq4.o$a;
import aq4.o$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import fq4.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.Set;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import ekd.m1;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import android.view.View$OnClickListener;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class o extends PresenterV2	// class@0002d2
{
    public n$a A;
    public View$OnClickListener B;
    public DecorationContainerView$e C;
    public FrameLayout p;
    public StoryDecorationContainerView q;
    public PublishSubject r;
    public a s;
    public f t;
    public f u;
    public BaseFragment v;
    public a w;
    public boolean x;
    public n y;
    public boolean z;

    public void o(){
       super();
       this.w = new n(this);
       this.x = false;
       this.y = new n();
       this.z = false;
       this.A = new l(this);
       this.B = new o$a(this);
       this.C = new o$b(this);
    }
    public void E8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "6")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity != null) {
          activity.F2(this.w);
       }
       this.q.d(this.C);
       this.s.f = this.q;
       if (!PatchProxy.applyVoid(objArray, this, oo, "7") && this.getActivity() != null) {
          DisplayMetrics uDisplayMetr = c.c(this.getActivity().getResources());
          if (((float)uDisplayMetr.widthPixels / uDisplayMetr.xdpi) - 0x40200000 <= 0) {
             this.z = true;
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, o.class, "5")) {
          return;
       }
       h1.n(0);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, o.class, "9")) {
          return;
       }
       h1.n(0);
       h1.b();
       h1.a();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity != null) {
          activity.l3(this.w);
       }
       this.p.setOnTouchListener(null);
       this.q.M(this.C);
       o ty = this.y;
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoid(null, ty, n.class, "4")) {
          ty.a();
          ty.a = null;
          ty.d.clear();
          ty.i = null;
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       if (this.x != null) {
          this.r.onNext(Integer.valueOf(0));
          this.x = false;
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       if (this.x == null) {
          this.r.onNext(Integer.valueOf(1));
          this.x = true;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a402e);
       this.q = m1.f(p0, 0x7f0a0a6c);
       m1.a(p0, this.B, R.id.sticker_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.r = this.r8("STORY_EDIT_BAR_ANIM_PUBLISHER");
       this.s = this.r8("STORY_EDIT_CONTEXT");
       this.t = this.x8("STORY_SHOWING_PANEL");
       this.u = this.x8("STORY_PANEL_TAG");
       this.v = this.r8("FRAGMENT");
       return;
    }
}
