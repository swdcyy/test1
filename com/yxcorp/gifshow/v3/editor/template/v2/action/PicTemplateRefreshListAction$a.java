package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction$a;
import erd.r;
import java.lang.Object;
import ytc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ytc.a$b;

public final class PicTemplateRefreshListAction$a implements r	// class@00136f
{
    public static final PicTemplateRefreshListAction$a b;

    static {
       PicTemplateRefreshListAction$a.b = new PicTemplateRefreshListAction$a();
    }
    public void PicTemplateRefreshListAction$a(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateRefreshListAction$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0 instanceof a$b ^ 0x01;
       }
       return b;
    }
}
