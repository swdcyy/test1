package com.yxcorp.gifshow.tube.SerialInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.SerialInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner$TypeAdapter;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription$TypeAdapter;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import ilc.e;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount;
import com.google.gson.stream.b;
import ilc.d;

public final class SerialInfo$TypeAdapter extends TypeAdapter	// class@001def
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       SerialInfo$TypeAdapter.f = a.get(SerialInfo.class);
    }
    public void SerialInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       this.c = p0.j(SerialInfo$RightTopCorner$TypeAdapter.b);
       this.d = p0.j(SerialInfo$SplitEntranceDescription$TypeAdapter.b);
       this.e = p0.j(SerialInfo$ClusterSerialCount$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SerialInfo$TypeAdapter.class, "2");
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
             obj = new SerialInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9994501a:
                      if (str.equals("detailPhotoTags")) {
                         i = 0;
                      }
                      break;
                    case 0xaf42d144:
                      if (str.equals("counts")) {
                         i = 1;
                      }
                      break;
                    case 0xb1f22278:
                      if (str.equals("exp_tag")) {
                         i = 2;
                      }
                      break;
                    case 0xb6810d3f:
                      if (str.equals("isCollected")) {
                         i = 3;
                      }
                      break;
                    case 0xb828af4c:
                      if (str.equals("moduleTitle")) {
                         i = 4;
                      }
                      break;
                    case 0xcb223cde:
                      if (str.equals("tvLandscapeCover")) {
                         i = 5;
                      }
                      break;
                    case 0xcc3c85ec:
                      if (str.equals("splitEntranceDescription")) {
                         i = 6;
                      }
                      break;
                    case 0xd7e6e31a:
                      if (str.equals("businessType")) {
                         i = 7;
                      }
                      break;
                    case 0xf1d571f5:
                      if (str.equals("latestDescription")) {
                         i = 8;
                      }
                      break;
                    case 0xf6a5f366:
                      if (str.equals("entranceDescription")) {
                         i = 9;
                      }
                      break;
                    case 0xf88eb6a2:
                      if (str.equals("latestSeen")) {
                         i = 10;
                      }
                      break;
                    case 0xfda2094e:
                      if (str.equals("rightTopCorner")) {
                         i = 11;
                      }
                      break;
                    case 3355:
                      if (str.equals("id")) {
                         i = 12;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 13;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 14;
                      }
                      break;
                    case 0x1e837758:
                      if (str.equals("panelDescription")) {
                         i = 15;
                      }
                      break;
                    case 0x26ac78f1:
                      if (str.equals("tubeCopyrightInfo")) {
                         i = 16;
                      }
                      break;
                    case 0x4cc2cab4:
                      if (str.equals("panelTitle")) {
                         i = 17;
                      }
                      break;
                    case 0x5ed127d4:
                      if (str.equals("episodeCount")) {
                         i = 18;
                      }
                      break;
                    case 0x6584c5b2:
                      if (str.equals("adoptionType")) {
                         i = 19;
                      }
                      break;
                    case 0x6b3c86a8:
                      if (str.equals("isClusterSerialOrSubDetailFeed")) {
                         i = 20;
                      }
                      break;
                    case 0x6e73aad5:
                      if (str.equals("collectName")) {
                         i = 21;
                      }
                      break;
                    case 0x76fbfe3b:
                      if (str.equals("mmuIpCover")) {
                         i = 22;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDetailPhotoTags = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mClusterSerialCount = this.e.read(p0);
                      break;
                    case 2:
                      obj.mExpTag = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.isCollected = KnownTypeAdapters$g.a(p0, obj.isCollected);
                      break;
                    case 4:
                      obj.mModuleTitle = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mTvLandscapeCover = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new e(this)).a(p0);
                      break;
                    case 6:
                      obj.mSplitEntranceDescription = this.d.read(p0);
                      break;
                    case 7:
                      obj.mBusinessType = KnownTypeAdapters$k.a(p0, obj.mBusinessType);
                      break;
                    case 8:
                      obj.mLatestDescription = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mEntranceDescription = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mLatestSeen = TypeAdapters.A.read(p0);
                      break;
                    case 11:
                      obj.mRightTopCorner = this.c.read(p0);
                      break;
                    case 12:
                      obj.mSerialId = TypeAdapters.A.read(p0);
                      break;
                    case 13:
                      obj.mType = KnownTypeAdapters$k.a(p0, obj.mType);
                      break;
                    case 14:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 15:
                      obj.mPanelDescription = TypeAdapters.A.read(p0);
                      break;
                    case 16:
                      obj.mTubeCopyrightInfo = TypeAdapters.A.read(p0);
                      break;
                    case 17:
                      obj.mPanelTitle = TypeAdapters.A.read(p0);
                      break;
                    case 18:
                      obj.mEpisodeCount = KnownTypeAdapters$k.a(p0, obj.mEpisodeCount);
                      break;
                    case 19:
                      obj.mAdoptionType = KnownTypeAdapters$k.a(p0, obj.mAdoptionType);
                      break;
                    case 20:
                      obj.isSerialCluster = KnownTypeAdapters$g.a(p0, obj.isSerialCluster);
                      break;
                    case 21:
                      obj.mCollectName = TypeAdapters.A.read(p0);
                      break;
                    case 22:
                      obj.mMmuIpCover = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SerialInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSerialId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mSerialId);
          }
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mTvLandscapeCover != null) {
             p0.r("tvLandscapeCover");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new d(this)).b(p0, p1.mTvLandscapeCover);
          }
          if (p1.mEntranceDescription != null) {
             p0.r("entranceDescription");
             TypeAdapters.A.write(p0, p1.mEntranceDescription);
          }
          if (p1.mDetailPhotoTags != null) {
             p0.r("detailPhotoTags");
             TypeAdapters.A.write(p0, p1.mDetailPhotoTags);
          }
          if (p1.mPanelDescription != null) {
             p0.r("panelDescription");
             TypeAdapters.A.write(p0, p1.mPanelDescription);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mExpTag != null) {
             p0.r("exp_tag");
             TypeAdapters.A.write(p0, p1.mExpTag);
          }
          p0.r("episodeCount");
          p0.K((long)p1.mEpisodeCount);
          if (p1.mRightTopCorner != null) {
             p0.r("rightTopCorner");
             this.c.write(p0, p1.mRightTopCorner);
          }
          if (p1.mCollectName != null) {
             p0.r("collectName");
             TypeAdapters.A.write(p0, p1.mCollectName);
          }
          if (p1.mLatestDescription != null) {
             p0.r("latestDescription");
             TypeAdapters.A.write(p0, p1.mLatestDescription);
          }
          if (p1.mLatestSeen != null) {
             p0.r("latestSeen");
             TypeAdapters.A.write(p0, p1.mLatestSeen);
          }
          if (p1.mSplitEntranceDescription != null) {
             p0.r("splitEntranceDescription");
             this.d.write(p0, p1.mSplitEntranceDescription);
          }
          p0.r("isClusterSerialOrSubDetailFeed");
          p0.P(p1.isSerialCluster);
          p0.r("adoptionType");
          p0.K((long)p1.mAdoptionType);
          if (p1.mMmuIpCover != null) {
             p0.r("mmuIpCover");
             TypeAdapters.A.write(p0, p1.mMmuIpCover);
          }
          p0.r("isCollected");
          p0.P(p1.isCollected);
          if (p1.mClusterSerialCount != null) {
             p0.r("counts");
             this.e.write(p0, p1.mClusterSerialCount);
          }
          if (p1.mTubeCopyrightInfo != null) {
             p0.r("tubeCopyrightInfo");
             TypeAdapters.A.write(p0, p1.mTubeCopyrightInfo);
          }
          if (p1.mPanelTitle != null) {
             p0.r("panelTitle");
             TypeAdapters.A.write(p0, p1.mPanelTitle);
          }
          if (p1.mModuleTitle != null) {
             p0.r("moduleTitle");
             TypeAdapters.A.write(p0, p1.mModuleTitle);
          }
          p0.r("businessType");
          p0.K((long)p1.mBusinessType);
          p0.j();
       }
       return;
    }
}
