package com.yxcorp.gifshow.commontab.pagelist.d;
import erd.g;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import gb5.a;
import java.util.Objects;

public final class d implements g	// class@0011bd
{
    public final HomeUniversalTabPageList$c b;

    public void d(HomeUniversalTabPageList$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          Objects.requireNonNull(this.b.b);
          b.a(0x8708467).k("common", false);
       }
       return;
    }
}
