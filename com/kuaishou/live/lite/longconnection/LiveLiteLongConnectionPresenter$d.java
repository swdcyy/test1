package com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$d;
import erd.g;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLiteLongConnectionPresenter$d implements g	// class@0009fd
{
    public final LiveLiteLongConnectionPresenter b;

    public void LiveLiteLongConnectionPresenter$d(LiveLiteLongConnectionPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLongConnectionPresenter$d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.I = p0.booleanValue();
       }
       return;
    }
}
