package com.yxcorp.gifshow.util.resource.Category$17;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import com.kuaishou.android.model.response.ConfigResponse;
import java.lang.StringBuilder;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.io.File;

public final class Category$17 extends Category	// class@000cb2
{

    public void Category$17(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public String getDownloadUrlSuffix(ConfigResponse p0){
       return p0.mEmojiTTFResource;
    }
    public String getUnzipDir(){
       String separator = File.separator;
       return b.a(-1504323719).k()+separator+".emoji_ttf"+separator;
    }
}
