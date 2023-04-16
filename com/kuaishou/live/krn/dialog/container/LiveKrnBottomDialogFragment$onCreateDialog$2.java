package com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$onCreateDialog$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;

public final class LiveKrnBottomDialogFragment$onCreateDialog$2 extends Lambda implements a	// class@001d4b
{
    public final LiveKrnBottomDialogFragment this$0;

    public void LiveKrnBottomDialogFragment$onCreateDialog$2(LiveKrnBottomDialogFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       LiveKrnBottomDialogFragment obj = PatchProxy.apply(null, this, LiveKrnBottomDialogFragment$onCreateDialog$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.F;
       if (obj != null) {
          LiveKrnFragment.I.e(obj);
       }
       obj = this.this$0.B;
       boolean b = (obj != null)? obj.g(): 1;
       return (b ^ 1);
    }
}
