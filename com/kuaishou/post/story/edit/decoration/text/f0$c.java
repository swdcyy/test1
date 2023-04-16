package com.kuaishou.post.story.edit.decoration.text.f0$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.post.story.edit.decoration.text.f0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import rp4.b;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$d;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;

public class f0$c extends m	// class@000aea
{
    public final f0 c;

    public void f0$c(f0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$c.class, "1")) {
          return;
       }
       f0$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, f0.class, "5")) {
          b.g("MOOD_TEXT_CANCEL", tc.A, "");
          tc.v.b = 2;
          tc.t.cancel();
       }
       return;
    }
}
