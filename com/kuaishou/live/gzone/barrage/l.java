package com.kuaishou.live.gzone.barrage.l;
import k51.c;
import com.kuaishou.live.gzone.barrage.l$a;
import java.lang.reflect.Type;
import el.a;
import lnc.a1;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import b53.t0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import java.util.List;
import v37.a;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.util.LinkedHashMap;
import pm8.a;
import p91.m;
import java.lang.Integer;
import com.kwai.live.gzone.barrage.LiveGzoneColorBarrageRight;
import kg1.g;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mrd.a;
import java.util.Iterator;
import android.view.View;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.live.gzone.barrage.k;
import java.lang.Runnable;
import ekd.k1;
import android.widget.ImageView;
import bjd.d;
import bb6.c;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import java.util.Map;
import java.util.Collections;
import com.airbnb.lottie.LottieAnimationView;
import b53.c0;
import android.view.View$OnLayoutChangeListener;
import brd.t;
import b53.f0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b53.e0;
import com.kuaishou.live.gzone.barrage.l$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import b53.u0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.popup.common.c;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.EditText;
import b53.g0;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewStub;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kuaishou.live.gzone.barrage.j;
import android.view.View$OnClickListener;

public class l extends c	// class@001c3f
{
    public LiveLottieAnimationView A;
    public List B;
    public View C;
    public RecyclerView D;
    public a E;
    public View$OnLayoutChangeListener F;
    public int G;
    public int H;
    public View$OnLayoutChangeListener I;
    public boolean p;
    public LinkedHashMap q;
    public LinkedHashMap r;
    public final BaseEditorFragment s;
    public final t0 t;
    public ViewGroup u;
    public View v;
    public boolean w;
    public a0 x;
    public ImageView y;
    public View z;
    public static final Type J;
    public static final int K;
    public static String sLivePresenterClassName;

    static {
       l.J = new l$a().getType();
       l.K = a1.e(4.00f);
    }
    public void l(BaseEditorFragment p0){
       super();
       this.t = new t0();
       this.s = p0;
    }
    public void E8(){
       SharedPreferences a;
       String str1;
       LiveGzoneColorBarrageRight mColorValue;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       if (this.u == null) {
          return;
       }
       List list = this.x.X2.a();
       this.B = list;
       if (q.f(list)) {
          return;
       }
       BaseEditorFragment m = this.s.M;
       u0 ou0 = null;
       BaseEditorFragment$Arguments mCancelWhenK = (m != null)? m.mCancelWhenKeyboardHidden: false;
       this.w = mCancelWhenK;
       this.P8();
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, ol, "7")) {
          LinkedHashMap linkedHashMa1 = a.J(l.J);
          str1 = this.x.Z2.d();
          if (linkedHashMa1 != null) {
             Integer integer = linkedHashMa1.get(str1);
             if (integer != null && integer.intValue() > 0) {
                int i2 = 0;
                while (true) {
                   if (i2 < this.B.size()) {
                      if (this.B.get(i2).mLevel == integer.intValue()) {
                         mColorValue = this.B.get(i2).mColorValue;
                      label_0084 :
                         if (integer.intValue() <= this.x.r1.w8() && (this.x.r1.Qi().mStatus != b || TextUtils.x(mColorValue))) {
                            linkedHashMa1.put(str1, Integer.valueOf(ou0));
                            a.o1(linkedHashMa1);
                         }else {
                            this.s.Zh(mColorValue);
                            this.s.Yh(this.B.get(i2).mLevel);
                            this.t.a.onNext(Integer.valueOf(i2));
                         }
                      }else {
                         i2 = i2 + 1;
                      }
                   }else {
                      mColorValue = objArray;
                      i2 = null;
                      goto label_0084 ;
                   }
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "4")) {
          if (this.x.r1.Qi().mStatus == b) {
             LinkedHashMap linkedHashMa = a.I(l.J);
             String str = this.x.Z2.d();
             int i = (linkedHashMa != null && linkedHashMa.get(str) != null)? linkedHashMa.get(str).intValue(): 0;
             Iterator iterator = this.B.iterator();
             int i1 = 0;
             while (iterator.hasNext()) {
                LiveGzoneColorBarrageRight mLevel = iterator.next().mLevel;
                if (this.x.r1.w8() >= mLevel) {
                   i1 = mLevel;
                }else {
                   continue ;
                }
             }
             if (i1 > i) {
                this.G = i1;
                this.z.setVisibility(ou0);
             }
          }
          a = a.a;
          str1 = "user";
          if (!a.getBoolean(b.d(str1)+"is_live_gzone_color_barrage_bubble_displayed", ou0)) {
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean(b.d(str1)+"is_live_gzone_color_barrage_bubble_displayed", b);
             g.a(uEditor);
             k1.s(new k(this), this, 200);
             this.A.setVisibility(ou0);
             this.A.setAnimationFromUrl(c.a().h(CdnHostGroupType.GAME.getTypeName(), "udata/pkg/kwai-client-image/gzone/live_gzone_color_barrage_icon_lottie_v3.json", Collections.emptyMap()));
             this.y.setVisibility(4);
          }
       }
       ol = this.C;
       if (ol != null) {
          c0 uoc0 = new c0(this);
          this.I = uoc0;
          ol.addOnLayoutChangeListener(uoc0);
       }
       this.X7(this.t.a.skip(1).subscribe(new f0(this)));
       ol = this.s;
       ol.X = new e0(this);
       ol.A = new l$b(this);
       LiveFansGroupIntimacyInfo mStatus = this.x.r1.Qi().mStatus;
       ClientContent$LiveStreamPackage liveStreamPa = this.x.Z2.a();
       ou0 = u0.class;
       if (!PatchProxy.isSupport(ou0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(mStatus), liveStreamPa, objArray, ou0, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COLORFUL_COMMENT_ENTRY_BUTTON";
          uElementPack.params = u0.a(mStatus);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(6, uElementPack, uContentPack);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "11")) {
          return;
       }
       l tD = this.D;
       if (tD != null) {
          tD.setAdapter(objArray);
       }
       tD = this.E;
       if (tD != null) {
          tD.o();
       }
       k1.n(this);
       if (this.F != null) {
          ViewGroup parent = this.m8().getParent();
          if (parent != null) {
             parent.removeOnLayoutChangeListener(this.F);
          }
       }
       tD = this.C;
       if (tD != null) {
          l tI = this.I;
          if (tI != null) {
             tD.removeOnLayoutChangeListener(tI);
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "10")) {
          return;
       }
       this.y.setImageResource(R.drawable.arg_RES_7f081247);
       this.y.setPadding(l.K, l.K, l.K, l.K);
       return;
    }
    public void R8(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "9")) {
          return;
       }
       k1.n(this);
       this.y.setSelected(false);
       this.P8();
       if (p0) {
          this.s.Kh().requestFocus();
          this.s.fi();
       }
       this.u.setVisibility(8);
       k1.s(new g0(this), this, 0);
       l tC = this.C;
       if (tC != null && tC.getLayoutParams() instanceof LinearLayout$LayoutParams) {
          tC.weight = 0x3f800000;
          tC.height = 0;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       View view = p0.findViewById(R.id.placeholder_wrapper);
       this.C = view;
       if (view == null) {
          this.C = p0.findViewById(0x7f0a30b0);
       }
       ViewGroup viewGroup = p0.findViewById(R.id.live_gzone_color_barrage_container);
       this.u = viewGroup;
       if (viewGroup == null) {
          return;
       }else {
          ViewStub viewStub = p0.findViewById(R.id.live_gzone_color_barrage_button_stub);
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d0b9f);
          viewStub = viewStub.inflate();
          this.y = viewStub.findViewById(0x7f0a1ea0);
          this.z = viewStub.findViewById(0x7f0a1ea4);
          this.A = viewStub.findViewById(0x7f0a1ea3);
          viewStub.setOnClickListener(new j(this));
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.x = this.q8(a0.class);
       return;
    }
}
