package com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter$PluginState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TunaQigsawPluginReporter$PluginState extends Enum	// class@00110f
{
    public final int value;
    public static final TunaQigsawPluginReporter$PluginState[] $VALUES;
    public static final TunaQigsawPluginReporter$PluginState INSTALLED;
    public static final TunaQigsawPluginReporter$PluginState INSTALL_FAIL;
    public static final TunaQigsawPluginReporter$PluginState INSTALL_SUCCESS;
    public static final TunaQigsawPluginReporter$PluginState SYNC_INSTALLED;
    public static final TunaQigsawPluginReporter$PluginState SYNC_NOT_INSTALL;
    public static final TunaQigsawPluginReporter$PluginState UNKNOWN;

    static {
       TunaQigsawPluginReporter$PluginState pluginState;
       TunaQigsawPluginReporter$PluginState[] pluginStateA = new TunaQigsawPluginReporter$PluginState[]{pluginState,pluginState,pluginState,pluginState,pluginState,pluginState};
       pluginState = new TunaQigsawPluginReporter$PluginState("UNKNOWN", 0, 0);
       TunaQigsawPluginReporter$PluginState.UNKNOWN = pluginState;
       pluginState = new TunaQigsawPluginReporter$PluginState("INSTALLED", 1, 1);
       TunaQigsawPluginReporter$PluginState.INSTALLED = pluginState;
       pluginState = new TunaQigsawPluginReporter$PluginState("INSTALL_SUCCESS", 2, 2);
       TunaQigsawPluginReporter$PluginState.INSTALL_SUCCESS = pluginState;
       pluginState = new TunaQigsawPluginReporter$PluginState("INSTALL_FAIL", 3, 3);
       TunaQigsawPluginReporter$PluginState.INSTALL_FAIL = pluginState;
       pluginState = new TunaQigsawPluginReporter$PluginState("SYNC_INSTALLED", 4, 20);
       TunaQigsawPluginReporter$PluginState.SYNC_INSTALLED = pluginState;
       pluginState = new TunaQigsawPluginReporter$PluginState("SYNC_NOT_INSTALL", 5, 21);
       TunaQigsawPluginReporter$PluginState.SYNC_NOT_INSTALL = pluginState;
       TunaQigsawPluginReporter$PluginState.$VALUES = pluginStateA;
    }
    public void TunaQigsawPluginReporter$PluginState(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static TunaQigsawPluginReporter$PluginState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TunaQigsawPluginReporter$PluginState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TunaQigsawPluginReporter$PluginState.class, p0);
    }
    public static TunaQigsawPluginReporter$PluginState[] values(){
       Object obj = PatchProxy.apply(null, null, TunaQigsawPluginReporter$PluginState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TunaQigsawPluginReporter$PluginState.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
