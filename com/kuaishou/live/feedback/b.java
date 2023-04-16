package com.kuaishou.live.feedback.b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.misc.report.ReportInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kp.r1;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import com.kwai.component.photo.reduce.g;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.action.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QRecoTag;
import brd.t;
import cg5.c;
import com.kwai.framework.logger.a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import brd.x;
import cjd.e;
import erd.o;
import a43.d;
import sfc.a;
import erd.g;
import crd.b;
import com.kuaishou.live.feedback.a;
import bz5.a$c;
import bz5.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import a43.b;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.r0;
import e17.i;
import com.kuaishou.android.model.feed.PhotoType;
import jga.c;
import wca.b;
import y41.i$a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import y41.i;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo;
import lp3.e;
import bz5.b$a;
import bz5.b$b;
import java.util.Objects;
import a43.l;
import android.view.View$OnClickListener;
import a43.k;
import a43.j;
import a43.i;
import a43.h;
import a43.g;
import a43.f;
import lnc.i3;
import a43.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import k2b.u1;
import bz5.b;
import android.view.View;
import i2b.a;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import a43.c;
import java.lang.Number;
import ekd.l1;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Math;
import android.app.Activity;

public class b	// class@001bc4
{
    public a a;
    public ViewGroup b;
    public FollowHelper$a c;

    public void b(){
       super();
    }
    public final ReportInfo a(GifshowActivity p0,BaseFeed p1){
       ReportInfo obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ReportInfo();
       obj.mRefer = p0.getUrl();
       obj.mPreRefer = p0.U2();
       obj.mReportedUserId = r1.U1(p1);
       obj.mSourceType = "live";
       obj.mLiveId = r1.n1(p1);
       obj.mPhoto = p1;
       obj.mEntrySource = "live_audience_feedback_report";
       return obj;
    }
    public void b(String p0,String p1,BaseFeed p2,boolean p3,String p4,int p5){
       Object[] objArray;
       FeedNegativeFeedback$NegativeReason negativeReas1;
       object oobject = p0;
       object oobject1 = p2;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[]{oobject,p1,oobject1,Boolean.valueOf(p3),p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uob, "8")) {
             return;
          }
       }else {
          int i = this;
       }
       this.c();
       List list = g.b();
       if (q.f(list)) {
          return;
       }else {
          objArray = 0;
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                FeedNegativeFeedback$NegativeReason negativeReas = iterator.next();
                if (TextUtils.n(negativeReas.mId, p0)) {
                   negativeReas1 = negativeReas;
                }
             }else {
                negativeReas1 = objArray;
             }
             if (negativeReas1 == null) {
                break ;
             }else {
                c.a(9, oobject1);
                a uoa = new a("LIVE_REDUCE_RESULT", null, null, null, r1.O0(p2));
                d uod = new d(p2, p0, p4, p5, p3);
                c.g(new QPhoto(oobject1), 7, 1, negativeReas1, null, null, p1).compose(v9).map(new e()).subscribe(v7, new a());
                return;
             }
          }
          return;
       }
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b ta = this.a;
       if (ta == null) {
          return;
       }
       ta.b(new a(this));
       this.a = null;
       return;
    }
    public void d(String p0,LiveStreamFeed p1,String p2,String p3,int p4){
       b uob = b.class;
       int i = 3;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "9")) {
             return;
          }
       }
       this.c();
       b.a(p1, p0, p3, p4);
       if (!r0.d(a.b())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          objArray1[0] = r1.U1(p1);
          objArray1[1] = r1.n1(p1);
          objArray1[2] = r1.M0(p1);
          Object[] objArray2 = new Object[i];
          objArray2[0] = r1.U1(p1);
          objArray2[1] = r1.n1(p1);
          objArray2[2] = Integer.valueOf(PhotoType.LIVESTREAM.toInt());
          i$a uoa = new i$a(r1.n1(p1));
          uoa.o(p1.mUser);
          uoa.h(p2);
          uoa.d(String.format("%s_%s_l%s", objArray2));
          uoa.m(String.format("ks://live/%s/%s/%s", objArray1));
          uoa.f(b.c(p1));
          uoa.c(r1.M0(p1));
          uoa.q(0);
          uoa.n(150);
          uoa.e(this.c);
          i oi = uoa.a();
          if (TextUtils.n(p0, "1001")) {
             oi.c();
          }else if(TextUtils.n(p0, "1002")){
             oi.e();
          }
          return;
       }
    }
    public void e(ViewGroup p0,GifshowActivity p1,BaseFeed p2,boolean p3,String p4,List p5,int p6,c p7,boolean p8,LiveSceneInfoService$LiveSceneInfo p9,e p10){
       ClientEvent$ElementPackage obj1;
       String str1;
       b uob2;
       b uob3;
       PatchProxyResult patchProxyRe1;
       b$a uoa1;
       object oobject4;
       int b;
       ClientContent$ContentPackage uContentPack;
       int i6;
       b$b uob4;
       b$b uob5;
       Integer integer;
       String str2;
       b a;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       b uob1 = b.class;
       int i = 9;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 0;
       int i5 = 1;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray = new Object[11];
          objArray[i4] = oobject;
          objArray[i5] = oobject1;
          objArray[i3] = oobject2;
          objArray[i2] = Boolean.valueOf(p3);
          objArray[i1] = oobject3;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = Boolean.valueOf(p8);
          objArray[i] = p9;
          objArray[10] = p10;
          if (PatchProxy.applyVoid(objArray, obj, uob1, "2")) {
             return;
          }
       }
       if (p5.isEmpty()) {
          return;
       }else {
          b$a uoa = new b$a();
          Iterator iterator = p5.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (PatchProxy.isSupport(uob1)) {
                Object[] objArray1 = new Object[i];
                objArray1[i4] = str;
                objArray1[i5] = oobject1;
                objArray1[i3] = oobject2;
                objArray1[i2] = Boolean.valueOf(p3);
                objArray1[i1] = Boolean.valueOf(p8);
                objArray1[5] = oobject3;
                objArray1[6] = p7;
                objArray1[7] = p9;
                objArray1[8] = p10;
                obj1 = PatchProxy.apply(objArray1, obj, uob1, "5");
                if (obj1 != patchProxyRe) {
                label_009f :
                   str1 = str;
                   uob2 = uob1;
                   uob3 = uob;
                   patchProxyRe1 = patchProxyRe;
                   uoa1 = uoa;
                }else {
                label_00ac :
                   Objects.requireNonNull(str);
                   i6 = str.hashCode();
                   if (i6 != 1568) {
                      if (i6 != 1569) {
                         switch (i6){
                             case 0x170060:
                               if (str.equals("1001")) {
                                  i6 = 2;
                               }
                               break;
                             case 0x170061:
                               if (str.equals("1002")) {
                                  i6 = 3;
                               }
                               break;
                             case 0x170062:
                               if (str.equals("1003")) {
                                  i6 = 4;
                               }
                               break;
                             case 0x170063:
                               if (str.equals("1004")) {
                                  i6 = 5;
                               }
                               break;
                             case 0x170064:
                               if (str.equals("1005")) {
                                  i6 = 6;
                               }
                               break;
                             default:
                         }
                         switch (i6){
                             case 0:
                               str1 = str;
                               uob2 = uob1;
                               uob3 = uob;
                               patchProxyRe1 = patchProxyRe;
                               uoa1 = uoa;
                               f uof = new f(this, str1, p1, p2, p3, p4, p8);
                               uob4 = new b$b(0x7f0811b6, 0x7f104c63, oobject);
                            label_024f :
                               obj1 = uob4;
                               break;
                             case 1:
                               str1 = str;
                               uob2 = uob1;
                               uob3 = uob;
                               patchProxyRe1 = patchProxyRe;
                               uoa1 = uoa;
                               g og = new g(this, str1, p1, p2, p3, p4, p8);
                               uob4 = new b$b(0x7f0811b1, 0x7f1036cd, oobject);
                               goto label_024f ;
                               break;
                             case 2:
                               str1 = str;
                               uob2 = uob1;
                               uob3 = uob;
                               patchProxyRe1 = patchProxyRe;
                               uoa1 = uoa;
                               h oh = new h(this, str1, p2, p1, p4, p8);
                               uob5 = new b$b(0x7f0811b3, 0x7f100f8f, obj);
                            label_01f8 :
                               obj1 = uob5;
                               break;
                             case 3:
                               str1 = str;
                               uob2 = uob1;
                               uob3 = uob;
                               patchProxyRe1 = patchProxyRe;
                               uoa1 = uoa;
                               i oi = new i(this, str1, p2, p1, p4, p8);
                               uob5 = new b$b(0x7f0811b8, 0x7f104f05, obj);
                               goto label_01f8 ;
                               break;
                             case 4:
                               str1 = str;
                               patchProxyRe1 = patchProxyRe;
                               uoa1 = uoa;
                               j oj = i3;
                               j oj1 = i3;
                               uob2 = uob1;
                               uob3 = uob;
                               oj = new j(this, p8, str1, p1, p2, p4, p7, p9, p10);
                               obj1 = new b$b(0x7f0806f3, 0x7f10169b, oj1);
                               break;
                             case 5:
                               str1 = str;
                               k ok = i6;
                               k ok1 = i6;
                               patchProxyRe1 = patchProxyRe;
                               uoa1 = uoa;
                               ok = new k(this, p2, str1, p4, p8);
                               obj1 = new b$b(0x7f0811b9, 0x7f1030d5, ok1);
                               uob2 = uob1;
                               uob3 = uob;
                               int i7 = 9;
                               break;
                             case 6:
                               obj1 = new b$b(0x7f0811b5, 0x7f102c99, new l(obj, oobject1, oobject2));
                               goto label_009f ;
                               break;
                             default:
                               str1 = str;
                               uob2 = uob1;
                               uob3 = uob;
                               patchProxyRe1 = patchProxyRe;
                               uoa1 = uoa;
                               obj1 = null;
                         }
                      }else if(!str.equals("12")){
                         i6 = 1;
                         goto label_010c ;
                      }
                   }else if(!str.equals("11")){
                      i6 = 0;
                      goto label_010c ;
                   }
                   i6 = -1;
                   goto label_010c ;
                }
             }else {
                goto label_00ac ;
             }
             if (obj1 != null) {
                uoa1.a(obj1);
                oobject4 = oobject2;
                if (!PatchProxy.isSupport(uob3) || !PatchProxy.applyVoidThreeRefs(oobject4, str1, Integer.valueOf(p8), null, b.class, "2")) {
                   obj1 = new ClientEvent$ElementPackage();
                   obj1.action2 = "NEGATIVE_DIALOG_ITEM";
                   i3 oi3 = i3.f();
                   oi3.d("negative_type", m.a(str1));
                   obj1.params = oi3.e();
                   uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = x.e(oobject4, p8);
                   u1.u0(3, obj1, uContentPack);
                label_02a4 :
                   obj = this;
                   uoa = uoa1;
                   patchProxyRe = patchProxyRe1;
                   uob1 = uob2;
                   uob = uob3;
                   i5 = 1;
                   i3 = 2;
                   i2 = 3;
                   i1 = 4;
                   i = 9;
                }
             }
             b = 3;
             goto label_02a4 ;
          }
          uob2 = uob1;
          patchProxyRe1 = patchProxyRe;
          uoa1 = uoa;
          oobject4 = oobject2;
          if (PatchProxy.applyVoidTwoRefs(oobject3, oobject4, null, uob, "1")) {
             integer = 1;
          }else {
             obj1 = new ClientEvent$ElementPackage();
             obj1.action2 = "NEGATIVE_DIALOG";
             uContentPack = new ClientContent$ContentPackage();
             integer = 1;
             ClientContent$LiveStreamPackage liveStreamPa = x.e(oobject4, integer);
             liveStreamPa.sessionId = oobject3;
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u0(4, obj1, uContentPack);
          }
          uob1 = uoa1.b();
          if (PatchProxy.isSupport(uob2)) {
             str2 = -1;
             if (PatchProxy.applyVoidFourRefs(uob1, p0, p1, Integer.valueOf(p6), this, b.class, "1")) {
                i6 = this;
             label_040d :
                return;
             }
          }else {
             str2 = -1;
          }
          ViewGroup viewGroup = this;
          b uob6 = uob2;
          if (!PatchProxy.applyVoidOneRefs(oobject1, viewGroup, uob6, "6") && viewGroup.b == null) {
             viewGroup.b = a.a(oobject1, 0x7f0d0fe0);
          }
          Object obj2 = p0;
          if (!PatchProxy.applyVoidOneRefs(obj2, viewGroup, uob6, "7")) {
             b b1 = viewGroup.b;
             if (b1 != null) {
                if (b1.getParent() != null) {
                   viewGroup.b.getParent().removeView(viewGroup.b);
                }
                if (obj2 != null) {
                   obj2.addView(viewGroup.b, new ViewGroup$LayoutParams(str2, str2));
                }
                viewGroup.b.setOnClickListener(new c(viewGroup));
             }
          }
          viewGroup.a = new a(uob1, viewGroup.b);
          int[] obj3 = PatchProxy.applyOneRefs(obj2, viewGroup, uob6, "14");
          PatchProxyResult patchProxyRe2 = patchProxyRe1;
          if (obj3 != patchProxyRe2) {
             b = obj3.intValue();
          }else {
             obj3 = new int[2];
             obj2.getLocationOnScreen(obj3);
             b = obj3[integer];
          }
          if (PatchProxy.isSupport(uob6)) {
             Object obj4 = PatchProxy.applyTwoRefs(oobject1, Integer.valueOf(b), viewGroup, uob6, "13");
             if (obj4 != patchProxyRe2) {
                i2 = obj4.intValue();
             label_03b4 :
                b = p6 - b;
                a = viewGroup.a;
                if (PatchProxy.isSupport(uob6)) {
                   Object obj5 = PatchProxy.applyThreeRefs(Integer.valueOf(b), p1, Integer.valueOf(i2), this, b.class, "12");
                   if (obj5 != patchProxyRe2) {
                      b = obj5.intValue();
                   }else if((float)b - (a.g + (float)i2) < 0){
                      b = Math.max(b, i2);
                   }else {
                      b = Math.min(b, (n.j(p1) - a1.d(R.dimen.arg_RES_7f07076a)));
                   }
                }else {
                   goto label_03e3 ;
                }
                a.c((float)b, p0.getHeight(), n.k(p1), i2);
                goto label_040d ;
             }
          }
          if (!l1.a(p1)) {
             i4 = n.A(p1);
          }
          i2 = (i4 + a1.d(0x7f07076b)) - b;
          goto label_03b4 ;
       }
    }
}
