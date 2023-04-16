package k2b.u1;
import java.util.Random;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import com.yxcorp.gifshow.log.model.CommonParams;
import android.view.View;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.model.BaseMetaData;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.log.model.StatMetaData;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AudienceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$LivePlayBizStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomProtoEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AudienceQoSSliceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$DeviceDetailPackage;
import q2b.h$b;
import k2b.k2;
import q2b.i$a;
import q2b.i;
import android.app.Activity;
import com.google.common.collect.ImmutableList;
import java.lang.RuntimeException;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import o56.d;
import com.kwai.sdk.switchconfig.a;
import fg6.a;
import q2b.f;
import com.google.gson.Gson;
import java.util.List;
import k2b.i0;
import java.util.HashMap;
import ok.s;
import ok.s$c;
import com.google.common.base.a;
import com.google.common.base.a$c;
import java.lang.Throwable;
import o56.c;
import o56.a;
import java.lang.IllegalArgumentException;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomStatEvent;
import f3b.o;
import com.kwai.robust.PatchProxyResult;
import java.util.UUID;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareEvent;
import k2b.b;
import k2b.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.NullPointerException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import q2b.h$a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.log.model.Click2MetaData;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IoOverviewStatEvent;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.ImageView;

public class u1	// class@001bbd
{
    public static final float a;

    static {
       u1.a = new Random().nextFloat();
    }
    public void u1(){
       super();
    }
    public static void A(ClientEvent$UrlPackage p0,String p1,int p2,ClientEvent$ElementPackage p3,ClientContent$ContentPackage p4){
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.contentPackage = p4;
       uClickEvent.elementPackage = p3;
       uClickEvent.type = p2;
       if (!TextUtils.x(p1)) {
       }else {
          p1 = "";
       }
       uClickEvent.extraMessage = p1;
       uClickEvent.direction = 0;
       u1.z(p0, uClickEvent);
       return;
    }
    public static void A0(ClientEvent$UrlPackage p0,ClientEvent$ShowEvent p1,ClientContentWrapper$ContentWrapper p2){
       p1.urlPackage = p0;
       b.a(0x4b316083).M0("", p1, null, false, p2, null, null);
    }
    public static void B(ClickMetaData p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "21")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       u1.b(p0);
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.direction = p0.getDirection();
       uClickEvent.type = p0.getType();
       if (p0.getElementPackage() != null) {
          uClickEvent.elementPackage = p0.getElementPackage();
       }
       if (p0.getStidContainer() != null) {
          uClickEvent.interStidContainer = p0.getStidContainer();
       }
       uClickEvent.interStExParams = TextUtils.k(p0.getStExParams());
       if (p0.getContentPackage() != null) {
          uClickEvent.contentPackage = p0.getContentPackage();
       }
       if (p0.getAreaPackage() != null) {
          uClickEvent.areaPackage = p0.getAreaPackage();
       }
       if (!TextUtils.x(p0.getMessage())) {
          uClickEvent.extraMessage = TextUtils.I(p0.getMessage());
       }
       if (!TextUtils.x(p0.getContentWrapperString())) {
          uClickEvent.contentWrapper = TextUtils.I(p0.getContentWrapperString());
       }
       if (p0.getUrlPackage() != null) {
          uClickEvent.urlPackage = p0.getUrlPackage();
       }
       if (p0.getReferUrlPackage() != null) {
          uClickEvent.referUrlPackage = p0.getReferUrlPackage();
       }
       if (p0.getReferElementPackage() != null) {
          uClickEvent.referElementPackage = p0.getReferElementPackage();
       }
       b.a(0x4b316083).Y("", uClickEvent, p0.getLogPage(), p0.isRealTime(), p0.getContentWrapper(), p0.getCommonParams(), null);
       return;
    }
    public static void B0(ShowMetaData p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "20")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       u1.b(p0);
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.type = p0.getType();
       if (p0.getElementPackage() != null) {
          showEvent.elementPackage = p0.getElementPackage();
       }
       if (p0.getContentPackage() != null) {
          showEvent.contentPackage = p0.getContentPackage();
       }
       if (p0.getStidContainer() != null) {
          showEvent.interStidContainer = p0.getStidContainer();
       }
       showEvent.interStExParams = TextUtils.k(p0.getStExParams());
       if (p0.getAreaPackage() != null) {
          showEvent.areaPackage = p0.getAreaPackage();
       }
       if (!TextUtils.x(p0.getContentWrapperString())) {
          showEvent.contentWrapper = TextUtils.I(p0.getContentWrapperString());
       }
       if (p0.getUrlPackage() != null) {
          showEvent.urlPackage = p0.getUrlPackage();
       }
       if (p0.getReferUrlPackage() != null) {
          showEvent.referUrlPackage = p0.getReferUrlPackage();
       }
       if (p0.getReferElementPackage() != null) {
          showEvent.referElementPackage = p0.getReferElementPackage();
       }
       b.a(0x4b316083).M0("", showEvent, p0.getLogPage(), p0.isRealTime(), p0.getContentWrapper(), p0.getCommonParams(), null);
       return;
    }
    public static void C(String p0,int p1,int p2,ClientEvent$ElementPackage p3,ClientContent$ContentPackage p4,ClientContentWrapper$ContentWrapper p5,View p6){
       u1.D(p0, p1, p2, p3, p4, null, false, p6, null);
    }
    public static void C0(String p0,e0 p1,int p2,ClientEvent$ElementPackage p3,ClientContent$ContentPackage p4){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, ou1, "26")) {
             return;
          }
       }
       u1.E0(p0, p1, p2, p3, null, p4, null, null, false, null);
       return;
    }
    public static void D(String p0,int p1,int p2,ClientEvent$ElementPackage p3,ClientContent$ContentPackage p4,ClientContentWrapper$ContentWrapper p5,boolean p6,View p7,CommonParams p8){
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.direction = p2;
       uClickEvent.type = p1;
       uClickEvent.elementPackage = p3;
       if (p4 != null) {
          uClickEvent.contentPackage = p4;
       }
       if (!TextUtils.x(p0)) {
          uClickEvent.extraMessage = p0;
       }
       u1.c0(uClickEvent, p6, p5, p7, null);
       return;
    }
    public static void D0(String p0,e0 p1,int p2,ClientEvent$ElementPackage p3,ClientContent$ContentPackage p4,ClientContentWrapper$ContentWrapper p5){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, ou1, "25")) {
             return;
          }
       }
       u1.E0(p0, p1, p2, p3, null, p4, p5, null, false, null);
       return;
    }
    public static void E(String p0,int p1,ClientContentWrapper$ContentWrapper p2,ClientEvent$ElementPackage p3){
       u1.F(p0, p1, p2, p3, false);
    }
    public static void E0(String p0,e0 p1,int p2,ClientEvent$ElementPackage p3,ClientEvent$AreaPackage p4,ClientContent$ContentPackage p5,ClientContentWrapper$ContentWrapper p6,CommonParams p7,boolean p8,View p9){
       object oobject = p3;
       object oobject1 = p4;
       object oobject2 = p5;
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = oobject;
          objArray[4] = oobject1;
          objArray[5] = oobject2;
          objArray[6] = p6;
          object oobject3 = null;
          objArray[7] = oobject3;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, oobject3, ou1, "27")) {
             return;
          }
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.type = p2;
       showEvent.elementPackage = oobject;
       showEvent.contentPackage = oobject2;
       if (oobject1 != null) {
          showEvent.areaPackage = oobject1;
       }
       b.a(0x4b316083).M0(p0, showEvent, p1, p8, p6, null, p9);
       return;
    }
    public static void F(String p0,int p1,ClientContentWrapper$ContentWrapper p2,ClientEvent$ElementPackage p3,boolean p4){
       u1.J(p0, p1, p3, null, p2, p4);
    }
    public static void F0(StatMetaData p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "22")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       u1.b(p0);
       ClientStat$StatPackage statPackage = p0.getStatPackage();
       StidContainerProto$StidContainer stidContaine = p0.getStidContainer();
       String stExParams = p0.getStExParams();
       if (!PatchProxy.applyVoidThreeRefs(statPackage, stidContaine, stExParams, null, u1.class, "24") && stidContaine != null) {
          ClientStat$StatPackage videoStatEve = statPackage.videoStatEvent;
          String str = " interStExParams=";
          String str1 = "Logger";
          if (videoStatEve != null) {
             videoStatEve.interStidContainer = stidContaine;
             videoStatEve.interStExParams = TextUtils.k(stExParams);
             Log.g(str1, "statPackage.videoStatEvent.interStidContainer="+statPackage.videoStatEvent.interStidContainer+str+statPackage.videoStatEvent.interStExParams);
          }else {
             videoStatEve = statPackage.audienceStatEvent;
             if (videoStatEve != null) {
                videoStatEve.interStidContainer = stidContaine;
                videoStatEve.interStExParams = TextUtils.k(stExParams);
                Log.g(str1, "statPackage.audienceStatEvent.interStidContainer="+statPackage.audienceStatEvent.interStidContainer+str+statPackage.audienceStatEvent.interStExParams);
             }else {
                videoStatEve = statPackage.livePlayBizStatEvent;
                if (videoStatEve != null) {
                   videoStatEve.interStidContainer = stidContaine;
                   videoStatEve.interStExParams = TextUtils.k(stExParams);
                   Log.g(str1, "statPackage.livePlayBizStatEvent.interStidContainer="+statPackage.livePlayBizStatEvent.interStidContainer+str+statPackage.livePlayBizStatEvent.interStExParams);
                }else {
                   videoStatEve = statPackage.customProtoEvent;
                   if (videoStatEve != null) {
                      videoStatEve.interStidContainer = stidContaine;
                      videoStatEve.interStExParams = TextUtils.k(stExParams);
                      Log.g(str1, "statPackage.customProtoEvent.interStidContainer="+statPackage.customProtoEvent.interStidContainer+str+statPackage.customProtoEvent.interStExParams);
                   }else {
                      videoStatEve = statPackage.audienceQosSliceStatEvent;
                      if (videoStatEve != null) {
                         videoStatEve.interStidContainer = stidContaine;
                         videoStatEve.interStExParams = TextUtils.k(stExParams);
                         Log.g(str1, "statPackage.audienceQosSliceStatEvent.interStidContainer="+statPackage.audienceQosSliceStatEvent.interStidContainer+str+statPackage.audienceQosSliceStatEvent.interStExParams);
                      }else {
                         videoStatEve = statPackage.cdnResourceLoadStatEvent;
                         if (videoStatEve != null) {
                            videoStatEve.interStidContainer = stidContaine;
                            videoStatEve.interStExParams = TextUtils.k(stExParams);
                            Log.g(str1, "statPackage.cdnResourceLoadStatEvent.interStidContainer="+statPackage.cdnResourceLoadStatEvent.interStidContainer+str+statPackage.cdnResourceLoadStatEvent.interStExParams);
                         }
                      }
                   }
                }
             }
          }
       }
       b.a(0x4b316083).F0("", p0.getStatPackage(), p0.getLogPage(), p0.isRealTime(), p0.getCommonParams());
       return;
    }
    public static void G(String p0,int p1,ClientEvent$ElementPackage p2,ClientContent$ContentPackage p3){
       u1.H(p0, p1, p2, p3, null);
    }
    public static void G0(int p0){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, ou1, "56")) {
          return;
       }
       b.a(0x4b316083).F(p0);
       return;
    }
    public static void H(String p0,int p1,ClientEvent$ElementPackage p2,ClientContent$ContentPackage p3,ClientContentWrapper$ContentWrapper p4){
       u1.J(p0, p1, p2, p3, p4, false);
    }
    public static void H0(int p0,String p1){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, ou1, "57")) {
          return;
       }
       b.a(0x4b316083).A(p0, p1);
       return;
    }
    public static void I(String p0,int p1,ClientEvent$ElementPackage p2,ClientContent$ContentPackage p3,ClientContentWrapper$ContentWrapper p4,View p5){
       u1.K(p0, p1, p2, p3, p4, false, p5);
    }
    public static void I0(int p0,int p1,int p2){
       u1.J0(p0, p1, p2, 0, "");
    }
    public static void J(String p0,int p1,ClientEvent$ElementPackage p2,ClientContent$ContentPackage p3,ClientContentWrapper$ContentWrapper p4,boolean p5){
       u1.D(p0, p1, 0, p2, p3, p4, p5, null, null);
    }
    public static void J0(int p0,int p1,int p2,int p3,String p4){
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.deviceDetailPackage = new ClientTaskDetail$DeviceDetailPackage();
       resultPackag.code = p3;
       resultPackag.message = p4;
       h$b uob = h$b.d(p1, p0);
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       uob.t(p2);
       u1.r0(uob);
    }
    public static void K(String p0,int p1,ClientEvent$ElementPackage p2,ClientContent$ContentPackage p3,ClientContentWrapper$ContentWrapper p4,boolean p5,View p6){
       u1.D(p0, p1, 0, p2, p3, p4, p5, p6, null);
    }
    public static void K0(int p0){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, ou1, "3")) {
          return;
       }
       k2 ok2 = u1.j();
       if (ok2 != null) {
          ok2.w(Integer.valueOf(p0));
       }
       return;
    }
    public static void L(String p0,e0 p1,int p2,ClientEvent$ElementPackage p3,ClientContent$ContentPackage p4){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, ou1, "30")) {
             return;
          }
       }
       u1.O(p0, p1, "", p2, 0, p3, null, p4, null, false, null, null);
       return;
    }
    public static void L0(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "1")) {
          return;
       }
       b.a(0x4b316083).Y0(u1.l(p0).b());
       return;
    }
    public static void M(String p0,e0 p1,int p2,ClientEvent$ElementPackage p3,ClientContent$ContentPackage p4,ClientContentWrapper$ContentWrapper p5){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, ou1, "28")) {
             return;
          }
       }
       u1.O(p0, p1, "", p2, 0, p3, null, p4, p5, false, null, null);
       return;
    }
    public static void M0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "4")) {
          return;
       }
       k2 ok2 = u1.j();
       if (ok2 != null) {
          ok2.x(p0);
       }
       return;
    }
    public static void N(String p0,e0 p1,int p2,ClientEvent$ElementPackage p3,ClientContent$ContentPackage p4,ClientContentWrapper$ContentWrapper p5,CommonParams p6){
       object oobject;
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4,oobject,p6};
          oobject = null;
          if (PatchProxy.applyVoid(objArray, oobject, ou1, "29")) {
             return;
          }
       }
       u1.O(p0, p1, "", p2, 0, p3, null, p4, null, false, p6, null);
       return;
    }
    public static void N0(Activity p0,e0 p1,ImmutableList p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u1.class, "10")) {
          return;
       }
       b.a(0x4b316083).n0(p0, p1, p2);
       return;
    }
    public static void O(String p0,e0 p1,String p2,int p3,int p4,ClientEvent$ElementPackage p5,ClientEvent$AreaPackage p6,ClientContent$ContentPackage p7,ClientContentWrapper$ContentWrapper p8,boolean p9,CommonParams p10,View p11){
       object oobject = p2;
       object oobject1 = p5;
       object oobject2 = p6;
       object oobject3 = p7;
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object[] objArray = new Object[12];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = oobject;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = oobject1;
          objArray[6] = oobject2;
          objArray[7] = oobject3;
          objArray[8] = p8;
          objArray[9] = Boolean.valueOf(p9);
          objArray[10] = p10;
          objArray[11] = p11;
          if (PatchProxy.applyVoid(objArray, null, ou1, "31")) {
             return;
          }
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.direction = p4;
       uClickEvent.type = p3;
       uClickEvent.elementPackage = oobject1;
       if (oobject3 != null) {
          uClickEvent.contentPackage = oobject3;
       }
       if (oobject2 != null) {
          uClickEvent.areaPackage = oobject2;
       }
       if (!TextUtils.x(p2)) {
          uClickEvent.extraMessage = oobject;
       }
       if (uClickEvent.urlPackage == null) {
          b.a(0x4b316083).Y(p0, uClickEvent, p1, p9, p8, p10, p11);
          return;
       }else {
          throw new RuntimeException("如果要使用非currentUrl上报clickEvent，请使用Logger.logClickEvent");
       }
    }
    public static void O0(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, u1.class, "6")) {
          return;
       }
       u1.P0(ImmutableMap.of(p0, p1));
       return;
    }
    public static void P(ClientEvent$ExceptionEvent p0){
       Gson a;
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "37")) {
          return;
       }
       if (d.i) {
          ClientEvent$ExceptionEvent type = p0.type;
          if (type == 1 || (type == 4 && ((long)(p0.message).length() - 0xc8000 < 0 && a.t().d("enableNumberFour", false)))) {
             a = a.a;
             List list = b.a(0x4b316083).b(a.h(p0.message, f.class).a, 50);
             if (list != null) {
                p0.userActionTrace = a.q(list);
             }
          }
       }
       b.a(0x4b316083).d1(p0);
       return;
    }
    public static void P0(Map p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "5")) {
          return;
       }
       k2 ok2 = u1.j();
       if (ok2 == null) {
          return;
       }
       try{
          if (p0 != null && !p0.isEmpty()) {
             str = ok2.l();
             HashMap hashMap = new HashMap();
             if (!TextUtils.x(str)) {
                hashMap = new HashMap(s.c("&").g().a().h("=").a(str));
             }
             hashMap.putAll(p0);
             ok2.x(a.g("&").k("=").b(hashMap));
          }
       }catch(java.lang.IllegalArgumentException e6){
          Log.e("Logger", "IllegalArgumentException", e6);
          Log.k(new Throwable("Logger updateCurrentParams"+str));
       }
       return;
    }
    public static void Q(String p0,String p1){
       u1.T("", p0, p1);
    }
    public static void R(String p0,String p1,int p2){
       if (PatchProxy.isSupport(u1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, u1.class, "47")) {
          return;
       }
       u1.S(p0, p1, p2, null);
       return;
    }
    public static void S(String p0,String p1,int p2,CommonParams p3){
       if (PatchProxy.isSupport(u1.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, u1.class, "48")) {
          return;
       }
       if (p0 == null || p1 == null) {
          Log.n("Logger", "logCustomEvent: key and value must not be null ");
          return;
       }else {
          b.a(0x4b316083).j1(p0, p1, p2, p3);
          return;
       }
    }
    public static void T(String p0,String p1,String p2){
       if (p1 == null || p2 == null) {
          Log.n("Logger", "logCustomEvent: key and value must not be null ");
          return;
       }else {
          b.a(0x4b316083).k(p0, p1, p2);
          return;
       }
    }
    public static void U(String p0,String p1){
       if (u1.a - 0x38d1b717 < 0) {
          u1.Q(p0, p1);
       }
       return;
    }
    public static void V(String p0,String p1,int p2){
       if (PatchProxy.isSupport(u1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, u1.class, "43")) {
          return;
       }
       if (u1.a - 0x38d1b717 < 0) {
          u1.R(p0, p1, p2);
       }
       return;
    }
    public static void W(String p0,byte[] p1,boolean p2,CommonParams p3){
       if (PatchProxy.isSupport(u1.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, u1.class, "68")) {
          return;
       }
       if (TextUtils.x(p0) && a.a().c()) {
          throw new IllegalArgumentException("should not make type empty or null in customProtoEvent");
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       ClientStat$CustomProtoEvent uCustomProto = new ClientStat$CustomProtoEvent();
       uCustomProto.type = TextUtils.I(p0);
       uCustomProto.payload = p1;
       statPackage.customProtoEvent = uCustomProto;
       u1.l0(statPackage, p2, p3);
       return;
    }
    public static void X(String p0,String p1){
       if (TextUtils.x(p0) && a.a().c()) {
          throw new IllegalArgumentException("should not make key empty or null in customStatEvent");
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       ClientStat$CustomStatEvent uCustomStatE = new ClientStat$CustomStatEvent();
       statPackage.customStatEvent = uCustomStatE;
       uCustomStatE.key = TextUtils.I(p0);
       p0.value = TextUtils.I(p1);
       b.a(0x4b316083).F0("", statPackage, null, false, null);
       return;
    }
    public static void Y(String p0,String p1,int p2){
       if (PatchProxy.isSupport(u1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, u1.class, "53")) {
          return;
       }
       u1.Z(p0, p1, false, null, p2);
       return;
    }
    public static void Z(String p0,String p1,boolean p2,CommonParams p3,int p4){
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, ou1, "55")) {
             return;
          }
       }
       if (!TextUtils.x(p0) || !a.a().c()) {
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          ClientStat$CustomStatEvent uCustomStatE = new ClientStat$CustomStatEvent();
          statPackage.customStatEvent = uCustomStatE;
          uCustomStatE.key = TextUtils.I(p0);
          p0.value = TextUtils.I(p1);
          p0.biz = p4;
          b.a(0x4b316083).F0("", statPackage, null, p2, p3);
          return;
       }else {
          throw new IllegalArgumentException("should not make key empty or null in customStatEvent");
       }
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, u1.class, "17")) {
          return;
       }
       k2 ok2 = u1.n();
       String str = "currentPage ";
       if (ok2 != null) {
          if (!("UNKNOWN2").equals(ok2.d) && ok2.b != null) {
             b.a(0x4b316083).Y0(ok2.d());
          }else {
             u1.Q("backToErrorPageOrCategory", str+o.m(u1.j())+"\r\n"+"referPage "+o.m(u1.j().t)+"\r\n"+Log.f(new Throwable()));
          }
       }else {
          u1.Q("backToNullReferPage", str+o.m(u1.j())+"\r\n"+Log.f(new Throwable()));
       }
       return;
    }
    public static void a0(ClientEvent$ClickEvent p0){
       u1.b0(p0, false, null);
    }
    public static void b(BaseMetaData p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "23")) {
          return;
       }
       if (p0.getLogPage() == null) {
          Log.d("Logger", "meta data 没有包含page!");
       }
       return;
    }
    public static void b0(ClientEvent$ClickEvent p0,boolean p1,ClientContentWrapper$ContentWrapper p2){
       u1.c0(p0, p1, p2, null, null);
    }
    public static void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, u1.class, "69")) {
          return;
       }
       b.a(0x4b316083).X(p0, p1);
       return;
    }
    public static void c0(ClientEvent$ClickEvent p0,boolean p1,ClientContentWrapper$ContentWrapper p2,View p3,CommonParams p4){
       if (p0.urlPackage != null) {
          throw new RuntimeException("如果要使用非currentUrl上报clickEvent，请使用Logger.logClickEvent");
       }
       b.a(0x4b316083).s0(p0, p1, p2, p4, p3);
       return;
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, u1.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableNewRealShow", false);
    }
    public static void d0(ClientEvent$ExceptionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "34")) {
          return;
       }
       b.a(0x4b316083).P(p0);
       return;
    }
    public static void e(ClientEvent$UrlPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "8")) {
          return;
       }
       k2 ok2 = u1.q();
       if (p0 == null || (ok2 != null && p0.page == ok2.c)) {
          if (!TextUtils.x(p0.identity) && (!TextUtils.x(p0.entryPageId) && !TextUtils.x(p0.entryPageSource))) {
             return;
          }else if(TextUtils.x(p0.identity)){
             p0.identity = TextUtils.I(ok2.a);
          }
          if (TextUtils.x(p0.entryPageId)) {
             p0.entryPageId = TextUtils.I(ok2.q);
          }
          if (TextUtils.x(p0.entryPageSource)) {
             p0.entryPageSource = TextUtils.I(ok2.r);
          }
          if (p0.pageSeq <= null) {
             k2 p = ok2.p;
             if (p > null) {
                p0.pageSeq = p;
             }
          }
          if (TextUtils.x(p0.topPage)) {
             p0.topPage = TextUtils.I(ok2.s);
          }
       }
       return;
    }
    public static void e0(ClientEvent$ExceptionEvent p0,boolean p1,CommonParams p2){
       if (PatchProxy.isSupport(u1.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, u1.class, "36")) {
          return;
       }
       b.a(0x4b316083).e1(p0, p1, p2);
       return;
    }
    public static String f(){
       Object obj = PatchProxy.apply(null, null, u1.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UUID.randomUUID().toString();
    }
    public static void f0(ClientEvent$ShareEvent p0){
       u1 ou1 = u1.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, ou1, "40")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, null, null, ou1, "41")) {
          b.a(0x4b316083).H(p0, null);
       }
       return;
    }
    public static String g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u1.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UUID.nameUUIDFromBytes(p0.getBytes()).toString();
    }
    public static void g0(ClientEvent$ShowEvent p0){
       u1.h0(p0, false, null);
    }
    public static b h(){
       Object obj = PatchProxy.apply(null, null, u1.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x4b316083).l0();
    }
    public static void h0(ClientEvent$ShowEvent p0,boolean p1,ClientContentWrapper$ContentWrapper p2){
       u1.i0(p0, p1, null, null);
    }
    public static CommonParams i(String p0,String p1){
       CommonParams obj = PatchProxy.applyTwoRefs(p0, p1, null, u1.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommonParams();
       obj.mServiceName = p0;
       obj.mSubBiz = p1;
       return obj;
    }
    public static void i0(ClientEvent$ShowEvent p0,boolean p1,ClientContentWrapper$ContentWrapper p2,View p3){
       if (p0.urlPackage != null) {
          throw new RuntimeException("如果要使用非currentUrl上报showEvent，请使用Logger.logShowEvent");
       }
       b.a(0x4b316083).M0("", p0, null, p1, p2, null, p3);
       return;
    }
    public static k2 j(){
       return b.a(0x4b316083).f();
    }
    public static void j0(ClientStat$StatPackage p0){
       b.a(0x4b316083).j(p0);
    }
    public static ClientEvent$UrlPackage k(){
       Object[] objArray = null;
       k2 obj = PatchProxy.apply(objArray, objArray, u1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u1.j();
       if (obj != null) {
          objArray = obj.e(true);
       }
       return objArray;
    }
    public static void k0(ClientStat$StatPackage p0,boolean p1){
       b.a(0x4b316083).i1(p0, p1);
    }
    public static i$a l(e0 p0){
       ClientContent$ContentPackage uContentPack;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack1;
       ClientEvent$ExpTagTrans uExpTagTrans;
       String str = "";
       String obj = PatchProxy.applyOneRefs(p0, null, u1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = p0.getPageParams();
       }catch(java.lang.Exception e0){
          obj = e0;
       }
       try{
          uContentPack = p0.Q3();
       }catch(java.lang.Exception e0){
          uContentPack = null;
       }
       try{
          uElementPack = p0.j4();
       }catch(java.lang.Exception e0){
          uElementPack = null;
       }
       try{
          uContentPack1 = p0.Nf();
       }catch(java.lang.Exception e0){
          uContentPack1 = null;
       }
       try{
          uExpTagTrans = p0.I1();
       }catch(java.lang.Exception e0){
       }
       String str1 = p0.o();
       if (str1 == null) {
          ExceptionHandler.handleCaughtException(new NullPointerException("Page2 shouldn\'t be null."));
       }else {
          str = str1;
       }
       return i.a().u(obj).y(p0.a2()).f(p0.eg()).r(p0.getPage()).s(e0).v(p0.P7()).e(p0.M()).p(p0.h5()).z(p0.pg()).j(p0.ye()).h(uContentPack).m(uElementPack).n(p0.K5()).o(uExpTagTrans).i(uContentPack1);
    }
    public static void l0(ClientStat$StatPackage p0,boolean p1,CommonParams p2){
       b.a(0x4b316083).F0("", p0, null, p1, p2);
    }
    public static ClientEvent$ExpTagTrans m(){
       Object[] objArray = null;
       k2 obj = PatchProxy.apply(objArray, objArray, u1.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u1.j();
       if (obj != null) {
          obj = obj.t;
          if (obj != null) {
             objArray = obj.A;
          }
       }
       return objArray;
    }
    public static void m0(ClientStat$StatPackage p0,boolean p1,String p2,String p3){
       u1.l0(p0, p1, u1.i(p2, p3));
    }
    public static k2 n(){
       k2 ok2 = u1.j();
       ok2 = (ok2 == null)? null: ok2.t;
       return ok2;
    }
    public static void n0(String p0,e0 p1,ClientStat$StatPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, null, p2, null, u1.class, "51")) {
          return;
       }
       u1.o0(p0, null, p2, false, null);
       return;
    }
    public static ClientEvent$ElementPackage o(){
       k2 obj = PatchProxy.apply(null, null, u1.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u1.j();
       if (obj != null) {
          obj = obj.t;
          if (obj != null) {
             return obj.u;
          }
       }
       return null;
    }
    public static void o0(String p0,e0 p1,ClientStat$StatPackage p2,boolean p3,CommonParams p4){
       object oobject;
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(ou1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),oobject};
          oobject = null;
          if (PatchProxy.applyVoid(objArray, oobject, ou1, "52")) {
             return;
          }
       }
       b.a(0x4b316083).F0(p0, p2, p1, p3, null);
       return;
    }
    public static void onEvent(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u1.class, "63")) {
          return;
       }
       p1 = "";
       if (p2 != null) {
          int len = p2.length;
          for (int i = 0; i < len; i = i + 1) {
             p1 = p1+p2[i];
          }
       }
       b.a(0x4b316083).logCustomEvent(p0, p1);
       return;
    }
    public static ClientEvent$UrlPackage p(){
       Object[] objArray = null;
       k2 obj = PatchProxy.apply(objArray, objArray, u1.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u1.j();
       if (obj != null) {
          obj = obj.t;
          if (obj != null) {
             return obj.e(false);
          }
       }
       return objArray;
    }
    public static void p0(String p0,e0 p1,h$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u1.class, "32")) {
          return;
       }
       b.a(0x4b316083).L0(p0, p2, p1);
       return;
    }
    public static k2 q(){
       Object obj = PatchProxy.apply(null, null, u1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x4b316083).Q();
    }
    public static void q0(h$a p0){
       b.a(0x4b316083).b1(p0);
    }
    public static ClientEvent$UrlPackage r(e0 p0){
       ClientEvent$UrlPackage urlPackage = null;
       FragmentActivity obj = PatchProxy.applyOneRefs(p0, urlPackage, u1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0 instanceof Fragment)? p0.getActivity(): urlPackage;
       if (p0 instanceof Activity) {
          obj = p0;
       }
       if (obj != null) {
          k2 ok2 = b.a(0x4b316083).f0(obj, p0);
          if (ok2 != null) {
             urlPackage = ok2.e(false);
          }
       }
       return urlPackage;
    }
    public static void r0(h$b p0){
       b.a(0x4b316083).J(p0);
    }
    public static void s(Click2MetaData p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u1.class, "78")) {
          return;
       }
       b.a(0x4b316083).E0(p0);
       return;
    }
    public static void s0(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, u1.class, "45")) {
          return;
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       ClientStat$IoOverviewStatEvent ioOverviewSt = new ClientStat$IoOverviewStatEvent();
       statPackage.ioOverviewStatEvent = ioOverviewSt;
       ioOverviewSt.procName = "";
       ioOverviewSt.version = p1;
       ioOverviewSt.ioOverview = p0;
       u1.j0(statPackage);
       return;
    }
    public static void t(int p0,ClientContentWrapper$ContentWrapper p1,ClientEvent$ElementPackage p2){
       u1.F("", p0, p1, p2, false);
    }
    public static void t0(int p0,ClientContentWrapper$ContentWrapper p1,ClientEvent$ElementPackage p2){
       u1.w0(p0, p2, null, p1, false);
    }
    public static void u(int p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2){
       u1.x(p0, "", 0, p1, p2);
    }
    public static void u0(int p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2){
       u1.x0(p0, p1, p2, null, false, null);
    }
    public static void v(int p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2,View p3){
       u1.C("", p0, 0, p1, p2, null, p3);
    }
    public static void v0(int p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2,ClientContentWrapper$ContentWrapper p3){
       u1.w0(p0, p1, p2, p3, false);
    }
    public static void w(int p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2,View p3,CommonParams p4){
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.direction = 0;
       uClickEvent.type = p0;
       uClickEvent.elementPackage = p1;
       String str = "";
       if (!TextUtils.x(str)) {
          uClickEvent.extraMessage = str;
       }
       if (uClickEvent.urlPackage == null) {
          b.a(0x4b316083).s0(uClickEvent, false, null, null, null);
          return;
       }else {
          throw new RuntimeException("如果要使用非currentUrl上报clickEvent，请使用Logger.logClickEvent");
       }
    }
    public static void w0(int p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2,ClientContentWrapper$ContentWrapper p3,boolean p4){
       u1.x0(p0, p1, p2, p3, p4, null);
    }
    public static void x(int p0,String p1,int p2,ClientEvent$ElementPackage p3,ClientContent$ContentPackage p4){
       u1.C(p1, p0, p2, p3, p4, null, null);
    }
    public static void x0(int p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2,ClientContentWrapper$ContentWrapper p3,boolean p4,View p5){
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.type = p0;
       showEvent.elementPackage = p1;
       showEvent.contentPackage = p2;
       u1.i0(showEvent, p4, p3, p5);
    }
    public static void y(View p0,String p1){
       ClientContent$ContentPackage uContentPack;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(u1.class)) {
          uContentPack = PatchProxy.applyThreeRefs(p1, Integer.valueOf(-1), p0, null, u1.class, "74");
          if (uContentPack != patchProxyRe) {
          }else if(TextUtils.x(p1)){
             p1 = PatchProxy.applyOneRefs(p0, null, u1.class, "73");
             if (p1 != patchProxyRe) {
             }else if(p0 instanceof TextView){
                TextView textView = p0;
                if (!TextUtils.x(textView.getText())) {
                   textView = textView.getText().toString();
                }
             }
             CharSequence contentDescr = p0.getContentDescription();
             if (contentDescr == null) {
                ClientContent$ContentPackage uContentPack1 = null;
             }else {
                contentDescr = String.valueOf(contentDescr);
             }
             if (TextUtils.x(p1)) {
                uContentPack = null;
             }
          }
          uContentPack = new ClientEvent$ElementPackage();
          uContentPack.name = p1;
          if (p0 instanceof CheckBox) {
             if (p0.isChecked()) {
                uContentPack.status = 1;
             }else {
                uContentPack.status = 2;
             }
          }else if(p0 instanceof Button){
             uContentPack.type = 1;
          }else if(p0 instanceof TextView){
             uContentPack.type = 2;
          }else if(p0 instanceof ImageView){
             uContentPack.type = 4;
          }else {
             uContentPack.type = 12;
          }
       }else {
          goto label_0022 ;
       }
       u1.u(1, uContentPack, null);
       return;
    }
    public static void y0(ClientEvent$UrlPackage p0,int p1,ClientEvent$ElementPackage p2,ClientContent$ContentPackage p3){
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.type = p1;
       showEvent.elementPackage = p2;
       showEvent.contentPackage = p3;
       u1.z0(p0, showEvent);
    }
    public static void z(ClientEvent$UrlPackage p0,ClientEvent$ClickEvent p1){
       p1.urlPackage = p0;
       b.a(0x4b316083).e(p1);
    }
    public static void z0(ClientEvent$UrlPackage p0,ClientEvent$ShowEvent p1){
       p1.urlPackage = p0;
       b.a(0x4b316083).h(p1);
    }
}
