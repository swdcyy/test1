package com.yxcorp.gifshow.record.album.model.c;
import m8c.e;
import com.yxcorp.gifshow.publish.ShareProject;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m8c.d;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.model.j;
import java.io.File;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.model.i;
import java.lang.CharSequence;
import android.text.TextUtils;

public class c implements e	// class@00173e
{
    public final ShareProject a;
    public double b;

    public void c(ShareProject p0){
       super();
       this.a = p0;
    }
    public t a(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new d(this));
    }
    public boolean b(){
       return this.a instanceof j;
    }
    public File c(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.f());
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.c();
    }
    public long e(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return new File(this.a.g()).lastModified();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof c && this.a.equals(p0.a))? true: false;
       return b;
    }
    public boolean f(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = true;
       if (!obj instanceof j || obj.l() - LongVideoLocalProject.e(b) <= 0) {
          b = false;
       }
       return b;
    }
    public void g(double p0){
       this.b = p0;
    }
    public File getCoverFile(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c();
    }
    public File getDirectory(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.g());
    }
    public String getIdentifier(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c().getAbsolutePath();
    }
    public Workspace$Source getSource(){
       return Workspace$Source.UNRECOGNIZED;
    }
    public Workspace$Type getType(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj instanceof j) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, j.class, "7");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(LongVideoLocalProject.a() && (obj.j() != null || (obj.g - LongVideoLocalProject.g(true) <= 0 && (obj.c != null || (obj.j() != null && obj.j().j0()))))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             return Workspace$Type.LONG_VIDEO;
          }else {
             return Workspace$Type.VIDEO;
          }
       }else if(obj instanceof i){
          return Workspace$Type.SINGLE_PICTURE;
       }else {
          return Workspace$Type.UNKNOWN;
       }
    }
    public double getVideoDuration(){
       c obj = PatchProxy.apply(null, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.a;
       if (obj instanceof j) {
          return (double)((float)obj.l() / 1000.00f);
       }
       return this.b;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.a.g()) && new File(this.a.g()).exists())? true: false;
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.hashCode();
    }
    public long i(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.d();
    }
    public File j(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c();
    }
    public ShareProject k(){
       return this.a;
    }
}
