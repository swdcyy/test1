package me9.k$b;
import java.util.concurrent.Callable;
import ne9.b;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ne9.d;
import android.graphics.Bitmap;
import com.google.gson.JsonObject;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import j8c.a;
import w46.b;

public final class k$b implements Callable	// class@002ff7
{
    public final b b;
    public final MagicRequest c;

    public void k$b(b p0,MagicRequest p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       String str1;
       d uod = PatchProxy.apply(null, this, k$b.class, "1");
       if (uod != PatchProxyResult.class) {
       }else if(this.b.a() != null){
          String str = "jpg";
          if (this.c.getRequestData() != null) {
             uod = a.a.c(this.c.getRequestData(), d.class);
             if (uod != null) {
                str1 = uod.a();
                if (str1 != null) {
                label_003c :
                   if (!TextUtils.equals(str1, str) && !TextUtils.equals(str1, "png")) {
                      throw new IllegalArgumentException("format Error : "+str1);
                   }
                }
             }
             str1 = str;
             goto label_003c ;
          }else {
             uod = new d(0x3f800000, str);
          }
       }else {
          Object[] objArray = new Object[0];
          a.D().t("MagicRequestSaveImgHandler", "bitmap is null", objArray);
          throw new IllegalArgumentException("no bitmap");
       }
       return uod;
    }
}
