package com.google.gson.Gson$FutureTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.IllegalStateException;
import com.google.gson.stream.b;

public class Gson$FutureTypeAdapter extends TypeAdapter	// class@000552
{
    public TypeAdapter a;

    public void Gson$FutureTypeAdapter(){
       super();
    }
    public Object read(a p0){
       Gson$FutureTypeAdapter ta = this.a;
       if (ta != null) {
          return ta.read(p0);
       }
       throw new IllegalStateException();
    }
    public void write(b p0,Object p1){
       Gson$FutureTypeAdapter ta = this.a;
       if (ta == null) {
          throw new IllegalStateException();
       }
       ta.write(p0, p1);
       return;
    }
}
