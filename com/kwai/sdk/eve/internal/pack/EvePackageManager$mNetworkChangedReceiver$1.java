package com.kwai.sdk.eve.internal.pack.EvePackageManager$mNetworkChangedReceiver$1;
import android.content.BroadcastReceiver;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.p0;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import rn7.d;
import java.util.List;

public final class EvePackageManager$mNetworkChangedReceiver$1 extends BroadcastReceiver	// class@00158b
{
    public int a;
    public final EvePackageManager b;

    public void EvePackageManager$mNetworkChangedReceiver$1(EvePackageManager p0){
       this.b = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EvePackageManager$mNetworkChangedReceiver$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          String str = 1;
          if (p0.F(p0)) {
             i = 1;
          }else if(p0.A(p0)){
             i = 2;
          }else {
             i = 3;
          }
          if (i != this.a) {
             this.a = i;
             if (i == str) {
                EvePackageManager f = this.b.f;
                if (f != null) {
                   EveLog.i$default("EPM#onReceive : updateTaskPackageByResponse ===> Network Changed", false, 2, null);
                   this.b.y(f, null);
                }
             }
          }
       }
    label_003a :
       return;
    }
}
