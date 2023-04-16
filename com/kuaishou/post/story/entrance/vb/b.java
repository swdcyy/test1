package com.kuaishou.post.story.entrance.vb.b;
import java.lang.Runnable;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$n;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import android.widget.TextView;

public final class b implements Runnable	// class@000b70
{
    public final MoodTemplateViewBinder$n b;
    public final MoodTemplateUiData c;

    public void b(MoodTemplateViewBinder$n p0,MoodTemplateUiData p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.b.N(this.c);
       MoodTemplateViewBinder d = this.b.b.d;
       if (d != null) {
          d.setEnabled(true);
       }
       return;
    }
}
