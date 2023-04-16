package com.kwai.framework.location.c;
import ok.x;
import java.lang.Object;
import com.kwai.framework.location.j;
import java.lang.String;
import com.kwai.framework.abtest.f;
import java.lang.Boolean;

public final class c implements x	// class@000b7e
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(f.a("enable_nearby_location_gps_permisson"));
    }
}
