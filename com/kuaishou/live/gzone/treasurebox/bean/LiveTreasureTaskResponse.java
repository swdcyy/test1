package com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureTaskResponse;
import java.io.Serializable;
import java.lang.Object;
import o53.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import java.util.List;

public class LiveTreasureTaskResponse implements Serializable	// class@001c64
{
    public List mTasks;
    public static final long serialVersionUID = 0xe9ac1163c8e0a992;

    public void LiveTreasureTaskResponse(){
       super();
    }
    public b getTask(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveTreasureTaskResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mTasks)) {
          return b.b(objArray);
       }
       return b.b(this.mTasks.get(0));
    }
}
