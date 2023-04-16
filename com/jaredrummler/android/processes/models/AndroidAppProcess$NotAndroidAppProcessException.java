package com.jaredrummler.android.processes.models.AndroidAppProcess$NotAndroidAppProcessException;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public final class AndroidAppProcess$NotAndroidAppProcessException extends Exception	// class@0006d7
{

    public void AndroidAppProcess$NotAndroidAppProcessException(int p0){
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       super(String.format("The process %d does not belong to any application", objArray));
    }
}
