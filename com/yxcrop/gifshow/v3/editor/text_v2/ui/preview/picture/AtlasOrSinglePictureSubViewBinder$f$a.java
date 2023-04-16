package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$f$a;
import erd.r;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.List;

public final class AtlasOrSinglePictureSubViewBinder$f$a implements r	// class@000b3b
{
    public final String b;

    public void AtlasOrSinglePictureSubViewBinder$f$a(String p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0.getIdentifyList().contains(this.b);
       }
       return b;
    }
}
