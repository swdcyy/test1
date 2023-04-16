package ana.e$a;
import com.kwai.framework.accountsecurity.d$a;
import ana.e;
import f55.g;
import java.lang.Object;
import java.security.KeyPair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s00.b$b;
import s00.b;
import java.security.PublicKey;
import java.lang.System;
import java.security.PrivateKey;
import com.kwai.framework.accountsecurity.d;
import com.yxcorp.gifshow.growth.bridge.bean.JsAccountAppealResult;
import o56.a;
import java.lang.Throwable;
import android.os.Bundle;

public class e$a implements d$a	// class@0000aa
{
    public final g a;
    public final e b;

    public void e$a(e p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(KeyPair p0){
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       String str = b.b().a(p0.getPublic().getEncoded());
       String str1 = String.valueOf(System.currentTimeMillis());
       try{
          str2 = d.j(p0.getPrivate(), str1);
       }catch(java.security.InvalidKeyException e0){
       label_002c :
          str2 = "";
       }catch(java.security.NoSuchAlgorithmException e0){
       }catch(java.io.UnsupportedEncodingException e0){
       }catch(java.security.SignatureException e0){
       }
       this.a.onSuccess(new JsAccountAppealResult(a.j, str1, str2, e0));
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       this.a.a(-1, p0.getMessage(), null);
       return;
    }
}
