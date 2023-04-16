package com.yxcorp.gifshow.edit.previewer.models.PrettifyInfoManager$fillBeauty$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.Attributes;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PrettifyInfoManager$fillBeauty$4 extends Lambda implements l	// class@001b5c
{
    public static final PrettifyInfoManager$fillBeauty$4 INSTANCE;

    static {
       PrettifyInfoManager$fillBeauty$4.INSTANCE = new PrettifyInfoManager$fillBeauty$4();
    }
    public void PrettifyInfoManager$fillBeauty$4(){
       super(1);
    }
    public final Attributes invoke(Beauty p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PrettifyInfoManager$fillBeauty$4.class, "1");
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
