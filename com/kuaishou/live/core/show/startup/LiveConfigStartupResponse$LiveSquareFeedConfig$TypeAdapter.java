package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter extends TypeAdapter	// class@00107d
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveSquareFeedConfig.class);
    }
    public void LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveSquareFeedConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc2201542:
                      if (str.equals("slideGuideDelayShowMills")) {
                         i = 0;
                      }
                      break;
                    case 0xd302872c:
                      if (str.equals("squareBannerShowMillis")) {
                         i = 1;
                      }
                      break;
                    case 0xdea71789:
                      if (str.equals("sideTabKeepMillis")) {
                         i = 2;
                      }
                      break;
                    case 0xe0ebfbf3:
                      if (str.equals("squareSearchBarScheme")) {
                         i = 3;
                      }
                      break;
                    case 0x200793ee:
                      if (str.equals("slideGuideTipsIntervalMillis")) {
                         i = 4;
                      }
                      break;
                    case 0x3c5d99ca:
                      if (str.equals("refreshLiveSquareMillis")) {
                         i = 5;
                      }
                      break;
                    case 0x49c5fca6:
                      if (str.equals("disableSquareSearchBar")) {
                         i = 6;
                      }
                      break;
                    case 0x54db2b4f:
                      if (str.equals("slideGuideShowMills")) {
                         i = 7;
                      }
                      break;
                    case 0x5c6a5515:
                      if (str.equals("recoSlideGuideIntervalMillis")) {
                         i = 8;
                      }
                      break;
                    case 0x78b61f05:
                      if (str.equals("slideGuideTipsMaxTimes")) {
                         i = 9;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSlideOnceGuideDelayShowMs = KnownTypeAdapters$n.a(p0, obj.mSlideOnceGuideDelayShowMs);
                      break;
                    case 1:
                      obj.mSquareBannerShowMs = KnownTypeAdapters$n.a(p0, obj.mSquareBannerShowMs);
                      break;
                    case 2:
                      obj.mSquareKeepCurrentTabDurationMs = KnownTypeAdapters$n.a(p0, obj.mSquareKeepCurrentTabDurationMs);
                      break;
                    case 3:
                      obj.mSquareSearchButtonScheme = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mSquareSlideGuideIntervalMs = KnownTypeAdapters$n.a(p0, obj.mSquareSlideGuideIntervalMs);
                      break;
                    case 5:
                      obj.mRefreshLiveSquareMs = KnownTypeAdapters$n.a(p0, obj.mRefreshLiveSquareMs);
                      break;
                    case 6:
                      obj.mDisableSquareSearchButton = KnownTypeAdapters$g.a(p0, obj.mDisableSquareSearchButton);
                      break;
                    case 7:
                      obj.mSlideOnceGuideDurationMs = KnownTypeAdapters$n.a(p0, obj.mSlideOnceGuideDurationMs);
                      break;
                    case 8:
                      obj.mRecoSlideGuideIntervalMs = KnownTypeAdapters$n.a(p0, obj.mRecoSlideGuideIntervalMs);
                      break;
                    case 9:
                      obj.mBottomSlideGuideMaxShownCount = KnownTypeAdapters$k.a(p0, obj.mBottomSlideGuideMaxShownCount);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("refreshLiveSquareMillis");
          p0.K(p1.mRefreshLiveSquareMs);
          p0.r("squareBannerShowMillis");
          p0.K(p1.mSquareBannerShowMs);
          p0.r("slideGuideTipsIntervalMillis");
          p0.K(p1.mSquareSlideGuideIntervalMs);
          p0.r("slideGuideTipsMaxTimes");
          p0.K((long)p1.mBottomSlideGuideMaxShownCount);
          p0.r("sideTabKeepMillis");
          p0.K(p1.mSquareKeepCurrentTabDurationMs);
          p0.r("slideGuideDelayShowMills");
          p0.K(p1.mSlideOnceGuideDelayShowMs);
          p0.r("recoSlideGuideIntervalMillis");
          p0.K(p1.mRecoSlideGuideIntervalMs);
          p0.r("slideGuideShowMills");
          p0.K(p1.mSlideOnceGuideDurationMs);
          p0.r("disableSquareSearchBar");
          p0.P(p1.mDisableSquareSearchButton);
          if (p1.mSquareSearchButtonScheme != null) {
             p0.r("squareSearchBarScheme");
             TypeAdapters.A.write(p0, p1.mSquareSearchButtonScheme);
          }
          p0.j();
       }
       return;
    }
}
