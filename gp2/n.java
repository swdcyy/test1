package gp2.n;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$State;
import java.lang.Enum;

public final class n	// class@002b7f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TheaterPlayer$State.values().length];
       n.a = ointArray;
       ointArray[TheaterPlayer$State.PREPARED.ordinal()] = 1;
       ointArray[TheaterPlayer$State.PAUSED.ordinal()] = 2;
       ointArray[TheaterPlayer$State.STARTED.ordinal()] = 3;
    }
}
