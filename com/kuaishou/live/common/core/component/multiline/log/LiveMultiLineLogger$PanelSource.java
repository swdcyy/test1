package com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogger$PanelSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiLineLogger$PanelSource extends Enum	// class@0014e9
{
    public final String source;
    public static final LiveMultiLineLogger$PanelSource[] $VALUES;
    public static final LiveMultiLineLogger$PanelSource BOTTOM;
    public static final LiveMultiLineLogger$PanelSource ING_HAIR_CUT;
    public static final LiveMultiLineLogger$PanelSource PUZZLE;
    public static final LiveMultiLineLogger$PanelSource UNKNOWN;

    static {
       LiveMultiLineLogger$PanelSource panelSource = new LiveMultiLineLogger$PanelSource("UNKNOWN", 0, "UNKNOWN");
       LiveMultiLineLogger$PanelSource.UNKNOWN = panelSource;
       LiveMultiLineLogger$PanelSource panelSource1 = new LiveMultiLineLogger$PanelSource("ING_HAIR_CUT", 1, "ING_HAIR_CUT");
       LiveMultiLineLogger$PanelSource.ING_HAIR_CUT = panelSource1;
       LiveMultiLineLogger$PanelSource panelSource2 = new LiveMultiLineLogger$PanelSource("BOTTOM", 2, "BOTTOM");
       LiveMultiLineLogger$PanelSource.BOTTOM = panelSource2;
       LiveMultiLineLogger$PanelSource panelSource3 = new LiveMultiLineLogger$PanelSource("PUZZLE", 3, "PUZZLE");
       LiveMultiLineLogger$PanelSource.PUZZLE = panelSource3;
       LiveMultiLineLogger$PanelSource[] panelSourceA = new LiveMultiLineLogger$PanelSource[]{panelSource,panelSource1,panelSource2,panelSource3};
       LiveMultiLineLogger$PanelSource.$VALUES = panelSourceA;
    }
    public void LiveMultiLineLogger$PanelSource(String p0,int p1,String p2){
       super(p0, p1);
       this.source = p2;
    }
    public static LiveMultiLineLogger$PanelSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLineLogger$PanelSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiLineLogger$PanelSource.class, p0);
    }
    public static LiveMultiLineLogger$PanelSource[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiLineLogger$PanelSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiLineLogger$PanelSource.$VALUES.clone();
    }
    public String toString(){
       return this.source;
    }
}
