package com.yxcorp.gifshow.detail.slideplay.c;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPreInfo;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import erd.g;
import java.util.HashMap;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import gx5.d;
import vu5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.util.List;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qvb.i;
import rma.c;
import uh5.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g3a.a;
import wvb.e;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import com.kuaishou.android.model.feed.PhotoType;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import g9c.d;
import java.util.ArrayList;
import d6a.s;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import android.app.Activity;
import vw5.f;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import lyb.v;

public class c	// class@001720
{

    public void c(){
       super();
    }
    public static void a(GifshowActivity p0,QPhoto p1,QPreInfo p2,int p3,boolean p4,View$OnClickListener p5){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uoc, "8")) {
             return;
          }
       }
       c.b(p0, p1, p2, p3, p4, p5, null);
       return;
    }
    public static void b(GifshowActivity p0,QPhoto p1,QPreInfo p2,int p3,boolean p4,View$OnClickListener p5,g p6){
       if (PatchProxy.isSupport2(c.class, "9")) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4),p5,p6};
          if (PatchProxy.applyVoid(objArray, null, c.class, "9")) {
             return;
          }
       }
       c.c(p0, p1, p2, p3, p4, p5, p6, null);
       PatchProxy.onMethodExit(c.class, "9");
       return;
    }
    public static void c(GifshowActivity p0,QPhoto p1,QPreInfo p2,int p3,boolean p4,View$OnClickListener p5,g p6,HashMap p7){
       if (PatchProxy.isSupport2(c.class, "10")) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4),p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, null, c.class, "10")) {
             return;
          }
       }
       c.d(p0, p1, p2, p3, p4, p5, p6, p7, null);
       PatchProxy.onMethodExit(c.class, "10");
       return;
    }
    public static void d(GifshowActivity p0,QPhoto p1,QPreInfo p2,int p3,boolean p4,View$OnClickListener p5,g p6,HashMap p7,String p8){
       Object[] objArray;
       boolean b;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       object oobject4 = p6;
       object oobject5 = p7;
       object oobject6 = p8;
       String obj = null;
       if (PatchProxy.isSupport2(c.class, "11")) {
          objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = oobject3;
          objArray[6] = oobject4;
          objArray[7] = oobject5;
          objArray[8] = oobject6;
          if (PatchProxy.applyVoid(objArray, obj, c.class, "11")) {
             return;
          }
       }
       if (VisitorModeManager.f()) {
          PatchProxy.onMethodExit(c.class, "11");
          return;
       }else if(p4 && oobject3 != null){
          oobject3.onClick(obj);
          PatchProxy.onMethodExit(c.class, "11");
          return;
       }else {
          Object obj1 = PatchProxy.applyTwoRefs(oobject, oobject1, obj, c.class, "13");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(!p0.a3() && d.a(-1188553266).VA(p0.U2(), p1.getUserId())){
             p0.finish();
             b = true;
          }else {
             b = false;
          }
          if (b) {
             PatchProxy.onMethodExit(c.class, "11");
             return;
          }else if(PatchProxy.isSupport2(c.class, "12")){
             objArray = new Object[]{oobject,oobject1,oobject2,Integer.valueOf(p3),oobject4,oobject5,oobject6};
             obj = null;
             if (PatchProxy.applyVoid(objArray, obj, c.class, "12")) {
             label_00f3 :
                PatchProxy.onMethodExit(c.class, "11");
                return;
             }
          }else {
             obj = null;
          }
          oobject.m3(obj);
          ProfileStartParam profileStart = ProfileStartParam.k(oobject1.mEntity);
          profileStart.q(c.e(p1));
          profileStart.A(oobject2);
          profileStart.z(p3);
          ProfileStartParam profileStart1 = profileStart.n(ProfileExtraKey.AD_CALLBACK_PARAM, oobject6);
          profileStart1.p(oobject4);
          profileStart1.D(oobject5);
          d.a(-1718536792).Y7(oobject, profileStart1);
          PatchProxy.onMethodExit(c.class, "12");
          goto label_00f3 ;
       }
    }
    public static String e(QPhoto p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       PhotoAdvertisement obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoc, "18");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       Object obj2 = PatchProxy.applyOneRefs(p0, obj, uoc, "17");
       obj = 3;
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          QPhoto mEntity = p0.mEntity;
          int i = 0;
          if (mEntity instanceof LiveStreamFeed) {
             LiveStreamModel mCoverWidget = mEntity.mLiveStreamModel.mCoverWidgets;
             if (mCoverWidget.size() > 0 && mCoverWidget.get(i).mType == obj) {
                b = true;
             }
          }
          b = false;
       }
       if (b) {
          return "SIMPLE_LIVE";
       }else {
          PhotoAdvertisement photoAdverti = k.B(p0);
          if (photoAdverti != null) {
             long l = (long)256;
             if (!(photoAdverti.mCommonSwitchBit & l) - l) {
                return "DEFAULT";
             }else {
                return "NATIVE_AD";
             }
          }else {
             PlcEntryStyleInfo plcEntryStyl = p0.getPlcEntryStyleInfo();
             if (plcEntryStyl != null) {
                if (a.t().d("reuseSourcePLCToProfilebool", true)) {
                   PlcEntryStyleInfo mBizType = plcEntryStyl.mBizType;
                   if (mBizType != 29 && (mBizType == 63 || mBizType == 10)) {
                      return "PLC";
                   }
                }
                plcEntryStyl = plcEntryStyl.mBizType;
                if (plcEntryStyl != true && (plcEntryStyl != obj && (plcEntryStyl != 8 && (plcEntryStyl != 30 && (plcEntryStyl != 35 && (plcEntryStyl != 39 && (plcEntryStyl != 42 && (plcEntryStyl != 24 && plcEntryStyl != 25)))))))) {
                   return "DEFAULT";
                }else {
                   return "PLC";
                }
             }else {
                return "DEFAULT";
             }
          }
       }
    }
    public static i f(QPhoto p0,BaseFragment p1){
       i oi = null;
       p0 = PatchProxy.applyTwoRefs(p0, p1, oi, c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       boolean b = d.a(-1782425284).J(p1);
       if (e.b() || (b && p1 instanceof RecyclerFragment)) {
          oi = c.m(p1.q());
       }
       return oi;
    }
    public static i g(BaseFragment p0){
       i oi = null;
       Object obj = PatchProxy.applyOneRefs(p0, oi, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof RecyclerFragment) {
          oi = p0.q();
       }
       if (oi instanceof a) {
          oi = oi.m();
       }
       return oi;
    }
    public static i h(BaseFragment p0){
       i oi = null;
       Object obj = PatchProxy.applyOneRefs(p0, oi, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof RecyclerFragment) {
          oi = c.m(p0.q());
       }
       return oi;
    }
    public static SlideMediaType i(int p0,QPhoto p1){
       SlideMediaType lIVE;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 16 || p1 == null) {
          return SlideMediaType.ALL;
       }else if(p1.isLiveStream()){
          lIVE = SlideMediaType.LIVE;
       }else {
          lIVE = SlideMediaType.PHOTO;
       }
       return lIVE;
    }
    public static List j(BaseFragment p0,boolean p1,PhotoType[] p2){
       RecyclerFragment obj;
       int i2;
       int i3;
       List list;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, null, c.class, "14");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p0 instanceof RecyclerFragment) {
          obj = p0;
          RecyclerView recyclerView = obj.h0();
          Object obj1 = PatchProxy.applyTwoRefs(p0, recyclerView, null, uoc, "16");
          int i = 0;
          int i1 = -1;
          if (obj1 != patchProxyRe) {
             i2 = obj1.intValue();
          }else if(recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager){
             int[] ointArray1 = recyclerView.getLayoutManager().findFirstVisibleItemPositions(null);
             if (ointArray1 != null) {
                int i4 = (ointArray1.length > 0)? ointArray1[i]: -1;
                int len1 = ointArray1.length;
                for (int i5 = 0; i5 < len1; i5 = i5 + 1) {
                   i4 = Math.min(ointArray1[i5], i4);
                }
                i2 = i4;
             label_0066 :
                i4 = i2 - obj.ia().b1();
                if (i4 >= 0) {
                   i2 = i4;
                }
             }
          }
          i2 = -1;
          goto label_0066 ;
          RecyclerView recyclerView1 = obj.h0();
          ArrayList obj2 = PatchProxy.applyOneRefs(recyclerView1, null, uoc, "15");
          if (obj2 != patchProxyRe) {
             i3 = obj2.intValue();
          }else if(recyclerView1.getLayoutManager() instanceof StaggeredGridLayoutManager){
             int[] ointArray = recyclerView1.getLayoutManager().findLastVisibleItemPositions(null);
             if (ointArray != null) {
                int len = ointArray.length;
                for (; i < len; i = i + 1) {
                   i1 = Math.max(ointArray[i], i1);
                }
             }
          }
          i3 = i1;
          i oi = c.g(p0);
          obj2 = new ArrayList();
          if (oi != null) {
             List items = oi.getItems();
             if (i2 >= 0 && i2 < Math.min(i3, items.size())) {
                list = items.subList(i2, Math.min(i3, items.size()));
                if (p1) {
                   q.c(list, new s(p2));
                }
             }
             return list;
          }
       }
       return new ArrayList();
    }
    public static boolean k(Activity p0,QPhoto p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       d uod = d.a(-1188553266);
       if (p0 != null && (p0 instanceof GifshowActivity && (p1 != null && uod != null))) {
          b = uod.VA(p0.U2(), p1.getUserId());
       }
    label_0036 :
       return b;
    }
    public static boolean l(){
       Object obj = PatchProxy.apply(null, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.f() || e.e())? true: false;
       return b;
    }
    public static i m(i p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       f obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "4");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = d.a(0x54358588);
       c uoc = d.a(-1782425284);
       obj = PatchProxy.applyOneRefs(p0, obj, c.class, "2");
       int i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          v ov = d.a(-724669335);
          b = (ov != null && ov.co(p0))? true: false;
       }
       if (b) {
          return d.a(-724669335).XY(p0);
       }else if(uoc != null){
          i = 0;
       }
       if (uoc.v2(p0) & i) {
          p0 = uoc.Z0(p0);
       }
       return p0;
    }
}
