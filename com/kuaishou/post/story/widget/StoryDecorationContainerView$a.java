package com.kuaishou.post.story.widget.StoryDecorationContainerView$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.AdvEditUtil;

public class StoryDecorationContainerView$a extends DecorationContainerView$e	// class@000b89
{
    public final StoryDecorationContainerView a;

    public void StoryDecorationContainerView$a(StoryDecorationContainerView p0){
       this.a = p0;
       super();
    }
    public void i(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryDecorationContainerView$a.class, "3")) {
       }else {
          super.i(p0);
          StoryDecorationContainerView$a ta = this.a;
          if (ta.s == null) {
             if (ta.v != null) {
                AdvEditUtil.k(ta.t, null, 300, false);
             }
             ta.s = true;
          }
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryDecorationContainerView$a.class, "1")) {
       }else {
          super.p(p0);
          StoryDecorationContainerView$a ta = this.a;
          if (ta.s == null) {
             if (ta.v != null) {
                AdvEditUtil.k(ta.t, null, 300, false);
             }
             ta.s = true;
          }
       }
       return;
    }
    public void x(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryDecorationContainerView$a.class, "4")) {
       }else {
          super.x(p0);
          StoryDecorationContainerView$a ta = this.a;
          if (ta.s != null) {
             if (ta.v != null) {
                AdvEditUtil.k(ta.t, null, 300, true);
             }
             ta.s = false;
          }
       }
       return;
    }
    public void y(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryDecorationContainerView$a.class, "2")) {
       }else {
          super.y(p0);
          StoryDecorationContainerView$a ta = this.a;
          if (ta.s != null) {
             if (ta.v != null) {
                AdvEditUtil.k(ta.t, null, 300, true);
             }
             ta.s = false;
          }
       }
       return;
    }
}
