package c.t.m.g.bl$a;
import java.lang.Object;
import c.t.m.g.bk;
import java.lang.String;
import c.t.m.g.bb;
import java.lang.StringBuilder;
import c.t.m.g.bt;
import c.t.m.g.by;

public class bl$a	// class@000be9
{
    public bk a;
    public String b;
    public boolean c;

    public void bl$a(){
       super();
       this.a = new bk();
       this.b = "";
       this.c = false;
       this.a();
    }
    public void a(){
       this.a(bb.a("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDMi0gKCzapHg05OXTOlWf9sT20tJJ8C+h41HJZI+nGU2h4sdirRTUB7wdwRR1w604QZJmn55p4S9xBRVCZWIXX2kWmekr90vvvpQow55PYk1JyGXKz7a+yzQxmyEIsD4mtw+M7G76YQrgrjD42EcGH453xTUTdJGwjrn/eCJng6QIDAQAB"), "0000");
    }
    public void a(byte[] p0,String p1){
       bt.a("RsaAes", "setPublicKey:"+p0.length+","+p1+", ignored:"+this.c);
       if (p1.length() != 4 || by.a(p0)) {
          this.a();
       }else {
          this.b = p1;
          this.a.a(p0);
       }
       return;
    }
}
