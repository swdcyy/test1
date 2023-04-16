package com.yxcorp.gifshow.util.resource.Category$27;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import java.nio.charset.Charset;
import com.kuaishou.android.model.response.ConfigResponse;
import java.lang.StringBuilder;
import java.io.File;

public final class Category$27 extends Category	// class@000cbd
{

    public void Category$27(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public Charset getCharset(){
       return Charset.defaultCharset();
    }
    public String getDownloadUrlSuffix(ConfigResponse p0){
       return p0.mDeNoiseMode;
    }
    public String getResourceDir(){
       return super.getResourceDir()+"karaoke_denoise_model_v1"+File.separator;
    }
    public String getResourceName(){
       return "karaoke_denoise_model_v1.tflite";
    }
    public boolean needRename(){
       return false;
    }
}
