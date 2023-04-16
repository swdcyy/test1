package dqb.d;
import com.yxcorp.gifshow.music.radio.backplay.MusicRadioPlayModel;
import java.lang.Enum;

public final class d	// class@0024f1
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[MusicRadioPlayModel.values().length];
       d.a = ointArray;
       MusicRadioPlayModel lIST = MusicRadioPlayModel.LIST;
       ointArray[lIST.ordinal()] = 1;
       MusicRadioPlayModel rANDOM = MusicRadioPlayModel.RANDOM;
       ointArray[rANDOM.ordinal()] = 2;
       ointArray[MusicRadioPlayModel.SINGLE.ordinal()] = 3;
       ointArray = new int[MusicRadioPlayModel.values().length];
       d.b = ointArray;
       ointArray[lIST.ordinal()] = 1;
       ointArray[rANDOM.ordinal()] = 2;
    }
}
