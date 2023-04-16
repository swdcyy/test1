package nfd.g$a;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Enum;

public class g$a	// class@001da9
{
    public static final int[] a;

    static {
       int[] ointArray = new int[MusicType.values().length];
       try{
          g$a.a = ointArray;
          ointArray[MusicType.LIP.ordinal()] = 1;
          try{
             g$a.a[MusicType.KARA.ordinal()] = 2;
             try{
                g$a.a[MusicType.ORIGINAL.ordinal()] = 3;
                try{
                   g$a.a[MusicType.COVER.ordinal()] = 4;
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
