package nd9.l;
import ui9.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import ke9.b;
import nd9.b;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import xi9.n;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import r5b.e;
import android.view.View;
import ce9.l;
import com.kwai.robust.PatchProxyResult;
import nd9.l$c;
import java.lang.Enum;
import oa0.a;
import java.lang.Number;
import android.widget.ImageView;
import qxc.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwai.library.widget.textview.KwaiMarqueeTextView;
import q5b.f;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import nd9.h;
import erd.g;
import crd.b;
import eoc.f;
import lm6.b;
import nd9.c;
import tg9.b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import pi9.e;
import lnc.m4;
import nd9.j;
import android.view.ViewOutlineProvider;
import lnc.s6;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import nd9.k;
import pi9.i;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import pc9.a;
import java.lang.System;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import w3b.l;
import j8c.a;
import q87.c;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import ee9.a;
import fe9.b;
import android.content.Intent;
import android.app.Activity;
import lnc.n4;
import ekd.j0;
import androidx.fragment.app.Fragment;
import xf6.l;
import nd9.i;
import lnc.d7;
import java.lang.Runnable;
import ekd.j;
import java.text.SimpleDateFormat;
import java.util.Date;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.magic.data.repo.response.MagicTipColorConfig;
import com.yxcorp.gifshow.model.CDNUrl;
import q5b.k;
import s0d.f;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import nd9.o;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import z3b.s0;
import z3b.a0;
import z3b.f;
import nd9.l$a;
import com.facebook.drawee.view.DraweeView;
import android.graphics.Bitmap;
import java.lang.Integer;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import com.yxcorp.gifshow.camerasdk.q;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import th0.a;
import nd9.l$b;
import android.animation.Animator$AnimatorListener;
import nd9.l$d;
import java.util.Objects;
import android.animation.AnimatorSet;
import ra6.a;
import nd9.q;
import nd9.r;
import nd9.s;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import v36.a;
import ad9.a;
import nd9.e;
import nd9.c0;
import nd9.d;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.util.rx.RxBus;
import java.lang.Long;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import e4b.a;
import e4b.c;
import w3b.q;
import lnc.o5;
import brd.t;
import nd9.g;
import nd9.f;

public class l extends d implements b	// class@00314d
{
    public Bitmap A;
    public a B;
    public ImageRequest[] C;
    public boolean D;
    public MagicEmojiEntrance E;
    public String F;
    public boolean G;
    public String H;
    public int I;
    public MagicEmoji$MagicFace J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public AbsRecordBottomBarViewBinder S;
    public LinearLayout n;
    public TextView o;
    public KwaiImageView p;
    public int q;
    public KwaiImageView r;
    public View s;
    public KwaiImageView t;
    public View u;
    public KwaiMarqueeTextView v;
    public ImageView w;
    public boolean x;
    public l$d y;
    public MagicEmoji$MagicFace z;

    public void l(CameraPageType p0,b p1){
       super(p0, p1);
       this.G = false;
       this.K = true;
       this.L = true;
       this.M = true;
       this.N = false;
       this.Q = false;
       this.R = false;
       d tf = this.f;
       if (tf instanceof a) {
          this.S = tf.zb();
       }
       this.d.n(b.class, new b(this));
       return;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       l tJ;
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, l.class, "27")) {
          return;
       }
       d tg = this.g;
       if (tg != null && tg.r()) {
          tJ = this.J;
          if (tJ != null) {
             e.d(tJ, 2);
             this.J = null;
          }
       }
       tJ = this.s;
       if (tJ == null || (!tJ.getVisibility() && this.d.d(l.i).a != null)) {
          this.K = false;
          this.h2();
          this.s2();
       }
    label_0052 :
       return;
    }
    public final String f2(){
       Object obj = PatchProxy.apply(null, this, l.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = l$c.a[this.c.ordinal()];
       if (i != 1 && (i != 2 && i != 3)) {
          return null;
       }
       return a.D0();
    }
    public int g2(){
       Object obj = PatchProxy.apply(null, this, l.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = l$c.a[this.c.ordinal()];
       if (i != 1 && (i != 2 && i != 3)) {
          return Integer.MAX_VALUE;
       }
       return a.e();
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, l.class, "11")) {
          return;
       }
       this.i2(false);
       this.r2();
       return;
    }
    public void i2(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "10")) {
          return;
       }
       ol = this.s;
       if (ol != null) {
          if (!p0) {
             ol.setVisibility(4);
             this.t.setVisibility(0);
          }else if(this.t.getVisibility()){
             this.p2(0);
          }else if(!this.s.getVisibility()){
             this.s.setVisibility(4);
             this.t.setVisibility(0);
          }
       }
       return;
    }
    public void k(View p0){
       int b;
       l tv;
       b uob;
       float f;
       TextView textView;
       KwaiImageView kwaiImageVie;
       AbsRecordBottomBarViewBinder n;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "2")) {
          return;
       }
       super.k(p0);
       l tS = this.S;
       Object[] objArray = null;
       View view = (tS == null)? objArray: tS.o;
       this.r = b.a(view, p0, 0x7f0a061b);
       tS = this.S;
       view = (tS == null)? objArray: tS.p;
       this.n = b.a(view, p0, 0x7f0a2a16);
       tS = this.S;
       view = (tS == null)? objArray: tS.q;
       this.o = b.a(view, p0, 0x7f0a2a18);
       tS = this.S;
       view = (tS == null)? objArray: tS.r;
       this.p = b.a(view, p0, 0x7f0a2a14);
       tS = this.S;
       view = (tS == null)? objArray: tS.n;
       this.s = b.a(view, p0, 0x7f0a061f);
       tS = this.S;
       view = (tS == null)? objArray: tS.B();
       this.t = b.a(view, p0, 0x7f0a0621);
       tS = this.S;
       view = (tS == null)? objArray: tS.C();
       this.u = b.a(view, p0, 0x7f0a0620);
       tS = this.S;
       view = (tS == null)? objArray: tS.E();
       this.v = b.a(view, p0, 0x7f0a0623);
       b = false;
       this.x = b;
       if (f.a()) {
          tv = this.v;
          if (tv != null) {
             tv.setText(R.string.arg_RES_7f104a51);
          }
       }
       tv = this.S;
       View view1 = (tv == null)? objArray: tv.s;
       this.w = b.a(view1, p0, 0x7f0a061d);
       this.Y1(f.a(PanelShowEvent.class, new h(this)));
       this.Y1(this.d.l(b.class, new c(this)));
       if (this.r != null && this.d.j() != null) {
          uob = this.d.j();
          tv = (PostExperimentUtils.Z0())? this.s: this.r;
          uob.addView(tv);
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "3") && this.r != null) {
          int i = 0x7f0a061c;
          f = 0x3f947ae1;
          if (e.e()) {
             this.r.setPadding(b, b, b, b);
             this.r.setScaleX(f);
             this.r.setScaleY(f);
             m4.a(this.r, true);
             e.j(this.s.findViewById(R.id.camera_magic_banner_icon_sweep_light_container));
             l ts = this.s;
             if (ts != null) {
                ts = ts.findViewById(i);
                e.j(ts);
                if (ts != null) {
                   ts.setOutlineProvider(new j(this));
                   ts.setClipToOutline(true);
                }
             }
          }else if(s6.m()){
             if (s6.w() == 3) {
                uob = this.s.findViewById(i);
                this.r.setPadding(b, b, b, b);
                this.r.setScaleX(f);
                this.r.setScaleY(f);
                ViewGroup$LayoutParams layoutParams = this.r.getLayoutParams();
                b = 0x7f07030d;
                layoutParams.width = a1.d(b);
                layoutParams.height = a1.d(b);
                this.r.setLayoutParams(layoutParams);
                if (uob != null) {
                   ViewGroup$MarginLayoutParams layoutParams1 = uob.getLayoutParams();
                   layoutParams1.width = a1.d(b);
                   layoutParams1.height = a1.d(b);
                   layoutParams1.topMargin = a1.d(0x7f0702e3);
                   layoutParams1.bottomMargin = a1.d(0x7f0702e3);
                   layoutParams1.leftMargin = a1.d(0x7f0702e3);
                   layoutParams1.rightMargin = a1.d(0x7f0702e3);
                   uob.setLayoutParams(layoutParams1);
                   uob.setOutlineProvider(new k(this));
                   uob.setClipToOutline(true);
                }
             }else {
                View[] viewArray = new View[]{this.s.findViewById(i),this.r};
                i.a(objArray, viewArray);
                this.r.setPadding(b, b, b, b);
             }
          }
       }
       return;
    }
    public boolean k2(){
       l obj = PatchProxy.apply(null, this, l.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = false;
       if (obj != null && obj.getVisibility()) {
          return b;
       }
       obj = this.t;
       if (obj == null || !obj.getVisibility()) {
          b = true;
       }
       return b;
    }
    public void l2(MagicEmojiEntrance p0){
       Object[] objArray;
       long l;
       int b1;
       d e;
       MagicEmojiEntrance magicEmojiEn1;
       int i2;
       SharedPreferences a;
       String this;
       int b2;
       SharedPreferences$Editor uEditor1;
       boolean b = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, l.class, "13")) {
          return;
       }
       if (b.R == null && obj != null) {
          a.o1(String.valueOf(obj.mMagicFaceId));
          b.R = true;
       }
       if (b.L == null) {
          b.d.m(new a(false, true));
          return;
       }else if(obj == null || obj.mMagicFaceInfo == null){
          objArray = new Object[false];
          a.D().w("face_cover", "processMagicFaceCoverData entrance.magicface is null", objArray);
          b.d.m(new a(false, true));
          return;
       }else {
          String str = this.f2();
          l = System.currentTimeMillis();
          if (l - obj.mBeginShowTimeMs < 0 || l - obj.mEndShowTimeMs > 0) {
             objArray = new Object[false];
             a.D().w("face_cover", "processMagicFaceCoverData time is not in range", objArray);
             b.d.m(new a(false, true));
             return;
          }else if(!l.q(obj.mMagicFaceInfo)){
             objArray = new Object[false];
             a.D().w("face_cover", "processMagicFaceCoverData magicFace is null", objArray);
             b.d.m(new a(false, true));
             return;
          }else if(q.f(obj.mEntranceIconUrl)){
             objArray = new Object[false];
             a.D().w("face_cover", "processMagicFaceCoverData entranceIconUrl is empty", objArray);
             b.d.m(new a(false, true));
             return;
          }else {
             MagicEmojiEntrance mEntranceIco = obj.mEntranceIconId;
             int i = 3;
             long l1 = 2;
             if (!TextUtils.n(mEntranceIco, str)) {
                if (!PatchProxy.applyVoidOneRefs(mEntranceIco, b, l.class, "15")) {
                   b1 = l$c.a[b.c.ordinal()];
                   if (b1 == 1 || (b1 == l1 || b1 == i)) {
                      uEditor1 = a.a.edit();
                      uEditor1.putString("video_magic_face_guide_id", mEntranceIco);
                      g.a(uEditor1);
                   }
                }
                b.n2(false);
                a.n1(false);
             }
             b.I = obj.mDirectlyUseMaxCount;
             if (this.g2() < obj.mMaxCount) {
                i obj1 = PatchProxy.applyOneRefs(obj, b, l.class, "6");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else if(b.d.d(l.i).a != null || (b.d.d(a.g).b != null || b.d.d(b.b).a == null)){
                   e = b.e;
                   if (e == null || !n4.c(e.getIntent())) {
                      e = b.e;
                      if (e != null && (j0.g(e.getIntent(), "kuaishan_template_id") || (!b.f.isDetached() && (obj.mAutoApplyMagicFace != null || l.c("key_enable_operation_auto_download_and_apply", false))))) {
                         b1 = true;
                      }
                   }
                }
             label_0146 :
                b1 = false;
                if (b1) {
                   obj1 = new i(b, obj);
                   if (d7.a.g() != Integer.MIN_VALUE) {
                      b.b2(obj1);
                   }else {
                      obj1.run();
                   }
                }else {
                   MagicEmojiEntrance mEntranceIco1 = obj.mEntranceIconUrl;
                   MagicEmojiEntrance mMagicFaceIn = obj.mMagicFaceInfo;
                   mEntranceIco = mMagicFaceIn;
                   MagicEmojiEntrance magicEmojiEn = mMagicFaceIn;
                   if (!PatchProxy.applyVoidThreeRefs(mEntranceIco1, mEntranceIco, p0, this, l.class, "20")) {
                      b.d.m(new a(false, true));
                      if (b.d.d(l.i).a == null) {
                         e = b.e;
                         if (e == null || (!n4.c(e.getIntent()) && !b.f.isDetached())) {
                            l obj2 = PatchProxy.applyOneRefs(obj, b, l.class, "21");
                            String str1 = "";
                            int i1 = 4;
                            if (obj2 != patchProxyRe) {
                               b1 = obj2.booleanValue();
                               magicEmojiEn1 = mEntranceIco1;
                            }else if(!TextUtils.x(obj.mEntranceTipMsg) || !j.h(obj.mEntranceTipIconUrls)){
                               a = a.a;
                               this = "magic_face_tips_effective_date";
                               String str3 = a.getString(this, str1);
                               magicEmojiEn1 = mEntranceIco1;
                               String str4 = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
                               int i4 = (TextUtils.n(str4, str3))? a.X(): 0;
                               String str5 = "magicfaceBadgeMaxCount";
                               if (a.a().c()) {
                                  if (g.q0() > 0) {
                                     l1 = (g.q0() == i1)? 0x2710: g.q0();
                                  }else {
                                     b2 = f.f(str5, false);
                                  }
                               }else {
                                  b2 = f.f(str5, false);
                               }
                               b2 = (i4 < l1)? true: false;
                               if (b2) {
                                  if (b.Q == null) {
                                     a.o1(String.valueOf(obj.mMagicFaceId));
                                     SharedPreferences$Editor uEditor = a.edit();
                                     uEditor.putString(this, str4);
                                     g.a(uEditor);
                                     uEditor1 = a.edit();
                                     uEditor1.putInt("magic_face_badge_count", (i4 + true));
                                     g.a(uEditor1);
                                  }
                                  b.Q = true;
                                  b.H = obj.mEntranceTipId;
                               }
                               Object[] objArray1 = new Object[false];
                               a.D().w("face_cover", "showTips:"+b2+"  tipsId:"+obj.mEntranceTipId+"  date:"+str4+" /last:"+str3, objArray1);
                               b1 = b2;
                            }else {
                               magicEmojiEn1 = mEntranceIco1;
                               b1 = false;
                            }
                            b.G = b1;
                            b.F = obj.mEntranceIconId;
                            b.q = obj.mEntranceTipStrategyId;
                            if (b.s != null && this.k2()) {
                               b.s.setVisibility(false);
                            }
                            obj2 = b.G;
                            if (obj2 != null) {
                               str1 = obj.mEntranceTipMsg;
                            }
                            MagicEmojiEntrance mEntranceTip = (obj2 != null)? obj.mEntranceTipIconUrls: 0;
                            MagicEmojiEntrance magicEmojiEn2 = mEntranceTip;
                            if (str1 != null && str1.length() > i1) {
                               str1 = str1.substring(false, i1);
                            }
                            String str2 = str1;
                            if (b.G == null) {
                            label_02fe :
                               i2 = 0;
                            }else if(!TextUtils.x(str2) && !j.h(magicEmojiEn2)){
                               i2 = 1;
                            }else if(TextUtils.x(str2) && !j.h(magicEmojiEn2)){
                               i2 = 2;
                            }else if(!TextUtils.x(str2) && j.h(magicEmojiEn2)){
                               i2 = 3;
                            }else {
                               goto label_02fe ;
                            }
                            if (b.G != null) {
                               if (PostExperimentUtils.Z0()) {
                                  mEntranceTip = obj.mEntranceTipColorConfig;
                                  if (mEntranceTip != null) {
                                     k.h(b.n, b.o, b.p, str2, mEntranceTip.entranceTipMsgColor, magicEmojiEn2, mEntranceTip.entranceTipBackgroundStartColor, mEntranceTip.entranceTipBackgroundEndColor, mEntranceTip.backgroundAlpha, i2);
                                  }
                               }else {
                                  obj2 = b.o;
                                  int i3 = (!TextUtils.x(str2))? 0: 8;
                                  obj2.setVisibility(i3);
                                  b.o.setBackgroundResource(R.drawable.arg_RES_7f0816d4);
                               }
                            }
                            b.C = f.x().q(magicEmojiEn1).w();
                            e = Fresco.newDraweeControllerBuilder();
                            e.u(b.C);
                            e.s(new o(b, magicEmojiEn));
                            b.r.setController(e.e());
                         }
                      }
                   }
                   b1 = a.Y();
                   if (!g.y(obj.mMagicFaceInfo) || b1 >= b.I) {
                      s0.e().i(obj.mMagicFaceInfo);
                      return;
                   }else {
                      s0.e().g(obj.mMagicFaceInfo);
                      f[] uofArray = new f[true];
                      uofArray[0] = super(b);
                      a0.o().a("record", "inner_resource", obj.mMagicFaceInfo, uofArray);
                   }
                }
             }else {
                b.d.m(new a(false, true));
                Object[] objArray2 = new Object[false];
                a.D().E("face_cover", "[magicface][keypath] ", "entrance.mMagicFaceInfo  showCount > maxCount"+obj.mMagicFaceInfo.mName, objArray2);
             }
             return;
          }
       }
    }
    public void m2(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "30")) {
          return;
       }
       if (this.C != null) {
          d uod = Fresco.newDraweeControllerBuilder();
          uod.u(this.C);
          uod.y(p0.getController());
          p0.setController(uod.e());
       }else {
          l tA = this.A;
          if (tA != null && !tA.isRecycled()) {
             p0.setImageBitmap(this.A);
          }else {
             this.h2();
          }
       }
       return;
    }
    public void n2(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol, "14")) {
          return;
       }
       int i = l$c.a[this.c.ordinal()];
       if (i == 1 || (i == 2 || i == 3)) {
          a.I0(p0);
       }
       return;
    }
    public boolean o2(){
       Object[] objArray;
       d obj = PatchProxy.apply(null, this, l.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.N == null) {
          objArray = new Object[0];
          a.D().w("face_cover", "no data", objArray);
          return 0;
       }else {
          obj = this.h;
          if (obj == null || !obj.isRecording()) {
             return this.K;
          }
          objArray = new Object[0];
          a.D().w("face_cover", "during record, can\'t show", objArray);
          return 0;
       }
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.s2();
       this.L = true;
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, l.class, "9")) {
          return;
       }
       this.r2();
       return;
    }
    public final void p2(boolean p0){
       MagicEmojiEntrance magicEmojiEn;
       Object[] this;
       Object obj = this;
       boolean b = p0;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), obj, ol, "25")) {
          return;
       }
       if (obj.s != null) {
          ol = obj.t;
          if (ol == null || (obj.o != null && (!b || obj.K != null))) {
             int i = 3;
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
             float[] uofloatArray = new float[2];
             int i1 = 0x3fa00000;
             int i2 = 0x3f800000;
             int i3 = (b)? 0x3f800000: 0x3fa00000;
             int i4 = 0;
             uofloatArray[i4] = i3;
             i3 = (b)? 0x3fa00000: 0x3f800000;
             int i5 = 1;
             uofloatArray[i5] = i3;
             String str = "scaleX";
             propertyValu[i4] = PropertyValuesHolder.ofFloat(str, uofloatArray);
             uofloatArray = new float[2];
             int i6 = (b)? 0x3f800000: 0x3fa00000;
             uofloatArray[i4] = i6;
             if (!b) {
                i1 = 0x3f800000;
             }
             uofloatArray[i5] = i1;
             String str1 = "scaleY";
             propertyValu[i5] = PropertyValuesHolder.ofFloat(str1, uofloatArray);
             uofloatArray = new float[2];
             int i7 = (b)? 0x3f800000: 0;
             uofloatArray[i4] = i7;
             i7 = (b)? 0: 0x3f800000;
             uofloatArray[i5] = i7;
             propertyValu[2] = PropertyValuesHolder.ofFloat("alpha", uofloatArray);
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(ol, propertyValu);
             objectAnimat.setDuration(300);
             objectAnimat.setInterpolator(new e());
             ol = obj.s;
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[i];
             float[] uofloatArray1 = new float[2];
             int i8 = (b)? 0: 0x3f800000;
             uofloatArray1[i4] = i8;
             i8 = (b)? 0x3f800000: 0;
             uofloatArray1[i5] = i8;
             propertyValu1[i4] = PropertyValuesHolder.ofFloat(str, uofloatArray1);
             float[] uofloatArray2 = new float[2];
             int i9 = (b)? 0: 0x3f800000;
             uofloatArray2[i4] = i9;
             i9 = (b)? 0x3f800000: 0;
             uofloatArray2[i5] = i9;
             propertyValu1[i5] = PropertyValuesHolder.ofFloat(str1, uofloatArray2);
             float[] uofloatArray3 = new float[2];
             i3 = (b)? 0: 0x3f800000;
             uofloatArray3[i4] = i3;
             if (!b) {
                i2 = 0;
             }
             uofloatArray3[i5] = i2;
             propertyValu1[2] = PropertyValuesHolder.ofFloat("alpha", uofloatArray3);
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(ol, propertyValu1);
             objectAnimat1.setInterpolator(new a(2.00f));
             objectAnimat1.setDuration(500);
             objectAnimat1.addListener(new l$b(obj, b));
             if (b && (PostExperimentUtils.o0() > 0 && obj.y == null)) {
                if (!TextUtils.x(obj.E.mEntranceShowTitle)) {
                   magicEmojiEn = obj.E.mEntranceShowTitle;
                   i5 = null;
                }else {
                   magicEmojiEn = obj.z.mName;
                }
                l$d uod = new l$d(this, PostExperimentUtils.o0(), magicEmojiEn, i5, null);
                obj.y = i3;
                Objects.requireNonNull(i3);
                uod = l$d.class;
                this = null;
                if (!PatchProxy.applyVoid(this, i3, uod, "1")) {
                   Object[] objArray = new Object[i4];
                   a.D().w("face_cover", "start MagicOperationLocationStrengthenAnimation", objArray);
                   if (i3.g == null) {
                      AnimatorSet uAnimatorSet = PatchProxy.apply(this, i3, uod, "5");
                      if (uAnimatorSet != PatchProxyResult.class) {
                      }else {
                         uAnimatorSet = new AnimatorSet();
                         if (!a.e()) {
                            ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(i3.h.v, "alpha", new float[2]{0x3f800000,0});
                            objectAnimat2.setDuration(150);
                            ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(i3.h.v, "alpha", new float[2]{0,0x3f800000});
                            objectAnimat3.addListener(new q(i3));
                            objectAnimat3.setDuration(150);
                            ObjectAnimator objectAnimat4 = ObjectAnimator.ofFloat(i3.h.v, "alpha", new float[2]{0x3f800000,0});
                            objectAnimat4.setDuration(150);
                            objectAnimat4.setStartDelay((long)(((i3.e - 1) * 4000) + 2500));
                            objectAnimat4.addListener(new r(i3));
                            ObjectAnimator objectAnimat5 = ObjectAnimator.ofFloat(i3.h.v, "alpha", new float[2]{0,0x3f800000});
                            objectAnimat5.addListener(new s(i3));
                            objectAnimat5.setDuration(150);
                            if (!i3.h.o.getVisibility()) {
                               uAnimatorSet.play(objectAnimat2).before(objectAnimat3);
                               uAnimatorSet.play(objectAnimat3).before(objectAnimat4);
                               uAnimatorSet.play(objectAnimat4).before(objectAnimat5);
                            }else {
                               ObjectAnimator objectAnimat6 = i3.b(i3.h.w);
                               if (i3.e >= 2) {
                                  this = i3.a();
                               }
                               uAnimatorSet.play(objectAnimat2).before(objectAnimat3);
                               uAnimatorSet.play(objectAnimat3).before(objectAnimat6);
                               AnimatorSet$Builder uBuilder = uAnimatorSet.play(objectAnimat6);
                               if (this != null) {
                                  uBuilder.with(this);
                               }
                               uBuilder.with(objectAnimat4);
                               uAnimatorSet.play(objectAnimat4).before(objectAnimat5);
                            }
                         }else if(i3.h.o.getVisibility()){
                            AnimatorSet$Builder uBuilder1 = uAnimatorSet.play(i3.b(i3.h.w));
                            if (i3.e >= 2) {
                               uBuilder1.with(i3.a());
                            }
                            uAnimatorSet.setStartDelay(300);
                         }
                      }
                      i3.g = uAnimatorSet;
                      uAnimatorSet.start();
                   }
                }
             }
          label_0253 :
             objectAnimat.start();
             objectAnimat1.start();
          }
       }
       return;
    }
    public final void r2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "12")) {
          return;
       }
       l ty = this.y;
       if (ty != null) {
          Objects.requireNonNull(ty);
          if (!PatchProxy.applyVoid(objArray, ty, l$d.class, "2")) {
             Object[] objArray1 = new Object[0];
             a.D().w("face_cover", "cancel MagicOperationLocationStrengthenAnimation", objArray1);
             l$d g = ty.g;
             if (g != null) {
                ty.g = objArray;
                g.cancel();
                if (!PatchProxy.applyVoid(objArray, ty, l$d.class, "4")) {
                   l v = ty.h.v;
                   if (v != null) {
                      v.setAlpha(0x3f800000);
                      v = ty.h.v;
                      int i = (f.a())? 0x7f104a51: 0x7f100485;
                      v.w(a1.p(i), 0, 17);
                   }
                }
                if (!PatchProxy.applyVoid(objArray, ty, l$d.class, "3")) {
                   l r = ty.h.r;
                   if (r != null) {
                      r.setScaleX(0x3f800000);
                      ty.h.r.setScaleY(0x3f800000);
                   }
                }
             }
          }
       }
       return;
    }
    public void s2(){
       if (PatchProxy.applyVoid(null, this, l.class, "31")) {
          return;
       }
       l tB = this.B;
       if (tB != null) {
          tB.c();
       }
       this.B = null;
       this.A = null;
       this.C = null;
       return;
    }
    public void w1(Intent p0){
       Object[] objArray;
       long l;
       Object obj = this;
       Object[] obj1 = p0;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ol, "1")) {
          return;
       }
       super.w1(p0);
       obj.d.l(a.class, new e(obj));
       obj.d.l(c0.class, new d(obj));
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, ol, "5")) {
          ol = obj.d.d(l.i);
          int i = 0;
          if (ol.h != MagicBusinessId.VIDEO) {
             obj1 = new Object[i];
             a.D().w("face_cover", "don\'t support businessId", obj1);
          }else {
             ol = ol.a;
             String str = "";
             String str1 = "[magicface][keypath] ";
             if (n4.c(p0)) {
                a uoa = a.D();
                StringBuilder str2 = "handleEntranceCover has auto apply magic: ";
                if (obj1 != null) {
                   str = p0.toString();
                }
                objArray = new Object[i];
                uoa.E("face_cover", str1, str2+str, objArray);
                RxBus.f.b(new MagicEmojiEntrance());
             }else if(ol != null){
                objArray = new Object[i];
                a.D().E("face_cover", str1, "handleEntranceCover defulatMagic: "+ol.mName, objArray);
                RxBus.f.b(new MagicEmojiEntrance());
             }else {
                objArray = new Object[i];
                a.D().E("face_cover", "[magicface][keypath][remote] ", "/rest/n/magicFace/entrance start ", objArray);
                int i1 = (PostExperimentUtils.Z0())? a.X(): a.a0();
                int i2 = i1;
                String str3 = a.a.getString("magic_face_id_for_tip", str);
                try{
                   objArray = 0;
                   if (!TextUtils.x(str3)) {
                      long l1 = Long.parseLong(str3);
                   }
                }catch(java.lang.NumberFormatException e0){
                   PostUtils.D("face_cover", "parse MagicFaceIdForTip error", e0);
                }
                l = objArray;
                str3 = null;
                if (obj1 != null) {
                   str3 = j0.f(obj1, "photo_task_id");
                }
                obj.d.m(new a(true, true));
                c.a().t(MagicBusinessId.VIDEO.mId, l.e(), q.d, o5.c(this.f2()), this.g2(), o5.c(a.Z()), i2, l, str3).subscribe(new g(obj), new f(obj));
             }
          }
       }
       return;
    }
}
