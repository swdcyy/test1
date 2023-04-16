package com.android.kwai.foundation.network.core.serializers.JsonSerializer;
import com.android.kwai.foundation.network.core.serializers.ISerializer;
import java.lang.Object;
import java.util.Map;
import okhttp3.RequestBody;
import java.lang.String;
import okhttp3.MediaType;
import com.google.gson.Gson;

public class JsonSerializer implements ISerializer	// class@000ef8
{

    public void JsonSerializer(){
       super();
    }
    public RequestBody serialize(Map p0){
       return RequestBody.create(MediaType.parse("application/json;charset=utf-8"), new Gson().q(p0));
    }
}
