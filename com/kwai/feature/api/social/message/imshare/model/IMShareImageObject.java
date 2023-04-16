package com.kwai.feature.api.social.message.imshare.model.IMShareImageObject;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import java.lang.String;
import java.lang.Object;

public class IMShareImageObject extends IMShareObject	// class@001152
{
    public final Object extraData;
    public final int height;
    public final String imageUrl;
    public String localFilePath;
    public final int width;
    public static final long serialVersionUID = 0x892c49c879e5d695;

    public void IMShareImageObject(String p0,int p1,int p2){
       super();
       this.imageUrl = p0;
       this.width = p1;
       this.height = p2;
       this.extraData = null;
    }
    public void IMShareImageObject(String p0,int p1,int p2,Object p3){
       super();
       this.imageUrl = p0;
       this.width = p1;
       this.height = p2;
       this.extraData = p3;
    }
    public int getKwaiMsgType(){
       return 1;
    }
    public int getShareAction(){
       return 9;
    }
}
