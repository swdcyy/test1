package ii9.b0;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.robust.PatchProxyResult;
import hi9.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.view.View;
import cw9.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import sm6.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import java.lang.Number;
import ii9.c0;
import android.view.ViewOutlineProvider;
import ii9.d0;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import android.app.Activity;
import com.kwai.feature.post.api.util.g;
import ii9.b0$a;
import android.view.View$OnLayoutChangeListener;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin$SendMessagePageInfo;
import uc9.b;

public class b0 extends d	// class@002830
{
    public ImageView n;
    public AnimCameraView o;
    public View p;
    public View q;
    public View r;

    public void b0(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void f2(float p0){
       int i2;
       Object[] obj;
       int i3;
       int i4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob0, "2")) {
          return;
       }
       String str = "adjustView displayRatio:";
       int i = 0;
       Object[] objArray = new Object[i];
       String str1 = "FixFrameController";
       a.D().w(str1, str+p0, objArray);
       if (!PatchProxy.isSupport(uob0) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob0, "3")) {
          obj = new Object[i];
          a.D().w(str1, str+p0, obj);
          Resources resources1 = a.b().getResources();
          i2 = 0x7f0a0086;
          View view = this.l.findViewById(i2);
          if (p0 - 0x3ef286bd <= 0) {
             i3 = c.b(a.b().getResources(), R.dimen.arg_RES_7f0710a0);
             i2 = c.b(a.b().getResources(), R.dimen.arg_RES_7f07109a);
             i4 = c.b(resources1, R.dimen.arg_RES_7f071097);
          }else if(p0 - 0x3f078788 < 0){
             i3 = c.b(a.b().getResources(), R.dimen.arg_RES_7f0710a1);
             i2 = c.b(resources1, R.dimen.arg_RES_7f07109b);
             i4 = c.b(resources1, R.dimen.arg_RES_7f071098);
          }else {
             i3 = c.b(a.b().getResources(), R.dimen.arg_RES_7f0710a2);
             ConstraintLayout uConstraintL = this.l.findViewById(R.id.preview_layout_content);
             a uoa = new a();
             uoa.i(uConstraintL);
             uoa.g(i2, 3);
             uoa.g(i2, 4);
             uoa.l(i2, 4, R.id.camera_preview_container, 4);
             uoa.b(uConstraintL);
             b.v(view, c.b(resources1, R.dimen.arg_RES_7f071093));
             i2 = c.b(resources1, 0x7f07109c);
             i4 = c.b(resources1, 0x7f071099);
          }
          b.v(this.n, i3);
          b.x(view, i4);
          if (this.p.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
             ViewGroup$MarginLayoutParams layoutParams2 = this.p.getLayoutParams();
             i4 = d.b();
             layoutParams2.leftMargin = i4;
             layoutParams2.rightMargin = i4;
             layoutParams2.bottomMargin = i2;
             this.p.setLayoutParams(layoutParams2);
          }
       }
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, this, uob0, "4")) {
          ViewGroup$LayoutParams layoutParams = this.o.getLayoutParams();
          i2 = d.d();
          layoutParams.width = i2;
          layoutParams.height = (int)((float)i2 / 0x3f400000);
          this.o.setLayoutParams(layoutParams);
          if (this.r.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
             ViewGroup$MarginLayoutParams layoutParams1 = this.r.getLayoutParams();
             obj = PatchProxy.apply(objArray1, objArray1, uod, "5");
             i2 = (obj != patchProxyRe)? obj.intValue(): c.b(a.b().getResources(), R.dimen.arg_RES_7f0710a5);
             layoutParams1.leftMargin = i2;
             layoutParams1.topMargin = i2;
             i2 = d.g();
             layoutParams1.width = i2;
             layoutParams1.height = (int)((float)i2 / 0x3f400000);
             this.r.setLayoutParams(layoutParams1);
          }
       }
       if (!PatchProxy.applyVoid(objArray1, this, uob0, "5")) {
          this.o.setOutlineProvider(new c0(this));
          this.q.setOutlineProvider(new d0(this));
          this.q.setClipToOutline(true);
          Drawable background = this.r.getBackground();
          if (background instanceof GradientDrawable) {
             background.setCornerRadius((float)d.f());
          }else {
             uob0 = this.r;
             GradientDrawable gradientDraw = PatchProxy.apply(objArray1, objArray1, uod, "7");
             if (gradientDraw != patchProxyRe) {
             }else {
                Resources resources = a.b().getResources();
                GradientDrawable gradientDraw1 = new GradientDrawable();
                gradientDraw1.setColor(resources.getColor(R.color.arg_RES_7f0600a6));
                gradientDraw1.setCornerRadius((float)d.f());
                int i1 = c.b(resources, R.dimen.arg_RES_7f0710a6);
                gradientDraw1.setStroke(i1, resources.getColor(R.color.arg_RES_7f0620c7));
                gradientDraw = gradientDraw1;
             }
             uob0.setBackground(gradientDraw);
          }
       }
       return;
    }
    public void k(View p0){
       b0 uob0 = b0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob0, "1")) {
          return;
       }
       super.k(p0);
       this.n = this.l.findViewById(0x7f0a3f18);
       this.p = this.l.findViewById(0x7f0a0630);
       this.q = this.l.findViewById(0x7f0a3ba2);
       this.r = this.l.findViewById(0x7f0a3ba3);
       AnimCameraView uAnimCameraV = this.d.b().z7();
       this.o = uAnimCameraV;
       uAnimCameraV.getCameraView().setRatio(g.d(2, this.e, false));
       this.o.setClipToOutline(true);
       this.q.setClipToOutline(true);
       float f = d.e();
       this.f2(f);
       p0.addOnLayoutChangeListener(new b0$a(this, p0, f));
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob0, "6")) {
          d te = this.e;
          if (te != null) {
             objArray = j0.e(te.getIntent(), "key_send_message_page_info");
          }
          if (objArray != null) {
             RecordPostPlugin$SendMessagePageInfo mIconRes = objArray.mIconRes;
             if (mIconRes != null) {
                this.n.setImageResource(mIconRes);
             }
          }
       }
    label_0097 :
       p0 = p0.findViewById(R.id.prettify_name_container);
       if (p0 != null && p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          int i = d.b();
          layoutParams.leftMargin = i;
          layoutParams.rightMargin = i;
          p0.setLayoutParams(layoutParams);
       }
       d td = this.d;
       Resources resources = this.e.getResources();
       int i1 = (d.e() - 0x3f078788 >= 0)? 0x7f0620c5: 0x7f0620c6;
       td.m(new b(resources.getColor(i1)));
       return;
    }
}
