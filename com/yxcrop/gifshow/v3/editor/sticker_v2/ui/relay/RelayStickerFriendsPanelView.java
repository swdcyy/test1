package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.util.AttributeSet;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.StringBuilder;
import msd.a;
import qrd.l1;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import fmd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView$a;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class RelayStickerFriendsPanelView extends FrameLayout	// class@000acf
{
    public final String b;
    public final String c;
    public TextView d;
    public KwaiImageView e;
    public View f;
    public KwaiImageView g;
    public View h;
    public KwaiImageView i;
    public View j;
    public KwaiImageView k;
    public View l;
    public final int m;
    public final int n;
    public final int o;
    public a p;
    public AtomicInteger q;
    public HashMap r;

    public void RelayStickerFriendsPanelView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = "RelayStickerFriendsPanelView";
       this.c = "+";
       this.m = a1.e(22.00f);
       this.n = a1.d(0x7f070e0c);
       this.o = a1.d(0x7f070e0b);
       this.b();
    }
    public void RelayStickerFriendsPanelView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = "RelayStickerFriendsPanelView";
       this.c = "+";
       this.m = a1.e(22.00f);
       this.n = a1.d(0x7f070e0c);
       this.o = a1.d(0x7f070e0b);
       this.b();
    }
    public void RelayStickerFriendsPanelView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = "RelayStickerFriendsPanelView";
       this.c = "+";
       this.m = a1.e(22.00f);
       this.n = a1.d(0x7f070e0c);
       this.o = a1.d(0x7f070e0b);
       this.b();
    }
    public final void a(KwaiImageView p0,boolean p1){
       if (PatchProxy.isSupport(RelayStickerFriendsPanelView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, RelayStickerFriendsPanelView.class, "4")) {
          return;
       }
       if (!p1) {
          a hierarchy = p0.getHierarchy();
          a.o(hierarchy, "avatarView.hierarchy");
          hierarchy.x(0);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, RelayStickerFriendsPanelView.class, "1")) {
          return;
       }
       a.d(this.getContext(), R.layout.arg_RES_7f0d12f8, this, true);
       View view = this.findViewById(R.id.relay_sticker_post_count);
       a.o(view, "findViewById\(R.id.relay_sticker_post_count\)");
       this.d = view;
       view = this.findViewById(R.id.relay_sticker_user_1_profile);
       a.o(view, "findViewById\(R.id.relay_sticker_user_1_profile\)");
       this.e = view;
       view = this.findViewById(R.id.relay_sticker_user_1);
       a.o(view, "findViewById\(R.id.relay_sticker_user_1\)");
       this.f = view;
       view = this.findViewById(R.id.relay_sticker_user_2_profile);
       a.o(view, "findViewById\(R.id.relay_sticker_user_2_profile\)");
       this.g = view;
       view = this.findViewById(R.id.relay_sticker_user_2);
       a.o(view, "findViewById\(R.id.relay_sticker_user_2\)");
       this.h = view;
       view = this.findViewById(R.id.relay_sticker_user_3_profile);
       a.o(view, "findViewById\(R.id.relay_sticker_user_3_profile\)");
       this.i = view;
       view = this.findViewById(R.id.relay_sticker_user_3);
       a.o(view, "findViewById\(R.id.relay_sticker_user_3\)");
       this.j = view;
       view = this.findViewById(R.id.relay_sticker_user_4_profile);
       a.o(view, "findViewById\(R.id.relay_sticker_user_4_profile\)");
       this.k = view;
       view = this.findViewById(R.id.relay_sticker_user_4);
       a.o(view, "findViewById\(R.id.relay_sticker_user_4\)");
       this.l = view;
       return;
    }
    public final void c(AtomicInteger p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RelayStickerFriendsPanelView.class, "3")) {
          return;
       }
       StringBuilder str = "notifyRenderComplete: counter = ["+p0+']';
       if (a.g(p0, this.q) && !p0.decrementAndGet()) {
          RelayStickerFriendsPanelView tp = this.p;
          if (tp != null) {
             tp.invoke();
          }
       }
       return;
    }
    public final void d(RelayUserInfo p0,KwaiImageView p1,a p2,AtomicInteger p3,boolean p4){
       if (PatchProxy.isSupport(RelayStickerFriendsPanelView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, RelayStickerFriendsPanelView.class, "7")) {
             return;
          }
       }
       this.a(p1, p4);
       if (TextUtils.x(p0.getProfileLocalPath()) && TextUtils.x(p0.getProfileUrl())) {
          this.c(p3);
          return;
       }else if(!TextUtils.x(p0.getProfileLocalPath())){
          String profileLocal = p0.getProfileLocalPath();
          a.m(profileLocal);
          File uFile = new File(profileLocal);
          p1.w(uFile, this.m, this.m, new RelayStickerFriendsPanelView$a(this, p3));
          return;
       }else {
          a.e(p0.getProfileUrl(), new RelayStickerFriendsPanelView$b(this, p3, p0, p1));
          return;
       }
    }
    public final void e(View p0,boolean p1){
       if (PatchProxy.isSupport(RelayStickerFriendsPanelView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, RelayStickerFriendsPanelView.class, "6")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams = null;
       }
       if (layoutParams != null) {
          RelayStickerFriendsPanelView tn = (p1)? this.n: this.o;
          layoutParams.setMarginEnd(tn);
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void setRenderCompleteListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RelayStickerFriendsPanelView.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       this.p = p0;
       return;
    }
}
