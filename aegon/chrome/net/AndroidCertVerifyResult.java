package aegon.chrome.net.AndroidCertVerifyResult;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.security.cert.X509Certificate;

public class AndroidCertVerifyResult	// class@000066
{
    public final int a;
    public final boolean b;
    public final List c;

    public void AndroidCertVerifyResult(int p0){
       super();
       this.a = p0;
       this.b = false;
       this.c = Collections.emptyList();
    }
    public void AndroidCertVerifyResult(int p0,boolean p1,List p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ArrayList(p2);
    }
    public byte[][] getCertificateChainEncoded(){
       byte[][] uobyteArray = new byte[][this.c.size()];
       try{
          for (int i = 0; i < this.c.size(); i = i + 1) {
             uobyteArray[i] = this.c.get(i).getEncoded();
          }
          return uobyteArray;
       }catch(java.security.cert.CertificateEncodingException e0){
          uobyteArray = new byte[][0];
          return uobyteArray;
       }
    }
    public int getStatus(){
       return this.a;
    }
    public boolean isIssuedByKnownRoot(){
       return this.b;
    }
}
