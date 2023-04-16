package com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$mContainerView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;

public final class NewStickerPicTemplateProcessor$mContainerView$2 extends Lambda implements a	// class@000a4a
{
    public final NewStickerPicTemplateProcessor this$0;

    public void NewStickerPicTemplateProcessor$mContainerView$2(NewStickerPicTemplateProcessor p0){
       this.this$0 = p0;
       super(0);
    }
    public final EditDecorationContainerViewV2 invoke(){
       View obj = PatchProxy.apply(null, this, NewStickerPicTemplateProcessor$mContainerView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.f.requireView().findViewById(R.id.new_text_decoration_editor_view);
       a.o(obj, "fragment.requireView\(\).f¡­t_decoration_editor_view\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
