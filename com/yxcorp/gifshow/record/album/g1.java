package com.yxcorp.gifshow.record.album.g1;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.io.File;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.String;
import k8c.c2;
import java.io.FileFilter;
import com.yxcorp.gifshow.record.album.r1;
import java.util.Comparator;
import java.util.Arrays;
import com.yxcorp.gifshow.model.j;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject$b;
import brd.g;

public final class g1 implements g	// class@001723
{
    public final long b;

    public void g1(long p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       File[] uFileArray = new File(LocalAlbumUtils.l(), ".long_video").listFiles(new c2(this.b));
       if (p0.isDisposed()) {
       }else if(uFileArray == null || !uFileArray.length){
          p0.onComplete();
       }else {
          Arrays.sort(uFileArray, r1.b);
          int len = uFileArray.length;
          int i = 0;
          while (true) {
             if (i < len) {
                j oj = new j(uFileArray[i].getAbsolutePath());
                if (oj.k() == null || (oj.k().c() != null && new File(oj.k().c().originVideoPath).exists())) {
                   if (!p0.isDisposed()) {
                      p0.onNext(oj);
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
