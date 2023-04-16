package com.google.gson.internal.bind.TreeTypeAdapter$a;
import zk.h;
import com.google.gson.a;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.lang.Object;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.reflect.Type;

public final class TreeTypeAdapter$a implements h, a	// class@000587
{
    public final TreeTypeAdapter a;

    public void TreeTypeAdapter$a(TreeTypeAdapter p0){
       this.a = p0;
       super();
    }
    public JsonElement a(Object p0){
       return this.a.c.x(p0);
    }
    public JsonElement b(Object p0,Type p1){
       return this.a.c.y(p0, p1);
    }
    public Object c(JsonElement p0,Type p1){
       return this.a.c.d(p0, p1);
    }
}
