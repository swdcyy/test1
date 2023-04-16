package com.yxcorp.gifshow.edit.previewer.models.PrettifyInfoManager$fillColorFilter$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import maa.a;
import java.lang.Number;
import saa.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PrettifyInfoManager$fillColorFilter$1 extends Lambda implements p	// class@001b5d
{
    public static final PrettifyInfoManager$fillColorFilter$1 INSTANCE;

    static {
       PrettifyInfoManager$fillColorFilter$1.INSTANCE = new PrettifyInfoManager$fillColorFilter$1();
    }
    public void PrettifyInfoManager$fillColorFilter$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
    public final a invoke(a p0,int p1){
       if (PatchProxy.isSupport(PrettifyInfoManager$fillColorFilter$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, PrettifyInfoManager$fillColorFilter$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "assetDraft");
       return p0.g0(p1, false);
    }
}
