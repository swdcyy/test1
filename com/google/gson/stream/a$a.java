package com.google.gson.stream.a$a;
import com.google.gson.internal.a;
import com.google.gson.stream.a;
import com.google.gson.internal.bind.a;
import java.lang.Object;
import java.util.Objects;
import com.google.gson.stream.JsonToken;
import java.util.Iterator;
import java.util.Map$Entry;
import zk.g;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class a$a extends a	// class@0005bc
{

    public void a$a(){
       super();
    }
    public void a(a p0){
       if (p0 instanceof a) {
          Objects.requireNonNull(p0);
          p0.S(JsonToken.NAME);
          Map$Entry uEntry = p0.T().next();
          p0.V(uEntry.getValue());
          p0.V(new g(uEntry.getKey()));
          return;
       }else {
          a i = p0.i;
          if (i == null) {
             i = p0.f();
          }
          if (i == 13) {
             p0.i = 9;
          }else if(i == 12){
             p0.i = 8;
          }else if(i == 14){
             p0.i = 10;
          }else {
             throw new IllegalStateException("Expected a name but was "+p0.J()+p0.r());
          }
          return;
       }
    }
}
