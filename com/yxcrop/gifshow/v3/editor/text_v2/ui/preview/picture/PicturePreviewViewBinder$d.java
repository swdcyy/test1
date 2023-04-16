package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$d;
import xnd.c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import wnd.j;
import bod.c;
import lod.m;
import bod.d;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import wnd.h;
import cq.a;
import q87.c;
import xnd.b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import wnd.b;
import java.lang.RuntimeException;

public final class PicturePreviewViewBinder$d implements c	// class@000b49
{
    public final PicturePreviewViewBinder a;

    public void PicturePreviewViewBinder$d(PicturePreviewViewBinder p0){
       this.a = p0;
       super();
    }
    public EditDecorationBaseDrawer a(NewTextBaseElementData p0){
       NewEditTextElement newEditTextE = PatchProxy.applyOneRefs(p0, this, PicturePreviewViewBinder$d.class, "1");
       if (newEditTextE != PatchProxyResult.class) {
       }else {
          a.p(p0, "data");
          if (p0 instanceof NewTextElementData) {
             int i = 0;
             if (p0.V0() == null) {
                p0.Z0(j.a.d("shadow_01", m.a()));
                p0.W0(h.n());
                Object[] objArray = new Object[i];
                a.D().w("PicturePreviewViewBinder", "createInstance use default", objArray);
             }
             newEditTextE = new NewEditTextElement(p0, this.a.M);
             newEditTextE.setAssetProportion(b.a(this.a.P));
             if ((p0.S0()).length() > 0) {
                i = true;
             }
             newEditTextE.setInitFromDraft(i);
          }else {
             throw new RuntimeException("createInstance type error");
          }
       }
       return newEditTextE;
    }
}
