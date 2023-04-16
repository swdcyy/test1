package com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$appendValidPlayPhoto$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager;
import iqa.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cra.w;
import java.lang.StringBuilder;
import q87.c;

public final class PushPermissionManager$appendValidPlayPhoto$$inlined$let$lambda$1 extends Lambda implements a	// class@0014aa
{
    public final int $feedPosition$inlined;
    public final int $pageInterface$inlined;
    public final b $playRecord$inlined;
    public final long $validPlayCnt;
    public final PushPermissionManager this$0;

    public void PushPermissionManager$appendValidPlayPhoto$$inlined$let$lambda$1(long p0,PushPermissionManager p1,b p2,int p3,int p4){
       this.$validPlayCnt = p0;
       this.this$0 = p1;
       this.$playRecord$inlined = p2;
       this.$pageInterface$inlined = p3;
       this.$feedPosition$inlined = p4;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       PushPermissionManager$appendValidPlayPhoto$$inlined$let$lambda$1 obj = PatchProxy.applyWithListener(null, this, PushPermissionManager$appendValidPlayPhoto$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       w.C().w("PushPermissionManager", "processValidPlay ²¥·ÅÊýãÐÖµ="+this.$validPlayCnt+" page="+this.$pageInterface$inlined, objArray);
       obj = this.$pageInterface$inlined;
       if (obj == 2) {
          this.this$0.l(obj);
       }else {
          i = true;
       }
       PatchProxy.onMethodExit(PushPermissionManager$appendValidPlayPhoto$$inlined$let$lambda$1.class, "1");
       return i;
    }
}
