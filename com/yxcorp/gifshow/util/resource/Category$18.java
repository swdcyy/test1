package com.yxcorp.gifshow.util.resource.Category$18;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import com.kuaishou.android.model.response.ConfigResponse;
import java.lang.StringBuilder;
import o56.c;
import o56.a;
import android.app.Application;
import java.io.File;

public final class Category$18 extends Category	// class@000cb3
{

    public void Category$18(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public String getDownloadUrlSuffix(ConfigResponse p0){
       return p0.mHuaweiHiai;
    }
    public String getUnzipDir(){
       return a.a().a().getDir("libs", 0).getAbsolutePath()+File.separator;
    }
}
