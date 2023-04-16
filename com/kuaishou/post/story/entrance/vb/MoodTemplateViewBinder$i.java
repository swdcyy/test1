package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$i;
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

public final class MoodTemplateViewBinder$i implements View$OnClickListener	// class@000b61
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$i(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$i.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateViewBinder", "mRemoteTemplatePanelClose", objArray);
       this.b.S.q0();
       return;
    }
}
