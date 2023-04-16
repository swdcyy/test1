package kz9.c;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kz9.b;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import w4.j;
import com.yxcorp.gifshow.util.cdnresource.e;

public final class c implements g	// class@002d2c
{
    public final CollectElement b;
    public final int c;

    public void c(CollectElement p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          e.a("ACTIVITY_RESOURCE", null, this.c, new b(this));
       }
       return;
    }
}
