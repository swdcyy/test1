package com.yxcorp.gifshow.model.i;
import com.yxcorp.gifshow.publish.ShareProject;
import java.lang.String;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import s16.j;
import android.content.Context;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
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
import com.yxcorp.gifshow.publish.ShareProject$ProjectType;
import com.kuaishou.android.model.music.Music;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;

public class i extends ShareProject	// class@001efb
{
    public String a;
    public VideoContext b;
    public Context c;

    public void i(String p0){
       super();
       this.c = a.a().a();
       this.a = p0;
    }
    public boolean a(){
       File obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new File(this.g());
       j.d().g(this.c.getApplicationContext(), obj.getAbsolutePath());
       return obj.delete();
    }
    public String b(){
       return this.a;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (TextUtils.isEmpty(this.a)) {
          return 0;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          try{
             LinkOption[] linkOptionAr = new LinkOption[0];
             return Files.readAttributes(new File(this.a).toPath(), BasicFileAttributes.class, linkOptionAr).creationTime().toMillis();
          }catch(java.io.IOException e0){
             f.D().z("SharePictureProject", "failed to get create time of the file, path="+this.a, e0);
          }
          return v1;
       }else {
          goto label_005f ;
       }
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (TextUtils.isEmpty(this.a))? 0: new File(this.a).lastModified();
       return l;
    }
    public List e(){
       return null;
    }
    public String f(){
       return this.a;
    }
    public String g(){
       return this.a;
    }
    public ShareProject$ProjectType h(){
       return ShareProject$ProjectType.PICTURE;
    }
    public Music i(){
       return null;
    }
    public VideoContext j(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = j.d().e(this.c, this.a);
       }
       return this.b;
    }
}
