package jb1.s$a;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Enum;

public class s$a	// class@002b1c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveAdminPrivilege$PrivilegeType.values().length];
       try{
          s$a.a = ointArray;
          ointArray[LiveAdminPrivilege$PrivilegeType.FORBID_COMMENT.ordinal()] = 1;
          try{
             s$a.a[LiveAdminPrivilege$PrivilegeType.KICK_USER.ordinal()] = 2;
             try{
                s$a.a[LiveAdminPrivilege$PrivilegeType.BLOCK.ordinal()] = 3;
                try{
                   s$a.a[LiveAdminPrivilege$PrivilegeType.CONTROL.ordinal()] = 4;
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
