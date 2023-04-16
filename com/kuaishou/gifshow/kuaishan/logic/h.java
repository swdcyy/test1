package com.kuaishou.gifshow.kuaishan.logic.h;
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

public final class h implements o	// class@001a4e
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public Object apply(Object p0){
       KSTemplateDetailInfo kSTemplateDe = PatchProxy.applyOneRefs(p0, this, h.class, "1");
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
