package com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.SwitchTab;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SwitchTab extends Enum	// class@0010e5
{
    public final int value;
    public static final SwitchTab[] $VALUES;
    public static final SwitchTab COLLECTED;
    public static final SwitchTab HISTORY;
    public static final SwitchTab LOCAL;
    public static final SwitchTab RECOMMEND;
    public static final SwitchTab VOICE;

    static {
       SwitchTab switchTab;
       SwitchTab[] switchTabArr = new SwitchTab[]{switchTab,switchTab,switchTab,switchTab,switchTab};
       switchTab = new SwitchTab("RECOMMEND", 0, 0);
       SwitchTab.RECOMMEND = switchTab;
       switchTab = new SwitchTab("COLLECTED", 1, 1);
       SwitchTab.COLLECTED = switchTab;
       switchTab = new SwitchTab("HISTORY", 2, 2);
       SwitchTab.HISTORY = switchTab;
       switchTab = new SwitchTab("LOCAL", 3, 3);
       SwitchTab.LOCAL = switchTab;
       switchTab = new SwitchTab("VOICE", 4, 4);
       SwitchTab.VOICE = switchTab;
       SwitchTab.$VALUES = switchTabArr;
    }
    public void SwitchTab(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static SwitchTab valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SwitchTab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SwitchTab.class, p0);
    }
    public static SwitchTab[] values(){
       Object obj = PatchProxy.apply(null, null, SwitchTab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SwitchTab.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
