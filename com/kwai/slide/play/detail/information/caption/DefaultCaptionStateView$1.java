package com.kwai.slide.play.detail.information.caption.DefaultCaptionStateView$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zq7.e0;
import com.kwai.slide.play.detail.information.caption.CaptionScrollView;
import android.widget.ScrollView;
import android.view.ViewGroup$LayoutParams;
import com.kwai.slide.play.detail.information.caption.CaptionView;
import com.kwai.slide.play.detail.information.caption.CaptionTextView;
import com.kwai.slide.play.detail.information.caption.CaptionView$a;
import android.widget.TextView;
import qrd.l1;

public final class DefaultCaptionStateView$1 extends Lambda implements p	// class@0017cc
{
    public static final DefaultCaptionStateView$1 INSTANCE;

    static {
       DefaultCaptionStateView$1.INSTANCE = new DefaultCaptionStateView$1();
    }
    public void DefaultCaptionStateView$1(){
       super(2);
    }
    public final View invoke(Context p0,ViewGroup p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultCaptionStateView$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "c");
       a.p(p1, "<anonymous parameter 1>");
       CaptionScrollView uCaptionScro = PatchProxy.applyOneRefs(p0, null, e0.class, "1");
       if (uCaptionScro != patchProxyRe) {
       }else {
          uCaptionScro = new CaptionScrollView(p0);
          uCaptionScro.setId(R.id.caption_scroll_container);
          uCaptionScro.setVerticalScrollBarEnabled(false);
          uCaptionScro.setHorizontalScrollBarEnabled(false);
          uCaptionScro.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
          CaptionTextView uCaptionText = CaptionView.n.a(p0);
          uCaptionText.setId(R.id.element_caption_label);
          uCaptionScro.addView(uCaptionText, -2, -2);
       }
       return uCaptionScro;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
