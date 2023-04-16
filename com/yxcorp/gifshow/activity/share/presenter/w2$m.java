package com.yxcorp.gifshow.activity.share.presenter.w2$m;
import zw8.y2;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.edit.draft.Workspace$Type;
import ow8.c;
import android.widget.RelativeLayout;
import android.view.ViewTreeObserver;
import zw8.t5;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import zw8.r5;
import android.widget.EditText;

public class w2$m implements y2	// class@00144e
{
    public final w2 a;

    public void w2$m(w2 p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       w2$m om = w2$m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "1")) {
          return;
       }
       om = this.a;
       om.S = p0;
       om.h9(false);
       w2$m ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, w2.class, "34")) {
          if (c.i(ta.J, ta.N) == Workspace$Type.ATLAS || c.i(ta.J, ta.N) == Workspace$Type.SINGLE_PICTURE) {
             if (!PatchProxy.applyVoid(objArray, ta, w2.class, "30")) {
                if (!ta.x.getHeight()) {
                   ta.x.getViewTreeObserver().addOnGlobalLayoutListener(new r5(ta));
                }else {
                   ta.e1 = ta.x.getHeight();
                   ta.d9();
                }
             }
          }else if(c.i(ta.J, ta.N) != Workspace$Type.LONG_PICTURE || PatchProxy.applyVoid(objArray, ta, w2.class, "27")){
             if (!ta.x.getHeight()) {
                ta.x.getViewTreeObserver().addOnGlobalLayoutListener(new t5(ta));
             }else {
                ta.e1 = ta.x.getHeight();
                ta.W8();
             }
          }
       }
       ta = this.a;
       if (ta.S != null) {
          ta.w.requestFocus();
          this.a.w.setCursorVisible(true);
       }else {
          this.a.u.requestFocus();
          this.a.u.setCursorVisible(true);
          this.a.u.setSelection(ta.u.getSelectionEnd());
       }
       return;
    }
}
