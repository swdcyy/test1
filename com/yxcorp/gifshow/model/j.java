package com.yxcorp.gifshow.model.j;
import com.yxcorp.gifshow.publish.ShareProject;
import java.lang.String;
import o56.c;
import o56.a;
import android.app.Application;
import java.io.File;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject$b;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import s16.j;
import android.content.Context;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qkd.b;
import java.lang.Number;
import android.os.Build$VERSION;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.LinkOption;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import haa.f;
import java.lang.StringBuilder;
import java.lang.Throwable;
import q87.c;
import java.util.List;
import lnc.la;
import com.yxcorp.gifshow.publish.ShareProject$ProjectType;
import com.kuaishou.android.model.music.Music;

public class j extends ShareProject	// class@001efe
{
    public VideoContext a;
    public String b;
    public boolean c;
    public LongVideoLocalProject d;
    public String e;
    public String f;
    public long g;
    public final Context h;

    public void j(String p0){
       super();
       Application uApplication = a.a().a();
       this.h = uApplication;
       File uFile = new File(p0);
       this.f = p0;
       boolean b = (uFile.getName()).startsWith("kwai_lv_");
       this.c = b;
       if (b) {
          LongVideoLocalProject longVideoLoc = new LongVideoLocalProject(uFile.getParentFile().getAbsolutePath(), uFile.getName());
          this.d = longVideoLoc;
          LongVideoLocalProject$b uob = longVideoLoc.c();
          if (uob == null) {
             return;
          }else {
             this.b = uob.originVideoPath;
             this.e = (!TextUtils.isEmpty(uob.coverPath))? new File(this.d.h(), uob.coverPath).getAbsolutePath(): this.b;
             this.a = uob.videoContext;
          }
       }else {
          this.b = p0;
          this.e = p0;
          this.a = j.d().e(uApplication, this.b);
       }
       return;
    }
    public boolean a(){
       File uFile;
       Object obj = PatchProxy.apply(null, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.c != null && this.k() != null) {
          uFile = this.k().h();
          if (uFile != null && uFile.isDirectory()) {
             b.m(uFile);
          }
       }else {
          uFile = new File(this.b);
          j.d().g(this.h.getApplicationContext(), uFile.getAbsolutePath());
          if (!uFile.delete()) {
             b = false;
          }
       }
       return b;
    }
    public String b(){
       return this.e;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (TextUtils.isEmpty(this.b)) {
          return 0;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          try{
             LinkOption[] linkOptionAr = new LinkOption[0];
             return Files.readAttributes(new File(this.b).toPath(), BasicFileAttributes.class, linkOptionAr).creationTime().toMillis();
          }catch(java.io.IOException e0){
             f.D().z("VideoProject", "failed to get create time of the file, path="+this.b, e0);
          }
          return v1;
       }else {
          goto label_005f ;
       }
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.c != null && (this.k() != null && this.k().c() != null)) {
          return this.k().c().lastUpdateTime;
       }
       long l = (!TextUtils.isEmpty(this.b))? new File(this.b).lastModified(): 0;
       return l;
    }
    public List e(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return la.a(this.a);
    }
    public String f(){
       return this.b;
    }
    public String g(){
       return this.f;
    }
    public ShareProject$ProjectType h(){
       return ShareProject$ProjectType.MP4;
    }
    public Music i(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return la.c(this.a, true, true);
    }
    public VideoContext j(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          this.a = j.d().e(this.h, this.b);
       }
       return this.a;
    }
    public LongVideoLocalProject k(){
       return this.d;
    }
    public long l(){
       return this.g;
    }
}
