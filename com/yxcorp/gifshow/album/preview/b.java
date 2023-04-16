package com.yxcorp.gifshow.album.preview.b;
import android.os.Build$VERSION;
import android.os.LocaleList;
import java.util.Locale;
import java.lang.Object;
import java.lang.String;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import r79.e;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.album.preview.b$a;
import k79.j;
import java.lang.Float;
import o79.i;

public class b	// class@001a4b
{
    public static Locale a;

    static {
       b.a = (Build$VERSION.SDK_INT >= 24)? LocaleList.getDefault().get(0): Locale.getDefault();
       if (b.a == null) {
          b.a = Locale.CHINESE;
       }
    }
    public void b(){
       super();
    }
    public static String a(String p0,c p1,boolean p2,int p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), null, b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!TextUtils.x(p0)) {
          Log.g("AlbumUtils", "cover exist, media path = "+p1.getPath());
          return p0;
       }else if(p1 instanceof e && b.S(p1.getThumbnailFile())){
          Log.g("AlbumUtils", "system cover exist, media path = "+p1.getPath());
          return p1.getThumbnailFile().getAbsolutePath();
       }else if(p2){
          File uFile = j.b(new File(p1.getPath()), b.b(p3, 0x3f800000).c, b.b(p3, 0x3f800000).c);
          if (b.S(uFile)) {
             Log.g("AlbumUtils", "cover not exist, use album cache, media path = "+p1.getPath());
             return uFile.getAbsolutePath();
          }
       }
       return "";
    }
    public static b$a b(int p0,float p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), null, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = i.k();
       int i1 = 3;
       int i2 = (p0 == i1)? i.c(R.dimen.arg_RES_7f070492): i.c(R.dimen.arg_RES_7f070491);
       i = i - ((p0 - 1) * i2);
       if (p0 != i1 && (i % p0)) {
          i2 = i2 + 1;
       }
       return new b$a(i2, i, (int)((p1 * (float)i) / (float)p0));
    }
}
