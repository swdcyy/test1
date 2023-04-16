package com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;

public final class AvatarFramePreferenceDialog$b implements View$OnClickListener	// class@001a70
{
    public final AvatarFramePreferenceDialog b;

    public void AvatarFramePreferenceDialog$b(AvatarFramePreferenceDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFramePreferenceDialog$b.class, "1")) {
          return;
       }
       this.b.V2();
       return;
    }
}
