package com.yxcorp.gifshow.util.resource.Category$21;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import java.nio.charset.Charset;
import com.kuaishou.android.model.response.ConfigResponse;

public final class Category$21 extends Category	// class@000cb7
{

    public void Category$21(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public Charset getCharset(){
       return Charset.defaultCharset();
    }
    public String getDownloadUrlSuffix(ConfigResponse p0){
       return p0.mStickerResource;
    }
    public boolean needAddNoMediaFile(){
       return true;
    }
}