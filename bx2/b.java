package bx2.b;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand$PlayerSyncCommand;
import java.lang.Enum;

public final class b	// class@000472
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VoicePartyTheaterSyncCommand$PlayerSyncCommand.values().length];
       b.a = ointArray;
       ointArray[VoicePartyTheaterSyncCommand$PlayerSyncCommand.PAUSE.ordinal()] = 1;
       ointArray[VoicePartyTheaterSyncCommand$PlayerSyncCommand.SEEK.ordinal()] = 2;
       ointArray[VoicePartyTheaterSyncCommand$PlayerSyncCommand.PLAY.ordinal()] = 3;
    }
}
