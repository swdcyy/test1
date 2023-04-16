package com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$viewModel$2$1;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$viewModel$2$a;

public final class PrivilegeListDialog$viewModel$2 extends Lambda implements a	// class@001a91
{
    public final PrivilegeListDialog this$0;

    public void PrivilegeListDialog$viewModel$2(PrivilegeListDialog p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, PrivilegeListDialog$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PrivilegeListDialog$viewModel$2$a(new PrivilegeListDialog$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
