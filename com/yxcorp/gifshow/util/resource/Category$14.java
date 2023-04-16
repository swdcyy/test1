package com.yxcorp.gifshow.util.resource.Category$14;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import java.nio.charset.Charset;
import com.kuaishou.android.model.response.ConfigResponse;
import java.lang.StringBuilder;
import lu5.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import j80.c;
import java.io.File;

public final class Category$14 extends Category	// class@000caf
{

    public void Category$14(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public Charset getCharset(){
       return Charset.defaultCharset();
    }
    public String getDownloadUrlSuffix(ConfigResponse p0){
       return p0.mKbarMmuModel;
    }
    public String getUnzipDir(){
       StringBuilder str = "";
       String str1 = PatchProxy.apply(null, null, c.class, "8");
       if (str1 != PatchProxyResult.class) {
       }else {
          str1 = b.a(-1504323719).c(".qrcode_model").getPath();
       }
       str1 = File.separator;
       return str+str1+str1+this.mResource+str1;
    }
}
