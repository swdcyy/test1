package com.kuaishou.live.gzone.treasurebox.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f63.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.d;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Integer;
import lnc.a1;
import android.graphics.Typeface;
import android.app.Application;
import o56.a;
import android.content.Context;
import d61.f0;
import o56.c;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import com.kwai.live.gzone.kshell.bean.LiveGzoneKShellRankUserInfo;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.gzone.treasurebox.presenter.a;
import android.view.View$OnClickListener;
import r53.a;
import qvb.i;

public class b extends PresenterV2	// class@001c7b
{
    public TextView p;
    public TextView q;
    public KwaiImageView r;
    public TextView s;
    public d t;
    public LiveGzoneKShellRankUserInfo u;
    public a v;
    public i w;
    public ProgressFragment x;
    public static String sLivePresenterClassName = "LiveGzoneKShellRankListItemPresenter";

    public void b(){
       super();
    }
    public void E8(){
       int i1;
       a uoa = a.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, b.class, str)) {
          return;
       }
       int i = this.t.get();
       this.p.setText(String.valueOf((i + 1)));
       b tp = this.p;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(tp, Integer.valueOf(i), objArray, uoa, str)) {
          if (i) {
             if (i != 1) {
                i1 = (i != 2)? a1.a(R.color.arg_RES_7f0601cb): a1.a(R.color.arg_RES_7f0615b4);
             }else {
                i1 = a1.a(R.color.arg_RES_7f0615b3);
             }
          }else {
             i1 = a1.a(R.color.arg_RES_7f0615b2);
          }
          tp.setTextColor(i1);
       }
       b tp1 = this.p;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(tp1, Integer.valueOf(i), objArray, uoa, "4")) {
          float f = (i > 2)? 16.00f: 18.00f;
          tp1.setTextSize(f);
          if (i <= 2) {
             tp1.setTypeface(Typeface.defaultFromStyle(3));
          }else {
             f0.i(tp1, a.b());
          }
       }
       tp1 = this.r;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(tp1, Integer.valueOf(i), objArray, uoa, "2")) {
          c uoc = null;
          if (i) {
             if (i != 1) {
                i = (i != 2)? 0: 0x7f081532;
             }else {
                i = 0x7f081534;
             }
          }else {
             i = 0x7f081533;
          }
          if (i > 0) {
             tp1.setPadding(n.c(a.a().a(), 0x3fc00000), n.c(a.a().a(), 0x3fc00000), n.c(a.a().a(), 0x3fc00000), n.c(a.a().a(), 0x3fc00000));
             tp1.getHierarchy().n().l(0);
             tp1.setBackgroundResource(i);
          }else {
             tp1.setPadding(uoc, uoc, uoc, uoc);
             tp1.getHierarchy().n().k(a1.a(R.color.arg_RES_7f062038));
          }
       }
       g.d(this.r, this.u.mUserInfo, HeadImageSize.MIDDLE);
       this.q.setText(this.u.mUserInfo.mName);
       this.s.setText(TextUtils.N(this.u.mScore));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       x.E(this.x);
       this.x = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a1f3f);
       this.q = p0.findViewById(0x7f0a1f3e);
       this.r = p0.findViewById(0x7f0a1f3d);
       this.s = p0.findViewById(0x7f0a1f3c);
       f0.i(this.p, this.getContext());
       p0.setOnClickListener(new a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.t = this.r8("ADAPTER_POSITION_GETTER");
       this.u = this.q8(LiveGzoneKShellRankUserInfo.class);
       this.v = this.q8(a.class);
       this.w = this.r8("DETAIL_PAGE_LIST");
       return;
    }
}
