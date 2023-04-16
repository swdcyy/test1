package c.t.m.g.bl;
import java.util.Random;
import c.t.m.g.bl$a;
import java.lang.String;
import java.lang.StringBuilder;
import c.t.m.g.bt;

public class bl	// class@000bea
{
    public static final Random a;
    public static final bl$a b;

    static {
       bl.a = new Random();
       bl.b = new bl$a();
    }
    public static void a(byte[] p0,String p1){
       bt.a("EncRsaAesUtil", "setPubKey version "+p1);
       bl.b.a(p0, p1);
    }
    public static byte[] a(int p0){
       byte[] uobyteArray = new byte[p0];
       bl.a.nextBytes(uobyteArray);
       return uobyteArray;
    }
}
