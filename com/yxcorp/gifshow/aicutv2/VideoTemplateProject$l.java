package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$l;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import h69.g;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import q87.c;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import o69.c;
import brd.t;
import com.yxcorp.gifshow.aicutv2.g;
import o69.a;
import java.io.File;
import s69.i;
import i69.a;
import o69.w0;
import com.yxcorp.gifshow.aicutv2.e;
import com.yxcorp.gifshow.aicutv2.f;

public final class VideoTemplateProject$l implements o	// class@001990
{
    public final VideoTemplateProject b;
    public final KwaiAICutStyle c;

    public void VideoTemplateProject$l(VideoTemplateProject p0,KwaiAICutStyle p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object[] objArray2;
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$l.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          int i = 0;
          Object[] objArray = new Object[i];
          g.D().w("VideoTemplateProject", "start\(\) : observableDownloadStyleMusic\(\) "+"style.id=["+this.c.getId()+']', objArray);
          p0 = g.D();
          StringBuilder str = "mPreSelectMusic=";
          AICutMusicInfo uAICutMusicI = this.b.P();
          String mId = (uAICutMusicI != null)? uAICutMusicI.getMId(): null;
          objArray = new Object[i];
          p0.w("VideoTemplateProject", str+mId, objArray);
          p0 = this.c.getId();
          mId = "-3";
          if (a.g(p0, "-1") || a.g(p0, mId)) {
             Object[] objArray1 = new Object[i];
             g.D().w("VideoTemplateProject", "empty style mock style download task ", objArray1);
             a uoa = new a();
             if (a.g(p0, mId)) {
                File uFile = new File(i.a.c());
                if (uFile.exists()) {
                   File[] uFileArray = uFile.listFiles();
                   if (uFileArray != null) {
                      int i1 = 1;
                      int i2 = (!uFileArray.length)? 1: 0;
                      if ((i2 ^ i1) == i1) {
                         uoa.f().e(uFile);
                      }
                   }
                }
             }
             uoa.m(p0);
             int i3 = 100;
             uoa.f().d(i3);
             uoa.f().e(new File(""));
             uoa.d().d(i3);
             if (this.b.P() != null) {
                p0 = this.b.P();
                a.m(p0);
                objArray2 = new Object[i];
                g.D().w("VideoTemplateProject", "empty style download music="+p0.getMId(), objArray2);
                ot = w0.b(p0).onErrorReturn(new e(p0)).map(new f(uoa));
             }else {
                ot = t.just(uoa);
             }
          }else {
             p0 = this.b.P();
             if (p0 == null) {
                p0 = this.b.H(this.c);
             }
             objArray2 = new Object[i];
             g.D().w("VideoTemplateProject", "use music id="+p0.getMId()+", name="+p0.getMName(), objArray2);
             a.o(p0, "music");
             ot = this.b.F(p0, this.c).flatMap(new g(this, p0));
          }
       }
       return ot;
    }
}
