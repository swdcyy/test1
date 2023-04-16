package nfd.n0$a;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Enum;

public class n0$a	// class@001dd4
{
    public static final int[] a;

    static {
       int[] ointArray = new int[User$FollowStatus.values().length];
       try{
          n0$a.a = ointArray;
          ointArray[User$FollowStatus.UNFOLLOW.ordinal()] = 1;
          try{
             n0$a.a[User$FollowStatus.FOLLOW_REQUESTING.ordinal()] = 2;
             try{
                n0$a.a[User$FollowStatus.FOLLOWING.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
