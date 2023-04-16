package com.kuaishou.post.story.entrance.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.post.story.entrance.j$a;
import com.kuaishou.post.story.entrance.j$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragmentV3;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragmentV2;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import com.kuaishou.post.story.entrance.j$c;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$c;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import im8.f;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import io.reactivex.subjects.PublishSubject;
import android.widget.RelativeLayout;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import vp4.b;

public class j extends PresenterV2	// class@000b3f
{
    public f A;
    public DecorationContainerView$e B;
    public final View$OnClickListener C;
    public long p;
    public StoryDecorationContainerView q;
    public ImageView r;
    public TextView s;
    public View t;
    public KwaiActionBar u;
    public View v;
    public PublishSubject w;
    public PublishSubject x;
    public b y;
    public f z;

    public void j(){
       super();
       this.B = new j$a(this);
       this.C = new j$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.q.d(this.B);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       this.q.M(this.B);
       return;
    }
    public void P8(StoryTextDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "6")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       this.s.setVisibility(8);
       this.t.setVisibility(8);
       this.v.setVisibility(8);
       StoryEditTextFragmentV3 storyEditTex = (PostExperimentUtils.r())? new StoryEditTextFragmentV3(): new StoryEditTextFragmentV2();
       storyEditTex.si(2);
       storyEditTex.qi("PRODUCE_MOOD_PHOTO");
       storyEditTex.a1.p = true;
       storyEditTex.ti(p0);
       StoryEditTextFragment a1 = storyEditTex.a1;
       a1.j = false;
       a1.q = this.y;
       storyEditTex.ri(new j$c(this));
       storyEditTex.ji(p0, this.q);
       this.q.d0();
       p0.i = true;
       if (this.A.get() != null) {
          storyEditTex.oi(this.A.get().a());
       }
       storyEditTex.pi(406);
       storyEditTex.setArguments(new BaseEditorFragment$Arguments().setCancelWhileKeyboardHidden(true).build());
       e uoe = activity.getSupportFragmentManager().beginTransaction();
       uoe.z(R.anim.arg_RES_7f01011a, false, false, R.anim.arg_RES_7f01011b);
       uoe.g(false, storyEditTex, "text");
       uoe.j("text");
       uoe.m();
       this.x.onNext(new Object());
       this.u.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a395d);
       this.t = m1.f(p0, 0x7f0a0770);
       this.u = m1.f(p0, 0x7f0a3f6a);
       this.q = m1.f(p0, 0x7f0a0a6c);
       this.r = m1.f(p0, 0x7f0a2dc6);
       this.v = m1.f(p0, 0x7f0a2be9);
       m1.a(p0, this.C, R.id.click_to_show_text_edit);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.w = this.r8("NEXT_STEP_PUBLISHER");
       this.x = this.r8("TEXT_FRAGMENT_SHOWN_PUBLISHER");
       this.A = this.x8("MOOD_TEMPLATE");
       this.y = this.r8("AI_VIDEO_PAGE_PRESENTER_MODEL");
       return;
    }
}
