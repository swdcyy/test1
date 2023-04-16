package com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment$onCreateDialog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;

public final class LiveKrnCenterDialogFragment$onCreateDialog$1 extends Lambda implements a	// class@001d52
{
    public final LiveKrnCenterDialogFragment this$0;

    public void LiveKrnCenterDialogFragment$onCreateDialog$1(LiveKrnCenterDialogFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       LiveKrnCenterDialogFragment obj = PatchProxy.apply(null, this, LiveKrnCenterDialogFragment$onCreateDialog$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.t;
       if (obj != null) {
          LiveKrnFragment.I.e(obj);
       }
       obj = this.this$0.u;
       boolean b = (obj != null)? obj.g(): 1;
       return (b ^ 1);
    }
}
