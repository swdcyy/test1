package com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment$b;
import android.view.animation.Animation$AnimationListener;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import androidx.fragment.app.Fragment;

public final class DecorationTimelineFragment$b implements Animation$AnimationListener	// class@000a32
{
    public final DecorationTimelineFragment b;

    public void DecorationTimelineFragment$b(DecorationTimelineFragment p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationTimelineFragment$b.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       if (this.b.getView() != null) {
          View view = this.b.getView();
          a.m(view);
          a.o(view, "view!!");
          view.setVisibility(8);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationTimelineFragment$b.class, "3")) {
          return;
       }
       a.p(p0, "animation");
       if (this.b.getView() != null) {
          View view = this.b.getView();
          a.m(view);
          a.o(view, "view!!");
          view.setVisibility(8);
       }
       return;
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationTimelineFragment$b.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       return;
    }
}
