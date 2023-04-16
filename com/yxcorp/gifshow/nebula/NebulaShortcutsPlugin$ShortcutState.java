package com.yxcorp.gifshow.nebula.NebulaShortcutsPlugin$ShortcutState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NebulaShortcutsPlugin$ShortcutState extends Enum	// class@00214c
{
    public static final NebulaShortcutsPlugin$ShortcutState[] $VALUES;
    public static final NebulaShortcutsPlugin$ShortcutState BOTH_COIN_WALLET_SHORTCUT;
    public static final NebulaShortcutsPlugin$ShortcutState MAX_COIN_SHORTCUT;
    public static final NebulaShortcutsPlugin$ShortcutState NO_ANY_SHORTCUT;
    public static final NebulaShortcutsPlugin$ShortcutState WALLET_SHORTCUT;

    static {
       NebulaShortcutsPlugin$ShortcutState shortcutStat = new NebulaShortcutsPlugin$ShortcutState("NO_ANY_SHORTCUT", 0);
       NebulaShortcutsPlugin$ShortcutState.NO_ANY_SHORTCUT = shortcutStat;
       NebulaShortcutsPlugin$ShortcutState shortcutStat1 = new NebulaShortcutsPlugin$ShortcutState("MAX_COIN_SHORTCUT", 1);
       NebulaShortcutsPlugin$ShortcutState.MAX_COIN_SHORTCUT = shortcutStat1;
       NebulaShortcutsPlugin$ShortcutState shortcutStat2 = new NebulaShortcutsPlugin$ShortcutState("WALLET_SHORTCUT", 2);
       NebulaShortcutsPlugin$ShortcutState.WALLET_SHORTCUT = shortcutStat2;
       NebulaShortcutsPlugin$ShortcutState shortcutStat3 = new NebulaShortcutsPlugin$ShortcutState("BOTH_COIN_WALLET_SHORTCUT", 3);
       NebulaShortcutsPlugin$ShortcutState.BOTH_COIN_WALLET_SHORTCUT = shortcutStat3;
       NebulaShortcutsPlugin$ShortcutState[] shortcutStat4 = new NebulaShortcutsPlugin$ShortcutState[]{shortcutStat,shortcutStat1,shortcutStat2,shortcutStat3};
       NebulaShortcutsPlugin$ShortcutState.$VALUES = shortcutStat4;
    }
    public void NebulaShortcutsPlugin$ShortcutState(String p0,int p1){
       super(p0, p1);
    }
    public static NebulaShortcutsPlugin$ShortcutState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NebulaShortcutsPlugin$ShortcutState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NebulaShortcutsPlugin$ShortcutState.class, p0);
    }
    public static NebulaShortcutsPlugin$ShortcutState[] values(){
       Object obj = PatchProxy.apply(null, null, NebulaShortcutsPlugin$ShortcutState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NebulaShortcutsPlugin$ShortcutState.$VALUES.clone();
    }
}
