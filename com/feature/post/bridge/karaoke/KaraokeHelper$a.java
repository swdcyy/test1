package com.feature.post.bridge.karaoke.KaraokeHelper$a;
import n3d.a;
import og.k;
import r16.f;
import w26.c;
import java.lang.Object;
import android.content.Intent;
import og.l;
import nsd.r0;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Arrays;
import java.lang.String;
import kotlin.jvm.internal.a;
import q87.c;
import java.util.HashMap;
import java.util.Map;
import com.feature.post.bridge.YodaUploadVideoResult;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import r26.a;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.feature.post.bridge.karaoke.KaraokeHelper;
import java.util.Objects;
import ng.a;
import r26.e;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;

public final class KaraokeHelper$a implements a	// class@00149e
{
    public final int b;
    public final k c;
    public final f d;
    public final c e;

    public void KaraokeHelper$a(int p0,k p1,f p2,c p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       String str4;
       KaraokeHelper$a tc;
       l ol = l.D();
       int i = 3;
       Object[] objArray = new Object[i];
       int i1 = 0;
       objArray[i1] = Integer.valueOf(p0);
       objArray[1] = Integer.valueOf(p1);
       boolean b = (p2 == null)? true: false;
       objArray[2] = Boolean.valueOf(b);
       String str = String.format("onActivityResult request=%d, result=%d, data=%b", Arrays.copyOf(objArray, i));
       a.o(str, "java.lang.String.format\(format, *args\)");
       objArray = new Object[i1];
       String str1 = "KaraokeHelper";
       ol.w(str1, str, objArray);
       if (p0 != 19 && p0 != 291) {
          KaraokeHelper$a tb = this.b;
          if (tb == null || p0 != tb) {
             return;
          }
       }
       String str2 = "0";
       String str3 = "progress";
       if (!p1) {
          HashMap hashMap = new HashMap();
          hashMap.put(str3, str2);
          this.c.d(new YodaUploadVideoResult(hashMap, i1));
          return;
       }else if(p1 != -1 || p2 == null){
          str4 = "onActivityResult not ok or null data, result="+p1;
          tc = this.c;
          Objects.requireNonNull(KaraokeHelper.a);
          if (tc != null) {
             tc.f(str4);
          }
          i1.c(new Throwable(str1+str4));
          return;
       }else {
          int i2 = j0.b(p2, "video_file_upload_id", -1);
          HashMap hashMap1 = new HashMap();
          hashMap1.put("filePath", j0.f(p2, "video_file_path"));
          hashMap1.put(str3, str2);
          if (i2 != -1) {
             hashMap1.put("uploadId", String.valueOf(i2));
          }
          str2 = "conversionTaskList";
          str4 = j0.f(p2, str2);
          if (!TextUtils.x(str4)) {
             hashMap1.put(str2, str4);
          }
          this.c.d(new YodaUploadVideoResult(hashMap1, 1));
          a uoa = this.d.L0(i2);
          if (uoa == null || uoa.getStatus() == PostStatus.UPLOAD_COMPLETE) {
             KaraokeHelper.a.b(uoa, this.c);
             return;
          }else {
             KaraokeHelper$a tc1 = this.c;
             tc = this.e;
             Objects.requireNonNull(KaraokeHelper.a);
             tc1.b(new a(i2, tc1, tc), tc);
             return;
          }
       }
    }
}
