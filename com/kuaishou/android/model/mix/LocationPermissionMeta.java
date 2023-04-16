package com.kuaishou.android.model.mix.LocationPermissionMeta;
import java.io.Serializable;
import java.lang.Object;

public class LocationPermissionMeta implements Serializable	// class@000d0f
{
    public boolean mHasSetTitle;
    public boolean mIsTextSystemPermissible;
    public int mStyle;
    public static final long serialVersionUID = 0xf2df3cd7f58a40f8;

    public void LocationPermissionMeta(){
       super();
       this.mHasSetTitle = false;
       this.mIsTextSystemPermissible = false;
    }
}
