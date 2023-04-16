package kotlinx.coroutines.channels.TickerMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TickerMode extends Enum	// class@0019a3
{
    public static final TickerMode[] $VALUES;
    public static final TickerMode FIXED_DELAY;
    public static final TickerMode FIXED_PERIOD;

    static {
       TickerMode tickerMode;
       TickerMode[] tickerModeAr = new TickerMode[]{tickerMode,tickerMode};
       tickerMode = new TickerMode("FIXED_PERIOD", 0);
       TickerMode.FIXED_PERIOD = tickerMode;
       tickerMode = new TickerMode("FIXED_DELAY", 1);
       TickerMode.FIXED_DELAY = tickerMode;
       TickerMode.$VALUES = tickerModeAr;
    }
    public void TickerMode(String p0,int p1){
       super(p0, p1);
    }
    public static TickerMode valueOf(String p0){
       return Enum.valueOf(TickerMode.class, p0);
    }
    public static TickerMode[] values(){
       return TickerMode.$VALUES.clone();
    }
}
