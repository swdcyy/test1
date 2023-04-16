package com.kuaishou.post.story.entrance.j$c;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$b;
import com.kuaishou.post.story.entrance.j;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.ImageView;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import android.widget.RelativeLayout;
import android.view.View;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import fq4.a0;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import com.kuaishou.post.story.aiVideo.MoodAIVideoErrorCode;
import io.reactivex.subjects.PublishSubject;
import iq4.x;
import java.lang.Runnable;
import ekd.k1;

public class j$c extends StoryEditTextFragment$b	// class@000b3e
{
    public final j a;

    public void j$c(j p0){
       this.a = p0;
       super();
    }
    public void a(StoryEditTextFragment$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$c.class, "1")) {
          return;
       }
       int i = 0;
       if (TextUtils.x(p0.a.mText)) {
          this.a.s.setVisibility(i);
       }else {
          this.a.s.setVisibility(8);
       }
       this.a.r.setImageDrawable(a1.f(R.drawable.arg_RES_7f080ed8));
       this.a.q.b0(p0.a);
       this.a.u.setVisibility(i);
       this.a.v.setVisibility(i);
       boolean b = true;
       if (p0.b == b) {
          p0.a.setEnableAddingAnimation(b);
          this.a.w.onNext(new a0(p0.a, p0.c, p0.d));
          k1.r(new x(this), 500);
       }else {
          this.a.t.setVisibility(i);
       }
       return;
    }
}
