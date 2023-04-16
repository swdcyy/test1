package com.yxcorp.gifshow.v3.editor.text.element.EditTextFixedContainerWidthElement;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import java.lang.String;
import suc.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.RectF;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import usd.q;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.edit.previewer.utils.TextPainterContentDimensionException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import faa.a;
import w46.b;
import juc.b;

public class EditTextFixedContainerWidthElement extends EditTextBaseElement	// class@0013f7
{
    public final boolean isTextModUpdate;

    public void EditTextFixedContainerWidthElement(EditTextBaseElementData p0,String p1,b p2,boolean p3){
       a.p(p0, "editTextBaseElementData");
       a.p(p1, "initText");
       super(p0, p1, p2, p3);
       this.isTextModUpdate = p3;
    }
    public void EditTextFixedContainerWidthElement(EditTextBaseElementData p0,String p1,b p2,boolean p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = "";
       }
       if (p4 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public void EditTextFixedContainerWidthElement(EditTextBaseElementData p0,String p1,boolean p2){
       super(p0, p1, null, p2, 4, null);
    }
    public void EditTextFixedContainerWidthElement(EditTextBaseElementData p0,boolean p1){
       super(p0, null, null, p1, 6, null);
    }
    public void initPainterMaxDimension(DecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextFixedContainerWidthElement.class, "1")) {
          return;
       }
       a.p(p0, "decorationContainerView");
       int width = p0.getWidth();
       int i = (int)(((float)p0.getHeight() - (this.mBaseDrawerData.n().top + this.mBaseDrawerData.n().bottom)) - (float)(this.getWholeRect().height() - this.getTextContentRect().height()));
       int i1 = q.u(i, this.mBaseDrawerData.C0().v());
       if (!width || !i1) {
          String str = "EditTextFixedContainerWidthElement initPainterMaxDimension, width = "+width+", height = "+i1;
          ExceptionHandler.handleCaughtException(new TextPainterContentDimensionException(str));
          Object[] objArray = new Object[0];
          a.D().t("TextPainterContentDimensionException", str, objArray);
       }
       this.getEditPainter().e(p0.getWidth(), q.u(i, this.mBaseDrawerData.C0().v()));
       return;
    }
}
