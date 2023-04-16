package c.t.m.g.bk;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.KeySpec;
import java.security.PublicKey;
import java.lang.Throwable;
import c.t.m.g.bt;

public class bk	// class@000be8
{
    public byte[] a;
    public PublicKey b;

    public void bk(){
       super();
       byte[] uobyteArray = new byte[0];
       this.a = uobyteArray;
    }
    public static String a(String p0){
       object oobject;
       String str = "-----";
       if (p0.contains(str)) {
          oobject = p0.split(str)[2];
       }
       return oobject.replaceAll("\n", "");
    }
    public void a(byte[] p0){
       bk ta = this.a;
       _monitor_enter(ta);
       this.b = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(p0));
       _monitor_exit(ta);
       return;
    }
}
