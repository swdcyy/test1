package com.android.kwai.foundation.network.core.deserializers.BeanDeserializer;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import java.lang.Object;
import okhttp3.Response;
import java.lang.Class;
import com.android.kwai.foundation.network.core.deserializers.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.Gson;

public class BeanDeserializer implements IDeserializer	// class@0003f0
{

    public void BeanDeserializer(){
       super();
    }
    public Object deserialize(Response p0,Class p1){
       JsonElement jsonElement = new JsonDeserializer().deserialize(p0, p1);
       if (jsonElement != null) {
          return new Gson().c(jsonElement, p1);
       }
       return null;
    }
}
