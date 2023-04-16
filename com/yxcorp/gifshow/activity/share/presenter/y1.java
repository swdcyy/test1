package com.yxcorp.gifshow.activity.share.presenter.y1;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.activity.share.presenter.v1;
import com.yxcorp.gifshow.activity.share.presenter.j2;
import f6c.d;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import u07.t$a;
import u07.b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import android.widget.Button;
import xw8.p0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zw8.b4;
import com.yxcorp.gifshow.activity.share.presenter.w1;
import erd.g;
import crd.b;
import zw8.a4;
import com.yxcorp.gifshow.activity.share.presenter.x1;
import com.yxcorp.gifshow.activity.share.presenter.y1$c;
import android.view.View$OnTouchListener;
import android.widget.RelativeLayout;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.gifshow.activity.share.presenter.y1$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.presenter.y1$b;
import com.yxcorp.gifshow.widget.m;
import com.kwai.robust.PatchProxyResult;
import zw8.e4;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.entity.QPhoto;

public class y1 extends PresenterV2 implements g	// class@00145c
{
    public KwaiActionBar p;
    public Button q;
    public Button r;
    public Button s;
    public EmojiEditText t;
    public boolean u;
    public p0 v;
    public BasePostActivity w;
    public c x;
    public QPhoto y;
    public String z;

    public void y1(){
       super();
       boolean b = (PostExperimentUtils.A1() || PostExperimentUtils.y1())? true: false;
       this.u = b;
       this.U7(new v1());
       this.U7(new j2());
       if (PostExperimentUtils.a1()) {
          this.U7(new d());
       }
       return;
    }
    public static void S8(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, y1.class, "10")) {
          return;
       }
       String str = a.a.getString("uploadNoticeInfo", "");
       if (TextUtils.x(str)) {
          str = a1.p(R.string.arg_RES_7f104faa);
       }
       t$a uoa = new t$a(p0);
       uoa.W0(R.string.arg_RES_7f10479a);
       uoa.z0(str);
       uoa.S0(R.string.arg_RES_7f101812);
       b.d(uoa).Y(PopupInterface.a);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y1.class, "3")) {
          return;
       }
       this.r.setVisibility(0);
       ActivityEvent dESTROY = ActivityEvent.DESTROY;
       this.X7(this.v.b.compose(c.c(this.w.m(), dESTROY)).subscribe(new b4(this), w1.b));
       this.X7(this.v.o.compose(c.c(this.w.m(), dESTROY)).subscribe(new a4(this), x1.b));
       this.p.setOnTouchListener(new y1$c(this));
       return;
    }
    public final void P8(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(y1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, y1.class, "13")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.s.getLayoutParams();
       layoutParams.width = p0;
       layoutParams.height = p1;
       p0 = (p2)? 10: 19;
       layoutParams.setMarginStart(a1.e((float)p0));
       this.s.setLayoutParams(layoutParams);
       return;
    }
    public final void R8(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(y1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, y1.class, "12")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.r.getLayoutParams();
       layoutParams.width = p0;
       layoutParams.height = p1;
       p0 = (p2)? 10: 19;
       layoutParams.setMarginEnd(a1.e((float)p0));
       this.r.setLayoutParams(layoutParams);
       return;
    }
    public final void V8(int p0,int p1,int p2){
       if (PatchProxy.isSupport(y1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, y1.class, "6")) {
          return;
       }
       boolean b = false;
       if (p0) {
          this.s.setText(a1.p(p0));
          this.P8(-2, -2, b);
       }else {
          this.s.setText("");
          this.P8(a1.e(40.00f), a1.e(40.00f), true);
       }
       this.s.setVisibility(p2);
       if (p1) {
          this.s.setBackground(j.n(this.w, p1, R.color.arg_RES_7f060148));
       }else {
          this.s.setBackgroundResource(b);
       }
       return;
    }
    public final void W8(int p0,int p1,int p2){
       if (PatchProxy.isSupport(y1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, y1.class, "7")) {
          return;
       }
       if (p0) {
          this.r.setText(a1.p(p0));
          this.R8(-2, -2, false);
       }else {
          this.R8(a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d), true);
          this.r.setText("");
       }
       this.r.setBackgroundResource(p1);
       if (p0) {
          this.r.setBackgroundResource(R.drawable.arg_RES_7f0801be);
          this.R8(a1.d(R.dimen.arg_RES_7f07032a), a1.d(R.dimen.arg_RES_7f0702ef), false);
       }
       this.r.setVisibility(p2);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y1.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0ca8);
       this.q = m1.f(p0, 0x7f0a3316);
       this.p = m1.f(p0, 0x7f0a3f6a);
       this.s = m1.f(p0, 0x7f0a1716);
       this.p.h(new y1$a(this));
       Button uButton = m1.f(p0, R.id.right_btn_v2);
       this.r = uButton;
       m1.b(uButton, new y1$b(this), R.id.right_btn_v2);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y1.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e4();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, y1.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(y1.class, new e4());
       }else {
          obj.put(y1.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y1.class, "1")) {
          return;
       }
       this.v = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.w = this.r8("SHARE_ACTIVITY");
       this.x = this.t8("WORKSPACE");
       this.y = this.t8("SHARE_QPHOTO");
       this.z = this.t8("SHARE_FROM_PAGE");
       return;
    }
}
