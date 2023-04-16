package com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$mClipboardManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import android.content.ClipboardManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;

public final class TaskCenterDTView$mClipboardManager$2 extends Lambda implements a	// class@00073d
{
    public final Context $context;

    public void TaskCenterDTView$mClipboardManager$2(Context p0){
       this.$context = p0;
       super(0);
    }
    public final ClipboardManager invoke(){
       Object obj = PatchProxy.apply(null, this, TaskCenterDTView$mClipboardManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$context.getSystemService("clipboard");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
