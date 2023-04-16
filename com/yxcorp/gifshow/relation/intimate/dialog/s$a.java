package com.yxcorp.gifshow.relation.intimate.dialog.s$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import lnc.a1;
import java.lang.Math;
import com.yxcorp.gifshow.model.IntimateRelationInfo;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import android.text.SpannableStringBuilder;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import abc.e0;
import android.view.View$OnClickListener;
import abc.g0;
import erd.r;
import brd.t;
import abc.f0;
import erd.g;
import crd.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import java.lang.Integer;
import java.lang.Float;
import y8c.d;
import io.reactivex.subjects.PublishSubject;

public class s$a extends PresenterV2	// class@001903
{
    public boolean A;
    public boolean B;
    public float p;
    public d q;
    public IntimateRelationInfo r;
    public IntimateRelationDialogParams s;
    public PublishSubject t;
    public int u;
    public int v;
    public TextView w;
    public KwaiImageView x;
    public FrameLayout y;
    public SelectShapeLinearLayout z;

    public void s$a(){
       super();
    }
    public void E8(){
       s$a uoa = s$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          this.z.setScaleX(this.p);
          this.z.setScaleY(this.p);
          this.z.setPivotX(0);
          this.z.setPivotY(0);
          ViewGroup$LayoutParams layoutParams = this.y.getLayoutParams();
          layoutParams.width = (int)Math.ceil((double)(this.p * (float)a1.d(0x7f070473)));
          layoutParams.height = (int)Math.ceil(((double)(this.p * (float)a1.d(0x7f070472)) + 0x3fe0000000000000));
          this.y.setLayoutParams(layoutParams);
       }
       int relationCoun = this.s.getRelationCount(this.r.mType);
       s$a tr = this.r;
       boolean b = (tr.mType == this.u)? true: false;
       if (tr.mUpperLimit > null) {
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(this.r.mName+"\("+relationCoun+"/"+this.r.mUpperLimit+"\)");
          spannableStr.setSpan(new AbsoluteSizeSpan(9, true), (this.r.mName).length(), spannableStr.length(), 33);
          if (relationCoun >= this.r.mUpperLimit) {
             this.A = true;
             if (!b) {
                this.z.setAlpha(0x3f000000);
             }
          }
          this.w.setText(spannableStr);
          this.w.setPadding(0, 0, 0, 0);
       }else {
          this.w.setText(tr.mName);
          this.w.setPadding(a1.d(R.dimen.arg_RES_7f07034b), 0, 0, 0);
       }
       this.w.setTextColor(this.r.getColor());
       String selectIcon = this.r.getSelectIcon();
       if (!TextUtils.x(selectIcon)) {
          this.x.M(selectIcon, objArray);
       }
       if (this.v == this.r.mType) {
          this.B = true;
          this.v = -1;
       }
       this.P8(this.B);
       this.y.setOnClickListener(new e0(this, b, relationCoun));
       this.X7(this.t.filter(new g0(this)).subscribe(new f0(this)));
       return;
    }
    public final void P8(boolean p0){
       s$a uoa = s$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.B = p0;
       b uob = PatchProxy.apply(null, this, uoa, "5");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
          uob.g(KwaiRadiusStyles.R8);
          uob.j(144);
          uob.l(this.r.getDialogBgStartColor(), this.r.getDialogBgEndColor());
       }
       if (p0) {
          uob.w(this.r.getColor());
          uob.x(0x3f800000);
       }else {
          uob.w(0);
       }
       this.z.setBackground(uob.a());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a3554);
       this.w = m1.f(p0, 0x7f0a3557);
       this.y = m1.f(p0, 0x7f0a36a4);
       this.z = m1.f(p0, 0x7f0a147d);
       return;
    }
    public void j8(){
       Integer integer = Integer.class;
       if (PatchProxy.applyVoid(null, this, s$a.class, "1")) {
          return;
       }
       this.p = this.r8("INTIMATE_DIALOG_SELECT_RELATION_SCALE").floatValue();
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.q8(IntimateRelationInfo.class);
       this.s = this.r8("INTIMATE_DIALOG_BUNDLE");
       this.t = this.r8("INTIMATE_DIALOG_SELECT_RELATION_SUBJECT");
       this.u = this.v8("INTIMATE_DIALOG_CURRENT_RELATION_TYPE", integer).intValue();
       this.v = this.v8("INTIMATE_DIALOG_DEFAULT_RELATION_TYPE", integer).intValue();
       return;
    }
}
