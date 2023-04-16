package com.kuaishou.post.story.edit.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zp4.l;
import com.kuaishou.post.story.edit.b;
import erd.g;
import crd.b;
import brd.t;
import zp4.m;
import com.kuaishou.post.story.edit.c;
import java.lang.Integer;
import java.lang.Boolean;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.kuaishou.post.story.edit.d$a;
import android.view.animation.Animation$AnimationListener;
import android.widget.RelativeLayout;
import com.kuaishou.post.story.edit.d$b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import io.reactivex.subjects.PublishSubject;
import mrd.a;

public class d extends PresenterV2	// class@000aca
{
    public PublishSubject p;
    public a q;
    public KwaiActionBar r;
    public View s;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.X7(this.p.subscribe(new l(this), b.b));
       this.X7(this.q.distinctUntilChanged().subscribe(new m(this), c.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.P8(R.anim.arg_RES_7f010126, 0x7f010123, false);
       return;
    }
    public final void P8(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, d.class, "7")) {
          return;
       }
       Animation uAnimation = AnimationUtils.loadAnimation(this.getContext(), p0);
       uAnimation.setAnimationListener(new d$a(this, p2));
       this.r.clearAnimation();
       this.r.startAnimation(uAnimation);
       uAnimation = AnimationUtils.loadAnimation(this.getContext(), p1);
       uAnimation.setAnimationListener(new d$b(this, p2));
       this.s.clearAnimation();
       this.s.startAnimation(uAnimation);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0471);
       this.r = m1.f(p0, 0x7f0a3f6a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("STORY_EDIT_BAR_ANIM_PUBLISHER");
       this.q = this.r8("STORY_NAVIGATIONBAR_STATE_PUBLISHER");
       return;
    }
}
