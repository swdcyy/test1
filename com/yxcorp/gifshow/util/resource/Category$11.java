package com.yxcorp.gifshow.util.resource.Category$11;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import java.nio.charset.Charset;
import com.kuaishou.android.model.response.ConfigResponse;

public final class Category$11 extends Category	// class@000cac
{

    public void Category$11(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public Charset getCharset(){
       return Charset.defaultCharset();
    }
    public String getDownloadUrlSuffix(ConfigResponse p0){
       return p0.mMagicFingerResource;
    }
    public boolean needAddNoMediaFile(){
       return true;
    }
}
