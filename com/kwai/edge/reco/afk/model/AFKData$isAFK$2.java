package com.kwai.edge.reco.afk.model.AFKData$isAFK$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.edge.reco.afk.model.AFKData;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class AFKData$isAFK$2 extends Lambda implements a	// class@000d2e
{
    public final AFKData this$0;

    public void AFKData$isAFK$2(AFKData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, AFKData$isAFK$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.g(this.this$0.b, "no_afk") ^ 0x01);
    }
}
