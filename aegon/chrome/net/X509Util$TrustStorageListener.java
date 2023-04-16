package aegon.chrome.net.X509Util$TrustStorageListener;
import android.content.BroadcastReceiver;
import aegon.chrome.net.X509Util$a;
import android.content.Context;
import android.content.Intent;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.Object;
import aegon.chrome.net.X509Util;
import a0.n;

public final class X509Util$TrustStorageListener extends BroadcastReceiver	// class@00008a
{

    public void X509Util$TrustStorageListener(){
       super();
    }
    public void X509Util$TrustStorageListener(X509Util$a p0){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       int i;
       if (Build$VERSION.SDK_INT >= 26) {
          i = (("android.security.action.KEYCHAIN_CHANGED").equals(p1.getAction()) || (("android.security.action.TRUST_STORE_CHANGED").equals(p1.getAction()) || (("android.security.action.KEY_ACCESS_CHANGED").equals(p1.getAction()) && !p1.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))))? 1: 0;
       }else {
          i = ("android.security.STORAGE_CHANGED").equals(p1.getAction());
       }
       if (i) {
          try{
             X509Util.f();
          }catch(java.security.cert.CertificateException e7){
             Object[] objArray = new Object[]{e7};
             n.a("X509Util", "Unable to reload the default TrustManager", objArray);
          }catch(java.security.KeyStoreException e7){
             objArray = new Object[]{e7};
             n.a("X509Util", "Unable to reload the default TrustManager", objArray);
          }catch(java.security.NoSuchAlgorithmException e7){
             objArray = new Object[]{e7};
             n.a("X509Util", "Unable to reload the default TrustManager", objArray);
          }
       }
    }
}
