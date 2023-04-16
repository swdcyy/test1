package com.eclipsesource.v8.utils.TypeAdapter;
import java.lang.Object;

public interface abstract TypeAdapter	// class@001018
{
    public static final Object DEFAULT;

    static {
       TypeAdapter.DEFAULT = new Object();
    }
    Object adapt(int p0,Object p1);
}
