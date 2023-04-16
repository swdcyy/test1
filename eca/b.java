package eca.b;
import pn9.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import voc.c0;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import eca.b$a;
import pn9.g$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import nn9.b;
import java.util.List;
import xoc.b;
import mn9.a;
import java.util.Objects;
import eca.g;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import cca.b;
import eca.c;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;
import android.animation.ObjectAnimator;
import java.lang.Runnable;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import zsd.u;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;

public final class b extends a	// class@002107
{
    public c0 f;
    public ObjectAnimator g;
    public final TextView h;
    public final KwaiImageView i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;
    public final TextView n;
    public final int o;
    public final int p;
    public final String q;
    public final String r;
    public final Runnable s;
    public final Fragment t;

    public void b(View p0,Fragment p1){
       a.p(p0, "itemView");
       a.p(p1, "fragment");
       super(p0);
       this.t = p1;
       this.f = new c0();
       View view = p0.findViewById(R.id.name);
       a.o(view, "itemView.findViewById\(R.id.name\)");
       this.h = view;
       view = p0.findViewById(R.id.icon);
       a.o(view, "itemView.findViewById\(R.id.icon\)");
       this.i = view;
       view = p0.findViewById(R.id.ai_cut_loading);
       a.o(view, "itemView.findViewById\(R.id.ai_cut_loading\)");
       this.j = view;
       view = p0.findViewById(R.id.ai_cut_icon);
       a.o(view, "itemView.findViewById\(R.id.ai_cut_icon\)");
       this.k = view;
       view = p0.findViewById(R.id.selected_view);
       a.o(view, "itemView.findViewById\(R.id.selected_view\)");
       this.l = view;
       view = p0.findViewById(R.id.loading_mask);
       a.o(view, "itemView.findViewById\(R.id.loading_mask\)");
       this.m = view;
       p0 = p0.findViewById(R.id.reco_reason);
       a.o(p0, "itemView.findViewById\(R.id.reco_reason\)");
       this.n = p0;
       this.o = a1.d(0x7f07032a);
       this.p = a1.d(0x7f070340);
       this.q = a1.p(0x7f1017d6);
       this.r = a1.p(0x7f100b0b);
       this.s = new b$a(this);
    }
    public void a(g$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.a(p0);
       RecyclerView$ViewHolder titemView = this.itemView;
       a.o(titemView, "itemView");
       this.f.g(titemView);
       return;
    }
    public void f(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       a.p(p1, "newState");
       return;
    }
    public void g(b p0,b p1,List p2){
       String name;
       Object[] this;
       boolean b;
       b a;
       Object[] objArray1;
       b uob = b.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       a.p(p1, "newState");
       a.p(p2, "payloads");
       a uoa = p1.g();
       String str = "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.ui.item.VideoTemplateUIItem";
       Objects.requireNonNull(uoa, str);
       if (!uoa.g()) {
          return;
       }
       uoa = p1.g();
       Objects.requireNonNull(uoa, str);
       VideoTemplate videoTemplat = uoa.b();
       a uoa1 = a.D();
       StringBuilder str1 = "id=";
       if (videoTemplat != null) {
          name = videoTemplat.getName();
          if (name != null) {
          label_0055 :
             int i = 0;
             this = new Object[i];
             String str2 = "VideoTemplateAICutItemHolder";
             uoa1.w(str2, str1+name+" onStateChanged "+p1, this);
             int this1 = 8;
             if (videoTemplat == null) {
                p0 = b.a;
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoid(null, p0, b.class, "10")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "EDIT_AICUT";
                   u1.u0(6, uElementPack, null);
                }
                b = p1.i();
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "5")) {
                   this.m.setVisibility(this1);
                   this.n.setVisibility(this1);
                   if (b) {
                      this.k.setVisibility(this1);
                      this.h.setVisibility(this1);
                      this.i();
                   }else {
                      this.k.setVisibility(i);
                      this.h.setVisibility(i);
                      this.h.setBackground(a1.f(R.drawable.arg_RES_7f0824f4));
                      this.h.setText(this.r);
                      this.j();
                   }
                   this.i.setActualImageResource(R.drawable.arg_RES_7f0824f5);
                   this.i.setPlaceHolderImage(R.drawable.arg_RES_7f0824f5);
                }
                return;
             }else {
                this.k.setVisibility(this1);
                this.k(videoTemplat);
                if (!TextUtils.x(c.a(this.t).d())) {
                   if (!p1.i()) {
                      Object[] objArray = new Object[i];
                      a.D().w(str2, "aicut item loadingAnimation stop loading", objArray);
                      this.h();
                      CDNUrl[] uCDNUrlArray = (p1.b == ItemLoadingStatus.ITEM_LOADING_FAILED)? 1: null;
                      if (!uCDNUrlArray) {
                         if (!PatchProxy.applyVoidOneRefs(videoTemplat, this, uob, "6")) {
                            this.k(videoTemplat);
                            if (videoTemplat.getCover() != null) {
                               uob = this.i;
                               List cover = videoTemplat.getCover();
                               if (cover != null) {
                                  uCDNUrlArray = new CDNUrl[i];
                                  objArray1 = cover.toArray(uCDNUrlArray);
                                  Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                               }else {
                                  objArray1 = new CDNUrl[i];
                               }
                               uob.W(objArray1, this.o, this.p, this);
                            }else {
                               this.i.setActualImageResource(i);
                            }
                         }
                         if (TextUtils.x(videoTemplat.getRecoReason())) {
                            this.n.setVisibility(this1);
                         }else {
                            this.n.setVisibility(i);
                            this.n.setText(videoTemplat.getRecoReason());
                         }
                      }else {
                         a = p1.f;
                         if (a != null) {
                            if (a instanceof KSException && a.mError == -39) {
                               a.D().e(str2, "aicut item failed due to illegal detected", a);
                            }else {
                               PostUtils.D(str2, "aicut item failed due to", a);
                            }
                         }
                      }
                   }else {
                      this.n.setVisibility(this1);
                      if (p0 != null && !p0.i()) {
                         a = this.g;
                         if (a == null || !a.isRunning()) {
                            Object[] objArray2 = new Object[i];
                            a.D().w(str2, "aicut item loadingAnimation register loading", objArray2);
                            this.j.postDelayed(this.s, 260);
                         }
                      }
                   }
                   if (this.h.getVisibility()) {
                      a = b.a;
                      Objects.requireNonNull(a);
                      if (!PatchProxy.applyVoid(null, a, b.class, "8")) {
                         ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                         uElementPack1.action2 = "CHANGE_TEMPLATE_BUTTON";
                         u1.u0(6, uElementPack1, null);
                      }
                      this.h.setVisibility(i);
                   }
                   this.h.setBackground(a1.f(R.drawable.arg_RES_7f0824f7));
                   this.h.setText(this.q);
                }else {
                   this.h();
                }
                p1 = (c.a(this.t).b() || p1.d())? 1: null;
                float f = 0;
                if (p0 == null || (p0.d() != p1 && !this.l.getAlpha() - f)) {
                   i = 1;
                }
                if (i) {
                   if (p1) {
                      this.f.b(this.l);
                   }else {
                      this.f.a(this.l);
                   }
                }else {
                   this.f.d();
                   p0 = this.l;
                   if (p1 != null) {
                      f = 0x3f800000;
                   }
                   p0.setAlpha(f);
                }
                return;
             }
          }
       }
       name = "default_ai_cut";
       goto label_0055 ;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.j();
       this.j.removeCallbacks(this.s);
       this.m.setVisibility(8);
       return;
    }
    public final void i(){
       b tg;
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("VideoTemplateAICutItemHolder", "aicut item loadingAnimation real start", objArray);
       if (!this.j.getVisibility()) {
          tg = this.g;
          if (tg != null && tg.isStarted() == true) {
             return;
          }
       }
       this.j.setVisibility(i);
       tg = this.g;
       if (tg != null) {
          tg.cancel();
       }
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.j, View.ROTATION, new float[2]{0,0x43b40000});
       this.g = objectAnimat;
       a.m(objectAnimat);
       objectAnimat.setDuration(1000);
       tg = this.g;
       a.m(tg);
       tg.setInterpolator(new LinearInterpolator());
       tg = this.g;
       a.m(tg);
       tg.setRepeatCount(-1);
       tg = this.g;
       a.m(tg);
       tg.setRepeatMode(1);
       tg = this.g;
       a.m(tg);
       tg.start();
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       this.j.setVisibility(8);
       b tg = this.g;
       if (tg != null) {
          tg.cancel();
       }
       this.g = null;
       return;
    }
    public final void k(VideoTemplate p0){
       String str = "#";
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       try{
          str = (u.q2(p0.getColor(), str, false, 2, null))? p0.getColor(): str+p0.getColor();
          this.i.getHierarchy().F(new ColorDrawable(Color.parseColor(str)));
       }catch(java.lang.IllegalArgumentException e0){
          a.D().e("VideoTemplateAICutItemHolder", "update: "+p0.getName()+" style color is wrong", e0);
       }
       return;
    }
}
