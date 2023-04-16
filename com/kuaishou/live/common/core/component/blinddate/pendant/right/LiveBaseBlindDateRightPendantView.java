package com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBaseBlindDateRightPendantView;
import android.widget.FrameLayout;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBaseBlindDateRightPendantView$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import ekd.p1;
import yb1.b;
import android.view.View$OnClickListener;
import yb1.c;
import yb1.d;
import yb1.e;
import yb1.g;
import java.lang.Boolean;
import java.lang.CharSequence;
import yb1.h;
import java.lang.Integer;
import usd.q;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBaseBlindDateRightPendantView$b;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public abstract class LiveBaseBlindDateRightPendantView extends FrameLayout	// class@000f80
{
    public LiveBaseBlindDateRightPendantView$b b;
    public FrameLayout c;
    public View d;
    public KwaiImageView e;
    public KwaiImageView f;
    public TextView g;
    public TextView h;
    public KwaiImageView i;
    public ImageView j;
    public g k;
    public boolean l;
    public HashMap m;
    public static final int n;
    public static final int o;
    public static final LiveBaseBlindDateRightPendantView$a p;

    static {
       LiveBaseBlindDateRightPendantView.p = new LiveBaseBlindDateRightPendantView$a(null);
       LiveBaseBlindDateRightPendantView.n = a1.d(0x7f070261);
       LiveBaseBlindDateRightPendantView.o = a1.d(0x7f07034c);
    }
    public void LiveBaseBlindDateRightPendantView(Context p0){
       super(p0, null, 2, null);
    }
    public void LiveBaseBlindDateRightPendantView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.l = true;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseBlindDateRightPendantView.class, "9")) {
       }else {
          View view = a.c(p0, this.getLayoutId$live_common_release(), this);
          View view1 = view.findViewById(R.id.live_blind_date_pendant_outer_container);
          a.o(view1, "view.findViewById\(R.id.l¡­_pendant_outer_container\)");
          this.c = view1;
          view1 = view.findViewById(R.id.live_blind_date_pendant_inner_container);
          a.o(view1, "view.findViewById\(R.id.l¡­_pendant_inner_container\)");
          this.d = view1;
          view1 = view.findViewById(R.id.live_blind_date_background_img);
          a.o(view1, "view.findViewById\(R.id.l¡­lind_date_background_img\)");
          this.e = view1;
          view1 = view.findViewById(R.id.live_blind_date_top_img);
          a.o(view1, "view.findViewById\(R.id.live_blind_date_top_img\)");
          this.f = view1;
          view1 = view.findViewById(R.id.live_blind_date_high_light_text);
          a.o(view1, "view.findViewById\(R.id.l¡­ind_date_high_light_text\)");
          this.g = view1;
          view1 = view.findViewById(R.id.live_blind_date_description_text);
          a.o(view1, "view.findViewById\(R.id.l¡­nd_date_description_text\)");
          this.h = view1;
          view1 = view.findViewById(R.id.live_blind_date_button_img);
          a.o(view1, "view.findViewById\(R.id.live_blind_date_button_img\)");
          this.i = view1;
          view = view.findViewById(R.id.live_blind_date_close_img);
          a.o(view, "view.findViewById\(R.id.live_blind_date_close_img\)");
          this.j = view;
          int i = a1.d(R.dimen.arg_RES_7f07025d);
          LiveBaseBlindDateRightPendantView tj = this.j;
          if (tj == null) {
             a.S("closeImageView");
          }
          p1.c(tj, i, i, i, i);
          view = this.getRootView();
          a.o(view, "rootView");
          this.a(view);
          if (!PatchProxy.applyVoid(null, this, LiveBaseBlindDateRightPendantView.class, "11")) {
             LiveBaseBlindDateRightPendantView tj1 = this.j;
             if (tj1 == null) {
                a.S("closeImageView");
             }
             tj1.setOnClickListener(new b(this));
             tj1 = this.c;
             if (tj1 == null) {
                a.S("pendantOuterContainer");
             }
             tj1.setOnClickListener(new c(this));
             tj1 = this.f;
             if (tj1 == null) {
                a.S("topImageView");
             }
             tj1.setOnClickListener(new d(this));
             tj1 = this.i;
             if (tj1 == null) {
                a.S("jumpImageView");
             }
             tj1.setOnClickListener(new e(this));
          }
       }
       return;
    }
    public void LiveBaseBlindDateRightPendantView(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseBlindDateRightPendantView.class, "10")) {
          return;
       }
       a.p(p0, "rootView");
       return;
    }
    public final void b(g p0,boolean p1){
       if (PatchProxy.isSupport(LiveBaseBlindDateRightPendantView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveBaseBlindDateRightPendantView.class, "12")) {
          return;
       }
       a.p(p0, "pendantData");
       this.k = p0;
       LiveBaseBlindDateRightPendantView tg = this.g;
       if (tg == null) {
          a.S("highLightTextView");
       }
       tg.setText(p0.b());
       tg = this.h;
       if (tg == null) {
          a.S("guideDescriptionTextView");
       }
       tg.setText(p0.a());
       this.c(p1);
       return;
    }
    public final void c(boolean p0){
       if (PatchProxy.isSupport(LiveBaseBlindDateRightPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveBaseBlindDateRightPendantView.class, "13")) {
          return;
       }
       this.l = p0;
       LiveBaseBlindDateRightPendantView tk = this.k;
       if (tk != null) {
          h oh = (p0)? tk.c(): tk.d();
          this.setPendantImgInfo(oh);
       }
       if (p0) {
          this.d();
       }else {
          this.e();
       }
       this.requestLayout();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveBaseBlindDateRightPendantView.class, "18")) {
          return;
       }
       this.setContainerSize(true);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveBaseBlindDateRightPendantView.class, "19")) {
          return;
       }
       this.setContainerSize(false);
       return;
    }
    public final void f(int p0){
       if (PatchProxy.isSupport(LiveBaseBlindDateRightPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveBaseBlindDateRightPendantView.class, "16")) {
          return;
       }
       if (this.l == null && p0 > 0) {
          int n = LiveBaseBlindDateRightPendantView.n;
          p0 = q.u(q.n(p0, LiveBaseBlindDateRightPendantView.o), n);
          float f = (float)p0 / (float)n;
          LiveBaseBlindDateRightPendantView td = this.d;
          String str = "pendantInnerContainer";
          if (td == null) {
             a.S(str);
          }
          td.setScaleX(f);
          td = this.d;
          if (td == null) {
             a.S(str);
          }
          td.setScaleY(f);
          td = this.c;
          if (td == null) {
             a.S("pendantOuterContainer");
          }
          ViewGroup$LayoutParams layoutParams = td.getLayoutParams();
          layoutParams.width = p0;
          layoutParams.height = (int)((float)this.getSmallModeHeight$live_common_release() * f);
          LiveBaseBlindDateRightPendantView tc = this.c;
          if (tc == null) {
             a.S("pendantOuterContainer");
          }
          tc.setLayoutParams(layoutParams);
       }
       return;
    }
    public final KwaiImageView getBackgroundImageView(){
       LiveBaseBlindDateRightPendantView obj = PatchProxy.apply(null, this, LiveBaseBlindDateRightPendantView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("backgroundImageView");
       }
       return obj;
    }
    public final TextView getGuideDescriptionTextView(){
       LiveBaseBlindDateRightPendantView obj = PatchProxy.apply(null, this, LiveBaseBlindDateRightPendantView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          a.S("guideDescriptionTextView");
       }
       return obj;
    }
    public final TextView getHighLightTextView(){
       LiveBaseBlindDateRightPendantView obj = PatchProxy.apply(null, this, LiveBaseBlindDateRightPendantView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          a.S("highLightTextView");
       }
       return obj;
    }
    public abstract int getLayoutId$live_common_release();
    public final LiveBaseBlindDateRightPendantView$b getPendantCallback(){
       return this.b;
    }
    public abstract int getSmallModeHeight$live_common_release();
    public final KwaiImageView getTopImageView(){
       LiveBaseBlindDateRightPendantView obj = PatchProxy.apply(null, this, LiveBaseBlindDateRightPendantView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("topImageView");
       }
       return obj;
    }
    public final void setBackgroundImageView(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseBlindDateRightPendantView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void setContainerSize(boolean p0){
       LiveBaseBlindDateRightPendantView td1;
       if (PatchProxy.isSupport(LiveBaseBlindDateRightPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveBaseBlindDateRightPendantView.class, "20")) {
          return;
       }
       int n = LiveBaseBlindDateRightPendantView.n;
       int i = (p0)? a1.d(R.dimen.arg_RES_7f07028f): this.getSmallModeHeight$live_common_release();
       LiveBaseBlindDateRightPendantView td = this.d;
       if (td == null) {
          a.S("pendantInnerContainer");
       }
       ViewGroup$LayoutParams layoutParams = td.getLayoutParams();
       layoutParams.width = n;
       layoutParams.height = i;
       if (p0) {
          td1 = this.d;
          if (td1 == null) {
             a.S("pendantInnerContainer");
          }
          float f = 0x3f800000;
          td1.setScaleX(f);
          td1 = this.d;
          if (td1 == null) {
             a.S("pendantInnerContainer");
          }
          td1.setScaleY(f);
       }
       td1 = this.c;
       if (td1 == null) {
          a.S("pendantOuterContainer");
       }
       ViewGroup$LayoutParams layoutParams1 = td1.getLayoutParams();
       layoutParams1.width = n;
       layoutParams1.height = i;
       LiveBaseBlindDateRightPendantView tc = this.c;
       if (tc == null) {
          a.S("pendantOuterContainer");
       }
       tc.setLayoutParams(layoutParams1);
       return;
    }
    public final void setGuideDescriptionTextView(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseBlindDateRightPendantView.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.h = p0;
       return;
    }
    public final void setHighLightTextView(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseBlindDateRightPendantView.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
    public final void setPendantCallback(LiveBaseBlindDateRightPendantView$b p0){
       this.b = p0;
    }
    public final void setPendantImgInfo(h p0){
       LiveBaseBlindDateRightPendantView te;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseBlindDateRightPendantView.class, "17")) {
          return;
       }
       CDNUrl[] uCDNUrlArray = e0.i(p0.a);
       a.o(uCDNUrlArray, "CDNUtil.parsePicUrl\(pend¡­ageInfo.backgroundImgUrl\)");
       int i = 0;
       int i1 = (!uCDNUrlArray.length)? 1: 0;
       if (i1 ^ 1) {
          te = this.e;
          if (te == null) {
             a.S("backgroundImageView");
          }
          te.U(uCDNUrlArray);
       }
       uCDNUrlArray = e0.i(p0.b);
       a.o(uCDNUrlArray, "CDNUtil.parsePicUrl\(pendantImageInfo.topImgUrl\)");
       i1 = (!uCDNUrlArray.length)? 1: 0;
       if (i1 ^ 1) {
          te = this.f;
          if (te == null) {
             a.S("topImageView");
          }
          te.U(uCDNUrlArray);
       }
       CDNUrl[] uCDNUrlArray1 = e0.i(p0.c);
       a.o(uCDNUrlArray1, "CDNUtil.parsePicUrl\(pendantImageInfo.buttonImgUrl\)");
       if (!uCDNUrlArray1.length) {
          i = 1;
       }
       if (i ^ 0x01) {
          LiveBaseBlindDateRightPendantView ti = this.i;
          if (ti == null) {
             a.S("jumpImageView");
          }
          ti.U(uCDNUrlArray1);
       }
       return;
    }
    public final void setTopImageView(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseBlindDateRightPendantView.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.f = p0;
       return;
    }
}
