package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$q;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public final class MoodTemplateViewBinder$q implements ViewTreeObserver$OnGlobalLayoutListener	// class@000b6d
{
    public final MoodTemplateViewBinder b;
    public final int c;
    public final boolean d;

    public void MoodTemplateViewBinder$q(MoodTemplateViewBinder p0,int p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, MoodTemplateViewBinder$q.class, "1")) {
          return;
       }
       this.b.x.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.H(this.c, this.d);
       return;
    }
}
