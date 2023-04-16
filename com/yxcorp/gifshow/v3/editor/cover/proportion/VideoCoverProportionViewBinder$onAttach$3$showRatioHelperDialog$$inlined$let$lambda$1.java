package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$onAttach$3$showRatioHelperDialog$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$onAttach$3;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.io.File;
import java.util.Objects;
import u07.t$a;
import android.app.Activity;
import u07.b;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.Context;
import i2b.a;
import android.widget.RelativeLayout;
import zf6.k;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$initRatioGuideView$1;
import android.view.View$OnClickListener;
import xp6.d;
import com.kwai.imsdk.internal.util.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import faa.a;
import q87.c;
import tpc.b0;
import w07.l;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class VideoCoverProportionViewBinder$onAttach$3$showRatioHelperDialog$$inlined$let$lambda$1 extends Lambda implements a	// class@000eb0
{
    public final FragmentActivity $it;
    public final VideoCoverProportionViewBinder$onAttach$3 this$0;

    public void VideoCoverProportionViewBinder$onAttach$3$showRatioHelperDialog$$inlined$let$lambda$1(FragmentActivity p0,VideoCoverProportionViewBinder$onAttach$3 p1){
       this.$it = p0;
       this.this$0 = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, VideoCoverProportionViewBinder$onAttach$3$showRatioHelperDialog$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       VideoCoverProportionViewBinder$onAttach$3 a = this.this$0.a;
       VideoCoverProportionViewBinder$onAttach$3$showRatioHelperDialog$$inlined$let$lambda$1 t$it = this.$it;
       a.o(t$it, "it");
       String absolutePath = this.this$0.a.p.getAbsolutePath();
       a.o(absolutePath, "destFile.absolutePath");
       Objects.requireNonNull(a);
       VideoCoverProportionViewBinder videoCoverPr = VideoCoverProportionViewBinder.class;
       if (!PatchProxy.applyVoidTwoRefs(t$it, absolutePath, a, videoCoverPr, "8")) {
          t$a uoa = b.a(new t$a(t$it));
          View view = PatchProxy.applyTwoRefs(t$it, absolutePath, a, videoCoverPr, "9");
          if (view != PatchProxyResult.class) {
          }else {
             View view1 = a.a(t$it, R.layout.arg_RES_7f0d0235);
             a.o(view1, "KwaiLayoutInflater.infla¡­cover_ratio_guide_dialog\)");
             view = view1;
             view1 = view.findViewById(R.id.cover_ratio_guide_load_failed);
             a.o(view1, "mRatioGuideView.findView¡­_ratio_guide_load_failed\)");
             if (k.d()) {
                view1.setBackgroundColor(a1.a(R.color.arg_RES_7f06018c));
             }else {
                view1.setBackgroundColor(a1.a(R.color.arg_RES_7f0601b5));
             }
             View view2 = view.findViewById(R.id.cover_ratio_guide_anim);
             a.o(view2, "mRatioGuideView.findView¡­d.cover_ratio_guide_anim\)");
             View view3 = view.findViewById(R.id.cover_ratio_guide_retry);
             a.o(view3, "mRatioGuideView.findView¡­.cover_ratio_guide_retry\)");
             view3.setOnClickListener(new VideoCoverProportionViewBinder$initRatioGuideView$1(a, view2, view1));
             d uod = a.b(absolutePath);
             if (uod != null && (uod.a == null || uod.b == null)) {
                Object[] objArray = new Object[false];
                a.D().w("VideoCoverProportionViewBinder", "innerShowRatioHelperDialog: ratio guide picture load failed", objArray);
                view2.setVisibility(4);
                view1.setVisibility(false);
             }else {
                view2.x(new File(absolutePath), a1.d(R.dimen.arg_RES_7f070181), a1.d(R.dimen.arg_RES_7f070180));
                view1.setVisibility(4);
                view2.setVisibility(false);
             }
          }
          uoa.H0(view);
          uoa.V0(false);
          uoa.W0(R.string.arg_RES_7f103d51);
          uoa.y0(R.string.arg_RES_7f103d50);
          uoa.Q0(R.string.arg_RES_7f101c73);
          uoa.a0(b0.a);
          uoa.X();
       }
       PatchProxy.onMethodExit(VideoCoverProportionViewBinder$onAttach$3$showRatioHelperDialog$$inlined$let$lambda$1.class, "1");
       return;
    }
}
