package com.yxcorp.gifshow.edit.previewer.models.PrettifyInfoManager$fillBeauty$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.edit.draft.Makeup;
import com.kuaishou.edit.draft.Attributes;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PrettifyInfoManager$fillBeauty$2 extends Lambda implements l	// class@001b5a
{
    public static final PrettifyInfoManager$fillBeauty$2 INSTANCE;

    static {
       PrettifyInfoManager$fillBeauty$2.INSTANCE = new PrettifyInfoManager$fillBeauty$2();
    }
    public void PrettifyInfoManager$fillBeauty$2(){
       super(1);
    }
    public final Attributes invoke(Makeup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PrettifyInfoManager$fillBeauty$2.class, "1");
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
