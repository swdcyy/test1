package com.yxcorp.gifshow.channel.stagger.header.subentrance.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hlb.c;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import k2b.u1;
import android.app.Activity;
import lj9.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import ok.x;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import lnc.i3;
import java.lang.Long;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.channel.stagger.header.subentrance.ChannelSubEntranceItemView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.channel.stagger.header.subentrance.ChannelSubEntranceItemView$a;
import com.yxcorp.gifshow.channel.stagger.header.subentrance.a$a;
import android.view.View$OnClickListener;

public class a extends PresenterV2	// class@00106c
{
    public KwaiImageView p;
    public TextView q;
    public ChannelSubEntranceItemView r;
    public TextView s;
    public int t;
    public int u;
    public c v;

    public void a(int p0){
       super();
       this.t = p0;
    }
    public void E8(){
       a tt;
       ViewGroup$LayoutParams obj;
       int i;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       this.p.U(this.v.mIconUrls);
       this.q.setText(TextUtils.I(this.v.mTitle));
       if (!TextUtils.x(this.v.mLabel)) {
          this.s.setVisibility(0);
          this.s.setText(this.v.mLabel);
       }else {
          this.s.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          tt = this.v;
          if (tt.a == null) {
             tt.a = true;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FIXED_OPERATION_POSITION";
             uElementPack.params = this.P8();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.ksOrderInfoPackage = l0.a(this.v.mKsOrderId);
             u1.u0(3, uElementPack, uContentPack);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4") && this.t != null) {
          Activity activity = this.getActivity();
          tt = this.t;
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             obj = PatchProxy.applyTwoRefs(activity, Integer.valueOf(tt), objArray, uob, "2");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
             label_00ac :
                int i1 = n.k(activity);
                if (i1 <= 0) {
                   i1 = n.x(activity);
                }
                i = (b.a.get().intValue() < 360)? b.c: b.b;
                if (tt > i) {
                   i = (int)((float)(i1 - a1.d(0x7f07014a)) / ((float)i + 0x3f000000));
                }else {
                   i = i1 / tt;
                }
             }
          }else {
             goto label_00ac ;
          }
          obj = this.r.getLayoutParams();
          if (obj != null && obj.width != i) {
             obj.width = i;
             this.r.setLayoutParams(obj);
          }
       }
    label_00f2 :
       return;
    }
    public final String P8(){
       i3 obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.c("position_id", Long.valueOf(this.v.mId));
       obj.d("position_name", TextUtils.I(this.v.mTitle));
       obj.c("position_index", Integer.valueOf((this.u + 1)));
       obj.d("link_url", TextUtils.I(this.v.mLinkUrl));
       obj.d("position_jump_type", TextUtils.I(this.v.mType));
       return obj.e();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3bad);
       this.p = m1.f(p0, 0x7f0a130c);
       this.q = m1.f(p0, 0x7f0a3f2c);
       this.s = m1.f(p0, 0x7f0a16ad);
       this.r.setItemPressHelper(new ChannelSubEntranceItemView$a());
       p0.setOnClickListener(new a$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.u = this.r8("ADAPTER_POSITION").intValue();
       this.v = this.q8(c.class);
       return;
    }
}
