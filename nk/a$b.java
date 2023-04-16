package nk.a$b;
import java.io.ByteArrayOutputStream;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class a$b	// class@00271d
{
    public static final byte[] a;

    static {
       try{
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          byte[] bytes = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.").getBytes("US-ASCII");
          for (int i = 0; i < 135; i = i + 1) {
             uByteArrayOu.write(bytes, 0, i);
          }
          a$b.a = uByteArrayOu.toByteArray();
       }catch(java.io.UnsupportedEncodingException e0){
          throw new RuntimeException("System doesn\'t support ASCII", e0);
       }
    }
}
