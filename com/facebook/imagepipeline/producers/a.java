package com.facebook.imagepipeline.producers.a;
import com.facebook.imagepipeline.producers.j;
import com.facebook.common.memory.b;
import ya.a;
import java.util.concurrent.Executor;
import com.facebook.imagepipeline.request.ImageRequest;
import bd.d;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import ab.e;
import java.lang.CharSequence;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class a extends j	// class@001128
{

    public void a(b p0){
       super(a.a(), p0);
    }
    public d c(ImageRequest p0){
       byte[] uobyteArray;
       String str = p0.s().toString();
       e.a(Boolean.valueOf((str.substring(0, 5)).equals("data:")));
       int i = str.indexOf(44);
       String str1 = str.substring((i + 1), str.length());
       str = str.substring(0, i);
       String str2 = ";";
       if (!str.contains(str2)) {
          uobyteArray = null;
       }else {
          String[] stringArray = str.split(str2);
          uobyteArray = (stringArray[(stringArray.length - 1)]).equals("base64");
       }
       uobyteArray = (uobyteArray)? Base64.decode(str1, 0): (Uri.decode(str1)).getBytes();
       return this.b(new ByteArrayInputStream(uobyteArray), uobyteArray.length);
    }
    public String e(){
       return "DataFetchProducer";
    }
}
