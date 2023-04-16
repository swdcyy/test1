package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$onFrameChanged$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import android.graphics.Rect;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;

public final class TextVideoPreviewViewBinder$onFrameChanged$1 extends Lambda implements a	// class@000b33
{
    public final TextVideoPreviewViewBinder this$0;

    public void TextVideoPreviewViewBinder$onFrameChanged$1(TextVideoPreviewViewBinder p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, TextVideoPreviewViewBinder$onFrameChanged$1.class, "1")) {
          return;
       }
       this.this$0.S().e0();
       List decorationDr = this.this$0.S().getDecorationDrawerList();
       a.o(decorationDr, "mContainerView.decorationDrawerList");
       Iterator iterator = decorationDr.iterator();
       while (iterator.hasNext()) {
          EditDecorationBaseDrawer uEditDecorat = iterator.next();
          a.o(uEditDecorat, "element");
          uEditDecorat.setAdditionOffsetY(0);
          uEditDecorat.mEditRect = new Rect(0, 0, this.this$0.S().getWidth(), this.this$0.S().getHeight());
          uEditDecorat.update();
       }
       return;
    }
}
