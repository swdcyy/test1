package okhttp3.TlsVersion;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Class;

public final class TlsVersion extends Enum	// class@002098
{
    public final String javaName;
    public static final TlsVersion[] $VALUES;
    public static final TlsVersion SSL_3_0;
    public static final TlsVersion TLS_1_0;
    public static final TlsVersion TLS_1_1;
    public static final TlsVersion TLS_1_2;
    public static final TlsVersion TLS_1_3;

    static {
       TlsVersion tlsVersion = new TlsVersion("TLS_1_3", 0, "TLSv1.3");
       TlsVersion.TLS_1_3 = tlsVersion;
       TlsVersion tlsVersion1 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
       TlsVersion.TLS_1_2 = tlsVersion1;
       TlsVersion tlsVersion2 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
       TlsVersion.TLS_1_1 = tlsVersion2;
       TlsVersion tlsVersion3 = new TlsVersion("TLS_1_0", 3, "TLSv1");
       TlsVersion.TLS_1_0 = tlsVersion3;
       TlsVersion tlsVersion4 = new TlsVersion("SSL_3_0", 4, "SSLv3");
       TlsVersion.SSL_3_0 = tlsVersion4;
       TlsVersion[] tlsVersionAr = new TlsVersion[]{tlsVersion,tlsVersion1,tlsVersion2,tlsVersion3,tlsVersion4};
       TlsVersion.$VALUES = tlsVersionAr;
    }
    public void TlsVersion(String p0,int p1,String p2){
       super(p0, p1);
       this.javaName = p2;
    }
    public static TlsVersion forJavaName(String p0){
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xe203c0d9:
             if (p0.equals("TLSv1.1")) {
                i = 0;
             }
             break;
           case 0xe203c0da:
             if (p0.equals("TLSv1.2")) {
                i = 1;
             }
             break;
           case 0xe203c0db:
             if (p0.equals("TLSv1.3")) {
                i = 2;
             }
             break;
           case 0x4b88569:
             if (p0.equals("SSLv3")) {
                i = 3;
             }
             break;
           case 0x4c38896:
             if (p0.equals("TLSv1")) {
                i = 4;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return TlsVersion.TLS_1_1;
           case 1:
             return TlsVersion.TLS_1_2;
           case 2:
             return TlsVersion.TLS_1_3;
           case 3:
             return TlsVersion.SSL_3_0;
           case 4:
             return TlsVersion.TLS_1_0;
           default:
             throw new IllegalArgumentException("Unexpected TLS version: "+p0);
       }
    }
    public static List forJavaNames(String[] p0){
       ArrayList uArrayList = new ArrayList(p0.length);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(TlsVersion.forJavaName(p0[i]));
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public static TlsVersion valueOf(String p0){
       return Enum.valueOf(TlsVersion.class, p0);
    }
    public static TlsVersion[] values(){
       return TlsVersion.$VALUES.clone();
    }
    public String javaName(){
       return this.javaName;
    }
}
