package com.kuaishou.post.story.edit.decoration.text.s$b;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$b;
import com.kuaishou.post.story.edit.decoration.text.s;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq4.a;
import com.kuaishou.post.story.entrance.e;
import java.lang.Integer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import rp4.a;
import q87.c;

public class s$b extends StoryEditTextFragment$b	// class@000b14
{
    public final s a;

    public void s$b(s p0){
       this.a = p0;
       super();
    }
    public void a(StoryEditTextFragment$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$b.class, "1")) {
          return;
       }
       if (this.a.u.t.c.intValue() == 2 && this.a.u.t.m == null) {
          p0.a.disableAction(0x101111);
       }
       this.a.q.b0(p0.a);
       if (this.a.P8() && (this.a.r.getVideoProject() != null && !this.a.r.isPlaying())) {
          Object[] objArray = new Object[0];
          a.D().w("StoryEditTextPresenter", "showTextEditFragment: playerView play", objArray);
          this.a.r.onResume();
          this.a.r.play();
       }
    label_006d :
       return;
    }
}
