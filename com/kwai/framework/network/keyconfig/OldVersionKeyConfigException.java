package com.kwai.framework.network.keyconfig.OldVersionKeyConfigException;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;

public class OldVersionKeyConfigException extends RuntimeException	// class@0017df
{
    public final int mLastVersion;
    public final int mVersion;

    public void OldVersionKeyConfigException(int p0,int p1){
       super("KeyConfig too old "+p0+". Current: "+p1);
       this.mLastVersion = p1;
       this.mVersion = p0;
    }
    public int getLastVersion(){
       return this.mLastVersion;
    }
    public int getVersion(){
       return this.mVersion;
    }
}
