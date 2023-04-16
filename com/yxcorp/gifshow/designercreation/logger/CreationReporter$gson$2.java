package com.yxcorp.gifshow.designercreation.logger.CreationReporter$gson$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CreationReporter$gson$2 extends Lambda implements a	// class@0012fa
{
    public static final CreationReporter$gson$2 INSTANCE;

    static {
       CreationReporter$gson$2.INSTANCE = new CreationReporter$gson$2();
    }
    public void CreationReporter$gson$2(){
       super(0);
    }
    public final Gson invoke(){
       Object obj = PatchProxy.apply(null, this, CreationReporter$gson$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Gson();
    }
    public Object invoke(){
       return this.invoke();
    }
}
