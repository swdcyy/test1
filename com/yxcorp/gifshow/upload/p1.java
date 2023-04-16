package com.yxcorp.gifshow.upload.p1;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import qq.a;
import java.lang.StringBuilder;
import w46.b;
import qkd.b;
import q87.c;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;

public final class p1 implements o	// class@001e98
{
    public static final p1 b;

    static {
       p1.b = new p1();
    }
    public void p1(){
       super();
    }
    public final Object apply(Object p0){
       AtlasInfo atlasInfo;
       File uFile2;
       String name;
       File uFile3;
       Object[] objArray2;
       try{
          if (TextUtils.isEmpty(p0.getWorkspacePath())) {
          }else {
             File uFile = new File(p0.getFilePath());
             if (uFile.isFile()) {
                uFile = uFile.getParentFile();
             }
             int i = 0;
             if (uFile != null && (!uFile.exists() && !uFile.mkdirs())) {
                Object[] objArray = new Object[i];
                a.D().t("UploadManager", "prepareForPostUploadWorks: "+uFile, objArray);
             }
          label_004c :
             if (p0.getCoverFile() != null && p0.getCoverFile().exists()) {
                File uFile1 = b.X(uFile, "_cover.jpg");
                try{
                   b.g(p0.getCoverFile(), uFile1);
                   Object[] objArray1 = new Object[i];
                   a.D().w("UploadManager", "Copy cover to "+uFile1.getAbsolutePath(), objArray1);
                   p0.setCoverFile(uFile1);
                }catch(java.io.IOException e3){
                   i1.b("UploadManager", e3);
                }
             }
          }
       }catch(java.io.IOException e0){
          i1.b("UploadManager", e0);
       }
    label_00ed :
       return p0;
    }
}
