package com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement$a;
import qvc.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement$a$a;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import xnd.b;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import android.widget.RelativeLayout;

public final class NewEditTextElement$a implements b	// class@000b8c
{
    public boolean a;
    public boolean b;
    public final NewEditTextElement c;
    public final DecorationContainerView d;
    public final boolean e;

    public void NewEditTextElement$a(NewEditTextElement p0,DecorationContainerView p1,boolean p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
       this.a = true;
       this.b = true ^ p2;
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewEditTextElement$a.class, "1")) {
          return;
       }
       a.p(p0, "oldString");
       a.p(p1, "newString");
       Object[] objArray = new Object[0];
       a.D().s("NewEditTextElement", "onTextChange: old > "+p0+" new > "+p1, objArray);
       int i = this.a ^ 0x01;
       if (this.c.mDecorationShowingView != null) {
          this.b(i, p0, p1);
       }else {
          this.d.post(new NewEditTextElement$a$a(this, i, p0, p1));
       }
       this.a = false;
       return;
    }
    public final void b(boolean p0,String p1,String p2){
       if (PatchProxy.isSupport(NewEditTextElement$a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, NewEditTextElement$a.class, "2")) {
          return;
       }
       NewEditTextElement$a tc = this.c;
       if (tc.mDecorationShowingView == null) {
          return;
       }
       boolean b = tc.reCalculateAndUpdateDimen(p0);
       if (this.b != null) {
          NewEditTextElement$a tc1 = this.c;
          NewEditTextElement onTextChange = tc1.onTextChangeListener;
          if (onTextChange != null) {
             onTextChange.a(tc1.getCurrentTextElementData().l0(), p2, p1, this.c.mBaseDrawerData.A(), this.c.mBaseDrawerData.d(), b, this.c.mBaseDrawerData.w(), this.c.mBaseDrawerData.x());
          }
       }else {
          this.b = true;
       }
       this.d.U(this.c);
       this.c.getTextDrawerLayout().invalidate();
       this.c.getTextDrawerLayout().c();
       return;
    }
}
