package com.yxcorp.gifshow.edit.previewer.models.PrettifyInfoManager$fillColorFilter$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.edit.draft.ColorFilter;
import com.kuaishou.edit.draft.Attributes;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PrettifyInfoManager$fillColorFilter$2 extends Lambda implements l	// class@001b5e
{
    public static final PrettifyInfoManager$fillColorFilter$2 INSTANCE;

    static {
       PrettifyInfoManager$fillColorFilter$2.INSTANCE = new PrettifyInfoManager$fillColorFilter$2();
    }
    public void PrettifyInfoManager$fillColorFilter$2(){
       super(1);
    }
    public final Attributes invoke(ColorFilter p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PrettifyInfoManager$fillColorFilter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.o(p0, "it");
       Attributes attributes = p0.getAttributes();
       a.o(attributes, "it.attributes");
       return attributes;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
