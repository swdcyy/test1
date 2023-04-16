package com.kuaishou.gifshow.kuaishan.logic.f1;
import erd.g;
import java.lang.Object;
import java.util.List;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import u80.e;
import java.lang.String;
import q87.c;
import java.lang.ref.SoftReference;

public final class f1 implements g	// class@001a0d
{
    public static final f1 b;

    static {
       f1.b = new f1();
    }
    public void f1(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       e.D().s("KuaiShanAPI", "getTemplatesInfo: memory cache refreshed", objArray);
       h1.a = new SoftReference(p0);
    }
}
