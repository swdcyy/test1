package com.kuaishou.post.story.entrance.j$b;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.entrance.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.util.Objects;
import com.kuaishou.post.story.entrance.i;
import erd.r;
import java.util.List;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import rp4.b;

public class j$b implements View$OnClickListener	// class@000b3d
{
    public final j b;

    public void j$b(j p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "1")) {
          return;
       }
       j$b tb = this.b;
       if ((SystemClock.elapsedRealtime() - tb.p) - 1000 <= 0) {
          return;
       }
       tb.p = SystemClock.elapsedRealtime();
       tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, j.class, "5")) {
          List list = tb.q.a0(i.b);
          if (!list.isEmpty()) {
             objArray = list.get(0);
          }
          tb.P8(objArray);
          b.g("CLICK_INPUT_MOOD", "PRODUCE_MOOD_PHOTO", "");
       }
       return;
    }
}
