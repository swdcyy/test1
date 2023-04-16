package aegon.chrome.net.DnsStatus;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.net.InetAddress;

public class DnsStatus	// class@00006c
{
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public void DnsStatus(List p0,boolean p1,String p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       if (p2 != null) {
       }else {
          p2 = "";
       }
       this.c = p2;
       if (p3 == null) {
          p3 = "";
       }
       this.d = p3;
       return;
    }
    public byte[][] getDnsServers(){
       byte[][] uobyteArray = new byte[][this.a.size()];
       for (int i = 0; i < this.a.size(); i = i + 1) {
          uobyteArray[i] = this.a.get(i).getAddress();
       }
       return uobyteArray;
    }
    public boolean getPrivateDnsActive(){
       return this.b;
    }
    public String getPrivateDnsServerName(){
       return this.c;
    }
    public String getSearchDomains(){
       return this.d;
    }
}
