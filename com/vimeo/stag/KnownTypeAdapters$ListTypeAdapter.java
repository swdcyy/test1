package com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.TypeAdapter;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.util.Collection;
import com.google.gson.stream.b;
import java.util.Iterator;

public final class KnownTypeAdapters$ListTypeAdapter extends TypeAdapter	// class@000ff3
{
    public final TypeAdapter a;
    public final p b;

    public void KnownTypeAdapters$ListTypeAdapter(TypeAdapter p0,p p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object read(a p0){
       Collection uCollection;
       if (JsonToken.NULL == p0.J()) {
          p0.A();
          uCollection = null;
       }else {
          Collection uCollection1 = this.b.a();
          p0.a();
          while (p0.l()) {
             uCollection1.add(this.a.read(p0));
          }
          p0.g();
          uCollection = uCollection1;
       }
       return uCollection;
    }
    public void write(b p0,Object p1){
       if (p1 == null) {
          p0.u();
       }else {
          p0.c();
          p1 = p1.iterator();
          while (p1.hasNext()) {
             this.a.write(p0, p1.next());
          }
          p0.g();
       }
       return;
    }
}
