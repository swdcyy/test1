package com.yxcorp.gifshow.util.cdnresource.CdnResource;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import java.lang.Object;
import java.util.List;
import java.io.File;
import java.lang.String;
import java.util.HashMap;
import org.json.JSONObject;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.io.FileNotFoundException;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import android.graphics.BitmapFactory;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import com.yxcorp.gifshow.util.cdnresource.b;
import java.io.FileFilter;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$b;
import com.airbnb.lottie.LottieTask;
import java.io.FileInputStream;
import java.io.InputStream;
import com.airbnb.lottie.a;
import qkd.b;

public final class CdnResource	// class@001f65
{
    public final Map a;
    public final File b;
    public final String c;
    public final int d;
    public static List e;
    public static List f;

    static {
       CdnResource.e = new ArrayList();
       CdnResource.f = new ArrayList();
       CdnResource.e.add(CdnResource$ResourceKey.detail_center_like);
       CdnResource.e.add(CdnResource$ResourceKey.detail_center_like_b);
       CdnResource.e.add(CdnResource$ResourceKey.comment_like);
       CdnResource.e.add(CdnResource$ResourceKey.detail_nav_like);
       CdnResource.e.add(CdnResource$ResourceKey.bt_detail_center_like);
       CdnResource.e.add(CdnResource$ResourceKey.bt_sidebar_like);
       CdnResource.e.add(CdnResource$ResourceKey.bt_comment_like);
       CdnResource.f.add(CdnResource$ResourceKey.detail_nav_unlike_b);
       CdnResource.f.add(CdnResource$ResourceKey.bt_sidebar_dislike);
       CdnResource.f.add(CdnResource$ResourceKey.bt_comment_dislike);
    }
    public void CdnResource(File p0,String p1,int p2){
       super();
       this.a = new HashMap();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public static CdnResource f(File p0,String p1,int p2){
       CdnResource uCdnResource = new CdnResource(p0, p1, p2);
       JSONObject jSONObject = uCdnResource.d();
       CdnResource$ResourceKey[] resourceKeyA = CdnResource$ResourceKey.values();
       p2 = resourceKeyA.length;
       int i = 0;
       while (i < p2) {
          object oobject = resourceKeyA[i];
          String str = jSONObject.optString(oobject.name());
          if (!TextUtils.x(str)) {
             uCdnResource.a.put(oobject, str);
          }
          i = i + 1;
       }
       if (uCdnResource.a.size()) {
          return uCdnResource;
       }
       throw new FileNotFoundException("未在压缩包里发现需要的资源");
    }
    public Bitmap a(CdnResource$ResourceKey p0){
       String str = this.a.get(p0);
       Bitmap uBitmap = (!TextUtils.x(str))? BitmapFactory.decodeFile(this.b.getAbsolutePath()+File.separator+str): null;
       return uBitmap;
    }
    public CdnResource$a b(CdnResource$ResourceKey p0){
       String str = this.a.get(p0);
       CdnResource$a uoa = null;
       if (TextUtils.x(str)) {
          return uoa;
       }
       File uFile = new File(this.b.getAbsolutePath()+File.separator+str);
       if (!uFile.exists()) {
          return uoa;
       }
       File[] uFileArray = uFile.listFiles(b.b);
       if (uFileArray == null) {
          return uoa;
       }
       return new CdnResource$b(uFileArray, this.c);
    }
    public LottieTask c(CdnResource$ResourceKey p0){
       String str = this.a.get(p0);
       if (TextUtils.x(str)) {
          return null;
       }
       File uFile = new File(this.b, str);
       if (!uFile.exists()) {
          return null;
       }
       return a.d(new FileInputStream(uFile), uFile.getAbsolutePath());
    }
    public JSONObject d(){
       return new JSONObject(b.f0(new File(this.b, "keymap.json")));
    }
    public String e(){
       return this.c;
    }
}
