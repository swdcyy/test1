package com.yxcorp.gifshow.edit.previewer.models.PrettifyInfoManager$fillBeauty$3;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import maa.a;
import java.lang.Number;
import naa.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PrettifyInfoManager$fillBeauty$3 extends Lambda implements p	// class@001b5b
{
    public static final PrettifyInfoManager$fillBeauty$3 INSTANCE;

    static {
       PrettifyInfoManager$fillBeauty$3.INSTANCE = new PrettifyInfoManager$fillBeauty$3();
    }
    public void PrettifyInfoManager$fillBeauty$3(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
    public final a invoke(a p0,int p1){
       if (PatchProxy.isSupport(PrettifyInfoManager$fillBeauty$3.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, PrettifyInfoManager$fillBeauty$3.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "assetDraft");
       return p0.f0(p1, false);
    }
}
