package com.yxcorp.gifshow.share.service.VideoShareObserver;
import android.os.FileObserver;
import java.io.File;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.share.service.VideoShareObserver$VideoObserverListener;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import java.lang.Integer;
import n80.b;
import q87.c;
import java.lang.Long;
import lnc.i3;
import java.lang.Number;
import k2b.u1;

public class VideoShareObserver extends FileObserver	// class@001c70
{
    public final long a;
    public long b;
    public long c;
    public final StringBuilder d;
    public final StringBuilder e;
    public boolean f;
    public VideoShareObserver$VideoObserverListener g;
    public final File h;

    public void VideoShareObserver(File p0){
       super(p0);
       this.b = 0;
       this.c = 0;
       this.d = "";
       this.e = "";
       this.f = false;
       this.h = p0;
       this.a = p0.length();
    }
    public void VideoShareObserver(File p0,VideoShareObserver$VideoObserverListener p1){
       super(p0);
       this.g = p1;
    }
    public void VideoShareObserver(String p0){
       super(p0);
       this.b = 0;
       this.c = 0;
       this.d = "";
       this.e = "";
       this.f = false;
       File uFile = new File(p0);
       this.h = uFile;
       this.a = uFile.length();
    }
    public void VideoShareObserver(String p0,VideoShareObserver$VideoObserverListener p1){
       super(p0);
       this.g = p1;
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VideoShareObserver.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("")) {
          p0 = "0";
       }
       return p0;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, VideoShareObserver.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((System.currentTimeMillis() - this.c) - 200 <= 0)? true: false;
       return b;
    }
    public void onEvent(int p0,String p1){
       long l;
       if (PatchProxy.isSupport(VideoShareObserver.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VideoShareObserver.class, "1")) {
          return;
       }
       if (!this.b - null) {
          l = System.currentTimeMillis();
          this.b = l;
          this.c = l;
          this.d+p0+":"+this.b+",";
       }else {
          l = System.currentTimeMillis();
          Object[] objArray = new Object[0];
          b.C().s("VideoShareObserver", "event "+p0+" "+(l - this.c), objArray);
          this.d+p0+":"+(l - this.c)+",";
          this.c = l;
       }
       return;
    }
    public void startWatching(){
       if (PatchProxy.applyVoid(null, this, VideoShareObserver.class, "4")) {
          return;
       }
       this.g.onStart();
       super.startWatching();
       return;
    }
    public void stopWatching(){
       StringBuilder str1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoShareObserver.class, "3")) {
          return;
       }
       super.stopWatching();
       if (this.f == null) {
          if (!PatchProxy.applyVoid(objArray, this, VideoShareObserver.class, "5")) {
             StringBuilder str = this.d;
             boolean b = this.a();
             if (!b) {
                String[] obj = PatchProxy.applyOneRefs(str, this, VideoShareObserver.class, "7");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   obj = str.split(",");
                   try{
                      if (obj.length > 1) {
                         int i = 1;
                         int i1 = 0;
                         int i2 = 0;
                         while (true) {
                            if (i < obj.length) {
                               String[] stringArray = (obj[i]).split(":");
                               if (stringArray.length >= 2) {
                                  long l = Long.parseLong(VideoShareObserver.b((stringArray[0]).trim()));
                                  if (Long.parseLong(VideoShareObserver.b((stringArray[1]).trim())) - 1000 >= 0) {
                                     i1 = i1 + 1;
                                  }
                                  i2 = (!l - 1)? i2 + 1: 0;
                                  if (i1 >= 3 && (long)i2 - 150 >= 0) {
                                     b = true;
                                     break ;
                                  }
                               }
                            label_0098 :
                               i = i + 1;
                            }
                         }
                      }
                   }catch(java.lang.Exception e0){
                      Object[] objArray1 = new Object[0];
                      b.C().t("VideoShareObserver", "eventSequence => "+e0, objArray1);
                   }
                   b = false;
                }
             }
             this.g.onStop(b);
             this.g = objArray;
             str = this.e+(System.currentTimeMillis() - this.b);
             i3 oi3 = i3.f();
             if ((this.d).length() > 0) {
                VideoShareObserver td = this.d;
                str1 = td.deleteCharAt((td.length() - true));
             }else {
                str1 = this.d;
             }
             oi3.d("event", str1);
             oi3.a("isActive", Boolean.valueOf(this.a()));
             oi3.d("time_frame", this.e);
             oi3.c("video_size", Long.valueOf(this.a));
             oi3.a("improvement", Boolean.FALSE);
             u1.R("video_share_recode", oi3.e(), 13);
          }
          this.f = true;
       }
       return;
    }
}
