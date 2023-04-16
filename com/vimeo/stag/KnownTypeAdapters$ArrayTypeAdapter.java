package com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.google.gson.TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.util.ArrayList;
import com.google.gson.stream.b;

public final class KnownTypeAdapters$ArrayTypeAdapter extends TypeAdapter	// class@000ff2
{
    public final TypeAdapter a;
    public final KnownTypeAdapters$f b;

    public void KnownTypeAdapters$ArrayTypeAdapter(TypeAdapter p0,KnownTypeAdapters$f p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object[] a(a p0){
       if (JsonToken.NULL == p0.J()) {
          p0.A();
          return null;
       }else {
          p0.a();
          ArrayList uArrayList = new ArrayList();
          while (p0.l()) {
             uArrayList.add(this.a.read(p0));
          }
          p0.g();
          return uArrayList.toArray(this.b.a(uArrayList.size()));
       }
    }
    public void b(b p0,Object[] p1){
       if (p1 == null) {
          p0.u();
       }else {
          p0.c();
          int len = p1.length;
          for (int i = 0; i < len; i = i + 1) {
             this.a.write(p0, p1[i]);
          }
          p0.g();
       }
       return;
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
