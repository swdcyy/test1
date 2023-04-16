package com.eclipsesource.v8.utils.SingleTypeAdapter;
import com.eclipsesource.v8.utils.TypeAdapter;
import java.lang.Object;

public abstract class SingleTypeAdapter implements TypeAdapter	// class@001017
{
    public int typeToAdapt;

    public void SingleTypeAdapter(int p0){
       super();
       this.typeToAdapt = p0;
    }
    public Object adapt(int p0,Object p1){
       if (p0 == this.typeToAdapt) {
          return this.adapt(p1);
       }
       return TypeAdapter.DEFAULT;
    }
    public abstract Object adapt(Object p0);
}
