package com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement$a;
import qvc.b;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import suc.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement$a$a;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import android.widget.RelativeLayout;

public final class EditTextBaseElement$a implements b	// class@0013f5
{
    public final EditTextBaseElement a;
    public final DecorationContainerView b;

    public void EditTextBaseElement$a(EditTextBaseElement p0,DecorationContainerView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditTextBaseElement$a.class, "1")) {
          return;
       }
       a.p(p0, "oldString");
       a.p(p1, "newString");
       Object[] objArray = new Object[0];
       a.D().s("EditTextBaseElement", "onTextChange: old > "+p0+" new > "+p1, objArray);
       b iTextElement = this.a.getITextElementAction();
       if (iTextElement != null) {
          iTextElement.a(this.a.getLayerIndex(), p0, p1);
       }
       int i = this.a.isInitText() ^ 0x01;
       if (this.a.mDecorationShowingView != null) {
          this.b(i);
       }else {
          this.b.post(new EditTextBaseElement$a$a(this, i));
       }
       return;
    }
    public final void b(boolean p0){
       EditTextBaseElement$a uoa = EditTextBaseElement$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.a;
       if (uoa.mDecorationShowingView == null) {
          return;
       }
       uoa.reCalculateAndUpdateDimen(p0);
       this.b.U(this.a);
       this.a.getTextDrawerLayout().invalidate();
       this.a.getTextDrawerLayout().c();
       return;
    }
}
