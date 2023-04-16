package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$b;
import androidx.lifecycle.Observer;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.View;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.widget.TextView;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;

public final class MoodTemplateViewBinder$b implements Observer	// class@000b5a
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$b(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("MoodTemplateViewBinder", "mCurrentLocalTemplate it:"+p0, objArray);
          if (p0 != null) {
             int i = 8;
             this.b.z.setVisibility(i);
             MoodTemplateViewBinder f = this.b.f;
             if (f != null) {
                f.setVisibility(i);
             }
             this.b.N(p0);
             this.b.L(p0);
             this.b.M(p0);
             f = this.b.d;
             if (f != null) {
                f.setEnabled(true);
             }
             this.b.K(p0);
          }
       }
       return;
    }
}
