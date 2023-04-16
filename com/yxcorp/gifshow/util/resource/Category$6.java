package com.yxcorp.gifshow.util.resource.Category$6;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import boc.b;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.nio.charset.Charset;
import com.kuaishou.android.model.response.ConfigResponse;

public final class Category$6 extends Category	// class@000cc2
{

    public void Category$6(String p0,int p1,String p2,String p3){
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
       return "";
    }
    public String getUnzipDir(){
       return this.getEmojiSubPath();
    }
    public void removeOutdatedFiles(){
       super.removeOutdatedFiles();
       this.checkFileValid();
    }
    public boolean useYcnnModelConfig(){
       return true;
    }
}
