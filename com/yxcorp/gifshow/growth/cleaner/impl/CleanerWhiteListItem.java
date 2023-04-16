package com.yxcorp.gifshow.growth.cleaner.impl.CleanerWhiteListItem;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerWhiteListItem$a;
import nsd.u;
import java.lang.Object;

public final class CleanerWhiteListItem implements Serializable	// class@00130e
{
    public ArrayList skipAbsFileList;
    public ArrayList skipAppList;
    public ArrayList skipPackageFileList;
    public ArrayList skipSdcardFileList;
    public int version;
    public static final CleanerWhiteListItem$a Companion;
    public static final long serialVersionUID;

    static {
       CleanerWhiteListItem.Companion = new CleanerWhiteListItem$a(null);
       CleanerWhiteListItem.serialVersionUID = 0xff6bff961d421fce;
    }
    public void CleanerWhiteListItem(){
       super();
    }
    public static final long getSerialVersionUID(){
       return CleanerWhiteListItem.serialVersionUID;
    }
}
