package com.yxcorp.gifshow.channel.stagger.model.LiveStreamNewStyleFeed;
import da6.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.channel.stagger.model.a;
import com.kuaishou.android.model.feed.PhotoType$a;
import da6.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.LiveStreamModel;
import qj9.e;
import java.util.Map;

public class LiveStreamNewStyleFeed extends BaseFeed implements c	// class@001071
{
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtendableModelMap mExtraMap;
    public LiveStreamModel mLiveStreamModel;
    public static final long serialVersionUID = 0xcdaf06a00aec7fb8;

    public void LiveStreamNewStyleFeed(){
       super();
       this.mExtraMap = new ExtendableModelMap();
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, LiveStreamNewStyleFeed.class, "1")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.LIVE_NEW_STYLE, a.a);
       return;
    }
    public void f(String p0,Object p1){
       b.c(this, p0, p1);
    }
    public Object getExtra(String p0){
       return b.a(this, p0);
    }
    public ExtendableModelMap getExtraMap(){
       Object obj = PatchProxy.apply(null, this, LiveStreamNewStyleFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraMap == null) {
          this.mExtraMap = new ExtendableModelMap();
       }
       return this.mExtraMap;
    }
    public String getId(){
       return this.mLiveStreamModel.mLiveStreamId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStreamNewStyleFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LiveStreamNewStyleFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LiveStreamNewStyleFeed.class, new e());
       }else {
          obj.put(LiveStreamNewStyleFeed.class, null);
       }
       return obj;
    }
    public void putExtra(String p0,Object p1){
       b.b(this, p0, p1);
    }
}
