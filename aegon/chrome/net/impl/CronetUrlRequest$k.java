package aegon.chrome.net.impl.CronetUrlRequest$k;
import aegon.chrome.net.impl.CronetUrlRequest;
import java.lang.String;
import aegon.chrome.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import java.nio.ByteBuffer;

public interface abstract CronetUrlRequest$k	// class@0000b4
{

    void a(long p0,CronetUrlRequest p1);
    long b(CronetUrlRequest p0,long p1,String p2,int p3,boolean p4,boolean p5,boolean p6,boolean p7,int p8,boolean p9,int p10,int p11);
    void c(long p0,CronetUrlRequest p1);
    void d(long p0,CronetUrlRequest p1,VersionSafeCallbacks$UrlRequestStatusListener p2);
    boolean e(long p0,CronetUrlRequest p1,String p2);
    void f(long p0,CronetUrlRequest p1,boolean p2);
    boolean g(long p0,CronetUrlRequest p1,String p2,String p3);
    boolean h(long p0,CronetUrlRequest p1,ByteBuffer p2,int p3,int p4);
}
