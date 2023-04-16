package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$d;
import nwc.l;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import faa.a;
import q87.c;
import und.l;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class TextVideoPreviewViewBinder$d implements l	// class@000b2c
{
    public final TextVideoPreviewViewBinder a;

    public void TextVideoPreviewViewBinder$d(TextVideoPreviewViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TextVideoPreviewViewBinder$d.class, "3")) {
          return;
       }
       this.a.S().getViewTreeObserver().addOnGlobalLayoutListener(new TextVideoPreviewViewBinder$d$a(this));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, TextVideoPreviewViewBinder$d.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextPreviewViewBinder", "onDiscardThemeClicked...", objArray);
       this.a.s0().t0(new EditSdkAction());
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, TextVideoPreviewViewBinder$d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextPreviewViewBinder", "onSaveThemeClicked....", objArray);
       this.a.s0().t0(new EditSdkAction());
       return;
    }
}
