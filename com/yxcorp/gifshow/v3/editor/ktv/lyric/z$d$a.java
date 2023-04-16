package com.yxcorp.gifshow.v3.editor.ktv.lyric.z$d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z;
import android.widget.AbsoluteLayout;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Iterator;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import io.reactivex.subjects.PublishSubject;

public class z$d$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000fed
{
    public final z$d b;

    public void z$d$a(z$d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, z$d$a.class, "1")) {
          return;
       }
       if (this.b.b.P.getWidth() > 0 && this.b.b.P.getHeight() > 0) {
          this.b.b.P.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.b.b.U.t0(true);
          List decorationDr = this.b.b.P.getDecorationDrawerList();
          if (decorationDr != null) {
             Iterator iterator = decorationDr.iterator();
             while (iterator.hasNext()) {
                BaseDrawer uBaseDrawer = iterator.next();
                if (uBaseDrawer instanceof EditTextBaseElement) {
                   uBaseDrawer.update();
                }
             }
          }
          String str = this.b.b.U.V0();
          if (TextUtils.x(str)) {
             return;
          }else {
             this.b.b.K.onNext(str);
          }
       }
       return;
    }
}
