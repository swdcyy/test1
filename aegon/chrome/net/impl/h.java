package aegon.chrome.net.impl.h;
import aegon.chrome.net.impl.CronetUrlRequest$k;
import aegon.chrome.net.impl.h$a;
import java.lang.Object;
import a0.o;
import aegon.chrome.net.impl.CronetUrlRequest;
import K.S;
import java.lang.String;
import aegon.chrome.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import java.nio.ByteBuffer;

public class h implements CronetUrlRequest$k	// class@0000cc
{
    public static CronetUrlRequest$k a;
    public static final m b;

    static {
       h.b = new h$a();
    }
    public void h(){
       super();
    }
    public static CronetUrlRequest$k i(){
       o.a(false);
       return new h();
    }
    public void a(long p0,CronetUrlRequest p1){
       S.MabZ5m6r(p0, p1);
    }
    public long b(CronetUrlRequest p0,long p1,String p2,int p3,boolean p4,boolean p5,boolean p6,boolean p7,int p8,boolean p9,int p10,int p11){
       return S.MuOIsMvf(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }
    public void c(long p0,CronetUrlRequest p1){
       S.Mhp54Oqs(p0, p1);
    }
    public void d(long p0,CronetUrlRequest p1,VersionSafeCallbacks$UrlRequestStatusListener p2){
       S.MgIIMpT9(p0, p1, p2);
    }
    public boolean e(long p0,CronetUrlRequest p1,String p2){
       return S.M51RPBJe(p0, p1, p2);
    }
    public void f(long p0,CronetUrlRequest p1,boolean p2){
       S.M4znfYdB(p0, p1, p2);
    }
    public boolean g(long p0,CronetUrlRequest p1,String p2,String p3){
       return S.MvHusd1J(p0, p1, p2, p3);
    }
    public boolean h(long p0,CronetUrlRequest p1,ByteBuffer p2,int p3,int p4){
       return S.MfCxA8r3(p0, p1, p2, p3, p4);
    }
}
