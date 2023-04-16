package aegon.chrome.net.AndroidKeyStore;
import java.lang.Object;
import java.security.PrivateKey;
import java.lang.String;
import javax.crypto.Cipher;
import java.security.Key;
import java.lang.StringBuilder;
import java.lang.Class;
import a0.n;
import java.security.Signature;

public class AndroidKeyStore	// class@000183
{

    public void AndroidKeyStore(){
       super();
    }
    public static byte[] encryptWithPrivateKey(PrivateKey p0,String p1,byte[] p2){
       Object[] objArray;
       int i = 0;
       try{
          Cipher instance = Cipher.getInstance(p1);
          try{
             int i1 = 1;
             instance.init(i1, p0);
             return instance.doFinal(p2);
          }catch(java.lang.Exception e7){
             objArray = new Object[i];
             n.a(v0, "Exception while encrypting input with "+p1+" and "+p0.getAlgorithm()+" private key \("+p0.getClass().getName()+"\): "+e7, objArray);
             return v1;
          }
       }catch(java.security.NoSuchAlgorithmException e5){
       }catch(javax.crypto.NoSuchPaddingException e5){
       }
       objArray = new Object[i];
       n.a("AndroidKeyStore", "Cipher "+p1+" not supported: "+e5, objArray);
       return 0;
    }
    public static String getPrivateKeyClassName(PrivateKey p0){
       return p0.getClass().getName();
    }
    public static boolean privateKeySupportsCipher(PrivateKey p0,String p1){
       int i = 0;
       try{
          Cipher.getInstance(p1).init(1, p0);
          return 1;
       }catch(java.security.NoSuchAlgorithmException e0){
       label_002b :
          return e0;
       }catch(javax.crypto.NoSuchPaddingException e0){
       }catch(java.security.InvalidKeyException e0){
       }catch(java.lang.Exception e3){
          Object[] objArray = new Object[i];
          n.a("AndroidKeyStore", "Exception while checking support for "+p1+": "+e3, objArray);
          goto label_002b ;
       }
    }
    public static boolean privateKeySupportsSignature(PrivateKey p0,String p1){
       int i = 0;
       try{
          Signature.getInstance(p1).initSign(p0);
          return true;
       }catch(java.security.NoSuchAlgorithmException e0){
       label_002b :
          return e0;
       }catch(java.security.InvalidKeyException e0){
       }catch(java.lang.Exception e3){
          Object[] objArray = new Object[i];
          n.a("AndroidKeyStore", "Exception while checking support for "+p1+": "+e3, objArray);
          goto label_002b ;
       }
    }
    public static byte[] signWithPrivateKey(PrivateKey p0,String p1,byte[] p2){
       Object[] objArray;
       int i = 0;
       try{
          Signature instance = Signature.getInstance(p1);
          try{
             instance.initSign(p0);
             instance.update(p2);
             return instance.sign();
          }catch(java.lang.Exception e7){
             objArray = new Object[i];
             n.a(v0, "Exception while signing message with "+p1+" and "+p0.getAlgorithm()+" private key \("+p0.getClass().getName()+"\): "+e7, objArray);
             return v1;
          }
       }catch(java.security.NoSuchAlgorithmException e5){
          objArray = new Object[i];
          n.a("AndroidKeyStore", "Signature algorithm "+p1+" not supported: "+e5, objArray);
          return 0;
       }
    }
}
