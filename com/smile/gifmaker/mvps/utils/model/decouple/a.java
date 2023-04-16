package com.smile.gifmaker.mvps.utils.model.decouple.a;
import com.smile.gifmaker.mvps.utils.model.decouple.BaseDecoupledDeserializer$a;
import java.lang.Object;
import java.lang.Exception;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class a implements BaseDecoupledDeserializer$a	// class@000fc9
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(Exception p0,JsonElement p1,Type p2){
       Log.e("deserialize", "fail", p0);
    }
}
