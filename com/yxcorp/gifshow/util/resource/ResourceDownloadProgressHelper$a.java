package com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$a;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper;
import java.lang.Object;
import boc.b;
import java.lang.Float;
import java.util.Map;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Set;
import java.util.Iterator;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;
import java.lang.Throwable;
import java.util.List;

public class ResourceDownloadProgressHelper$a implements n$c	// class@000cd8
{
    public final ResourceDownloadProgressHelper a;

    public void ResourceDownloadProgressHelper$a(ResourceDownloadProgressHelper p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       this.a.c.put(p0, Float.valueOf(0x3f800000));
       Object[] objArray = new Object[0];
       a.C().D("ResourceDownloadProgressHelper", "[yModel][keypath][download] ", p0.getResourceName()+" completed", objArray);
       Iterator iterator = this.a.e.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ResourceDownloadProgressHelper$b uob = this.a.e.get(str);
          if (uob != null && this.e(str, p0)) {
             uob.h(p0);
             if (!this.a.c(str) - 0x3f800000) {
                uob.onCompleted(str);
                this.a.e(str);
             }else {
                uob.h(p0);
             }
          }
       }
       return;
    }
    public void b(b p0,float p1){
       this.a.c.put(p0, Float.valueOf(p1));
       Iterator iterator = this.a.e.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ResourceDownloadProgressHelper$b uob = this.a.e.get(str);
          if (uob != null && this.e(str, p0)) {
             uob.onProgress(str, this.a.c(str));
          }
       }
       return;
    }
    public void c(b p0){
       Iterator iterator = this.a.e.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ResourceDownloadProgressHelper$b uob = this.a.e.get(str);
          if (uob != null && this.e(str, p0)) {
             uob.a(str, ResourceDownloadProgressHelper.f);
             this.a.e(str);
          }
       }
       return;
    }
    public void d(b p0,Throwable p1){
       Iterator iterator = this.a.e.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ResourceDownloadProgressHelper$b uob = this.a.e.get(str);
          if (uob != null && this.e(str, p0)) {
             uob.a(str, p1);
             this.a.e(str);
          }
       }
       return;
    }
    public final boolean e(String p0,b p1){
       List list = this.a.d.get(p0);
       boolean b = (list != null && list.contains(p1))? true: false;
       return b;
    }
}
