package com.kuaishou.live.core.show.highlight.model.LiveAudienceHighlightVideoInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kuaishou.live.debuglog.LiveModelLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveAudienceHighlightVideoInfo implements Serializable	// class@000be9
{
    public List mHighlightVideoCoverUrl;
    public List mHighlightVideoDownloadUrl;
    public long mHighlightVideoDurationMills;
    public long mHighlightVideoFileSize;
    public String mHighlightVideoId;
    public String mHighlightVideoPreviewUrl;
    public KwaiManifest mMediaManifest;
    public long mStartTimeMs;
    public int mVideoHeight;
    public int mVideoWidth;
    public static final long serialVersionUID = 0xa02a4763381ad86;

    public void LiveAudienceHighlightVideoInfo(){
       super();
    }
    public List getHighlightVideoDownloadUrls(){
       LinkedList obj = PatchProxy.apply(null, this, LiveAudienceHighlightVideoInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedList();
       if (!q.f(this.mHighlightVideoDownloadUrl)) {
          Iterator iterator = this.mHighlightVideoDownloadUrl.iterator();
          while (iterator.hasNext()) {
             obj.add(iterator.next().mUrl);
          }
       }
       return obj;
    }
    public KwaiManifest getHlsManifest(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveAudienceHighlightVideoInfo obj = PatchProxy.apply(objArray, this, LiveAudienceHighlightVideoInfo.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.mMediaManifest == null) {
          obj = this.mHighlightVideoPreviewUrl;
          KwaiManifest kwaiManifest = PatchProxy.applyOneRefs(obj, objArray, LiveAudienceHighlightVideoInfo.class, "2");
          if (kwaiManifest != patchProxyRe) {
          }else {
             kwaiManifest = KwaiManifest.from(obj);
             if (kwaiManifest == null) {
                b.B(LiveModelLogTag.LIVE_HIGHLIGHT, "parseHlsManifest failed");
             }
          }
          this.mMediaManifest = kwaiManifest;
       }
       return this.mMediaManifest;
    }
}
