package b5d.f;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$PlayerEvent;
import java.lang.Enum;

public final class f	// class@0003aa
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CloudMusicHelper$PlayerEvent.values().length];
       f.a = ointArray;
       ointArray[CloudMusicHelper$PlayerEvent.PLAY.ordinal()] = 1;
       ointArray[CloudMusicHelper$PlayerEvent.STOP.ordinal()] = 2;
       ointArray[CloudMusicHelper$PlayerEvent.PAUSE.ordinal()] = 3;
       ointArray[CloudMusicHelper$PlayerEvent.RESET.ordinal()] = 4;
       ointArray[CloudMusicHelper$PlayerEvent.RELEASE.ordinal()] = 5;
    }
}
