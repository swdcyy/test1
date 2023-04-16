package com.yxcorp.gifshow.util.resource.Category$23;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import com.kuaishou.android.model.response.ConfigResponse;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.Object;
import wkd.b;
import j80.c;

public final class Category$23 extends Category	// class@000cb9
{

    public void Category$23(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public String getDownloadUrlSuffix(ConfigResponse p0){
       return p0.mGlassesResource;
    }
    public String getResourceDir(){
       return this.getUnzipDir()+"glasses_resource_v4"+File.separator;
    }
    public String getUnzipDir(){
       String separator = File.separator;
       return b.a(-1504323719).k()+separator+".glasses"+separator;
    }
    public boolean needAddNoMediaFile(){
       return true;
    }
}
