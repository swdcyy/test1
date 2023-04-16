package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$k;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Object;
import rd5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public final class CollectElement$k implements g	// class@00149e
{
    public final CollectElement b;

    public void CollectElement$k(CollectElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectElement$k.class, "1")) {
       }else {
          Log.g("CollectElementTag", "comment panel changed!");
          p0.J = true;
       }
       return;
    }
}
