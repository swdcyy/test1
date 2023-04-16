package aegon.chrome.net.impl.CronetUrlRequest$h;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import aegon.chrome.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class CronetUrlRequest$h implements Runnable	// class@0001cb
{
    public final VersionSafeCallbacks$UrlRequestStatusListener b;
    public final int c;
    public final CronetUrlRequest d;

    public void CronetUrlRequest$h(CronetUrlRequest p0,VersionSafeCallbacks$UrlRequestStatusListener p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       int i;
       CronetUrlRequest$h tb = this.b;
       switch (this.c){
           case 0:
             i = 0;
             break;
           case 1:
             i = 1;
             break;
           case 2:
             i = 2;
             break;
           case 3:
             i = 3;
             break;
           case 4:
             i = 4;
             break;
           case 6:
             i = 5;
             break;
           case 7:
             i = 6;
             break;
           case 8:
             i = 7;
             break;
           case 9:
             i = 8;
             break;
           case 10:
             i = 9;
             break;
           case 11:
             i = 10;
             break;
           case 12:
             i = 11;
             break;
           case 13:
             i = 12;
             break;
           case 14:
             i = 13;
             break;
           case 15:
             i = 14;
             break;
           default:
          label_0007 :
             throw new IllegalArgumentException("No request status found.");
       }
       tb.a(i);
       return;
    }
}
