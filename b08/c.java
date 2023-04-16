package b08.c;
import com.kuaishou.bowl.core.live.BusinessDataSource;
import java.lang.Enum;

public final class c	// class@0002eb
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BusinessDataSource.values().length];
       c.a = ointArray;
       ointArray[BusinessDataSource.BACK_PAGE.ordinal()] = 1;
       ointArray[BusinessDataSource.PAGE_INIT_MATERIAL.ordinal()] = 2;
    }
}
