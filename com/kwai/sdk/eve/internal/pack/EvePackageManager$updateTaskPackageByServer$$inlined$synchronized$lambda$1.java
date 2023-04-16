package com.kwai.sdk.eve.internal.pack.EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import tn7.b;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.a;

public final class EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1 extends Lambda implements l	// class@00158c
{
    public final boolean $isLocal$inlined;
    public final EveServerPackage $serverPackage$inlined;
    public final b $taskPackage;
    public final EvePackageManager this$0;

    public void EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1(b p0,EvePackageManager p1,EveServerPackage p2,boolean p3){
       this.$taskPackage = p0;
       this.this$0 = p1;
       this.$serverPackage$inlined = p2;
       this.$isLocal$inlined = p3;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1 t$taskPackag;
       if (PatchProxy.isSupport2(EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1.class, "1")) {
          return;
       }
       boolean b = false;
       EveLog.w$default("EPM#updateTaskPackageByServer : download success = "+p0+", taskPackage = "+this.$taskPackage, b, 2, null);
       if (!p0) {
          t$taskPackag = this.$taskPackage;
          if (a.g(t$taskPackag, this.this$0.h.get(t$taskPackag.taskId))) {
             this.this$0.h.remove(this.$taskPackage.taskId);
          }
          PatchProxy.onMethodExit(EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1.class, "1");
          return;
       }else {
          int i = 1;
          if (a.g(this.this$0.h.get(this.$taskPackage.taskId), this.$taskPackage) ^ i) {
             EveLog.w$default("EPM#updateTaskPackageByServer : download complete but another isUpdating = "+this.$taskPackage, b, 2, null);
             PatchProxy.onMethodExit(EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1.class, "1");
             return;
          }else if(this.this$0.A(this.$taskPackage)){
             this.$taskPackage.j(i);
             EveLog.i$default("EPM#updateTaskPackageByServer : verify success ===> taskPackage = "+this.$taskPackage, b, 2, null);
             this.this$0.j(this.$taskPackage);
          }else {
             EveLog.i$default("EPM#updateTaskPackageByServer : verify fail and drop ===> taskPackage = "+this.$taskPackage, b, 2, null);
             this.this$0.q(this.$taskPackage);
             t$taskPackag = this.$taskPackage;
             if (a.g(t$taskPackag, this.this$0.h.get(t$taskPackag.taskId))) {
                this.this$0.h.remove(this.$taskPackage.taskId);
             }
          }
          PatchProxy.onMethodExit(EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1.class, "1");
          return;
       }
    }
}
