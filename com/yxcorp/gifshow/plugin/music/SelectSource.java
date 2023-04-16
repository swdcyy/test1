package com.yxcorp.gifshow.plugin.music.SelectSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SelectSource extends Enum	// class@000ff0
{
    public static final SelectSource[] $VALUES;
    public static final SelectSource AI_CUT;
    public static final SelectSource AUTO_MUSIC;
    public static final SelectSource COLLECT_LIST;
    public static final SelectSource DRAFT_RESTORED;
    public static final SelectSource HISTORY_LIST;
    public static final SelectSource LOCAL_LIST;
    public static final SelectSource MUSIC_LIBRARY;
    public static final SelectSource PIC_TEMPLATE;
    public static final SelectSource RAP_MUSIC;
    public static final SelectSource RECOMMEND_LIST;

    static {
       SelectSource[] selectSource = new SelectSource[10];
       SelectSource selectSource1 = new SelectSource("RECOMMEND_LIST", 0);
       SelectSource.RECOMMEND_LIST = selectSource1;
       selectSource[0] = selectSource1;
       selectSource1 = new SelectSource("COLLECT_LIST", 1);
       SelectSource.COLLECT_LIST = selectSource1;
       selectSource[1] = selectSource1;
       selectSource1 = new SelectSource("LOCAL_LIST", 2);
       SelectSource.LOCAL_LIST = selectSource1;
       selectSource[2] = selectSource1;
       selectSource1 = new SelectSource("AI_CUT", 3);
       SelectSource.AI_CUT = selectSource1;
       selectSource[3] = selectSource1;
       selectSource1 = new SelectSource("AUTO_MUSIC", 4);
       SelectSource.AUTO_MUSIC = selectSource1;
       selectSource[4] = selectSource1;
       selectSource1 = new SelectSource("RAP_MUSIC", 5);
       SelectSource.RAP_MUSIC = selectSource1;
       selectSource[5] = selectSource1;
       selectSource1 = new SelectSource("MUSIC_LIBRARY", 6);
       SelectSource.MUSIC_LIBRARY = selectSource1;
       selectSource[6] = selectSource1;
       selectSource1 = new SelectSource("PIC_TEMPLATE", 7);
       SelectSource.PIC_TEMPLATE = selectSource1;
       selectSource[7] = selectSource1;
       selectSource1 = new SelectSource("DRAFT_RESTORED", 8);
       SelectSource.DRAFT_RESTORED = selectSource1;
       selectSource[8] = selectSource1;
       selectSource1 = new SelectSource("HISTORY_LIST", 9);
       SelectSource.HISTORY_LIST = selectSource1;
       selectSource[9] = selectSource1;
       SelectSource.$VALUES = selectSource;
    }
    public void SelectSource(String p0,int p1){
       super(p0, p1);
    }
    public static SelectSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SelectSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SelectSource.class, p0);
    }
    public static SelectSource[] values(){
       Object obj = PatchProxy.apply(null, null, SelectSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SelectSource.$VALUES.clone();
    }
}
