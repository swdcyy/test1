package com.android.kwai.foundation.network.core.serializers.FormSerializer;
import com.android.kwai.foundation.network.core.serializers.ISerializer;
import java.lang.Object;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.FormBody$Builder;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
import java.lang.StringBuilder;
import okhttp3.RequestBody;

public class FormSerializer implements ISerializer	// class@0003f8
{

    public void FormSerializer(){
       super();
    }
    public FormBody serialize(Map p0){
       FormBody$Builder uBuilder = new FormBody$Builder();
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          uBuilder.add(str, p0.get(str)+"");
       }
       return uBuilder.build();
    }
    public RequestBody serialize(Map p0){
       return this.serialize(p0);
    }
}
