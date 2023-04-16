package com.yxcorp.gifshow.util.resource.Category$24;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$1;
import tkd.b;
import tkd.d;
import boc.c0;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import boc.b;
import java.nio.charset.Charset;
import com.kuaishou.android.model.response.ConfigResponse;
import wkd.b;
import j80.c;
import java.io.File;

public final class Category$24 extends Category	// class@000cba
{

    public void Category$24(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public boolean checkFileValid(){
       boolean b = d.a(-1017416905).t40(this.getResourceDir());
       Object[] objArray = new Object[0];
       a.C().w("SCREENCAST_PATCH checkMd5", "result: "+b, objArray);
       if (!b) {
          this.a();
       }
       return b;
    }
    public Charset getCharset(){
       return Charset.defaultCharset();
    }
    public String getDownloadUrlSuffix(ConfigResponse p0){
       return p0.mScreencastPatch;
    }
    public String getUnzipDir(){
       String separator = File.separator;
       return b.a(-1504323719).c(".screencast")+separator+this.mResource+separator;
    }
    public void removeOutdatedFiles(){
       super.removeOutdatedFiles();
       this.checkFileValid();
    }
}
