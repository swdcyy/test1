package com.kuaishou.post.story.aiVideo.widget.MoodAIVideoProgressFragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.Window;

public class MoodAIVideoProgressFragment extends ProgressFragment	// class@000ac2
{
    public Dialog V0;

    public void MoodAIVideoProgressFragment(){
       super();
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MoodAIVideoProgressFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       this.V0 = uDialog;
       uDialog.getWindow().setFlags(0x20000, 0x20000);
       return this.V0;
    }
}
