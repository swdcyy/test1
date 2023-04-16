package com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$AdEventTrackData$TypeAdapter extends TypeAdapter	// class@000d77
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       PlcEntryStyleInfo$AdEventTrackData$TypeAdapter.f = a.get(PlcEntryStyleInfo$AdEventTrackData.class);
    }
    public void PlcEntryStyleInfo$AdEventTrackData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PlcEntryStyleInfo$Track$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter1 = p0.j(PlcEntryStyleInfo$TrackInfo$TypeAdapter.b);
       this.d = typeAdapter1;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public PlcEntryStyleInfo$AdEventTrackData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$AdEventTrackData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$AdEventTrackData uAdEventTrac = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdEventTrac;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdEventTrac;
       }else {
          p0.c();
          PlcEntryStyleInfo$AdEventTrackData uAdEventTrac1 = new PlcEntryStyleInfo$AdEventTrackData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8653e87b:
                   if (str.equals("liveReservationId")) {
                      i = 0;
                   }
                   break;
                 case 0x9b6e2b51:
                   if (str.equals("advertiserUserId")) {
                      i = 1;
                   }
                   break;
                 case 0x9c0c4a8b:
                   if (str.equals("adTracks")) {
                      i = 2;
                   }
                   break;
                 case 0xab2f45fd:
                   if (str.equals("adType")) {
                      i = 3;
                   }
                   break;
                 case 0xae6b3984:
                   if (str.equals("plcExtData")) {
                      i = 4;
                   }
                   break;
                 case 0xb21df56b:
                   if (str.equals("extData")) {
                      i = 5;
                   }
                   break;
                 case 0xb80cf509:
                   if (str.equals("orderId")) {
                      i = 6;
                   }
                   break;
                 case 0xbdc0e5f5:
                   if (str.equals("sourceType")) {
                      i = 7;
                   }
                   break;
                 case 0xc4a6040a:
                   if (str.equals("pageId")) {
                      i = 8;
                   }
                   break;
                 case 0xc5d402d4:
                   if (str.equals("templateType")) {
                      i = 9;
                   }
                   break;
                 case 0xcb7ef180:
                   if (str.equals("taskId")) {
                      i = 10;
                   }
                   break;
                 case 0xce61bf7d:
                   if (str.equals("adTrackInfos")) {
                      i = 11;
                   }
                   break;
                 case 0xd832e1c7:
                   if (str.equals("liveStreamId")) {
                      i = 12;
                   }
                   break;
                 case 0xe2d4fe6a:
                   if (str.equals("subPageId")) {
                      i = 13;
                   }
                   break;
                 case 0xf8034478:
                   if (str.equals("trafficSource")) {
                      i = 14;
                   }
                   break;
                 case 0x304fb52:
                   if (str.equals("liveReservationStatus")) {
                      i = 15;
                   }
                   break;
                 case 0x5859731:
                   if (str.equals("adPos")) {
                      i = 16;
                   }
                   break;
                 case 0x624bf4e:
                   if (str.equals("llsid")) {
                      i = 17;
                   }
                   break;
                 case 0x65e5105:
                   if (str.equals("poiId")) {
                      i = 18;
                   }
                   break;
                 case 0x1120a12e:
                   if (str.equals("gridPos")) {
                      i = 19;
                   }
                   break;
                 case 0x2c9bfca5:
                   if (str.equals("gridUnitId")) {
                      i = 20;
                   }
                   break;
                 case 0x326aee32:
                   if (str.equals("reportTrackInfoTime")) {
                      i = 21;
                   }
                   break;
                 case 0x33e00bfe:
                   if (str.equals("liveStatus")) {
                      i = 22;
                   }
                   break;
                 case 0x39214b32:
                   if (str.equals("coverId")) {
                      i = 23;
                   }
                   break;
                 case 0x4a2457c7:
                   if (str.equals("missionId")) {
                      i = 24;
                   }
                   break;
                 case 0x51e4492a:
                   if (str.equals("creativeId")) {
                      i = 25;
                   }
                   break;
                 case 0x54818182:
                   if (str.equals("chargeInfo")) {
                      i = 26;
                   }
                   break;
                 case 0x5c84c766:
                   if (str.equals("liveReservationAuthorId")) {
                      i = 27;
                   }
                   break;
                 case 0x60eba909:
                   if (str.equals("orderSource")) {
                      i = 28;
                   }
                   break;
                 case 0x7be101de:
                   if (str.equals("adOperationType")) {
                      i = 29;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAdEventTrac1.mLiveReservationId = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uAdEventTrac1.mAdvertiserUserId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mAdvertiserUserId);
                   break;
                 case 2:
                   uAdEventTrac1.mAdTracks = this.c.read(p0);
                   break;
                 case 3:
                   uAdEventTrac1.mAdType = KnownTypeAdapters$k.a(p0, uAdEventTrac1.mAdType);
                   break;
                 case 4:
                   uAdEventTrac1.mPlcExtData = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uAdEventTrac1.mExtData = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uAdEventTrac1.mOrderId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mOrderId);
                   break;
                 case 7:
                   uAdEventTrac1.mSourceType = KnownTypeAdapters$k.a(p0, uAdEventTrac1.mSourceType);
                   break;
                 case 8:
                   uAdEventTrac1.mPageId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mPageId);
                   break;
                 case 9:
                   uAdEventTrac1.mTemplateType = KnownTypeAdapters$k.a(p0, uAdEventTrac1.mTemplateType);
                   break;
                 case 10:
                   uAdEventTrac1.mTaskId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mTaskId);
                   break;
                 case 11:
                   uAdEventTrac1.mAdTrackInfos = this.e.read(p0);
                   break;
                 case 12:
                   uAdEventTrac1.mLiveStreamId = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   uAdEventTrac1.mSubPageId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mSubPageId);
                   break;
                 case 14:
                   uAdEventTrac1.mTrafficSource = TypeAdapters.A.read(p0);
                   break;
                 case 15:
                   uAdEventTrac1.mLiveReservationStatus = KnownTypeAdapters$k.a(p0, uAdEventTrac1.mLiveReservationStatus);
                   break;
                 case 16:
                   uAdEventTrac1.mAdPos = KnownTypeAdapters$k.a(p0, uAdEventTrac1.mAdPos);
                   break;
                 case 17:
                   uAdEventTrac1.mLlsid = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mLlsid);
                   break;
                 case 18:
                   uAdEventTrac1.mPoiId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mPoiId);
                   break;
                 case 19:
                   uAdEventTrac1.mGridPos = KnownTypeAdapters$k.a(p0, uAdEventTrac1.mGridPos);
                   break;
                 case 20:
                   uAdEventTrac1.mGridUnitId = TypeAdapters.A.read(p0);
                   break;
                 case 21:
                   uAdEventTrac1.mReportTrackInfoTime = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mReportTrackInfoTime);
                   break;
                 case 22:
                   uAdEventTrac1.mLiveStatus = KnownTypeAdapters$k.a(p0, uAdEventTrac1.mLiveStatus);
                   break;
                 case 23:
                   uAdEventTrac1.mCoverId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mCoverId);
                   break;
                 case 24:
                   uAdEventTrac1.mMissionId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mMissionId);
                   break;
                 case 25:
                   uAdEventTrac1.mCreativeId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mCreativeId);
                   break;
                 case 26:
                   uAdEventTrac1.mChargeInfo = TypeAdapters.A.read(p0);
                   break;
                 case 27:
                   uAdEventTrac1.mLiveReservationAuthorId = KnownTypeAdapters$n.a(p0, uAdEventTrac1.mLiveReservationAuthorId);
                   break;
                 case 28:
                   uAdEventTrac1.mOrderSource = TypeAdapters.A.read(p0);
                   break;
                 case 29:
                   uAdEventTrac1.mAdOperationType = KnownTypeAdapters$k.a(p0, uAdEventTrac1.mAdOperationType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAdEventTrac1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$AdEventTrackData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$AdEventTrackData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAdTracks != null) {
             p0.r("adTracks");
             this.c.write(p0, p1.mAdTracks);
          }
          if (p1.mAdTrackInfos != null) {
             p0.r("adTrackInfos");
             this.e.write(p0, p1.mAdTrackInfos);
          }
          p0.r("sourceType");
          p0.K((long)p1.mSourceType);
          p0.r("adType");
          p0.K((long)p1.mAdType);
          if (p1.mExtData != null) {
             p0.r("extData");
             TypeAdapters.A.write(p0, p1.mExtData);
          }
          p0.r("orderId");
          p0.K(p1.mOrderId);
          if (p1.mChargeInfo != null) {
             p0.r("chargeInfo");
             TypeAdapters.A.write(p0, p1.mChargeInfo);
          }
          p0.r("coverId");
          p0.K(p1.mCoverId);
          p0.r("creativeId");
          p0.K(p1.mCreativeId);
          p0.r("llsid");
          p0.K(p1.mLlsid);
          p0.r("pageId");
          p0.K(p1.mPageId);
          p0.r("subPageId");
          p0.K(p1.mSubPageId);
          p0.r("gridPos");
          p0.K((long)p1.mGridPos);
          if (p1.mGridUnitId != null) {
             p0.r("gridUnitId");
             TypeAdapters.A.write(p0, p1.mGridUnitId);
          }
          p0.r("templateType");
          p0.K((long)p1.mTemplateType);
          p0.r("adPos");
          p0.K((long)p1.mAdPos);
          p0.r("adOperationType");
          p0.K((long)p1.mAdOperationType);
          p0.r("reportTrackInfoTime");
          p0.K(p1.mReportTrackInfoTime);
          p0.r("advertiserUserId");
          p0.K(p1.mAdvertiserUserId);
          p0.r("poiId");
          p0.K(p1.mPoiId);
          p0.r("missionId");
          p0.K(p1.mMissionId);
          p0.r("taskId");
          p0.K(p1.mTaskId);
          if (p1.mLiveReservationId != null) {
             p0.r("liveReservationId");
             TypeAdapters.A.write(p0, p1.mLiveReservationId);
          }
          p0.r("liveReservationAuthorId");
          p0.K(p1.mLiveReservationAuthorId);
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          p0.r("liveStatus");
          p0.K((long)p1.mLiveStatus);
          p0.r("liveReservationStatus");
          p0.K((long)p1.mLiveReservationStatus);
          if (p1.mOrderSource != null) {
             p0.r("orderSource");
             TypeAdapters.A.write(p0, p1.mOrderSource);
          }
          if (p1.mTrafficSource != null) {
             p0.r("trafficSource");
             TypeAdapters.A.write(p0, p1.mTrafficSource);
          }
          if (p1.mPlcExtData != null) {
             p0.r("plcExtData");
             TypeAdapters.A.write(p0, p1.mPlcExtData);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
