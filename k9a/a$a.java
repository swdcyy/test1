package k9a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity$AnchorPoint;
import java.lang.Enum;

public class a$a	// class@002c1b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GifshowActivity$AnchorPoint.values().length];
       try{
          a$a.a = ointArray;
          ointArray[GifshowActivity$AnchorPoint.AT_USER_IN_PHOTO_DESCRIPTION.ordinal()] = 1;
          try{
             a$a.a[GifshowActivity$AnchorPoint.AT_USER_IN_COMMENT.ordinal()] = 2;
             try{
                a$a.a[GifshowActivity$AnchorPoint.PHOTO_LIKER.ordinal()] = 3;
                try{
                   a$a.a[GifshowActivity$AnchorPoint.NAME.ordinal()] = 4;
                   try{
                      a$a.a[GifshowActivity$AnchorPoint.DEFAULT.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
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
