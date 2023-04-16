package com.kwai.live.gzone.emotion.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import java.io.File;
import ak5.j;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.List;
import android.view.View;
import android.widget.ImageView;
import com.kwai.live.gzone.emotion.l$a;
import android.view.View$OnClickListener;
import y47.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import com.kwai.live.gzone.emotion.k$a;
import com.kwai.live.gzone.emotion.k$b;

public class l extends PresenterV2	// class@000ce9
{
    public EmotionInfo p;
    public k$a q;
    public k$b r;
    public View s;
    public TextView t;
    public KwaiBindableImageView u;
    public TextView v;

    public void l(){
       super();
    }
    public void E8(){
       float f;
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       l tp = this.p;
       if (tp == null) {
          return;
       }
       l tt = this.t;
       if (tt != null) {
          tt.setText(tp.mEmotionName);
          return;
       }else {
          File uFile = j.r(tp);
          int i = 0;
          if (uFile != null) {
             this.u.v(uFile, i, i);
          }else {
             this.u.P(this.p.mEmotionImageSmallUrl);
          }
          this.v.setText(this.p.mEmotionName);
          tp = this.p;
          int i1 = 1;
          if (tp.mPayStatus != null || tp.mPayType <= i1) {
             i1 = 0;
          }
          tp = this.s;
          if (!i1) {
             i = 4;
          }
          tp.setVisibility(i);
          if (i1) {
             f = 0.30f;
             this.v.setAlpha(f);
             this.u.setAlpha(f);
          }else {
             f = 0x3f800000;
             this.v.setAlpha(f);
             this.u.setAlpha(f);
          }
          if (i1) {
             this.m8().setOnClickListener(new l$a(this));
          }else {
             this.m8().setOnClickListener(new g(this));
          }
          return;
       }
    }
    public void P8(EmotionInfo p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_LIVE_GZONE_EMO";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("emo_id", p0.mId);
       jsonObject.c0("emo_pac_id", p0.mEmotionPackageId);
       if (p0.mPayType > 1) {
          i = (p0.mPayStatus == null)? 3: 2;
       }else {
          i = 1;
       }
       jsonObject.a0("emo_status", Integer.valueOf(i));
       uElementPack.params = jsonObject.toString();
       u1.u(1, uElementPack, null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a0cfd);
       this.u = m1.f(p0, 0x7f0a0cfa);
       this.s = m1.f(p0, 0x7f0a0cfc);
       this.t = m1.f(p0, 0x7f0a0d06);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.q8(EmotionInfo.class);
       this.q = this.t8("emotion_item_click_listener");
       this.r = this.t8("locked_emotion_item_click_listener");
       return;
    }
}
