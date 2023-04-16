package jb1.b$a;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Enum;

public class b$a	// class@002b08
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveAdminPrivilege$PrivilegeType.values().length];
       try{
          b$a.a = ointArray;
          ointArray[LiveAdminPrivilege$PrivilegeType.FORBID_COMMENT.ordinal()] = 1;
          try{
             b$a.a[LiveAdminPrivilege$PrivilegeType.KICK_USER.ordinal()] = 2;
             try{
                b$a.a[LiveAdminPrivilege$PrivilegeType.BLOCK.ordinal()] = 3;
                try{
                   b$a.a[LiveAdminPrivilege$PrivilegeType.CONTROL.ordinal()] = 4;
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
