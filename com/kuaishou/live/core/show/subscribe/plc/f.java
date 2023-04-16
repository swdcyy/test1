package com.kuaishou.live.core.show.subscribe.plc.f;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo$LiveSubscribeStat;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import hy2.c;
import android.content.Context;
import mz6.a;
import mz6.b$d;
import mz6.b;
import zk2.g;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zk2.q;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import y41.i$a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import y41.i;
import java.util.Objects;
import jga.f$a;
import jga.f;
import erd.g;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import pk2.c;
import pk2.b;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.subscribe.plc.c;
import com.kuaishou.live.core.show.subscribe.plc.LiveSubscribeHalfDialogEvent$EventType;
import tkd.b;
import tkd.d;
import nl9.u;
import ol9.a;
import u06.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.live.core.show.subscribe.plc.LiveSubscribeHalfDialogEvent;
import java.util.Map;
import com.kwai.framework.model.user.QCurrentUser;
import zk2.k;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import com.kuaishou.live.core.show.subscribe.plc.d;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.live.core.show.subscribe.plc.a;
import crd.b;
import zk2.m;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import zk2.p;
import com.kuaishou.live.core.show.subscribe.plc.b;
import zk2.l;

public class f	// class@001160
{

    public void f(){
       super();
    }
    public static t a(Activity p0,QPhoto p1,String p2,String p3,boolean p4,boolean p5,LiveSubscribeStatInfo p6){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object obj = null;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,Boolean.valueOf(p4),Boolean.valueOf(p5),oobject4};
          Object obj1 = PatchProxy.apply(objArray, obj, uof, "7");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (!f.f(p6)) {
          return f.h(p0, p1, oobject4, p5, p3);
       }else if(f.g(p1, p3)){
          return t.empty();
       }else {
          LiveSubscribeStatInfo mLiveSubscri = oobject4.mLiveSubscribeStat;
          if (mLiveSubscri.mDisableCancel != null) {
             LiveSubscribeStatInfo$LiveSubscribeStat mDisableCanc = mLiveSubscri.mDisableCancelTips;
             t ot = PatchProxy.applyOneRefs(mDisableCanc, obj, uof, "13");
             if (ot != patchProxyRe) {
             }else if(!TextUtils.x(mDisableCanc)){
                i.d(R.style.arg_RES_7f11066a, mDisableCanc);
             }
             ot = t.empty();
             return ot;
          }else if(p4){
             if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "14")) {
                c uoc = new c(p0);
                a uoa = a.b();
                uoa.i(0);
                uoa.o(R.color.arg_RES_7f061767);
                uoa.g(R.string.arg_RES_7f100fdf);
                uoc.a(uoa.a());
                uoc.l(new g(p0, p1, p2));
                uoc.q();
             }
             return t.empty();
          }else {
             return f.i(p0, p1, p2);
          }
       }
    }
    public static void b(Activity p0,QPhoto p1,String p2,int p3,FollowHelper$a p4){
       Object[] objArray;
       String liveStreamId;
       f uof = f.class;
       int i = 4;
       int i1 = 5;
       if (PatchProxy.isSupport(uof)) {
          objArray = new Object[i1];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[i] = p4;
          if (PatchProxy.applyVoid(objArray, null, uof, "11")) {
             return;
          }
       }
       if (p0 instanceof GifshowActivity) {
       }else {
          p0 = null;
       }
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          objArray = new Object[i1];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[i] = p4;
          if (!PatchProxy.applyVoid(objArray, null, oq, "1")) {
          label_0052 :
             if (p1 != null && !TextUtils.x(p1.getLiveStreamId())) {
                liveStreamId = p1.getLiveStreamId();
             }else {
                b.B(LiveLogTag.LIVE_SUBSCRIBE, "[LiveSubscribeSuccessUtils][followUser]liveStreamId is null");
                liveStreamId = null;
             }
             i$a uoa = new i$a(p0, liveStreamId).p(p2);
             uoa.n(p3);
             uoa.q(1);
             uoa.e(p4);
             if (p1 != null) {
                p2 = r1.M0(p1.mEntity);
                Object[] objArray1 = new Object[]{r1.U1(p1.mEntity),r1.n1(p1.mEntity),p2};
                uoa.d(p1.getFullSource());
                uoa.c(p2);
                uoa.m(String.format("ks://live/%s/%s/%s", objArray1));
             }
             i oi = uoa.a();
             Objects.requireNonNull(oi);
             if (!PatchProxy.applyVoid(null, oi, i.class, "3")) {
                f$a uoa1 = oi.a();
                if (uoa1 == null) {
                   b.Z(LiveLogTag.LIVE_DO_FOLLOW, "[LiveFollowHelper][doFollowUser]: paramsBuilder == null");
                }else {
                   FollowHelper.e(uoa1.b(), oi.s, oi.t, oi.u);
                }
             }
          }
       }else {
          goto label_0052 ;
       }
       return;
    }
    public static t c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().a(p0).map(new e()).doOnNext(c.b);
    }
    public static void d(QPhoto p0,boolean p1,LiveSubscribeHalfDialogEvent$EventType p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, f.class, "10")) {
          return;
       }
       if (p0 != null) {
          u ou = d.a(-1694791652);
          String photoId = p0.getPhotoId();
          int i = (p1)? 1: 2;
          ou.Nb(photoId, 1, i);
          d.a(0x4ffa335e).Lv(p0, p1);
          d.a(-1575111559).Nc(p0.getPhotoId());
       }
       RxBus.f.b(new LiveSubscribeHalfDialogEvent(p2));
       return;
    }
    public static void e(Activity p0,Map p1,Map p2){
       Object[] objArray;
       d uod;
       m om;
       object oobject = p0;
       object oobject1 = p1;
       Map map = p2;
       f uof = f.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "1")) {
          return;
       }
       Object obj = map.get("QPhoto");
       Object obj1 = p1.get("reservationId");
       Object obj2 = p1.get("source");
       if (TextUtils.x(obj1)) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "3")) {
             y.a(p0, null, "live_subscribe_directly_action", 0, null, null, 0, 0, new k(p0, p1, map));
          }
       }else {
          Object obj3 = null;
          int i = 4;
          int i1 = 3;
          if (Boolean.TRUE.equals(map.get("shouldShowDialog"))) {
             if (PatchProxy.isSupport(uof)) {
                objArray = new Object[]{oobject,obj,obj1,obj2,oobject1};
                if (!PatchProxy.applyVoid(objArray, obj3, uof, "4")) {
                }
             }else {
             }
          }else if(PatchProxy.isSupport(uof)){
             objArray = new Object[]{oobject,obj,obj1,obj2,oobject1};
             if (!PatchProxy.applyVoid(objArray, obj3, uof, "2")) {
             }
          }else {
          }
       }
    label_00e8 :
       return;
    }
    public static boolean f(LiveSubscribeStatInfo p0){
       boolean b = (p0.mLiveSubscribeStat.mBookStatus == LiveSubscribeBookStatus.BOOKED)? true: false;
       return b;
    }
    public static boolean g(QPhoto p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p.a(p0, p1) == 24)? true: false;
       return b;
    }
    public static t h(Activity p0,QPhoto p1,LiveSubscribeStatInfo p2,boolean p3,String p4){
       c obj;
       f uof = f.class;
       String str = null;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, str, uof, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LiveSubscribeStatInfo$LiveSubscribeStat mSubscribeId = p2.mLiveSubscribeStat.mSubscribeId;
       obj = b.b();
       int i = p.a(p1, p4);
       if (p1 != null) {
          str = p1.getUserId();
       }
       b uob = new b(p1, mSubscribeId, p4, p2, p0, p3);
       return obj.A0(mSubscribeId, i, str).map(new e()).doOnNext(i);
    }
    public static t i(Activity p0,QPhoto p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().y0(p2).map(new e()).doOnNext(new l(p1, p2, p0));
    }
}
