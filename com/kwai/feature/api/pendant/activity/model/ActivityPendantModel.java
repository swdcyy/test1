package com.kwai.feature.api.pendant.activity.model.ActivityPendantModel;
import java.io.Serializable;
import com.kwai.feature.api.pendant.activity.model.ActivityPendantModel$a;
import nsd.u;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import com.kwai.feature.api.pendant.activity.model.AdsorptionModel;
import com.kwai.feature.api.pendant.activity.model.SuspensionModel;
import com.kwai.feature.api.pendant.activity.model.ActPendantCloseDialogModel;
import com.kwai.feature.api.pendant.activity.model.ActivityPendantBubble;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.pendant.activity.model.InitialPosition;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.Arrays;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ActivityPendantModel implements Serializable	// class@001029
{
    public final int _effectPolicy;
    public final List _legalArea;
    public final String activityId;
    public final AdsorptionModel adsorptionStateConfig;
    public final ActivityPendantBubble bubble;
    public final boolean clickHoldAnimation;
    public final ActPendantCloseDialogModel closeAlert;
    public final int defaultDisplayStyle;
    public final long endTime;
    public final String linkUrl;
    public final int maxClickXMarkCount;
    public final boolean needLogin;
    public final boolean onlyTk;
    public final String[] pagesString;
    public final long startTime;
    public final boolean supportDemote;
    public final SuspensionModel suspensionStateConfig;
    public final String tkBundleId;
    public final String tkExtraParams;
    public static final ActivityPendantModel$a Companion;
    public static final List defaultLegalArea;
    public static final long serialVersionUID;

    static {
       Integer integer;
       ActivityPendantModel.Companion = new ActivityPendantModel$a(null);
       Integer[] integerArray = new Integer[]{integer,integer,Integer.valueOf(493),Integer.valueOf(270)};
       integer = Integer.valueOf(44);
       ActivityPendantModel.defaultLegalArea = CollectionsKt__CollectionsKt.L(integerArray);
    }
    public void ActivityPendantModel(){
       super(null, 0, null, null, 0, false, 0, null, null, 0, 0, false, null, null, false, false, null, null, null, 0x7ffff, null);
    }
    public void ActivityPendantModel(String p0){
       super(p0, 0, null, null, 0, false, 0, null, null, 0, 0, false, null, null, false, false, null, null, null, 0x7fffe, null);
    }
    public void ActivityPendantModel(String p0,int p1){
       super(p0, p1, null, null, 0, false, 0, null, null, 0, 0, false, null, null, false, false, null, null, null, 0x7fffc, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2){
       super(p0, p1, p2, null, 0, false, 0, null, null, 0, 0, false, null, null, false, false, null, null, null, 0x7fff8, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3){
       super(p0, p1, p2, p3, 0, false, 0, null, null, 0, 0, false, null, null, false, false, null, null, null, 0x7fff0, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4){
       super(p0, p1, p2, p3, p4, false, 0, null, null, 0, 0, false, null, null, false, false, null, null, null, 0x7ffe0, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5){
       super(p0, p1, p2, p3, p4, p5, 0, null, null, 0, 0, false, null, null, false, false, null, null, null, 0x7ffc0, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6){
       super(p0, p1, p2, p3, p4, p5, p6, null, null, 0, 0, false, null, null, false, false, null, null, null, 0x7ff80, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7, null, 0, 0, false, null, null, false, false, null, null, null, 0x7ff00, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, 0, 0, false, null, null, false, false, null, null, null, 0x7fe00, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, 0, false, null, null, false, false, null, null, null, 0x7fc00, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, false, null, null, false, false, null, null, null, 0x7f800, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, null, null, false, false, null, null, null, 0x7f000, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11,String p12){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, null, false, false, null, null, null, 0x7e000, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11,String p12,String p13){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, false, false, null, null, null, 0x7c000, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11,String p12,String p13,boolean p14){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, false, null, null, null, 0x78000, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11,String p12,String p13,boolean p14,boolean p15){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, null, null, null, 0x70000, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11,String p12,String p13,boolean p14,boolean p15,ActPendantCloseDialogModel p16){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, null, null, 0x60000, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11,String p12,String p13,boolean p14,boolean p15,ActPendantCloseDialogModel p16,ActivityPendantBubble p17){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, null, 0x40000, null);
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11,String p12,String p13,boolean p14,boolean p15,ActPendantCloseDialogModel p16,ActivityPendantBubble p17,List p18){
       int i = this;
       Object obj = p7;
       Object obj1 = p8;
       Object obj2 = p13;
       Object obj3 = p16;
       Object obj4 = p18;
       a.p(p0, "activityId");
       a.p(p2, "pagesString");
       a.p(p3, "linkUrl");
       a.p(obj, "adsorptionStateConfig");
       a.p(obj1, "suspensionStateConfig");
       a.p(obj2, "tkBundleId");
       a.p(obj3, "closeAlert");
       a.p(obj4, "_legalArea");
       super();
       i.activityId = p0;
       i.defaultDisplayStyle = p1;
       i.pagesString = p2;
       i.linkUrl = p3;
       i._effectPolicy = p4;
       i.needLogin = p5;
       i.maxClickXMarkCount = p6;
       i.adsorptionStateConfig = obj;
       i.suspensionStateConfig = obj1;
       i.startTime = p9;
       i.endTime = p10;
       i.supportDemote = p11;
       i.tkExtraParams = p12;
       i.tkBundleId = obj2;
       i.onlyTk = p14;
       i.clickHoldAnimation = p15;
       i.closeAlert = obj3;
       i.bubble = p17;
       i._legalArea = obj4;
    }
    public void ActivityPendantModel(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11,String p12,String p13,boolean p14,boolean p15,ActPendantCloseDialogModel p16,ActivityPendantBubble p17,List p18,int p19,u p20){
       AdsorptionModel uAdsorptionM;
       SuspensionModel suspensionMo;
       int i10;
       int i11;
       int i = p19;
       String str = "";
       String str1 = (i & 0x01)? str: p0;
       int i1 = 2;
       int i2 = (i & 0x02)? 2: p1;
       int i3 = 0;
       String[] stringArray = (i & 0x04)? new String[i3]: p2;
       String str2 = (i & 0x08)? str: p3;
       if (!(i & 0x10)) {
          i1 = p4;
       }
       int i4 = (i & 0x20)? 0: p5;
       int i5 = (i & 0x40)? 1: p6;
       if (i & 0x0080) {
          uAdsorptionM = new AdsorptionModel(false, null, null, null, 0, 0, 0, false, false, 511, null);
       }else {
          int i13 = p7;
       }
       if (i & 0x0100) {
          suspensionMo = new SuspensionModel(false, null, null, null, 0, 0, 0, false, false, 0, null, 0, 4095, null);
       }else {
          int i12 = p8;
       }
       suspensionMo = (i & 0x0200)? 0: p9;
       int i6 = (i & 0x0400)? Long.MAX_VALUE: p10;
       i3 = (i & 0x0800)? 1: p11;
       String str3 = (i & 0x1000)? str: p12;
       String str4 = str;
       str = (i & 0x2000)? str4: p13;
       str4 = str;
       str = (i & 0x4000)? 0: p14;
       int i7 = (i & 0x8000)? 1: p15;
       if (i & 0x10000) {
          ActPendantCloseDialogModel uActPendantC = new ActPendantCloseDialogModel(0, 0, 0, 0, 0, 0, 63, 0);
       }else {
          int i9 = p16;
       }
       int i8 = (i & 0x20000)? 0: p17;
       List list = (i & 0x40000)? CollectionsKt__CollectionsKt.E(): p18;
       super(str1, i2, stringArray, str2, i1, i4, i5, v11, uAdsorptionM, suspensionMo, i6, i3, str3, str4, str, i7, v18, i8, list);
       return;
    }
    public static ActivityPendantModel copy$default(ActivityPendantModel p0,String p1,int p2,String[] p3,String p4,int p5,boolean p6,int p7,AdsorptionModel p8,SuspensionModel p9,long p10,long p11,boolean p12,String p13,String p14,boolean p15,boolean p16,ActPendantCloseDialogModel p17,ActivityPendantBubble p18,List p19,int p20,Object p21){
       int i1;
       ActivityPendantModel uActivityPen = p0;
       int i = p20;
       ActivityPendantModel activityId = (i & 0x01)? uActivityPen.activityId: p1;
       ActivityPendantModel defaultDispl = (i & 0x02)? uActivityPen.defaultDisplayStyle: p2;
       ActivityPendantModel pagesString = (i & 0x04)? uActivityPen.pagesString: p3;
       ActivityPendantModel linkUrl = (i & 0x08)? uActivityPen.linkUrl: p4;
       ActivityPendantModel _effectPolic = (i & 0x10)? uActivityPen._effectPolicy: p5;
       ActivityPendantModel needLogin = (i & 0x20)? uActivityPen.needLogin: p6;
       ActivityPendantModel maxClickXMar = (i & 0x40)? uActivityPen.maxClickXMarkCount: p7;
       ActivityPendantModel adsorptionSt = (i & 0x0080)? uActivityPen.adsorptionStateConfig: p8;
       ActivityPendantModel suspensionSt = (i & 0x0100)? uActivityPen.suspensionStateConfig: p9;
       ActivityPendantModel startTime = (i & 0x0200)? uActivityPen.startTime: p10;
       ActivityPendantModel endTime = (i & 0x0400)? uActivityPen.endTime: p11;
       ActivityPendantModel supportDemot = (i & 0x0800)? uActivityPen.supportDemote: p12;
       ActivityPendantModel uActivityPen1 = supportDemot;
       supportDemot = (i & 0x1000)? uActivityPen.tkExtraParams: p13;
       ActivityPendantModel uActivityPen2 = supportDemot;
       supportDemot = (i & 0x2000)? uActivityPen.tkBundleId: p14;
       ActivityPendantModel uActivityPen3 = supportDemot;
       supportDemot = (i & 0x4000)? uActivityPen.onlyTk: p15;
       ActivityPendantModel uActivityPen4 = supportDemot;
       supportDemot = (i & 0x8000)? uActivityPen.clickHoldAnimation: p16;
       ActivityPendantModel uActivityPen5 = supportDemot;
       supportDemot = (i & 0x10000)? uActivityPen.closeAlert: p17;
       ActivityPendantModel uActivityPen6 = supportDemot;
       supportDemot = (i & 0x20000)? uActivityPen.bubble: p18;
       ActivityPendantModel _legalArea = (i & 0x40000)? uActivityPen._legalArea: p19;
       return p0.copy(activityId, defaultDispl, pagesString, linkUrl, _effectPolic, needLogin, maxClickXMar, adsorptionSt, suspensionSt, startTime, endTime, uActivityPen1, uActivityPen2, uActivityPen3, uActivityPen4, uActivityPen5, uActivityPen6, supportDemot, _legalArea);
    }
    public final String component1(){
       return this.activityId;
    }
    public final long component10(){
       return this.startTime;
    }
    public final long component11(){
       return this.endTime;
    }
    public final boolean component12(){
       return this.supportDemote;
    }
    public final String component13(){
       return this.tkExtraParams;
    }
    public final String component14(){
       return this.tkBundleId;
    }
    public final boolean component15(){
       return this.onlyTk;
    }
    public final boolean component16(){
       return this.clickHoldAnimation;
    }
    public final ActPendantCloseDialogModel component17(){
       return this.closeAlert;
    }
    public final ActivityPendantBubble component18(){
       return this.bubble;
    }
    public final int component2(){
       return this.defaultDisplayStyle;
    }
    public final String[] component3(){
       return this.pagesString;
    }
    public final String component4(){
       return this.linkUrl;
    }
    public final boolean component6(){
       return this.needLogin;
    }
    public final int component7(){
       return this.maxClickXMarkCount;
    }
    public final AdsorptionModel component8(){
       return this.adsorptionStateConfig;
    }
    public final SuspensionModel component9(){
       return this.suspensionStateConfig;
    }
    public final ActivityPendantModel copy(String p0,int p1,String[] p2,String p3,int p4,boolean p5,int p6,AdsorptionModel p7,SuspensionModel p8,long p9,long p10,boolean p11,String p12,String p13,boolean p14,boolean p15,ActPendantCloseDialogModel p16,ActivityPendantBubble p17,List p18){
       ActivityPendantModel obj;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p7;
       object oobject4 = p8;
       object oobject5 = p13;
       object oobject6 = p16;
       object oobject7 = p18;
       if (PatchProxy.isSupport(ActivityPendantModel.class)) {
          Object[] objArray = new Object[19];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = oobject3;
          objArray[8] = oobject4;
          objArray[9] = Long.valueOf(p9);
          objArray[10] = Long.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          objArray[12] = p12;
          objArray[13] = oobject5;
          objArray[14] = Boolean.valueOf(p14);
          objArray[15] = Boolean.valueOf(p15);
          objArray[16] = oobject6;
          objArray[17] = p17;
          objArray[18] = oobject7;
          obj = PatchProxy.apply(objArray, this, ActivityPendantModel.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "activityId");
       a.p(oobject1, "pagesString");
       a.p(oobject2, "linkUrl");
       a.p(oobject3, "adsorptionStateConfig");
       a.p(oobject4, "suspensionStateConfig");
       a.p(oobject5, "tkBundleId");
       a.p(oobject6, "closeAlert");
       a.p(oobject7, "_legalArea");
       obj = new ActivityPendantModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18);
       return v22;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivityPendantModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       ActivityPendantModel uActivityPen = ActivityPendantModel.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (a.g(uActivityPen, class) ^ true) {
          return false;
       }else {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kwai.feature.api.pendant.activity.model.ActivityPendantModel");
          if (a.g(this.activityId, p0.activityId) ^ true) {
             return false;
          }else if(this.defaultDisplayStyle != p0.defaultDisplayStyle){
             return false;
          }else if(!Arrays.equals(this.pagesString, p0.pagesString)){
             return false;
          }else if(a.g(this.linkUrl, p0.linkUrl) ^ true){
             return false;
          }else if(this._effectPolicy != p0._effectPolicy){
             return false;
          }else if(this.needLogin != p0.needLogin){
             return false;
          }else if(this.maxClickXMarkCount != p0.maxClickXMarkCount){
             return false;
          }else if(a.g(this.adsorptionStateConfig, p0.adsorptionStateConfig) ^ true){
             return false;
          }else if(a.g(this.suspensionStateConfig, p0.suspensionStateConfig) ^ true){
             return false;
          }else if(this.startTime - p0.startTime){
             return false;
          }else if(this.endTime - p0.endTime){
             return false;
          }else if(this.supportDemote != p0.supportDemote){
             return false;
          }else if(a.g(this.tkExtraParams, p0.tkExtraParams) ^ true){
             return false;
          }else if(a.g(this.tkBundleId, p0.tkBundleId) ^ true){
             return false;
          }else if(this.onlyTk != p0.onlyTk){
             return false;
          }else if(this.clickHoldAnimation != p0.clickHoldAnimation){
             return false;
          }else if(a.g(this.closeAlert, p0.closeAlert) ^ true){
             return false;
          }else if(a.g(this.bubble, p0.bubble) ^ true){
             return false;
          }else if(a.g(this._legalArea, p0._legalArea) ^ true){
             return false;
          }else {
             return true;
          }
       }
    }
    public final String getActivityId(){
       return this.activityId;
    }
    public final AdsorptionModel getAdsorptionStateConfig(){
       return this.adsorptionStateConfig;
    }
    public final ActivityPendantBubble getBubble(){
       return this.bubble;
    }
    public final boolean getClickHoldAnimation(){
       return this.clickHoldAnimation;
    }
    public final ActPendantCloseDialogModel getCloseAlert(){
       return this.closeAlert;
    }
    public final int getDefaultDisplayStyle(){
       return this.defaultDisplayStyle;
    }
    public final long getEndTime(){
       return this.endTime;
    }
    public final List getLegalAreaList(){
       Object[] objArray = null;
       ActivityPendantModel obj = PatchProxy.apply(objArray, this, ActivityPendantModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._legalArea;
       int i = (obj.size() == 4)? 1: 0;
       if (i) {
          objArray = obj;
       }
       if (objArray == null) {
          objArray = ActivityPendantModel.defaultLegalArea;
       }
       return objArray;
    }
    public final String getLinkUrl(){
       return this.linkUrl;
    }
    public final int getMaxClickXMarkCount(){
       return this.maxClickXMarkCount;
    }
    public final boolean getNeedLogin(){
       return this.needLogin;
    }
    public final boolean getOnlyTk(){
       return this.onlyTk;
    }
    public final String[] getPagesString(){
       return this.pagesString;
    }
    public final long getStartTime(){
       return this.startTime;
    }
    public final boolean getSupportDemote(){
       return this.supportDemote;
    }
    public final SuspensionModel getSuspensionStateConfig(){
       return this.suspensionStateConfig;
    }
    public final String getTkBundleId(){
       return this.tkBundleId;
    }
    public final String getTkExtraParams(){
       return this.tkExtraParams;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ActivityPendantModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (((((((((this.activityId).hashCode() * 31) + this.defaultDisplayStyle) * 31) + Arrays.hashCode(this.pagesString)) * 31) + (this.linkUrl).hashCode()) * 31) + this._effectPolicy) * 31;
       int i1 = 1231;
       int i2 = (this.needLogin != null)? 1231: 1237;
       ActivityPendantModel tstartTime = this.startTime;
       tstartTime = this.endTime;
       i = (((((((((((i + i2) * 31) + this.maxClickXMarkCount) * 31) + this.adsorptionStateConfig.hashCode()) * 31) + this.suspensionStateConfig.hashCode()) * 31) + (int)(tstartTime ^ (tstartTime >> 32))) * 31) + (int)(tstartTime ^ (tstartTime >> 32))) * 31;
       i2 = (this.supportDemote != null)? 1231: 1237;
       i = (i + i2) * 31;
       ActivityPendantModel ttkExtraPara = this.tkExtraParams;
       int i3 = 0;
       i2 = (ttkExtraPara != null)? ttkExtraPara.hashCode(): 0;
       i = (((i + i2) * 31) + (this.tkBundleId).hashCode()) * 31;
       i2 = (this.onlyTk != null)? 1231: 1237;
       i = (i + i2) * 31;
       if (this.clickHoldAnimation == null) {
          i1 = 1237;
       }
       i = (((i + i1) * 31) + this.closeAlert.hashCode()) * 31;
       ttkExtraPara = this.bubble;
       if (ttkExtraPara != null) {
          i3 = ttkExtraPara.hashCode();
       }
       return (((i + i3) * 31) + this._legalArea.hashCode());
    }
    public final boolean isLoginEffect(){
       boolean b = true;
       if (this._effectPolicy == b) {
       }else {
          b = false;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ActivityPendantModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ActivityPendantModel\(activityId="+this.activityId+", defaultDisplayStyle="+this.defaultDisplayStyle+", pagesString="+Arrays.toString(this.pagesString)+", linkUrl="+this.linkUrl+", _effectPolicy="+this._effectPolicy+", needLogin="+this.needLogin+", maxClickXMarkCount="+this.maxClickXMarkCount+", adsorptionStateConfig="+this.adsorptionStateConfig+", suspensionStateConfig="+this.suspensionStateConfig+", startTime="+this.startTime+", endTime="+this.endTime+", supportDemote="+this.supportDemote+", tkExtraParams="+this.tkExtraParams+", tkBundleId="+this.tkBundleId+", onlyTk="+this.onlyTk+", clickHoldAnimation="+this.clickHoldAnimation+", closeAlert="+this.closeAlert+", bubble="+this.bubble+", _legalArea="+this._legalArea+"\)";
    }
}
