package com.kuaishou.webkit.adapter.PermissionRequestAdapter;
import com.kuaishou.webkit.PermissionRequest;
import android.webkit.PermissionRequest;
import android.net.Uri;
import java.lang.String;

public class PermissionRequestAdapter extends PermissionRequest	// class@0012a9
{
    public PermissionRequest mStub;

    public void PermissionRequestAdapter(PermissionRequest p0){
       super();
       this.mStub = p0;
    }
    public void deny(){
       this.mStub.deny();
    }
    public Uri getOrigin(){
       return this.mStub.getOrigin();
    }
    public String[] getResources(){
       return this.mStub.getResources();
    }
    public void grant(String[] p0){
       this.mStub.grant(p0);
    }
}
