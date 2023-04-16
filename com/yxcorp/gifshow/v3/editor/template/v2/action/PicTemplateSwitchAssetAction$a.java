package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateSwitchAssetAction$a;
import t36.f$a;
import java.lang.Object;
import qsc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class PicTemplateSwitchAssetAction$a implements f$a	// class@00137e
{
    public final int a;

    public void PicTemplateSwitchAssetAction$a(int p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateSwitchAssetAction$a.class, "1")) {
       }else {
          p0.b(this.a);
       }
       return;
    }
}
