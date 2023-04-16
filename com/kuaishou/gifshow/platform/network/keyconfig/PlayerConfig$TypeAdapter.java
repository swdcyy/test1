package com.kuaishou.gifshow.platform.network.keyconfig.PlayerConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.PlayerConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PlayerConfig$TypeAdapter extends TypeAdapter	// class@00087d
{
    public final Gson a;
    public static final a b;

    static {
       PlayerConfig$TypeAdapter.b = a.get(PlayerConfig.class);
    }
    public void PlayerConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlayerConfig$TypeAdapter.class, "2");
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
             obj = new PlayerConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9849705f:
                      if (str.equals("detailMaxResolution")) {
                         i = 0;
                      }
                      break;
                    case 0xa522bba7:
                      if (str.equals("bitrate_init_level")) {
                         i = 1;
                      }
                      break;
                    case 0xb3beddbc:
                      if (str.equals("short_keep_interval")) {
                         i = 2;
                      }
                      break;
                    case 0xc466444d:
                      if (str.equals("download_percent_thr")) {
                         i = 3;
                      }
                      break;
                    case 0xfa1b29c2:
                      if (str.equals("maxSpeedbps")) {
                         i = 4;
                      }
                      break;
                    case 0x7d9a267:
                      if (str.equals("max_resolution")) {
                         i = 5;
                      }
                      break;
                    case 0x253b34cf:
                      if (str.equals("preferQuality")) {
                         i = 6;
                      }
                      break;
                    case 0x3d910cb1:
                      if (str.equals("detailMaxSpeedbps")) {
                         i = 7;
                      }
                      break;
                    case 0x4b2fb323:
                      if (str.equals("maxBufferDurMs")) {
                         i = 8;
                      }
                      break;
                    case 0x4c109fbc:
                      if (str.equals("long_keep_interval")) {
                         i = 9;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDetailMaxResolution = KnownTypeAdapters$k.a(p0, obj.mDetailMaxResolution);
                      break;
                    case 1:
                      obj.mBitrateInitLevel = KnownTypeAdapters$k.a(p0, obj.mBitrateInitLevel);
                      break;
                    case 2:
                      obj.mShortKeepInterval = KnownTypeAdapters$k.a(p0, obj.mShortKeepInterval);
                      break;
                    case 3:
                      obj.mDownloadPercentThreshhold = KnownTypeAdapters$k.a(p0, obj.mDownloadPercentThreshhold);
                      break;
                    case 4:
                      obj.mMaxSpeedbps = KnownTypeAdapters$k.a(p0, obj.mMaxSpeedbps);
                      break;
                    case 5:
                      obj.mMaxResolution = KnownTypeAdapters$k.a(p0, obj.mMaxResolution);
                      break;
                    case 6:
                      obj.mPreferQuality = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mDetailMaxSpeedbps = KnownTypeAdapters$k.a(p0, obj.mDetailMaxSpeedbps);
                      break;
                    case 8:
                      obj.mMaxBufferDurMs = KnownTypeAdapters$k.a(p0, obj.mMaxBufferDurMs);
                      break;
                    case 9:
                      obj.mLongKeepInterval = KnownTypeAdapters$k.a(p0, obj.mLongKeepInterval);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("maxBufferDurMs");
          p0.K((long)p1.mMaxBufferDurMs);
          if (p1.mPreferQuality != null) {
             p0.r("preferQuality");
             TypeAdapters.A.write(p0, p1.mPreferQuality);
          }
          p0.r("short_keep_interval");
          p0.K((long)p1.mShortKeepInterval);
          p0.r("long_keep_interval");
          p0.K((long)p1.mLongKeepInterval);
          p0.r("bitrate_init_level");
          p0.K((long)p1.mBitrateInitLevel);
          p0.r("max_resolution");
          p0.K((long)p1.mMaxResolution);
          p0.r("maxSpeedbps");
          p0.K((long)p1.mMaxSpeedbps);
          p0.r("detailMaxSpeedbps");
          p0.K((long)p1.mDetailMaxSpeedbps);
          p0.r("detailMaxResolution");
          p0.K((long)p1.mDetailMaxResolution);
          p0.r("download_percent_thr");
          p0.K((long)p1.mDownloadPercentThreshhold);
          p0.j();
       }
       return;
    }
}
