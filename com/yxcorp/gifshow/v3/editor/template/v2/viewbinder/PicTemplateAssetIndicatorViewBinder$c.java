package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder$c;
import com.yxcorp.gifshow.util.ARecyclerAdapter$c;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.ARecyclerAdapter$c$a;

public final class PicTemplateAssetIndicatorViewBinder$c implements ARecyclerAdapter$c	// class@00138a
{

    public void PicTemplateAssetIndicatorViewBinder$c(){
       super();
    }
    public boolean a(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateAssetIndicatorViewBinder$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "oldData");
          a.p(p1, "newData");
          b = a.g(p0.getId(), p1.getId());
       }
       return b;
    }
    public boolean b(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateAssetIndicatorViewBinder$c.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "oldData");
          a.p(p1, "newData");
          b = ARecyclerAdapter$c$a.a(this, p0, p1);
       }
       return b;
    }
    public Object c(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateAssetIndicatorViewBinder$c.class, "3");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "oldData");
          a.p(p1, "newData");
       }
       return p0;
    }
}
