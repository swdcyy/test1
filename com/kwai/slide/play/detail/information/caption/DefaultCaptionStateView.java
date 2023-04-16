package com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView;
import com.kwai.slide.play.detail.information.caption.CaptionStateView;
import com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView$1;
import msd.p;
import android.text.SpannableStringBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import qp7.t0;
import com.kwai.slide.play.detail.information.caption.l;
import com.kwai.slide.play.detail.information.caption.k;
import com.kwai.slide.play.detail.information.caption.CaptionTextView;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import lnc.a1;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import o56.a;
import com.yxcorp.gifshow.widget.textview.ClickablePressedSpanTextView;
import com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView$a;
import android.view.View$OnTouchListener;
import com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView$b;
import android.view.View$OnClickListener;
import com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView$c;
import com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView$d;
import androidx.lifecycle.Observer;

public final class DefaultCaptionStateView extends CaptionStateView	// class@0017d1
{
    public CaptionTextView e;

    public void DefaultCaptionStateView(){
       super(DefaultCaptionStateView$1.INSTANCE);
    }
    public void e(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultCaptionStateView.class, "2")) {
          return;
       }
       DefaultCaptionStateView te = this.e;
       if (te == null) {
          a.S("mLabelTextView");
       }
       te.setText(p0);
       return;
    }
    public void f(View p0,ViewGroup p1,t0 p2,l p3,k p4){
       DefaultCaptionStateView uDefaultCapt = DefaultCaptionStateView.class;
       int i = 0;
       if (PatchProxy.isSupport(uDefaultCapt)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uDefaultCapt, "1")) {
             return;
          }
       }
       a.p(p0, "view");
       a.p(p1, "parent");
       a.p(p2, "pageConfig");
       a.p(p3, "viewModel");
       a.p(p4, "eventBus");
       p0 = p0.findViewById(R.id.element_caption_label);
       a.o(p0, "view.findViewById\(R.id.element_caption_label\)");
       this.e = p0;
       String str = "mLabelTextView";
       if (p0 == null) {
          a.S(str);
       }
       p0.setHighlightColor(i);
       DefaultCaptionStateView te = this.e;
       if (te == null) {
          a.S(str);
       }
       float f = (NasaSlidePlayExperimentUtil.k())? 0: 0x3f800000;
       te.setShadowLayer(0x3f800000, f, 0x3f800000, a1.a(R.color.arg_RES_7f061ec8));
       te = this.e;
       if (te == null) {
          a.S(str);
       }
       te.setMovementMethod(ScrollingMovementMethod.getInstance());
       if (a.d()) {
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          te.setContentDescription(a1.p(R.string.arg_RES_7f104a7e));
       }
       te = this.e;
       if (te == null) {
          a.S(str);
       }
       te.setScrollAble(p2.e());
       if (p2.d()) {
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          te.setOnTouchListener(DefaultCaptionStateView$a.b);
       }else if(!p2.e()){
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          te.setOnTouchListener(null);
       }
       if (!p2.a()) {
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          te.setOnClickListener(new DefaultCaptionStateView$b(p4));
       }else {
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          te.setOnClickListener(new DefaultCaptionStateView$c(p4));
       }
       p3.i(new DefaultCaptionStateView$d(this));
       return;
    }
}
