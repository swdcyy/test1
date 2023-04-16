package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$j;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import q87.c;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;

public final class MoodTemplateViewBinder$j implements View$OnClickListener	// class@000b62
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$j(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$j.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateViewBinder", "mClickToCloseRemotePanel", objArray);
       this.b.S.q0();
       return;
    }
}
