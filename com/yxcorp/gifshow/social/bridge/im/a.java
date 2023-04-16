package com.yxcorp.gifshow.social.bridge.im.a;
import erd.o;
import java.lang.Object;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import java.lang.Boolean;

public final class a implements o	// class@001d5e
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       boolean b = true;
       if (p0.getMemberStatus() == b) {
       }else {
          b = false;
       }
       return Boolean.valueOf(b);
    }
}
