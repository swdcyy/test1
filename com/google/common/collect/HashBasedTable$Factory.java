package com.google.common.collect.HashBasedTable$Factory;
import ok.x;
import java.io.Serializable;
import java.lang.Object;
import java.util.Map;
import java.util.LinkedHashMap;
import com.google.common.collect.Maps;

public class HashBasedTable$Factory implements x, Serializable	// class@0004cf
{
    public final int expectedSize;
    public static final long serialVersionUID;

    public void HashBasedTable$Factory(int p0){
       super();
       this.expectedSize = p0;
    }
    public Object get(){
       return this.get();
    }
    public Map get(){
       return Maps.v(this.expectedSize);
    }
}
