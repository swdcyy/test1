package com.yxcorp.gifshow.share.KwaiOperator;
import com.yxcorp.gifshow.share.KwaiOperator$a;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.KwaiOperator$Style;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mhc.v1;
import mhc.p0;
import java.lang.Enum;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kwai.feature.api.social.message.imshare.model.SharePosInfo;
import com.yxcorp.gifshow.share.KwaiOperator$b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import xxb.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import brd.t;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.share.OperationModel$Type;
import kotlin.Pair;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.app.Activity;
import mhc.t0;
import io.reactivex.g;
import mhc.q1;
import com.kuaishou.gifshow.forward.config.ForwardPanelConfigV2;
import com.kwai.framework.model.feed.BaseFeed;
import wkd.b;
import nic.a;
import java.util.concurrent.TimeUnit;
import mhc.q0;
import erd.o;
import mhc.r0;
import erd.g;
import mhc.s0;
import t45.d;
import brd.z;
import mhc.w0;
import mhc.a1;
import mhc.c1;
import mhc.m1;
import crd.b;
import msd.p;
import com.yxcorp.gifshow.share.KwaiOperator$createOpClickListener$1;
import mhc.o0;
import msd.q;
import com.yxcorp.gifshow.share.KwaiOperator$createOpShowListener$1;
import android.app.Dialog;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public final class KwaiOperator	// class@001b4d
{
    public Class a;
    public Object b;
    public int c;
    public o0 d;
    public MerchantForwardFragment$d e;
    public String f;
    public boolean g;
    public s h;
    public SharePosInfo i;
    public ProgressFragment j;
    public Runnable k;
    public final GifshowActivity l;
    public final OperationModel m;
    public final KwaiOperator$Style n;
    public final v1 o;
    public final List p;
    public static final KwaiOperator$a q;

    static {
       KwaiOperator.q = new KwaiOperator$a(null);
    }
    public void KwaiOperator(GifshowActivity p0,OperationModel p1,KwaiOperator$Style p2,List p3){
       a.p(p0, "activity");
       a.p(p1, "model");
       a.p(p2, "style");
       a.p(p3, "factories");
       super(p0, p1, p2, null, p3);
    }
    public void KwaiOperator(GifshowActivity p0,OperationModel p1,KwaiOperator$Style p2,v1 p3){
       super(p0, p1, p2, p3, null);
    }
    public void KwaiOperator(GifshowActivity p0,OperationModel p1,KwaiOperator$Style p2,v1 p3,List p4){
       Integer integer;
       a.p(p0, "activity");
       a.p(p1, "model");
       a.p(p2, "style");
       a.p(p4, "factories");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       int i = p0.a[p2.ordinal()];
       int i1 = 1;
       if (i != i1 && i != 2) {
          if (i == 3) {
             i1 = 0;
          }
       }else if(p4 != null){
          integer = Integer.valueOf(p4.size());
       }else {
          integer = null;
       }
       i1 = integer.intValue();
       if (i1 <= 0 || i1 == p4.size()) {
          this.i = new SharePosInfo();
          this.k = new KwaiOperator$b(this);
          return;
       }else {
          throw new IllegalArgumentException("style "+p2+" need "+i1+" factories");
       }
    }
    public void KwaiOperator(GifshowActivity p0,OperationModel p1,KwaiOperator$Style p2,v1 p3,v1 p4){
       a.p(p0, "activity");
       a.p(p1, "model");
       a.p(p2, "style");
       a.p(p3, "factory1");
       v1[] ov1Array = new v1[]{p3,p4};
       super(p0, p1, p2, null, CollectionsKt__CollectionsKt.N(ov1Array));
    }
    public void KwaiOperator(GifshowActivity p0,OperationModel p1,KwaiOperator$Style p2,v1 p3,v1 p4,v1 p5){
       a.p(p0, "activity");
       a.p(p1, "model");
       a.p(p2, "style");
       a.p(p3, "factory");
       a.p(p4, "factory1");
       v1[] ov1Array = new v1[]{p4,p5};
       super(p0, p1, p2, p3, CollectionsKt__CollectionsKt.N(ov1Array));
    }
    public static void r(KwaiOperator p0,b p1,boolean p2,boolean p3,boolean p4,boolean p5,long p6,boolean p7,int p8,Object p9){
       t ot;
       object oobject1;
       boolean b5;
       boolean b6;
       t ot2;
       OperationModel a;
       Integer integer1;
       ForwardPanelConfigV2 uForwardPane1;
       Integer integer2;
       Pair pair;
       int i2;
       Object obj = p0;
       object oobject = (p8 & 0x01)? null: p1;
       int i = 0;
       boolean b = (p8 & 0x02)? false: p2;
       boolean b1 = (p8 & 0x04)? true: p3;
       boolean b2 = (p8 & 0x08)? false: p4;
       boolean b3 = (p8 & 0x10)? false: p5;
       long l = (p8 & 0x20)? -1: p6;
       boolean b4 = (p8 & 0x40)? false: p7;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiOperator kwaiOperator = KwaiOperator.class;
       Integer integer = Integer.valueOf(i);
       int i1 = 3;
       if (PatchProxy.isSupport(kwaiOperator)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(b),Boolean.valueOf(b1),Boolean.valueOf(b2),Boolean.valueOf(b3),Long.valueOf(l),Boolean.valueOf(b4)};
          if (PatchProxy.applyVoid(objArray, obj, kwaiOperator, "8")) {
          label_02c9 :
             return;
          }
       }
       if (b1) {
          ot = PatchProxy.apply(null, obj, kwaiOperator, "16");
          if (ot != patchProxyRe) {
          }else {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (qCurrentUser.isLogined()) {
                ot = t.just(Boolean.TRUE);
                a.o(ot, "Observable.just\(true\)");
             }else {
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                String str1 = 37;
                b5 = 30;
                switch (p0.c[obj.m.q().ordinal()]){
                    case 1:
                      pair = new Pair("qr_code_share", integer);
                      break;
                    case 2:
                      pair = new Pair("profile_share", Integer.valueOf(b5));
                      break;
                    case 3:
                      pair = new Pair("photo_share", integer);
                      break;
                    case 4:
                      pair = new Pair("live_push_share", Integer.valueOf(str1));
                      break;
                    case 5:
                      pair = new Pair("live_play_share", Integer.valueOf(str1));
                      break;
                    case 6:
                      pair = new Pair("page_detail_share", Integer.valueOf(b5));
                      break;
                    default:
                      pair = new Pair("unknown", integer);
                }
                objectRef.element = pair;
                if (obj.m.q() == OperationModel$Type.PHOTO) {
                   Object first = objectRef.element.getFirst();
                   String str2 = obj.l.U2();
                   if (str2 != null) {
                      b5 = b;
                      oobject1 = oobject;
                      b6 = b4;
                      if (StringsKt__StringsKt.O2(str2, "ks://profile", i, 2, null) == true) {
                         i2 = 29;
                      label_0151 :
                         objectRef.element = new Pair(first, Integer.valueOf(i2));
                      }
                   }else {
                      oobject1 = oobject;
                      b5 = b;
                      b6 = b4;
                   }
                   i2 = 16;
                   goto label_0151 ;
                }else {
                   oobject1 = oobject;
                   b5 = b;
                   b6 = b4;
                }
                String str3 = obj.l.getString(R.string.arg_RES_7f103082);
                a.o(str3, "activity.getString\(R.string.login_prompt_share\)");
                ot = t.create(new t0(obj, objectRef, str3));
                a.o(ot, "Observable.create { emit¡­ }.launch\(\)\n      }\n    }");
             }
          }
          oobject1 = oobject;
          b5 = b;
          b6 = b4;
       }else {
          oobject1 = oobject;
          b5 = b;
          b6 = b4;
          ot = t.just(Boolean.TRUE);
       }
       a.o(ot, "login");
       KwaiOperator m = obj.m;
       t ot1 = PatchProxy.applyTwoRefs(ot, m, obj, kwaiOperator, "4");
       if (ot1 != patchProxyRe) {
       }else {
          a.p(ot, "loginObservable");
          a.p(m, "model");
          q1 obj1 = PatchProxy.applyOneRefs(m, obj, kwaiOperator, "6");
          if (obj1 != patchProxyRe) {
             ot2 = obj1;
          }else {
             obj1 = q1.c;
             obj1.h(null);
             a = m.a;
             if (a == null) {
                OperationModel obj2 = PatchProxy.applyOneRefs(m, obj, kwaiOperator, "5");
                if (obj2 != patchProxyRe) {
                   integer1 = obj2;
                label_0220 :
                   ForwardPanelConfigV2 uForwardPane = (integer1 != null && (integer1.intValue() == 3 && m.d == null))? "liveStreamRedPack": null;
                   obj2 = m.g;
                   if (obj2 == null) {
                      if (integer1 != null && (integer1.intValue() == 1 || (integer1 != null && integer1.intValue() == 3))) {
                         BaseFeed uBaseFeed = m.i();
                         if (uBaseFeed != null) {
                            uForwardPane1 = uBaseFeed.getId();
                         }
                      }
                      uForwardPane1 = null;
                   }
                   ot2 = b.a(0x6af2a3ec).b(integer1, a, uForwardPane, obj2).timeout(1, TimeUnit.SECONDS).onErrorReturn(q0.b).doOnNext(new r0(obj, m)).map(s0.b);
                   if (a != null || integer1 != null) {
                      i = 1;
                   }
                   if (!i) {
                      ot2 = null;
                   }
                }else {
                   String str = obj1.e(m);
                   switch (str.hashCode()){
                       case 0xbf05c295:
                         if (str.equals("QR_CODE_PROFILE")) {
                            integer1 = Integer.valueOf(10);
                            goto label_0220 ;
                         }
                         break;
                       case 0xed8e89a9:
                         if (str.equals("profile")) {
                            integer1 = Integer.valueOf(2);
                            goto label_0220 ;
                         }
                         break;
                       case 0x65b3e32:
                         if (str.equals("photo")) {
                            integer2 = Integer.valueOf(1);
                         label_0200 :
                            integer1 = integer2;
                            goto label_0220 ;
                         }
                         break;
                       case 0x33e78b8c:
                         if (str.equals("liveStream")) {
                            integer2 = Integer.valueOf(3);
                            goto label_0200 ;
                         }
                         break;
                       case 0x7eb43512:
                         if (str.equals("PHOTO_COMMENT")) {
                            integer1 = Integer.valueOf(14);
                            goto label_0220 ;
                         }
                         break;
                       default:
                   }
                }
             }
             integer1 = null;
             goto label_0220 ;
          }
          ot1 = ot.subscribeOn(d.c).flatMap(w0.b).flatMap(new a1(obj, ot2)).flatMap(new c1(ot2));
          a.o(ot1, "loginObservable.subscrib¡­.just\(loginResult \)\n    }");
       }
       m1 om1 = new m1(p0, b2, b3, l, b6, oobject1, b5);
       ot1.observeOn(d.a).subscribe(ot);
       goto label_02c9 ;
    }
    public final p a(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiOperator.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiOperator$createOpClickListener$1(this, p0);
    }
    public final q b(o0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiOperator.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiOperator$createOpShowListener$1(p0);
    }
    public final GifshowActivity c(){
       return this.l;
    }
    public final int d(){
       return this.c;
    }
    public final Dialog e(){
       KwaiOperator tb = this.b;
       if (!tb instanceof Dialog) {
          tb = null;
       }
       return tb;
    }
    public final o0 f(){
       return this.d;
    }
    public final List g(){
       return this.p;
    }
    public final v1 h(){
       return this.o;
    }
    public final OperationModel i(){
       return this.m;
    }
    public final ProgressFragment j(){
       return this.j;
    }
    public final SharePosInfo k(){
       return this.i;
    }
    public final KwaiOperator$Style l(){
       return this.n;
    }
    public final void m(o0 p0){
       this.d = p0;
    }
    public final void n(Object p0){
       this.b = p0;
    }
    public final void o(ProgressFragment p0){
       this.j = p0;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, KwaiOperator.class, "15")) {
          return;
       }
       KwaiOperator.r(this, null, false, false, false, false, 0, false, 127, null);
       return;
    }
    public final void q(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiOperator.class, "14")) {
          return;
       }
       KwaiOperator.r(this, p0, false, false, false, false, 0, false, 126, null);
       return;
    }
}
