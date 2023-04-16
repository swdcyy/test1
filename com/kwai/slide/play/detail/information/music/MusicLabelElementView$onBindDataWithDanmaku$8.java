package com.kwai.slide.play.detail.information.music.MusicLabelElementView$onBindDataWithDanmaku$8;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lr7.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.widget.popup.a;
import android.content.Context;
import qp7.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import java.lang.CharSequence;
import lr7.y;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.c$b;
import lr7.z;
import w07.l;
import lr7.a0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class MusicLabelElementView$onBindDataWithDanmaku$8 extends FunctionReferenceImpl implements l	// class@0017f7
{

    public void MusicLabelElementView$onBindDataWithDanmaku$8(b p0){
       super(1, p0, b.class, "showDanmakuPop", "showDanmakuPop\(Z\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(MusicLabelElementView$onBindDataWithDanmaku$8.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicLabelElementView$onBindDataWithDanmaku$8.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), treceiver, uob, "6")) {
          Context uContext = treceiver.k();
          Objects.requireNonNull(uContext, "null cannot be cast to non-null type android.app.Activity");
          a uoa = new a(uContext);
          uoa.I0(0x2b0f);
          uoa.K0(KwaiBubbleOption.g);
          ImageView imageView = treceiver.v(R.id.danmakuSwitchButton);
          a.o(imageView, "danmakuSwitchButton");
          ImageView imageView1 = treceiver.v(R.id.danmakuSwitchButton);
          a.o(imageView1, "danmakuSwitchButton");
          int i = (imageView.getPaddingLeft() - imageView1.getPaddingRight()) / 2;
          uoa.B0(i);
          uoa.p0(i);
          imageView = treceiver.v(R.id.danmakuSwitchButton);
          a.o(imageView, "danmakuSwitchButton");
          imageView1 = treceiver.v(R.id.danmakuSwitchButton);
          a.o(imageView1, "danmakuSwitchButton");
          uoa.v0((treceiver.w(imageView, R.dimen.arg_RES_7f07054f) - treceiver.w(imageView1, R.dimen.arg_RES_7f0700f9)));
          uoa.o0(treceiver.v(R.id.danmakuSwitchButton));
          int i1 = (p0)? 0x7f100992: 0x7f1005be;
          uoa.F0(a1.p(i1));
          uoa.q0(true);
          uoa.K(new y(treceiver, p0));
          uoa.b0(new z(treceiver, p0));
          uoa.n();
          uoa.A(true);
          uoa.z(true);
          uoa.P(true);
          uoa.B(true);
          uoa.T(3000);
          uoa.M(new a0(treceiver, p0));
          treceiver.l = p.o(uoa);
       }
       return;
    }
}
