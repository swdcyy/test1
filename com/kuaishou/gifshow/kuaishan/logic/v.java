package com.kuaishou.gifshow.kuaishan.logic.v;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import brd.t;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.String;

public final class v implements o	// class@001a77
{
    public static final v b;

    static {
       v.b = new v();
    }
    public void v(){
       super();
    }
    public final Object apply(Object p0){
       if (!p0.booleanValue()) {
          return t.just(Boolean.FALSE);
       }
       throw new KSException(-39, "resizeAndCheckFace\(\) illegal face detected");
    }
}
