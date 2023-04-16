package com.kuaishou.post.story.edit.decoration.text.f0$b;
import com.yxcorp.gifshow.widget.u;
import com.kuaishou.post.story.edit.decoration.text.f0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;

public class f0$b extends u	// class@000ae9
{
    public final f0 c;

    public void f0$b(f0 p0,long p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$b.class, "1")) {
          return;
       }
       f0$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, f0.class, "7")) {
          if (TextUtils.isEmpty(tc.s.mText)) {
             tc.t.cancel();
          }else {
             tc.P8();
          }
       }
       return;
    }
}
