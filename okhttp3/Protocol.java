package okhttp3.Protocol;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Class;

public final class Protocol extends Enum	// class@002088
{
    public final String protocol;
    public static final Protocol[] $VALUES;
    public static final Protocol H2_PRIOR_KNOWLEDGE;
    public static final Protocol HTTP_1_0;
    public static final Protocol HTTP_1_1;
    public static final Protocol HTTP_2;
    public static final Protocol QUIC;
    public static final Protocol SPDY_3;

    static {
       Protocol protocol = new Protocol("HTTP_1_0", 0, "http/1.0");
       Protocol.HTTP_1_0 = protocol;
       Protocol protocol1 = new Protocol("HTTP_1_1", 1, "http/1.1");
       Protocol.HTTP_1_1 = protocol1;
       Protocol protocol2 = new Protocol("SPDY_3", 2, "spdy/3.1");
       Protocol.SPDY_3 = protocol2;
       Protocol protocol3 = new Protocol("HTTP_2", 3, "h2");
       Protocol.HTTP_2 = protocol3;
       Protocol protocol4 = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
       Protocol.H2_PRIOR_KNOWLEDGE = protocol4;
       Protocol protocol5 = new Protocol("QUIC", 5, "quic");
       Protocol.QUIC = protocol5;
       Protocol[] protocolArra = new Protocol[]{protocol,protocol1,protocol2,protocol3,protocol4,protocol5};
       Protocol.$VALUES = protocolArra;
    }
    public void Protocol(String p0,int p1,String p2){
       super(p0, p1);
       this.protocol = p2;
    }
    public static Protocol get(String p0){
       Protocol hTTP_1_0 = Protocol.HTTP_1_0;
       if (p0.equals(hTTP_1_0.protocol)) {
          return hTTP_1_0;
       }
       hTTP_1_0 = Protocol.HTTP_1_1;
       if (p0.equals(hTTP_1_0.protocol)) {
          return hTTP_1_0;
       }
       hTTP_1_0 = Protocol.H2_PRIOR_KNOWLEDGE;
       if (p0.equals(hTTP_1_0.protocol)) {
          return hTTP_1_0;
       }
       hTTP_1_0 = Protocol.HTTP_2;
       if (p0.equals(hTTP_1_0.protocol)) {
          return hTTP_1_0;
       }
       hTTP_1_0 = Protocol.SPDY_3;
       if (p0.equals(hTTP_1_0.protocol)) {
          return hTTP_1_0;
       }
       hTTP_1_0 = Protocol.QUIC;
       if (p0.equals(hTTP_1_0.protocol)) {
          return hTTP_1_0;
       }
       throw new IOException("Unexpected protocol: "+p0);
    }
    public static Protocol valueOf(String p0){
       return Enum.valueOf(Protocol.class, p0);
    }
    public static Protocol[] values(){
       return Protocol.$VALUES.clone();
    }
    public String toString(){
       return this.protocol;
    }
}
