package com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.TypeAdapter;
import zk.i;
import com.google.gson.b;
import com.google.gson.Gson;
import el.a;
import zk.j;
import com.google.gson.internal.bind.TreeTypeAdapter$a;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.Class;
import com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory;
import com.google.gson.stream.a;
import com.google.gson.JsonElement;
import com.google.gson.internal.b;
import com.google.gson.a;
import com.google.gson.stream.b;
import zk.h;

public final class TreeTypeAdapter extends TypeAdapter	// class@000588
{
    public final i a;
    public final b b;
    public final Gson c;
    public final a d;
    public final j e;
    public final TreeTypeAdapter$a f;
    public TypeAdapter g;

    public void TreeTypeAdapter(i p0,b p1,Gson p2,a p3,j p4){
       super();
       this.f = new TreeTypeAdapter$a(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static j b(a p0,Object p1){
       boolean b = (p0.getType() == p0.getRawType())? true: false;
       return new TreeTypeAdapter$SingleTypeFactory(p1, p0, b, null);
    }
    public final TypeAdapter a(){
       TreeTypeAdapter tg = this.g;
       if (tg != null) {
       }else {
          tg = this.c.l(this.e, this.d);
          this.g = tg;
       }
       return tg;
    }
    public Object read(a p0){
       if (this.b == null) {
          return this.a().read(p0);
       }
       JsonElement jsonElement = b.a(p0);
       if (jsonElement.D()) {
          return null;
       }
       return this.b.deserialize(jsonElement, this.d.getType(), this.f);
    }
    public void write(b p0,Object p1){
       TreeTypeAdapter ta = this.a;
       if (ta == null) {
          this.a().write(p0, p1);
          return;
       }else if(p1 == null){
          p0.u();
          return;
       }else {
          b.b(ta.serialize(p1, this.d.getType(), this.f), p0);
          return;
       }
    }
}
