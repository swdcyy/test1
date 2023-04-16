package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$atlasOrSinglePictureViewBinder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;

public final class PicturePreviewViewBinder$atlasOrSinglePictureViewBinder$2 extends Lambda implements a	// class@000b46
{
    public final Fragment $fragment;
    public final View $rootView;
    public final PicturePreviewViewBinder this$0;

    public void PicturePreviewViewBinder$atlasOrSinglePictureViewBinder$2(PicturePreviewViewBinder p0,View p1,Fragment p2){
       this.this$0 = p0;
       this.$rootView = p1;
       this.$fragment = p2;
       super(0);
    }
    public final AtlasOrSinglePictureSubViewBinder invoke(){
       Object obj = PatchProxy.apply(null, this, PicturePreviewViewBinder$atlasOrSinglePictureViewBinder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AtlasOrSinglePictureSubViewBinder(this.$rootView, this.$fragment, this.this$0.P);
    }
    public Object invoke(){
       return this.invoke();
    }
}
