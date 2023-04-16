package com.kuaishou.gifshow.kuaishan.logic.j;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Collections;

public final class j implements o	// class@001a56
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public Object apply(Object p0){
       KSTemplateDetailInfo kSTemplateDe = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (kSTemplateDe != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p0.mFileMd5CheckList;
          if (p0 == null) {
             p0 = Collections.emptyList();
          }
          kSTemplateDe = p0;
       }
       return kSTemplateDe;
    }
}
