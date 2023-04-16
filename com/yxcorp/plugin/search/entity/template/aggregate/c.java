package com.yxcorp.plugin.search.entity.template.aggregate.c;
import com.smile.gifmaker.mvps.utils.model.decouple.BaseDecoupledDeserializer$a;
import java.lang.Object;
import java.lang.Exception;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.JsonObject;
import java.lang.String;
import k2b.u1;

public final class c implements BaseDecoupledDeserializer$a	// class@0013b5
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(Exception p0,JsonElement p1,Type p2){
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("exception", p0.getMessage());
       jsonObject.c0("json", p1.toString());
       jsonObject.c0("type", p2.toString());
       u1.Q("exception", jsonObject.toString());
    }
}
