package com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationHolder;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationHolder$a;
import nsd.u;
import java.lang.Object;

public final class CleanerConfigurationHolder implements Serializable	// class@0012fe
{
    public CleanerConfiguration cleanerConfig;
    public static final CleanerConfigurationHolder$a Companion;
    public static final long serialVersionUID;

    static {
       CleanerConfigurationHolder.Companion = new CleanerConfigurationHolder$a(null);
       CleanerConfigurationHolder.serialVersionUID = 0xff6bff961d421fd0;
    }
    public void CleanerConfigurationHolder(){
       super();
    }
    public static final long getSerialVersionUID(){
       return CleanerConfigurationHolder.serialVersionUID;
    }
}
