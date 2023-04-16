package com.kwai.feature.api.danmaku.model.DanmakuEditorActivityEntry;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r85.b;

public class DanmakuEditorActivityEntry extends BifrostFeatureActivityEntry	// class@000e76
{
    public String activityType;
    public String link;
    public int maxShowCount;
    public BifrostString title;

    public void DanmakuEditorActivityEntry(){
       super();
       this.maxShowCount = 3;
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, DanmakuEditorActivityEntry.class, "1")) {
          return;
       }
       b.a("DANMAKU_INPUT_BANNER", DanmakuEditorActivityEntry.class);
       return;
    }
}
