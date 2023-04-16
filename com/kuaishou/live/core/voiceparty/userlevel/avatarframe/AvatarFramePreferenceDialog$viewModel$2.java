package com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$viewModel$2$1;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$viewModel$2$a;

public final class AvatarFramePreferenceDialog$viewModel$2 extends Lambda implements a	// class@001a73
{
    public final AvatarFramePreferenceDialog this$0;

    public void AvatarFramePreferenceDialog$viewModel$2(AvatarFramePreferenceDialog p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, AvatarFramePreferenceDialog$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AvatarFramePreferenceDialog$viewModel$2$a(new AvatarFramePreferenceDialog$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
