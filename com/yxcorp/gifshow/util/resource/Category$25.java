package com.yxcorp.gifshow.util.resource.Category$25;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import boc.b;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.nio.charset.Charset;
import com.kuaishou.android.model.response.ConfigResponse;
import java.lang.StringBuilder;

public final class Category$25 extends Category	// class@000cbb
{

    public void Category$25(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public boolean checkFileValid(){
       boolean b = MagicEmojiResourceHelper.r(this);
       if (!b) {
          this.a();
       }
       return b;
    }
    public Charset getCharset(){
       return Charset.defaultCharset();
    }
    public String getDownloadUrlSuffix(ConfigResponse p0){
       return p0.mDirtylensResource;
    }
    public String getResourceDir(){
       return this.getUnzipDir()+"dirtylens_detect.model";
    }
    public void removeOutdatedFiles(){
       super.removeOutdatedFiles();
       this.checkFileValid();
    }
}
