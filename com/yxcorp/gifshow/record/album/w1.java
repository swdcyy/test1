package com.yxcorp.gifshow.record.album.w1;
import io.reactivex.g;
import java.util.regex.Pattern;
import java.lang.Object;
import brd.v;
import java.io.File;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import k8c.b2;
import java.io.FileFilter;
import com.yxcorp.gifshow.record.album.q1;
import java.util.Comparator;
import java.util.Arrays;
import java.lang.String;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import rnc.i;
import iud.a;
import java.nio.charset.Charset;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import java.util.UUID;
import com.yxcorp.gifshow.model.j;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.util.AdvEditUtil;
import brd.g;
import qkd.b;
import com.yxcorp.gifshow.model.i;

public final class w1 implements g	// class@001782
{
    public final long b;
    public final Pattern c;

    public void w1(long p0,Pattern p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       w1 tc = this.c;
       File[] uFileArray = LocalAlbumUtils.l().listFiles(new b2(this.b));
       if (p0.isDisposed()) {
       }else if(uFileArray == null || !uFileArray.length){
          p0.onComplete();
       }else {
          Arrays.sort(uFileArray, q1.b);
          int len = uFileArray.length;
          int i = 0;
          while (true) {
             if (i < len) {
                object oobject = uFileArray[i];
                if (tc.matcher(oobject.getName()).matches()) {
                   if (i.b(oobject.getName())) {
                      String str = URLEncoder.encode(oobject.getName(), a.f.name());
                      File uFile = new File(oobject.getParentFile(), str);
                      while (uFile.exists()) {
                         uFile = new File(oobject.getParentFile(), UUID.randomUUID().toString()+"-"+str);
                      }
                      if (oobject.renameTo(uFile)) {
                         oobject = uFile;
                      }
                   }
                   j oj = new j(oobject.getAbsolutePath());
                   if (oj.j() == null) {
                      oj.g = (long)AdvEditUtil.i(oobject.getAbsolutePath());
                   }
                   if (!p0.isDisposed()) {
                      p0.onNext(oj);
                   }
                }else if(b.L(oobject)){
                   i oi = new i(oobject.getAbsolutePath());
                   if (!p0.isDisposed()) {
                      p0.onNext(oi);
                   }
                }
                i = i + 1;
             }else {
                p0.onComplete();
                break ;
             }
          }
       }
       return;
    }
}
