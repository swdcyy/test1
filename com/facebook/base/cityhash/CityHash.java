package com.facebook.base.cityhash.CityHash;
import java.lang.String;
import com.facebook.soloader.SoLoader;
import com.facebook.jni.HybridData;
import java.lang.Object;

public class CityHash	// class@001036
{
    public final HybridData a;

    static {
       SoLoader.b("basejni");
    }
    public void CityHash(HybridData p0){
       super();
       this.a = p0;
    }
    public static native int jniCityHash32(String p0);
}
