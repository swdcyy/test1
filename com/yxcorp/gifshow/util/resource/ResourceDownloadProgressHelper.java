package com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$a;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$c;
import t16.a;
import java.util.List;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import boc.b;
import java.util.Map;
import java.lang.Float;
import com.yxcorp.gifshow.util.resource.p;
import boc.n;
import java.lang.Runnable;
import t45.c;
import qfc.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class ResourceDownloadProgressHelper	// class@000cdb
{
    public final float a;
    public final float b;
    public Map c;
    public Map d;
    public Map e;
    public static final Throwable f;

    static {
       ResourceDownloadProgressHelper.f = new Throwable("download canceled");
    }
    public void ResourceDownloadProgressHelper(){
       super();
       this.a = 0;
       this.b = 0x3f800000;
       this.c = new ConcurrentHashMap();
       this.d = new ConcurrentHashMap();
       this.e = new ConcurrentHashMap();
       n.a(new ResourceDownloadProgressHelper$a(this));
    }
    public static ResourceDownloadProgressHelper d(){
       return ResourceDownloadProgressHelper$c.a;
    }
    public boolean a(a p0,String p1,List p2,ResourceDownloadProgressHelper$b p3){
       return this.b(p0, p1, p2, false, p3);
    }
    public boolean b(a p0,String p1,List p2,boolean p3,ResourceDownloadProgressHelper$b p4){
       if (q.f(p2) || p4 == null) {
          return false;
       }
       try{
          Iterator iterator = p2.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (this.c.containsKey(uob) && !this.c.get(uob).floatValue() - 0x3f800000) {
                if (p.h(uob)) {
                   p2.remove(uob);
                }else {
                   this.c.put(uob, Float.valueOf(0));
                }
             }
          }
       }catch(java.lang.Exception e0){
       }
       if (q.f(p2)) {
          p4.onCompleted(p1);
       }else if(q.f(p2)){
          c.a(new n(p2, p3, p0));
       }
       this.d.put(p1, p2);
       this.e.put(p1, p4);
       return true;
    }
    public float c(String p0){
       List list = this.d.get(p0);
       float f = 0;
       if (q.f(list)) {
          Object[] objArray = new Object[0];
          a.C().t("ResourceDownloadProgressHelper", p0+"getDownloadTaskProgress Error ", objArray);
          return f;
       }else {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (this.c.containsKey(uob)) {
                f = f + this.c.get(uob).floatValue();
             }
          }
          return (f / (float)list.size());
       }
    }
    public void e(String p0){
       if (TextUtils.x(p0)) {
          return;
       }
       this.d.remove(p0);
       this.e.remove(p0);
       Object[] objArray = new Object[0];
       a.C().D("ResourceDownloadProgressHelper", "[yModel][keypath][download] ", p0+" download finish, taskSize:"+this.e.size(), objArray);
       return;
    }
}
