package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$generatorGather$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import sm7.i;
import ml5.a;
import com.kwai.sdk.eve.internal.inference.DataBundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;
import com.kwai.sdk.eve.internal.inference.DataBundle$TRANSFER;

public final class PostEntranceEveManager$generatorGather$1 extends Lambda implements p	// class@00104c
{
    public static final PostEntranceEveManager$generatorGather$1 INSTANCE;

    static {
       PostEntranceEveManager$generatorGather$1.INSTANCE = new PostEntranceEveManager$generatorGather$1();
    }
    public void PostEntranceEveManager$generatorGather$1(){
       super(2);
    }
    public final DataBundle invoke(i p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PostEntranceEveManager$generatorGather$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "triggerEvent");
       DataBundle uDataBundle = new DataBundle();
       GeneratedMessageLite generatedMes = p1.f();
       if (generatedMes != null) {
          uDataBundle.a("event", generatedMes);
          uDataBundle.a("graphicAB", Boolean.valueOf(a.t().d("postGraphicCheckABTest", false)));
       }
       uDataBundle.b(DataBundle$TRANSFER.REF);
       return uDataBundle;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
