package com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragmentV3;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragmentV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;
import com.kuaishou.post.story.edit.decoration.text.c0;
import com.kuaishou.post.story.edit.decoration.text.f0;
import com.kuaishou.post.story.edit.decoration.text.h0;
import com.kuaishou.post.story.edit.decoration.text.b0;
import dq4.a0;
import com.kuaishou.post.story.edit.decoration.text.x;
import com.kuaishou.post.story.edit.decoration.text.t;
import android.view.View;

public class StoryEditTextFragmentV3 extends StoryEditTextFragmentV2	// class@000ad9
{

    public void StoryEditTextFragmentV3(){
       super();
    }
    public int getLayoutResId(){
       return 0x7f0d1575;
    }
    public void ki(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragmentV3.class, "1")) {
          return;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.Z0 = presenterV2;
       presenterV2.U7(new c0());
       this.Z0.U7(new f0());
       this.Z0.U7(new h0());
       this.Z0.U7(new b0());
       this.Z0.U7(new a0());
       this.Z0.U7(new x());
       if (this.li()) {
          this.Z0.U7(new t());
       }
       this.Z0.f(this.Y0);
       Object[] objArray = new Object[]{this.a1};
       this.Z0.i(objArray);
       return;
    }
}
