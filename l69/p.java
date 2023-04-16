package l69.p;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;
import com.kuaishou.edit.draft.Music$Type;
import com.kuaishou.edit.draft.Asset$PositionType;

public final class p	// class@002ca7
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       p.a = ointArray;
       Workspace$Type pHOTO_MOVIE = Workspace$Type.PHOTO_MOVIE;
       ointArray[pHOTO_MOVIE.ordinal()] = 1;
       Workspace$Type aLBUM_MOVIE = Workspace$Type.ALBUM_MOVIE;
       ointArray[aLBUM_MOVIE.ordinal()] = 2;
       ointArray = new int[Workspace$Type.values().length];
       p.b = ointArray;
       ointArray[aLBUM_MOVIE.ordinal()] = 1;
       ointArray[Workspace$Type.AI_CUT.ordinal()] = 2;
       ointArray[Workspace$Type.KUAISHAN.ordinal()] = 3;
       ointArray[pHOTO_MOVIE.ordinal()] = 4;
       ointArray = new int[Music$Type.values().length];
       p.c = ointArray;
       ointArray[Music$Type.ONLINE.ordinal()] = 1;
       ointArray[Music$Type.OPERATION.ordinal()] = 2;
       ointArray[Music$Type.IMPORT.ordinal()] = 3;
       ointArray = new int[Asset$PositionType.values().length];
       p.d = ointArray;
       ointArray[Asset$PositionType.OPENING.ordinal()] = 1;
       ointArray[Asset$PositionType.ENDING.ordinal()] = 2;
    }
}
