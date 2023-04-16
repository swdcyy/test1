package com.yxcorp.gifshow.v3.editor.text.element.a;
import erd.g;
import com.yxcorp.gifshow.v3.editor.text.element.c;
import java.lang.Object;
import java.lang.Integer;
import android.widget.AbsoluteLayout;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import suc.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Runnable;
import lwc.h;
import uld.j;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;

public final class a implements g	// class@0013f8
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       if (tb.D == null) {
          tb.y.requestLayout();
          tb.P8();
       }else {
          j.a(p0.intValue(), tb.y, tb.q.z(), new d(tb), tb.getActivity(), tb.C);
       }
       if (p0.intValue() == -10) {
          tb.B.q1(-10, tb.C);
       }else {
          tb.B.q1(p0.intValue(), tb.C);
       }
       return;
    }
}
