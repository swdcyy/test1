package com.yxcorp.gifshow.model.Data;
import java.lang.Cloneable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;

public final class Data implements Cloneable	// class@001e01
{
    public final long countor;
    public final String objectID;

    public void Data(String p0,long p1){
       a.p(p0, "objectID");
       super();
       this.objectID = p0;
       this.countor = p1;
    }
    public final String a(){
       return this.objectID;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, Data.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = super.clone();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.model.Data");
       }
       return obj;
    }
}
