package com.feature.post.bridge.jsmodel.JsSaveImageParams;
import java.io.Serializable;
import java.lang.Object;

public class JsSaveImageParams implements Serializable	// class@00148d
{
    public String base64String;
    public boolean isRequestPermissionsWithCancelEvent;
    public String mCallback;
    public static final long serialVersionUID = 0x5910f25d70964dde;

    public void JsSaveImageParams(){
       super();
       this.isRequestPermissionsWithCancelEvent = false;
    }
}
