package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResSuccessAction$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import java.lang.Boolean;
import java.lang.Comparable;
import xrd.b;

public final class PicTemplateDownloadResSuccessAction$a implements Comparator	// class@001366
{

    public void PicTemplateDownloadResSuccessAction$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDownloadResSuccessAction$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Boolean.valueOf(p0.f()), Boolean.valueOf(p1.f()));
    }
}
