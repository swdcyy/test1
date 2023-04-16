package com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkPhotoParam;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class ShareBusinessLinkPhotoParam implements Serializable	// class@0013d6
{
    public String mEditPhotoId;
    public String mEditSessionId;
    public String mEditUid;
    public static final long serialVersionUID = 0xaeb892a206f7e6d5;

    public void ShareBusinessLinkPhotoParam(String p0,String p1,String p2){
       super();
       this.mEditSessionId = p0;
       this.mEditPhotoId = p1;
       this.mEditUid = p2;
    }
}
