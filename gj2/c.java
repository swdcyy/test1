package gj2.c;
import erd.o;
import t02.a0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gj2.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gj2.d;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.live.model.ResolutionPlayUrls;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.android.live.log.LiveLogTag;
import com.google.common.collect.ImmutableMap;
import pp.c;
import java.util.Map;
import pp.d;
import zsd.u;
import com.yxcorp.gifshow.model.CDNUrl;
import gj2.e;
import com.kuaishou.live.core.show.screencast.exception.LiveAudienceScreencastException;

public final class c implements o	// class@002b33
{
    public final a0 b;

    public void c(a0 p0){
       a.p(p0, "callerContext");
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       Object[] objArray1;
       d uod;
       a0 e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, uoc, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "liveAudienceScreencastHlsConfig");
          String str = 2;
          if (!p0.a().isEmpty()) {
             p0 = p0.a();
             obj = p0.iterator();
             while (true) {
                Object[] objArray = null;
                if (obj.hasNext()) {
                   objArray1 = obj.next();
                   if (objArray1.mDefaultSelect == null) {
                      continue ;
                   }
                }else {
                   objArray1 = objArray;
                }
                LiveQualityItem liveQualityI = PatchProxy.apply(objArray, this, uoc, "2");
                String str1 = "targetQualityType";
                if (liveQualityI != patchProxyRe) {
                }else {
                   liveQualityI = LiveQualityItem.AutoQuality().mQualityType;
                   LiveQualityItem mLevel = LiveQualityItem.AutoQuality().mLevel;
                   e = this.b.E;
                   a.o(e, "callerContext.mLivePlayerController");
                   List liveQualityL = e.getLiveQualityList();
                   a.o(liveQualityL, "callerContext.mLivePlaye¡­ontroller.liveQualityList");
                   Iterator iterator = liveQualityL.iterator();
                   while (iterator.hasNext()) {
                      LiveQualityItem liveQualityI1 = iterator.next();
                      LiveQualityItem mLevel1 = liveQualityI1.mLevel;
                      if (mLevel1 > mLevel) {
                         liveQualityI = liveQualityI1.mQualityType;
                         mLevel = mLevel1;
                      }else {
                         continue ;
                      }
                   }
                   a.o(liveQualityI, str1);
                }
                this.b.H2.m(LiveLogTag.SCREEN_CAST, "LiveAudienceScreencastHlsFinder", ImmutableMap.of(str1, liveQualityI));
                p0 = p0.iterator();
                while (true) {
                   if (p0.hasNext()) {
                      Object obj1 = p0.next();
                      if (u.I1(obj1.mType, liveQualityI, true)) {
                         objArray = obj1;
                      }else {
                         continue ;
                      }
                   }
                   p0 = PatchProxy.applyTwoRefs(objArray, objArray1, this, uoc, "3");
                   if (p0 != patchProxyRe) {
                      obj = p0;
                      break ;
                   }else {
                      int i = 0;
                      String str2 = "findTargetHlsPlayUrl";
                      if (objArray != null) {
                         this.b.H2.m(LiveLogTag.SCREEN_CAST, str2, ImmutableMap.of("targetResolutionPlayUrl", objArray));
                         i = objArray.mUrls.get(i).mUrl;
                         a.o(i, "targetResolutionPlayUrl.mUrls[0].mUrl");
                         uod = new d(i, e.a());
                      }else if(objArray1 != null){
                         this.b.H2.m(LiveLogTag.SCREEN_CAST, str2, ImmutableMap.of("defaultResolutionPlayUrl", objArray1));
                         i = objArray1.mUrls.get(i).mUrl;
                         a.o(i, "defaultResolutionPlayUrl.mUrls[0].mUrl");
                         uod = new d(i, e.a());
                      }else {
                         throw new LiveAudienceScreencastException("not found right hls urls", str);
                      }
                      obj = uod;
                      break ;
                   }
                }
             }
          }else {
             throw new LiveAudienceScreencastException("empty liveAudienceScreencastHlsConfig.hlsPlayUrls", str);
          }
       }
       return obj;
    }
}
