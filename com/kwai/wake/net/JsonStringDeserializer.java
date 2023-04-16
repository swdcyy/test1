package com.kwai.wake.net.JsonStringDeserializer;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import java.lang.Object;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import java.nio.charset.Charset;

public final class JsonStringDeserializer implements IDeserializer	// class@00110e
{

    public void JsonStringDeserializer(){
       super();
    }
    public Object deserialize(Response p0,Class p1){
       return this.deserialize(p0, p1);
    }
    public String deserialize(Response p0,Class p1){
       a.p(p0, "response");
       a.p(p1, "destClz");
       try{
          int i = 0;
          ResponseBody responseBody = p0.body();
          MediaType mediaType = (responseBody != null)? responseBody.contentType(): i;
          String str = 1;
          if (mediaType != null) {
             String str1 = mediaType.type();
             if (str1 != null && (str == str1.equals("application") && (mediaType.subtype()).equals("json"))) {
                Charset uCharset = mediaType.charset(Charset.forName("utf-8"));
                byte[] uobyteArray = responseBody.bytes();
                a.o(uobyteArray, "bytes");
                a.m(uCharset);
                return new String(uobyteArray, uCharset);
             }
          }
       label_0050 :
          return i;
       }catch(java.lang.Exception e0){
       }
    }
}
