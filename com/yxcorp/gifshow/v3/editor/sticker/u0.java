package com.yxcorp.gifshow.v3.editor.sticker.u0;
import ok.h;
import java.lang.Object;
import android.util.Pair;
import itc.x2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import java.lang.String;
import java.util.List;

public final class u0 implements h	// class@0012c0
{
    public static final u0 b;

    static {
       u0.b = new u0();
    }
    public void u0(){
       super();
    }
    public final Object apply(Object p0){
       ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
       tagPackage.identity = p0.first;
       tagPackage.name = p0.second;
       tagPackage.index = (long)(x2.a.indexOf(p0) + 1);
       return tagPackage;
    }
}
