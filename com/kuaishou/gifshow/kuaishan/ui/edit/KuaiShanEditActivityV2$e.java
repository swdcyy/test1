package com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$e;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.BasePostActivity;

public final class KuaiShanEditActivityV2$e implements Runnable	// class@001aba
{
    public final KuaiShanEditActivityV2 b;

    public void KuaiShanEditActivityV2$e(KuaiShanEditActivityV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KuaiShanEditActivityV2$e.class, "1")) {
          return;
       }
       this.b.finish();
       return;
    }
}
