package fpb.c;
import com.yxcorp.gifshow.music.cloudmusic.search.logger.LogType;
import java.lang.Enum;
import com.yxcorp.gifshow.music.cloudmusic.search.logger.PhotoButton;
import com.yxcorp.gifshow.music.cloudmusic.search.logger.MusicCardButton;

public final class c	// class@0029ba
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;

    static {
       int[] ointArray = new int[LogType.values().length];
       c.a = ointArray;
       ointArray[LogType.CLICK.ordinal()] = 1;
       ointArray[LogType.SHOW.ordinal()] = 2;
       ointArray = new int[PhotoButton.values().length];
       c.b = ointArray;
       PhotoButton pLAY = PhotoButton.PLAY;
       ointArray[pLAY.ordinal()] = 1;
       PhotoButton pAUSE = PhotoButton.PAUSE;
       ointArray[pAUSE.ordinal()] = 2;
       PhotoButton uSE = PhotoButton.USE;
       ointArray[uSE.ordinal()] = 3;
       ointArray = new int[PhotoButton.values().length];
       c.c = ointArray;
       ointArray[pLAY.ordinal()] = 1;
       ointArray[pAUSE.ordinal()] = 2;
       ointArray[uSE.ordinal()] = 3;
       ointArray = new int[MusicCardButton.values().length];
       c.d = ointArray;
       ointArray[MusicCardButton.SCISSOR.ordinal()] = 1;
       ointArray[MusicCardButton.USE.ordinal()] = 2;
    }
}
