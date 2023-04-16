package com.kuaishou.live.gzone.treasurebox.widget.LiveGzoneTreasurePendantV2;
import ml8.d;
import com.kuaishou.live.gzone.treasurebox.widget.ILiveTreasureBoxPendantView;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.common.gzone.pendant.LiveScaleFrameLayout;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.CountDownTimer;
import java.lang.Runnable;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import android.widget.TextView;
import crd.b;
import lnc.b9;
import com.kuaishou.live.gzone.treasurebox.widget.a;
import ok.h;
import android.widget.FrameLayout;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import r0.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import f37.o0;
import ac.a;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import java.lang.StringBuilder;
import p53.q1;
import com.kuaishou.live.gzone.treasurebox.widget.LiveGzoneTreasurePendantV2$a;
import java.lang.Enum;
import lnc.a1;
import pp.a;
import q87.c;
import s53.c;
import s53.e;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;

public class LiveGzoneTreasurePendantV2 extends ILiveTreasureBoxPendantView implements d	// class@001ca7
{
    public TextView f;
    public View g;
    public TextView h;
    public LiveTreasureBoxModel i;
    public q1 j;
    public b k;
    public CountDownTimer l;
    public KwaiImageView m;
    public KwaiImageView n;
    public CDNUrl[] o;
    public CDNUrl[] p;
    public long q;
    public static final int r;

    public void LiveGzoneTreasurePendantV2(Context p0){
       super(p0, null);
    }
    public void LiveGzoneTreasurePendantV2(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneTreasurePendantV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setClipChildren(false);
       this.setClipToPadding(false);
       this.doBindView(a.c(p0, R.layout.arg_RES_7f0d0e28, this));
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTreasurePendantV2.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, LiveGzoneTreasurePendantV2.class, "6")) {
          LiveGzoneTreasurePendantV2 tl = this.l;
          if (tl != null) {
             tl.cancel();
             this.l = null;
          }
       }
       return;
    }
    public Runnable c(){
       return null;
    }
    public void d(LiveTreasureBoxModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTreasurePendantV2.class, "4")) {
          return;
       }
       if (p0 == null && this.i == null) {
          this.f.setText(R.string.arg_RES_7f10247b);
          this.f.setTextSize(1, this.getDefaultTextSize());
       }
       if (this.i != p0) {
          this.i = p0;
          if (p0 == null) {
             b9.a(this.k);
             return;
          }else {
             this.g(p0);
             this.k = b9.c(this.k, new a(this));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTreasurePendantV2.class, "1")) {
          return;
       }
       this.f = this.findViewById(0x7f0a050a);
       this.g = this.findViewById(0x7f0a0508);
       this.h = m1.f(p0, 0x7f0a342e);
       this.m = m1.f(p0, 0x7f0a26f1);
       this.n = m1.f(p0, 0x7f0a4061);
       this.m.setPlaceHolderImage(a.d(this.getContext(), R.drawable.arg_RES_7f081211));
       return;
    }
    public void e(int p0){
       if (PatchProxy.isSupport(LiveGzoneTreasurePendantV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGzoneTreasurePendantV2.class, "8")) {
          return;
       }
       if (p0 < 1) {
          this.h.setVisibility(8);
       }else {
          this.h.setText(String.valueOf(p0));
          this.h.setVisibility(0);
       }
       return;
    }
    public void f(CDNUrl[] p0,CDNUrl[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneTreasurePendantV2.class, "3")) {
          return;
       }
       if (!o0.b(this.p, p0)) {
          this.p = p0;
          if (p0 == null) {
             this.n.setController(null);
          }else {
             this.n.U(p0);
          }
       }
       if (!o0.b(this.o, p1)) {
          this.o = p1;
          if (p1 == null) {
             this.m.setController(null);
          }else {
             this.m.U(p1);
          }
       }
       return;
    }
    public final void g(LiveTreasureBoxModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTreasurePendantV2.class, "5")) {
          return;
       }
       if (p0 != null && p0.getBoxStatus() != null) {
          int remainSecond = p0.getRemainSecond();
          LiveGzoneTreasurePendantV2 tj = this.j;
          if (tj != null) {
             tj.a("¡¾BoxPendantView¡¿updateStatus:"+remainSecond+""+p0.getBoxStatus());
          }
          int i = LiveGzoneTreasurePendantV2$a.a[p0.getBoxStatus().ordinal()];
          String str = null;
          if (i != 1 && i != 2) {
             if (i != 0.00f) {
                if (this.l != null) {
                   return;
                }else {
                   this.f.setTextSize(1, this.getDefaultTextSize());
                   str = a1.p(R.string.arg_RES_7f102d34);
                }
             }else {
                this.f(str, str);
             }
          }else {
             this.f.setTextSize(1, this.getCountingTextSize());
             LiveGzoneTreasurePendantV2 liveGzoneTre = 4;
             if (remainSecond == liveGzoneTre) {
                if (!PatchProxy.isSupport(LiveGzoneTreasurePendantV2.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(remainSecond), this, LiveGzoneTreasurePendantV2.class, "7") && this.l == null)) {
                   Object[] objArray = new Object[0];
                   a.C().s("BoxView", "startCountDown: ", objArray);
                   c uoc = new c(this, (long)(((remainSecond + 1) * 1000) - 1), 100);
                   this.l = a.C();
                   a.C().start();
                }
                return;
             }else if(remainSecond < liveGzoneTre && this.l != null){
                return;
             }else {
                this.q = (long)(remainSecond * 1000);
                str = e.a(remainSecond);
             }
          }
          if (!TextUtils.n(this.f.getText(), str)) {
             this.f.setText(str);
          }
       }
    label_00d9 :
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTreasurePendantV2.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       return;
    }
    public final void setDisplayRestTime(long p0){
       String str;
       if (PatchProxy.isSupport(LiveGzoneTreasurePendantV2.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveGzoneTreasurePendantV2.class, "11")) {
          return;
       }
       if ((p0 / 1000) - null > 0) {
          LiveGzoneTreasurePendantV2 tf = this.f;
          if (PatchProxy.isSupport(LiveGzoneTreasurePendantV2.class)) {
             str = PatchProxy.applyOneRefs(Long.valueOf(p0), null, LiveGzoneTreasurePendantV2.class, "12");
             if (str != PatchProxyResult.class) {
             label_0085 :
                tf.setText(str);
             }
          }
          int i = (int)p0 / 1000;
          int i1 = i / 3600;
          int i2 = (i % 3600) / 60;
          i = i % 60;
          StringBuilder str1 = "";
          if (i1 > 0) {
             str1 = (i1 >= 10)? str1+i1: str1+'0'+i1;
             str1 = str1+':';
          }
          str1 = (i2 >= 10)? str1+i2: str1+'0'+i2;
          str1 = str1+':';
          str1 = (i >= 10)? str1+i: str1+'0'+i;
          str = str1;
          goto label_0085 ;
       }else {
          this.f.setText(R.string.arg_RES_7f102d34);
       }
       return;
    }
    public void setLogProvider(q1 p0){
       this.j = p0;
    }
}
