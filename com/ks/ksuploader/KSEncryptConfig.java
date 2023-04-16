package com.ks.ksuploader.KSEncryptConfig;
import java.lang.Object;
import java.util.Arrays;

public class KSEncryptConfig	// class@00074d
{
    public int cipher;
    public byte[] key;
    public byte[] nonce;

    public void KSEncryptConfig(){
       super();
       this.cipher = 0;
       this.key = null;
       this.nonce = null;
    }
    public void KSEncryptConfig(int p0,byte[] p1,byte[] p2){
       super();
       this.cipher = p0;
       this.key = p1;
       this.nonce = p2;
    }
    public void KSEncryptConfig(KSEncryptConfig p0){
       super();
       this.cipher = p0.cipher;
       KSEncryptConfig key = p0.key;
       this.key = (key != null)? Arrays.copyOf(key, key.length): null;
       p0 = p0.nonce;
       this.nonce = (p0 != null)? Arrays.copyOf(p0, p0.length): null;
       return;
    }
    public boolean isValid(){
       KSEncryptConfig tcipher = this.cipher;
       if (tcipher == null) {
          return true;
       }
       if (tcipher != true) {
          return false;
       }
       tcipher = this.key;
       if (tcipher != null && tcipher.length == 32) {
          tcipher = this.nonce;
          if (tcipher != null && tcipher.length == 12) {
             return true;
          }
       }
       return false;
    }
}
