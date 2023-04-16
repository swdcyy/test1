package com.yxcorp.gifshow.util.resource.FontCategory;
import com.yxcorp.gifshow.util.resource.CommonCategory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.yxcorp.gifshow.util.resource.FontCategory$b;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.io.File;
import java.util.Map;
import qkd.c;
import qfc.a;
import java.lang.Throwable;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.yxcorp.gifshow.util.resource.FontCategory$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.HashMap;
import boc.d;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import doc.a;

public class FontCategory extends CommonCategory	// class@000cca
{
    public final FontCategory$b mFontDownloadInfo;
    public static final Executor b;

    static {
       FontCategory.b = Executors.newSingleThreadExecutor();
    }
    public void FontCategory(FontCategory$b p0){
       super("font_resource"+p0.d, "ks://download_font_resource", p0.b, p0.c);
       this.mFontDownloadInfo = p0;
    }
    public static String getFontResDir(){
       return b.a(-1504323719).h(".font_resource").getAbsolutePath();
    }
    public static Map parseFontIdCache(){
       String str;
       File uFile = new File(FontCategory.getFontResDir(), "font_config");
       FontCategory$a uoa = null;
       if (uFile.exists()) {
          try{
             str = c.j(uFile.getAbsoluteFile());
          label_0029 :
             if (!TextUtils.x(str)) {
                uoa = a.a.i(str, new FontCategory$a().getType());
             }
             if (uoa == null) {
                uoa = new HashMap();
             }
             return uoa;
          }catch(java.io.IOException e0){
             Object[] objArray = new Object[0];
             a.C().u("FontCategory", e0, objArray);
          }
          str = uoa;
          goto label_0029 ;
       }else {
          goto label_0028 ;
       }
    }
    public String generateResourcePath(){
       return this.mFontDownloadInfo.a;
    }
    public boolean isNeedDownload(){
       Object[] objArray;
       int i = 0;
       if (!(TextUtils.k(this.mFontDownloadInfo.f)).equalsIgnoreCase(TextUtils.k(this.mFontDownloadInfo.e))) {
          objArray = new Object[i];
          a.C().s("FontCategory", "needDownload hash updated, download", objArray);
          return true;
       }else {
          String str = this.generateResourcePath();
          boolean b = new File(str).exists();
          StringBuilder str1 = "needDownload fontResourcePath: "+str;
          objArray = new Object[i];
          a.C().s("FontCategory", str1+", ret: "+b, objArray);
          return (b ^ 0x01);
       }
    }
    public void markHaveDownloaded(String p0){
       Object[] objArray = new Object[0];
       a.C().s("FontCategory", "markHaveDownloaded", objArray);
       FontCategory.b.execute(new d(this));
    }
    public boolean needDownload(a p0){
       return this.isNeedDownload();
    }
}
