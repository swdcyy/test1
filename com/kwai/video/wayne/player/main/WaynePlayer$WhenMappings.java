package com.kwai.video.wayne.player.main.WaynePlayer$WhenMappings;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Enum;

public final class WaynePlayer$WhenMappings	// class@000d9b
{
    public static final int[] $EnumSwitchMapping$0;

    static {
       int[] ointArray = new int[PlayerState.values().length];
       WaynePlayer$WhenMappings.$EnumSwitchMapping$0 = ointArray;
       ointArray[PlayerState.Playing.ordinal()] = 1;
       ointArray[PlayerState.Stopped.ordinal()] = 2;
       ointArray[PlayerState.Paused.ordinal()] = 3;
       ointArray[PlayerState.Preparing.ordinal()] = 4;
    }
}
