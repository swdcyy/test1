package com.kuaishou.tuna_core.krn.native_view.TunaRichTextViewManager$a;
import lg.e;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lg.f;
import androidx.appcompat.widget.AppCompatTextView;
import ze.n0;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.TextView;
import com.facebook.react.uimanager.j;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.krn.native_view.b;
import msd.a;
import c15.b;
import tkd.b;
import tkd.d;
import nmc.e;
import android.text.Spanned;

public class TunaRichTextViewManager$a extends LayoutShadowNode implements e	// class@0010de
{
    public Spanned b;
    public static final int c;

    public void TunaRichTextViewManager$a(){
       super();
       this.b = null;
       this.setMeasureFunction(this);
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       float f;
       TunaRichTextViewManager$a uoa = TunaRichTextViewManager$a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Float.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, this, uoa, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.longValue();
          }
       }
       if (this.b == null) {
          return f.b(i, i);
       }else {
          YogaMeasureMode eXACTLY = YogaMeasureMode.EXACTLY;
          if (p2 == eXACTLY && p4 == eXACTLY) {
             return f.a(p1, p3);
          }else {
             AppCompatTextView uAppCompatTe = new AppCompatTextView(this.getThemedContext());
             uAppCompatTe.setText(this.b);
             uAppCompatTe.measure(i, i);
             if (p2 != eXACTLY) {
                f = (float)uAppCompatTe.getMeasuredWidth();
                if (p2 != YogaMeasureMode.AT_MOST || f - p1 <= 0) {
                   p1 = f;
                }
             }
             if (p4 != eXACTLY) {
                float f1 = (float)uAppCompatTe.getMeasuredHeight();
                if (p2 != YogaMeasureMode.AT_MOST || f1 - p3 <= 0) {
                   p3 = f1;
                }
             }
             return f.a(p1, p3);
          }
       }
    }
    public void onCollectExtraUpdates(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaRichTextViewManager$a.class, "3")) {
          return;
       }
       if (this.b != null) {
          p0.h(this.getReactTag(), this.b);
       }else {
          b.b(KsLogTunaCoreTag.TUNA_KRN.appendTag("TunaRichTextViewManager"), b.b);
       }
       return;
    }
    public void setContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaRichTextViewManager$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.b = d.a(0x48215b73).CU(p0);
       }
       this.markUpdated();
       return;
    }
}
