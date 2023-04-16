package com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$c;
import erd.g;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;

public final class DefaultCardProcessor$c implements g	// class@001346
{
    public final DefaultCardProcessor b;

    public void DefaultCardProcessor$c(DefaultCardProcessor p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultCardProcessor$c.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             ProfilePostEmptyCardUtils.e.i("DefaultPostCard", "on selected, refresh card");
             this.b.p(false);
          }
       }
       return;
    }
}
