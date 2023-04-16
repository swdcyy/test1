package bb1.n$c;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Enum;

public class n$c	// class@00033c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveAdminPrivilege$PrivilegeType.values().length];
       try{
          n$c.a = ointArray;
          ointArray[LiveAdminPrivilege$PrivilegeType.FORBID_COMMENT.ordinal()] = 1;
          try{
             n$c.a[LiveAdminPrivilege$PrivilegeType.KICK_USER.ordinal()] = 2;
             try{
                n$c.a[LiveAdminPrivilege$PrivilegeType.BLOCK.ordinal()] = 3;
                try{
                   n$c.a[LiveAdminPrivilege$PrivilegeType.CONTROL.ordinal()] = 4;
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
