package com.kuaishou.merchant.api.router.FragmentConfig$bundle$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FragmentConfig$bundle$2 extends Lambda implements a	// class@001578
{
    public static final FragmentConfig$bundle$2 INSTANCE;

    static {
       FragmentConfig$bundle$2.INSTANCE = new FragmentConfig$bundle$2();
    }
    public void FragmentConfig$bundle$2(){
       super(0);
    }
    public final Bundle invoke(){
       Object obj = PatchProxy.apply(null, this, FragmentConfig$bundle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Bundle();
    }
    public Object invoke(){
       return this.invoke();
    }
}
