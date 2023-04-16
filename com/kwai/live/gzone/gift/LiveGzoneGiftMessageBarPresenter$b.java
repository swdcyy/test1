package com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$b;
import lf3.g;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneSpreadGold;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import x67.j;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k57.d;
import k57.b;
import k57.a;
import java.util.Objects;
import android.graphics.drawable.LayerDrawable;
import k57.c;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import android.graphics.Color;
import k57.e;
import com.airbnb.lottie.LottieAnimationView;
import j57.p;
import oq5.a;
import oq5.c;
import trd.j;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$a$a;
import android.os.Handler;
import lf3.f;

public final class LiveGzoneGiftMessageBarPresenter$b implements g	// class@000d0a
{
    public final LiveGzoneGiftMessageBarPresenter b;

    public void LiveGzoneGiftMessageBarPresenter$b(LiveGzoneGiftMessageBarPresenter p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       LayerDrawable obj3;
       SCGzoneSpreadGold buttonText;
       b a;
       Object obj = this;
       Object obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveGzoneGiftMessageBarPresenter$b.class, str)) {
       }else {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (qCurrentUser.isLogined()) {
             LiveGzoneGiftMessageBarPresenter x = obj.b.x;
             if (x == null || x.R4() != true) {
                LiveGzoneGiftMessageBarPresenter$b b = obj.b;
                b.z = obj1;
                Activity activity = b.getActivity();
                if (activity != null) {
                   a.o(activity, "it");
                   d uod = new d(activity);
                   String str1 = "message";
                   a.o(obj1, str1);
                   b obj2 = PatchProxy.applyOneRefs(obj1, uod, d.class, "3");
                   if (obj2 != PatchProxyResult.class) {
                      uod = obj2;
                   }else {
                      a.p(obj1, str1);
                      if (!PatchProxy.applyVoidOneRefs(obj1, uod, d.class, "7")) {
                         d c = uod.c;
                         Objects.requireNonNull(a.h);
                         obj2 = new b(a.a);
                         obj3 = PatchProxy.applyOneRefs(obj1, obj2, b.class, str);
                         if (obj3 != PatchProxyResult.class) {
                         }else {
                            a.p(obj1, "data");
                            SCGzoneSpreadGold backgroundCo = obj1.backgroundColor;
                            a.o(backgroundCo, "data.backgroundColor");
                            SCGzoneSpreadGold backgroundFr = obj1.backgroundFrameColor;
                            a.o(backgroundFr, "data.backgroundFrameColor");
                            c[] uocArray = new c[]{obj2.a(backgroundFr, "#FFBC1E", "#CDB0FF"),obj2.a(backgroundCo, "#A57BFF", "#4C17CB")};
                            LayerDrawable layerDrawabl = new LayerDrawable(uocArray);
                            a = obj2.a;
                            layerDrawabl.setLayerInset(1, a, a, a, a);
                            obj3 = layerDrawabl;
                         }
                         c.setBackground(obj3);
                      }
                      if (!PatchProxy.applyVoidOneRefs(obj1, uod, d.class, "8")) {
                         uod.d.setText((obj1.showTimeMills / (long)1000)+'s');
                         buttonText = obj1.countDownColor;
                         if (buttonText != null) {
                            uod.d.setTextColor(Color.parseColor(buttonText));
                         }
                         e uoe = new e(uod, obj1, obj1.showTimeMills, 1000);
                         uod.j = v12;
                      }
                      if (!PatchProxy.applyVoidOneRefs(obj1, uod, d.class, "11")) {
                         buttonText = obj1.buttonText;
                         if (buttonText != null) {
                            uod.g.setText(buttonText);
                         }
                         buttonText = obj1.buttonColor;
                         if (buttonText != null) {
                            uod.g.setTextColor(Color.parseColor(buttonText));
                         }
                      }
                      uod.b.setAnimationFromUrl(obj1.leftIconAnimationUrl);
                      uod.b.setProgress(0);
                      uod.l = obj1;
                   }
                   p op = new p(obj, obj1);
                   Objects.requireNonNull(uod);
                   obj3 = PatchProxy.applyOneRefs(op, uod, d.class, "4");
                   if (obj3 != PatchProxyResult.class) {
                      uod = obj3;
                   }else {
                      a.p(op, "listener");
                      uod.m = op;
                   }
                   LiveGzoneGiftMessageBarPresenter.S8(obj.b).H6(uod);
                   obj.b.y.add(uod);
                   obj.b.V8().sendEmptyMessage(1);
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
