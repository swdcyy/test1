package com.kuaishou.post.story.widget.StoryEditText$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.post.story.widget.StoryEditText;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.view.ViewTreeObserver;

public class StoryEditText$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@000b8f
{
    public final int b;
    public final StoryEditText c;

    public void StoryEditText$c(StoryEditText p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, StoryEditText$c.class, "1")) {
          return;
       }
       if (this.c.getWidth()) {
          this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.c.setTextModeInner(this.b);
       }
       return;
    }
}
