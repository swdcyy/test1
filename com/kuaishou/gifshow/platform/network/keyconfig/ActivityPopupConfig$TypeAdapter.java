package com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$PopupUiConfig$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$PopupUiConfig;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class ActivityPopupConfig$TypeAdapter extends TypeAdapter	// class@000853
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       ActivityPopupConfig$TypeAdapter.e = a.get(ActivityPopupConfig.class);
    }
    public void ActivityPopupConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ActivityPopupConfig$PopupUiConfig$TypeAdapter.d);
       this.c = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
       this.d = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ActivityPopupConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new ActivityPopupConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x81158a4f:
                      if (str.equals("startTime")) {
                         i = 0;
                      }
                      break;
                    case 0x957315eb:
                      if (str.equals("isAbandon")) {
                         i = 1;
                      }
                      break;
                    case 0x9d829705:
                      if (str.equals("blackPages")) {
                         i = 2;
                      }
                      break;
                    case 0xa0336a48:
                      if (str.equals("endTime")) {
                         i = 3;
                      }
                      break;
                    case 0xa4fc3ef6:
                      if (str.equals("uiConfig")) {
                         i = 4;
                      }
                      break;
                    case 0xba8879a4:
                      if (str.equals("priority")) {
                         i = 5;
                      }
                      break;
                    case 0xbe071a81:
                      if (str.equals("ksOrderId")) {
                         i = 6;
                      }
                      break;
                    case 0xe884fee7:
                      if (str.equals("popupId")) {
                         i = 7;
                      }
                      break;
                    case 0xf944e6bf:
                      if (str.equals("tkExtraParams")) {
                         i = 8;
                      }
                      break;
                    case 0x18461d19:
                      if (str.equals("dismissDelay")) {
                         i = 9;
                      }
                      break;
                    case 0x4747637f:
                      if (str.equals("viewType")) {
                         i = 10;
                      }
                      break;
                    case 0x4ba40179:
                      if (str.equals("intervalDuration")) {
                         i = 11;
                      }
                      break;
                    case 0x4c9df990:
                      if (str.equals("dispersedTime")) {
                         i = 12;
                      }
                      break;
                    case 0x5daecb76:
                      if (str.equals("blackPagesString")) {
                         i = 13;
                      }
                      break;
                    case 0x60912cd4:
                      if (str.equals("tkBundleId")) {
                         i = 14;
                      }
                      break;
                    case 0x7a1b748a:
                      if (str.equals("activityId")) {
                         i = 15;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mStartTime = KnownTypeAdapters$n.a(p0, obj.mStartTime);
                      break;
                    case 1:
                      obj.mIsAbandon = KnownTypeAdapters$g.a(p0, obj.mIsAbandon);
                      break;
                    case 2:
                      obj.mBlackPages = this.c.read(p0);
                      break;
                    case 3:
                      obj.mEndTime = KnownTypeAdapters$n.a(p0, obj.mEndTime);
                      break;
                    case 4:
                      obj.mPopupUiConfig = this.b.read(p0);
                      break;
                    case 5:
                      obj.mPriority = KnownTypeAdapters$k.a(p0, obj.mPriority);
                      break;
                    case 6:
                      obj.mKsOrderId = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mPopupId = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mTkExtraParams = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mDismissDelay = KnownTypeAdapters$k.a(p0, obj.mDismissDelay);
                      break;
                    case 10:
                      obj.mViewType = KnownTypeAdapters$k.a(p0, obj.mViewType);
                      break;
                    case 11:
                      obj.mIntervalDuration = KnownTypeAdapters$k.a(p0, obj.mIntervalDuration);
                      break;
                    case 12:
                      obj.mDispersedTime = KnownTypeAdapters$k.a(p0, obj.mDispersedTime);
                      break;
                    case 13:
                      obj.mBlackPagesString = this.d.read(p0);
                      break;
                    case 14:
                      obj.mTkBundleId = TypeAdapters.A.read(p0);
                      break;
                    case 15:
                      obj.mActivityId = TypeAdapters.A.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityPopupConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPopupId != null) {
             p0.r("popupId");
             TypeAdapters.A.write(p0, p1.mPopupId);
          }
          if (p1.mActivityId != null) {
             p0.r("activityId");
             TypeAdapters.A.write(p0, p1.mActivityId);
          }
          if (p1.mKsOrderId != null) {
             p0.r("ksOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
          }
          p0.r("startTime");
          p0.K(p1.mStartTime);
          p0.r("endTime");
          p0.K(p1.mEndTime);
          p0.r("dispersedTime");
          p0.K((long)p1.mDispersedTime);
          p0.r("priority");
          p0.K((long)p1.mPriority);
          p0.r("intervalDuration");
          p0.K((long)p1.mIntervalDuration);
          p0.r("isAbandon");
          p0.P(p1.mIsAbandon);
          if (p1.mPopupUiConfig != null) {
             p0.r("uiConfig");
             this.b.write(p0, p1.mPopupUiConfig);
          }
          if (p1.mTkExtraParams != null) {
             p0.r("tkExtraParams");
             TypeAdapters.A.write(p0, p1.mTkExtraParams);
          }
          if (p1.mTkBundleId != null) {
             p0.r("tkBundleId");
             TypeAdapters.A.write(p0, p1.mTkBundleId);
          }
          if (p1.mBlackPages != null) {
             p0.r("blackPages");
             this.c.write(p0, p1.mBlackPages);
          }
          if (p1.mBlackPagesString != null) {
             p0.r("blackPagesString");
             this.d.write(p0, p1.mBlackPagesString);
          }
          p0.r("viewType");
          p0.K((long)p1.mViewType);
          p0.r("dismissDelay");
          p0.K((long)p1.mDismissDelay);
          p0.j();
       }
       return;
    }
}
