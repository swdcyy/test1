package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2$b;
import uv8.o$b;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2;
import uwc.a;
import twc.a;
import itc.v;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.Objects;

public final class PicTemplateEditorV2$b extends o$b	// class@00133e
{

    public void PicTemplateEditorV2$b(){
       super();
    }
    public BaseEditor e(){
       PicTemplateEditorV2 picTemplateE = PatchProxy.apply(null, this, PicTemplateEditorV2$b.class, "1");
       if (picTemplateE != PatchProxyResult.class) {
       }else {
          a uoa = v.a(this.c());
          a.m(uoa);
          EditDecorationContainerView uEditDecorat = uoa.D();
          Objects.requireNonNull(uEditDecorat, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView<com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData, com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer<out com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData>>");
          picTemplateE = new PicTemplateEditorV2(uEditDecorat);
       }
       return picTemplateE;
    }
}
