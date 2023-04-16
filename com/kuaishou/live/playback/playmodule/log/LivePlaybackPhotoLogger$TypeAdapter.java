package com.kuaishou.live.playback.playmodule.log.LivePlaybackPhotoLogger$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.playback.playmodule.log.LivePlaybackPhotoLogger;
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
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Integer;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.kuaishou.live.playback.playmodule.log.LivePlaybackSlidePlayLogger;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class LivePlaybackPhotoLogger$TypeAdapter extends TypeAdapter	// class@000d3d
{
    public final Gson a;
    public static final a b;

    static {
       LivePlaybackPhotoLogger$TypeAdapter.b = a.get(LivePlaybackPhotoLogger.class);
    }
    public void LivePlaybackPhotoLogger$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackPhotoLogger$TypeAdapter.class, "2");
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
             obj = new LivePlaybackPhotoLogger();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x871d0b05:
                      if (str.equals("prepare_time")) {
                         i = 0;
                      }
                      break;
                    case 0x89444d94:
                      if (str.equals("duration")) {
                         i = 1;
                      }
                      break;
                    case 0x949793cd:
                      if (str.equals("leaveAction")) {
                         i = 2;
                      }
                      break;
                    case 0x988e7084:
                      if (str.equals("kwaiSignature")) {
                         i = 3;
                      }
                      break;
                    case 0x9ef43556:
                      if (str.equals("comment_pause_time")) {
                         i = 4;
                      }
                      break;
                    case 0x9f91c87e:
                      if (str.equals("video_type")) {
                         i = 5;
                      }
                      break;
                    case 0xc2c80298:
                      if (str.equals("prefetchSize")) {
                         i = 6;
                      }
                      break;
                    case 0xc2e81f6c:
                      if (str.equals("buffer_time")) {
                         i = 7;
                      }
                      break;
                    case 0xcf388bd4:
                      if (str.equals("enter_time")) {
                         i = 8;
                      }
                      break;
                    case 0xdc8482ed:
                      if (str.equals("photoId")) {
                         i = 9;
                      }
                      break;
                    case 0xdddd283e:
                      if (str.equals("playing_time")) {
                         i = 10;
                      }
                      break;
                    case 0xe294859b:
                      if (str.equals("playUrl")) {
                         i = 11;
                      }
                      break;
                    case 0xe31bd535:
                      if (str.equals("has_used_earphone")) {
                         i = 12;
                      }
                      break;
                    case 0xfe375755:
                      if (str.equals("leave_time")) {
                         i = 13;
                      }
                      break;
                    case 0xca0fc05:
                      if (str.equals("other_pause_time")) {
                         i = 14;
                      }
                      break;
                    case 0x14bc97a2:
                      if (str.equals("videoQosJson")) {
                         i = 15;
                      }
                      break;
                    case 0x1d1ca58c:
                      if (str.equals("averageFps")) {
                         i = 16;
                      }
                      break;
                    case 0x1fba87c5:
                      if (str.equals("mBluetoothDeviceInfo")) {
                         i = 17;
                      }
                      break;
                    case 0x46657973:
                      if (str.equals("video_stat_comment_stay_duration")) {
                         i = 18;
                      }
                      break;
                    case 0x50f5d1ec:
                      if (str.equals("has_downloaded")) {
                         i = 19;
                      }
                      break;
                    case 0x697e4810:
                      if (str.equals("stalledCount")) {
                         i = 20;
                      }
                      break;
                    case 0x6f8a1697:
                      if (str.equals("dnsResolverHost")) {
                         i = 21;
                      }
                      break;
                    case 0x6f8c9b7a:
                      if (str.equals("dnsResolverName")) {
                         i = 22;
                      }
                      break;
                    case 0x73a026b5:
                      if (str.equals("media_type")) {
                         i = 23;
                      }
                      break;
                    case 0x73ba6928:
                      if (str.equals("dnsResolvedIP")) {
                         i = 24;
                      }
                      break;
                    case 0x7c9c4a69:
                      if (str.equals("play_video_type")) {
                         i = 25;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mPrepareDuration = KnownTypeAdapters$n.a(p0, obj.mPrepareDuration);
                      break;
                    case 1:
                      obj.mDuration = KnownTypeAdapters$n.a(p0, obj.mDuration);
                      break;
                    case 2:
                      obj.mLeaveAction = KnownTypeAdapters$k.a(p0, obj.mLeaveAction);
                      break;
                    case 3:
                      obj.mKwaiSignature = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mCommentPauseDuration = KnownTypeAdapters$n.a(p0, obj.mCommentPauseDuration);
                      break;
                    case 5:
                      obj.mVideoType = KnownTypeAdapters.c.read(p0);
                      break;
                    case 6:
                      obj.mPrefetchSize = KnownTypeAdapters$n.a(p0, obj.mPrefetchSize);
                      break;
                    case 7:
                      obj.mBufferDuration = KnownTypeAdapters$n.a(p0, obj.mBufferDuration);
                      break;
                    case 8:
                      obj.mEnterTime = KnownTypeAdapters$n.a(p0, obj.mEnterTime);
                      break;
                    case 9:
                      obj.mPhotoId = KnownTypeAdapters$n.a(p0, obj.mPhotoId);
                      break;
                    case 10:
                      obj.mPlayedDuration = KnownTypeAdapters$n.a(p0, obj.mPlayedDuration);
                      break;
                    case 11:
                      obj.mPlayUrl = TypeAdapters.A.read(p0);
                      break;
                    case 12:
                      obj.mHasUsedEarphone = KnownTypeAdapters$g.a(p0, obj.mHasUsedEarphone);
                      break;
                    case 13:
                      obj.mLeaveTime = KnownTypeAdapters$n.a(p0, obj.mLeaveTime);
                      break;
                    case 14:
                      obj.mOtherPauseDuration = KnownTypeAdapters$n.a(p0, obj.mOtherPauseDuration);
                      break;
                    case 15:
                      obj.mVideoQosJson = TypeAdapters.A.read(p0);
                      break;
                    case 16:
                      obj.mAverageFps = KnownTypeAdapters$j.a(p0, obj.mAverageFps);
                      break;
                    case 17:
                      obj.mBluetoothDeviceInfo = TypeAdapters.A.read(p0);
                      break;
                    case 18:
                      obj.mCommentStayDuration = KnownTypeAdapters$n.a(p0, obj.mCommentStayDuration);
                      break;
                    case 19:
                      obj.mHasDownloaded = KnownTypeAdapters$g.a(p0, obj.mHasDownloaded);
                      break;
                    case 20:
                      obj.mStalledCount = KnownTypeAdapters$n.a(p0, obj.mStalledCount);
                      break;
                    case 21:
                      obj.mDnsResolverHost = TypeAdapters.A.read(p0);
                      break;
                    case 22:
                      obj.mDnsResolverName = TypeAdapters.A.read(p0);
                      break;
                    case 23:
                      obj.mMediaType = KnownTypeAdapters.c.read(p0);
                      break;
                    case 24:
                      obj.mDnsResolvedIP = TypeAdapters.A.read(p0);
                      break;
                    case 25:
                      obj.mPlayVideoType = KnownTypeAdapters.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlaybackPhotoLogger$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("photoId");
          p0.K(p1.mPhotoId);
          p0.r("duration");
          p0.K(p1.mDuration);
          p0.r("playing_time");
          p0.K(p1.mPlayedDuration);
          p0.r("has_downloaded");
          p0.P(p1.mHasDownloaded);
          p0.r("prepare_time");
          p0.K(p1.mPrepareDuration);
          p0.r("enter_time");
          p0.K(p1.mEnterTime);
          p0.r("leave_time");
          p0.K(p1.mLeaveTime);
          p0.r("buffer_time");
          p0.K(p1.mBufferDuration);
          p0.r("comment_pause_time");
          p0.K(p1.mCommentPauseDuration);
          p0.r("other_pause_time");
          p0.K(p1.mOtherPauseDuration);
          if (p1.mVideoType != null) {
             p0.r("video_type");
             KnownTypeAdapters.c.write(p0, p1.mVideoType);
          }
          if (p1.mPlayVideoType != null) {
             p0.r("play_video_type");
             KnownTypeAdapters.c.write(p0, p1.mPlayVideoType);
          }
          if (p1.mMediaType != null) {
             p0.r("media_type");
             KnownTypeAdapters.c.write(p0, p1.mMediaType);
          }
          p0.r("stalledCount");
          p0.K(p1.mStalledCount);
          if (p1.mDnsResolvedIP != null) {
             p0.r("dnsResolvedIP");
             TypeAdapters.A.write(p0, p1.mDnsResolvedIP);
          }
          if (p1.mDnsResolverName != null) {
             p0.r("dnsResolverName");
             TypeAdapters.A.write(p0, p1.mDnsResolverName);
          }
          if (p1.mDnsResolverHost != null) {
             p0.r("dnsResolverHost");
             TypeAdapters.A.write(p0, p1.mDnsResolverHost);
          }
          if (p1.mPlayUrl != null) {
             p0.r("playUrl");
             TypeAdapters.A.write(p0, p1.mPlayUrl);
          }
          p0.r("video_stat_comment_stay_duration");
          p0.K(p1.mCommentStayDuration);
          p0.r("averageFps");
          p0.J((double)p1.mAverageFps);
          p0.r("prefetchSize");
          p0.K(p1.mPrefetchSize);
          p0.r("leaveAction");
          p0.K((long)p1.mLeaveAction);
          if (p1.mBluetoothDeviceInfo != null) {
             p0.r("mBluetoothDeviceInfo");
             TypeAdapters.A.write(p0, p1.mBluetoothDeviceInfo);
          }
          p0.r("has_used_earphone");
          p0.P(p1.mHasUsedEarphone);
          if (p1.mVideoQosJson != null) {
             p0.r("videoQosJson");
             TypeAdapters.A.write(p0, p1.mVideoQosJson);
          }
          if (p1.mKwaiSignature != null) {
             p0.r("kwaiSignature");
             TypeAdapters.A.write(p0, p1.mKwaiSignature);
          }
          p0.j();
       }
       return;
    }
}
