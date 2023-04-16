package com.kwai.live.gzone.accompanyplay.a$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import java.util.List;
import j47.c;
import com.kwai.live.gzone.accompanyplay.a;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.TextPaint;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import im8.f;
import java.lang.Integer;
import com.kwai.live.gzone.accompanyplay.a$b$a;
import android.view.View$OnClickListener;
import android.view.View;
import android.content.Context;
import d61.f0;
import android.graphics.Typeface;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import io.reactivex.subjects.PublishSubject;

public class a$b extends PresenterV2	// class@000aee
{
    public View p;
    public TextView q;
    public TextView r;
    public f s;
    public PublishSubject t;
    public UserInfo u;
    public TextView v;
    public KwaiImageView w;
    public c x;

    public void a$b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "3")) {
          return;
       }
       UserInfo mExtraInfo = this.u.mExtraInfo;
       if (mExtraInfo != null) {
          UserExtraInfo mBase64Segme = mExtraInfo.mBase64Segments;
          if (mBase64Segme != null) {
             mExtraInfo.mIconSegments = this.x.Z2(mBase64Segme);
             UserExtraInfo mIconSegment = this.u.mExtraInfo.mIconSegments;
             a$b tr = this.r;
             a$b tx = this.x;
             if (!PatchProxy.applyVoidThreeRefs(mIconSegment, tr, tx, null, a.class, "2")) {
                CharSequence uCharSequenc = tx.U2(mIconSegment, a1.d(R.dimen.arg_RES_7f070283), a1.d(R.dimen.arg_RES_7f07031b));
                if (!TextUtils.x(uCharSequenc)) {
                   tr.setText(TextUtils.ellipsize(uCharSequenc, tr.getPaint(), 200.00f, TextUtils$TruncateAt.END));
                   tr.setVisibility(0);
                }else {
                   tr.setVisibility(8);
                }
             }
          }
       }
       int i = this.s.get().intValue();
       this.v.setText(String.valueOf((i + 1)));
       this.p.setOnClickListener(new a$b$a(this, i));
       f0.i(this.v, this.getContext());
       this.q.setTypeface(Typeface.defaultFromStyle(1));
       this.q.setText(this.x.h4(this.u));
       g.d(this.w, this.u, HeadImageSize.MIDDLE);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       this.p = p0;
       this.q = m1.f(p0, 0x7f0a1e3b);
       this.r = m1.f(p0, 0x7f0a1e3a);
       this.v = m1.f(p0, 0x7f0a1e3c);
       this.w = m1.f(p0, 0x7f0a1e39);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.s = this.x8("ADAPTER_POSITION");
       this.t = this.r8("KEY_ITEM_CLICK_EVENT");
       this.u = this.q8(UserInfo.class);
       this.x = this.r8("KEY_BRIDGE_SERVICE");
       return;
    }
}
