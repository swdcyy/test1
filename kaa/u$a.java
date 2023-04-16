package kaa.u$a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;

public class u$a	// class@002c37
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       try{
          u$a.a = ointArray;
          ointArray[Workspace$Type.SINGLE_PICTURE.ordinal()] = 1;
          try{
             u$a.a[Workspace$Type.LONG_PICTURE.ordinal()] = 2;
             try{
                u$a.a[Workspace$Type.ATLAS.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
