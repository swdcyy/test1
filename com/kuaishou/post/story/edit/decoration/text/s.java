package com.kuaishou.post.story.edit.decoration.text.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.post.story.edit.decoration.text.s$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import rp4.a;
import q87.c;
import fq4.a;
import com.kuaishou.post.story.entrance.e;
import java.lang.Integer;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragmentV3;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragmentV2;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import com.kuaishou.post.story.edit.decoration.text.s$b;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$c;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import aq4.j$c;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import ekd.m1;
import dq4.e;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;

public class s extends PresenterV2	// class@000b17
{
    public long p;
    public StoryDecorationContainerView q;
    public VideoSDKPlayerView r;
    public View s;
    public Fragment t;
    public a u;
    public PublishSubject v;
    public AIVideoBackgroundData w;
    public DecorationContainerView$e x;

    public void s(){
       super();
       this.w = null;
       this.x = new s$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       this.q.d(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s.class, "4")) {
          return;
       }
       this.q.M(this.x);
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, s.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.w != null && !this.r.getVisibility())? true: false;
       return b;
    }
    public void R8(DecorationDrawer p0){
       StoryEditTextFragmentV3 storyEditTex;
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "6")) {
          return;
       }
       this.q.d0();
       if (this.P8() && (this.r.getVideoProject() != null && this.r.isPlaying())) {
          Object[] objArray = new Object[0];
          a.D().w("StoryEditTextPresenter", "showTextEditFragment: playerView pause", objArray);
          this.r.onPause();
          this.r.pause();
       }
    label_003e :
       if (this.u.t.c.intValue() == 2) {
          storyEditTex = (PostExperimentUtils.r())? new StoryEditTextFragmentV3(): new StoryEditTextFragmentV2();
       }else {
          storyEditTex = new StoryEditTextFragment();
       }
       storyEditTex.si(this.u.t.c.intValue());
       storyEditTex.qi("EDIT_MOOD_PHOTO");
       storyEditTex.ti(this.q.getSelectStoryTextDrawer());
       storyEditTex.ri(new s$b(this));
       storyEditTex.ji(p0, this.q);
       e k = this.u.t.k;
       if (k != null) {
          storyEditTex.oi(k.a());
       }
       storyEditTex.setArguments(new BaseEditorFragment$Arguments().setCancelWhileKeyboardHidden(true).build());
       storyEditTex.pi(404);
       this.v.onNext(new j$c(0, storyEditTex, "text"));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0a6c);
       this.s = m1.f(p0, 0x7f0a359e);
       this.r = m1.f(p0, 0x7f0a3120);
       m1.a(p0, new e(this), R.id.text_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("STORY_EDIT_CONTEXT");
       this.v = this.r8("STORY_SHOW_PANEL_PUBLISHER");
       this.w = this.t8("MOOD_AI_VIDEO_DATA");
       return;
    }
}
