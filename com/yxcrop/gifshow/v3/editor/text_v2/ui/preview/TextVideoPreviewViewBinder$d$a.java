package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;

public final class TextVideoPreviewViewBinder$d$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000b2b
{
    public final TextVideoPreviewViewBinder$d b;

    public void TextVideoPreviewViewBinder$d$a(TextVideoPreviewViewBinder$d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TextVideoPreviewViewBinder$d$a.class, "1")) {
          return;
       }
       this.b.a.S().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       List decorationDr = this.b.a.S().getDecorationDrawerList();
       a.o(decorationDr, "mContainerView.decorationDrawerList");
       Iterator iterator = decorationDr.iterator();
       while (iterator.hasNext()) {
          iterator.next().update();
       }
       return;
    }
}
