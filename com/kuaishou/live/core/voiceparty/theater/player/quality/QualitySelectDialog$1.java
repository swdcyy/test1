package com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog;
import crd.b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class QualitySelectDialog$1 extends Lambda implements a	// class@0019aa
{
    public final b $disposable;
    public final QualitySelectDialog this$0;

    public void QualitySelectDialog$1(QualitySelectDialog p0,b p1){
       this.this$0 = p0;
       this.$disposable = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, QualitySelectDialog$1.class, "1")) {
          return;
       }
       this.this$0.a();
       this.$disposable.dispose();
       return;
    }
}
