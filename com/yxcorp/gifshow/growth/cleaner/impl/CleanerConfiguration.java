package com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfiguration;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfiguration$a;
import nsd.u;
import java.lang.Object;

public final class CleanerConfiguration implements Serializable	// class@0012fc
{
    public long notificationLeftSize;
    public ArrayList whiteList;
    public static final CleanerConfiguration$a Companion;
    public static final long defaultSize;
    public static final long serialVersionUID;
    public static final int version;

    static {
       CleanerConfiguration.Companion = new CleanerConfiguration$a(null);
       CleanerConfiguration.version = 1;
       CleanerConfiguration.defaultSize = 5120;
       CleanerConfiguration.serialVersionUID = 0xff6bff961d421fcf;
    }
    public void CleanerConfiguration(){
       super();
       this.notificationLeftSize = CleanerConfiguration.defaultSize;
    }
    public static final long getDefaultSize(){
       return CleanerConfiguration.defaultSize;
    }
    public static final long getSerialVersionUID(){
       return CleanerConfiguration.serialVersionUID;
    }
    public static final int getVersion(){
       return CleanerConfiguration.version;
    }
}
