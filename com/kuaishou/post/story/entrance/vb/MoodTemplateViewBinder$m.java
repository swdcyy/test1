package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$m;
import java.lang.Runnable;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public final class MoodTemplateViewBinder$m implements Runnable	// class@000b65
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$m(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MoodTemplateViewBinder$m.class, "1")) {
          return;
       }
       MoodTemplateViewBinder d = this.b.d;
       if (d != null) {
          d.setEnabled(true);
       }
       return;
    }
}
