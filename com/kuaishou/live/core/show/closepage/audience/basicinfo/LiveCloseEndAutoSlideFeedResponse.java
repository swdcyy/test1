package com.kuaishou.live.core.show.closepage.audience.basicinfo.LiveCloseEndAutoSlideFeedResponse;
import java.io.Serializable;
import mkd.a;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.LiveCloseEndAutoSlideFeedResponse$a;
import nsd.u;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveCloseEndAutoSlideFeedResponse implements Serializable, a	// class@000a30
{
    public final List feedList;
    public final String listLoadSequenceID;
    public static final LiveCloseEndAutoSlideFeedResponse$a Companion;
    public static final long serialVersionUID;

    static {
       LiveCloseEndAutoSlideFeedResponse.Companion = new LiveCloseEndAutoSlideFeedResponse$a(null);
    }
    public void LiveCloseEndAutoSlideFeedResponse(List p0,String p1){
       super();
       this.feedList = p0;
       this.listLoadSequenceID = p1;
    }
    public static LiveCloseEndAutoSlideFeedResponse copy$default(LiveCloseEndAutoSlideFeedResponse p0,List p1,String p2,int p3,Object p4){
       LiveCloseEndAutoSlideFeedResponse liveCloseEnd;
       LiveCloseEndAutoSlideFeedResponse listLoadSequ;
       if (p3 & 0x01) {
          liveCloseEnd = p0.feedList;
       }
       if (p3 & 0x02) {
          listLoadSequ = p0.listLoadSequenceID;
       }
       return p0.copy(liveCloseEnd, listLoadSequ);
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveCloseEndAutoSlideFeedResponse.class, "1")) {
          return;
       }
       LiveCloseEndAutoSlideFeedResponse tLiveCloseEn = this.feedList;
       if (tLiveCloseEn != null) {
          Iterator iterator = tLiveCloseEn.iterator();
          while (iterator.hasNext()) {
             r1.Y4(iterator.next(), this.listLoadSequenceID);
          }
       }
       return;
    }
    public final List component1(){
       return this.feedList;
    }
    public final String component2(){
       return this.listLoadSequenceID;
    }
    public final LiveCloseEndAutoSlideFeedResponse copy(List p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveCloseEndAutoSlideFeedResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveCloseEndAutoSlideFeedResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCloseEndAutoSlideFeedResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveCloseEndAutoSlideFeedResponse && (a.g(this.feedList, p0.feedList) && a.g(this.listLoadSequenceID, p0.listLoadSequenceID)))) {
          return true;
       }
       return false;
    }
    public final List getFeedList(){
       return this.feedList;
    }
    public final String getListLoadSequenceID(){
       return this.listLoadSequenceID;
    }
    public int hashCode(){
       LiveCloseEndAutoSlideFeedResponse obj = PatchProxy.apply(null, this, LiveCloseEndAutoSlideFeedResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.feedList;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveCloseEndAutoSlideFeedResponse tlistLoadSeq = this.listLoadSequenceID;
       if (tlistLoadSeq != null) {
          i = tlistLoadSeq.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCloseEndAutoSlideFeedResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCloseEndAutoSlideFeedResponse\(feedList="+this.feedList+", listLoadSequenceID="+this.listLoadSequenceID+"\)";
    }
}
