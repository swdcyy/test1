package com.google.gson.JsonElement;
import java.lang.Object;
import com.google.gson.JsonArray;
import zk.f;
import com.google.gson.JsonObject;
import zk.g;
import java.lang.UnsupportedOperationException;
import java.lang.Class;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.io.StringWriter;
import com.google.gson.stream.b;
import java.io.Writer;
import com.google.gson.internal.b;
import java.lang.AssertionError;
import java.lang.Number;

public abstract class JsonElement	// class@000555
{

    public void JsonElement(){
       super();
    }
    public boolean B(){
       return this instanceof JsonArray;
    }
    public boolean D(){
       return this instanceof f;
    }
    public boolean E(){
       return this instanceof JsonObject;
    }
    public boolean F(){
       return this instanceof g;
    }
    public abstract JsonElement b();
    public boolean d(){
       throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
    public byte l(){
       throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
    public double m(){
       throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
    public float n(){
       throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
    public int p(){
       throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
    public JsonArray q(){
       if (this.B()) {
          return this;
       }
       throw new IllegalStateException("Not a JSON Array: "+this);
    }
    public JsonObject r(){
       if (this.E()) {
          return this;
       }
       throw new IllegalStateException("Not a JSON Object: "+this);
    }
    public g s(){
       if (this.F()) {
          return this;
       }
       throw new IllegalStateException("Not a JSON Primitive: "+this);
    }
    public long t(){
       throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
    public String toString(){
       try{
          StringWriter stringWriter = new StringWriter();
          b uob = new b(stringWriter);
          uob.C(true);
          b.b(this, uob);
          return stringWriter.toString();
       }catch(java.io.IOException e0){
          throw new AssertionError(e0);
       }
    }
    public Number u(){
       throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
    public short v(){
       throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
    public String w(){
       throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
}
