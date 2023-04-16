package com.tencent.mm.opensdk.constants.Build;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;

public final class Build	// class@000e6e
{
    public static final int SDK_INT = 638058496;

    public void Build(){
       super();
       throw new RuntimeException("Build should not be instantiated");
    }
    public static int getMajorVersion(){
       return 6;
    }
    public static int getMinorVersion(){
       return 8;
    }
}
