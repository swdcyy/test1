package com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$d;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import android.content.Intent;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class KuaiShanEditActivityV2$d implements Runnable	// class@001ab9
{
    public final KuaiShanEditActivityV2 b;
    public final Intent c;
    public final o1 d;

    public void KuaiShanEditActivityV2$d(KuaiShanEditActivityV2 p0,Intent p1,o1 p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KuaiShanEditActivityV2$d.class, "1")) {
          return;
       }
       KuaiShanEditActivityV2$d tc = this.c;
       a.o(tc, "intent");
       this.b.J3(tc, this.d, false);
       return;
    }
}
