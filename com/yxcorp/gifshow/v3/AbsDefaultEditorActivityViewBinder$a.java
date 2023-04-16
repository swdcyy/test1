package com.yxcorp.gifshow.v3.AbsDefaultEditorActivityViewBinder$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.AbsDefaultEditorActivityViewBinder;
import lwc.h;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c35.c;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import java.util.Objects;
import com.yxcorp.gifshow.v3.EditorActivity;
import android.app.Activity;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import lnc.u6;
import android.view.View;
import ooc.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import wba.e0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import android.widget.FrameLayout;

public final class AbsDefaultEditorActivityViewBinder$a implements Observer	// class@000d0b
{
    public final AbsDefaultEditorActivityViewBinder b;
    public final h c;

    public void AbsDefaultEditorActivityViewBinder$a(AbsDefaultEditorActivityViewBinder p0,h p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsDefaultEditorActivityViewBinder$a.class, "1")) {
       }else if(p0.width() - (float)0 > 0){
          c uoc = this.b.z();
          Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.EditorActivity");
          FlexScreenStatusData uFlexScreenS = u6.a(uoc, 0);
          AbsDefaultEditorActivityViewBinder$a tc = this.c;
          View view = this.b.D();
          ViewGroup$LayoutParams obj = PatchProxy.applyFourRefs(tc, p0, view, uFlexScreenS, null, h.class, "8");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             int statusBarHei = uFlexScreenS.getStatusBarHeight();
             int i1 = (uFlexScreenS.getHasHole())? statusBarHei: a1.e(16.00f);
             if (tc.i.a1() != Workspace$Type.VIDEO || e0.e(tc.i)) {
                i = statusBarHei;
             }else {
                ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                i = (int)p0.top;
                int i2 = i - i1;
                if (i2 <= 0 || i2 >= layoutParams.height) {
                   i = i1;
                }
             }
          }
          obj = this.b.D().getLayoutParams();
          String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
          Objects.requireNonNull(obj, str);
          obj.topMargin = i;
          AbsDefaultEditorActivityViewBinder$a tb = this.b;
          if (tb.t != null) {
             tb.D().setVisibility(0);
             this.b.t = false;
          }
          this.b.D().requestLayout();
          obj = this.b.C().getLayoutParams();
          Objects.requireNonNull(obj, str);
          obj.topMargin = i;
          this.b.C().requestLayout();
          i = this.b.z();
          Objects.requireNonNull(i, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.EditorActivity");
          if (!PatchProxy.applyVoid(null, i, EditorActivity.class, "16")) {
             i.Y0 = true;
             if (i.Z0 != null) {
                i.Z3();
             }
          }
       }
       return;
    }
}
