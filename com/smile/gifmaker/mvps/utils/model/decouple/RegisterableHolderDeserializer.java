package com.smile.gifmaker.mvps.utils.model.decouple.RegisterableHolderDeserializer;
import com.smile.gifmaker.mvps.utils.model.decouple.BaseDecoupledDeserializer;
import java.lang.Object;
import java.lang.Iterable;
import wl8.b;
import java.util.Objects;
import java.lang.Class;
import tl8.a;
import java.util.Set;
import java.util.Collections;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;

public class RegisterableHolderDeserializer extends BaseDecoupledDeserializer	// class@000c35
{

    public Iterable a(Object p0){
       Objects.requireNonNull(p0);
       return Collections.unmodifiableSet(b.b.a(b.class));
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.b(p0, p1, p2);
    }
}
