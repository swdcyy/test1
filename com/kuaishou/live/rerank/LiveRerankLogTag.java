package com.kuaishou.live.rerank.LiveRerankLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveRerankLogTag extends Enum implements c	// class@000f60
{
    public final String mName;
    public static final LiveRerankLogTag[] $VALUES;
    public static final LiveRerankLogTag LIVE_RERANK;

    static {
       LiveRerankLogTag liveRerankLo = new LiveRerankLogTag("LIVE_RERANK", 0, "LiveRerank");
       LiveRerankLogTag.LIVE_RERANK = liveRerankLo;
       LiveRerankLogTag[] liveRerankLo1 = new LiveRerankLogTag[]{liveRerankLo};
       LiveRerankLogTag.$VALUES = liveRerankLo1;
    }
    public void LiveRerankLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveRerankLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRerankLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRerankLogTag.class, p0);
    }
    public static LiveRerankLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRerankLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRerankLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
