package com.android.kwai.foundation.network.core.deserializers.StringDeserializer;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import java.lang.Object;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import java.lang.CharSequence;
import java.nio.charset.Charset;

public class StringDeserializer implements IDeserializer	// class@000eea
{

    public void StringDeserializer(){
       super();
    }
    public Object deserialize(Response p0,Class p1){
       return this.deserialize(p0, p1);
    }
    public String deserialize(Response p0,Class p1){
       ResponseBody responseBody = p0.body();
       MediaType mediaType = responseBody.contentType();
       if ((mediaType.type()).contains("text")) {
          return new String(responseBody.bytes(), mediaType.charset(Charset.forName("utf-8")));
       }
       return null;
    }
}
