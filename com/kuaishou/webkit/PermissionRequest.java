package com.kuaishou.webkit.PermissionRequest;
import java.lang.Object;
import android.net.Uri;
import java.lang.String;

public abstract class PermissionRequest	// class@001255
{

    public void PermissionRequest(){
       super();
    }
    public abstract void deny();
    public abstract Uri getOrigin();
    public abstract String[] getResources();
    public abstract void grant(String[] p0);
}
