package com.kuaishou.post.story.entrance.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iq4.b;
import com.kuaishou.post.story.entrance.a;
import erd.g;
import crd.b;
import brd.t;
import fq4.a0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import androidx.lifecycle.ViewModel;
import brd.a0;
import iq4.c;
import com.kuaishou.post.story.entrance.b;
import android.view.View;
import ekd.m1;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import iq4.a;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.post.story.entrance.d$a;
import im8.f;
import vp4.b;

public class d extends PresenterV2	// class@000b32
{
    public StoryDecorationContainerView p;
    public PublishSubject q;
    public b r;
    public d$a s;
    public String t;
    public f u;
    public f v;
    public f w;
    public Fragment x;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.X7(this.q.subscribe(new b(this), a.b));
       return;
    }
    public final void P8(a0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       this.X7(ViewModelProviders.of(this.x).get(MoodTemplateViewModel.class).E0(true).R(new c(this, p0), b.b));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0a6c);
       m1.a(p0, new a(this), R.id.next_step);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.r8("NEXT_STEP_PUBLISHER");
       this.s = this.r8("NEXT_STEP_PAGE_PARAM");
       this.t = this.r8("task_id");
       this.u = this.x8("INTENT_STORY_SOURCE");
       this.v = this.x8("INTENT_STORY_FILEPATH");
       this.w = this.x8("MOOD_TEMPLATE");
       this.x = this.r8("FRAGMENT");
       this.r = this.r8("AI_VIDEO_PAGE_PRESENTER_MODEL");
       return;
    }
}
