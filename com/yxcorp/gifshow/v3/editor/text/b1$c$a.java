package com.yxcorp.gifshow.v3.editor.text.b1$c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.text.b1$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.b1;
import android.widget.AbsoluteLayout;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Iterator;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import io.reactivex.subjects.PublishSubject;

public class b1$c$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0013ab
{
    public final b1$c b;

    public void b1$c$a(b1$c p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, b1$c$a.class, "1")) {
          return;
       }
       if (this.b.b.L.getWidth() > 0 && this.b.b.L.getHeight() > 0) {
          this.b.b.L.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          if (f.z(this.b.b.s)) {
             this.b.b.u.e.clear();
          }
          b1$c b = this.b.b;
          b1 n = b.N;
          boolean b1 = (f.z(b.s) || this.b.b.O != null)? true: false;
          n.t0(b1);
          if (!this.b.b.S8()) {
             List decorationDr = this.b.b.L.getDecorationDrawerList();
             if (decorationDr != null) {
                Iterator iterator = decorationDr.iterator();
                while (iterator.hasNext()) {
                   BaseDrawer uBaseDrawer = iterator.next();
                   if (uBaseDrawer instanceof EditTextBaseElement) {
                      uBaseDrawer.update();
                   }
                }
             }
          }
          b = this.b.b;
          b.O = false;
          String str = b.N.V0();
          if (TextUtils.x(str)) {
             return;
          }else {
             this.b.b.F.onNext(str);
          }
       }
       return;
    }
}
