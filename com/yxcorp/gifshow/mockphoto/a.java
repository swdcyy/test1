package com.yxcorp.gifshow.mockphoto.a;
import java.lang.Object;
import um6.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.music.utils.o;
import java.lang.Integer;
import kqb.y;
import kqb.h0;
import java.lang.Boolean;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.Lyrics$Line;
import ekd.p;
import wkd.b;
import j80.c;
import java.lang.System;

public class a	// class@001ddf
{

    public void a(){
       super();
    }
    public static String a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getOutputAudioPath() == null || !new File(p0.getOutputAudioPath()).exists()) {
          return null;
       }
       File uFile = a.c("mp3");
       PostUtils.c(new File(p0.getOutputAudioPath()), uFile);
       return uFile.getAbsolutePath();
    }
    public static String b(a p0){
       Lyrics lyrics;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Writer writer = null;
       File obj = PatchProxy.applyOneRefs(p0, writer, a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0.getClipLyric() == null) {
          return "";
       }
       obj = a.c("lrc");
       Lyrics clipLyric = p0.getClipLyric();
       int realBegin = p0.getRealBegin();
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          lyrics = PatchProxy.applyTwoRefs(clipLyric, Integer.valueOf(realBegin), writer, oo, "8");
          if (lyrics != patchProxyRe) {
          label_003f :
             lyrics.mDuration = p0.getRealDuration();
             String str = "]";
             FileWriter obj1 = PatchProxy.applyTwoRefs(lyrics, obj, writer, h0.class, "1");
             if (obj1 != patchProxyRe) {
                obj1.booleanValue();
             }else if(obj == null){
                if (obj.exists()) {
                   obj.delete();
                }
                if (!obj.getParentFile().exists()) {
                   obj.getParentFile().mkdirs();
                }
                obj.createNewFile();
                obj1 = new FileWriter(obj, true);
                BufferedWriter uBufferedWri = new BufferedWriter(obj1);
                uBufferedWri.write("[by:kwai]");
                uBufferedWri.newLine();
                uBufferedWri.write("[offset:"+lyrics.mOffset+str);
                uBufferedWri.newLine();
                uBufferedWri.write("[total:"+lyrics.mDuration+str);
                uBufferedWri.newLine();
                Lyrics mLines = lyrics.mLines;
                if (mLines != null) {
                   Iterator iterator = mLines.iterator();
                   while (iterator.hasNext()) {
                      h0.a(iterator.next(), uBufferedWri);
                   }
                }
                uBufferedWri.flush();
                p.f(uBufferedWri);
             }
          }
       }
       lyrics = y.a(clipLyric, realBegin);
       goto label_003f ;
    }
    public static File c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(b.a(-1504323719).o(), System.nanoTime()+"."+p0);
    }
}
