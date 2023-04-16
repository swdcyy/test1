package com.android.kwai.foundation.network.core.deserializers.JsonDeserializer;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import java.lang.Object;
import okhttp3.Response;
import java.lang.Class;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import java.lang.String;
import java.nio.charset.Charset;
import com.google.gson.c;
import com.google.gson.JsonElement;

public class JsonDeserializer implements IDeserializer	// class@0003f2
{

    public void JsonDeserializer(){
       super();
    }
    public Object deserialize(Response p0,Class p1){
       ResponseBody responseBody = p0.body();
       MediaType mediaType = responseBody.contentType();
       JsonElement jsonElement = ((mediaType.subtype()).equals("json") || (mediaType.subtype()).equals("plain"))? new c().a(new String(responseBody.bytes(), mediaType.charset(Charset.forName("utf-8")))): null;
       return jsonElement;
    }
}
