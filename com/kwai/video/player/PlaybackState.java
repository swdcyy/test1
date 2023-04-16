package com.kwai.video.player.PlaybackState;
import java.lang.String;

public interface abstract PlaybackState	// class@000b02
{
    public static final String[] STATE_STRING;

    static {
       String[] stringArray = new String[]{"MP_STATE_IDLE","MP_STATE_INITIALIZED","MP_STATE_ASYNC_PREPARING","MP_STATE_PREPARED","MP_STATE_STARTED","MP_STATE_PAUSED","MP_STATE_COMPLETED","MP_STATE_STOPPED","MP_STATE_ERROR","MP_STATE_END"};
       PlaybackState.STATE_STRING = stringArray;
    }
}
