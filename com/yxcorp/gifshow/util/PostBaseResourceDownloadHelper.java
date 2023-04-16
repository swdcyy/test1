package com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper;
import java.lang.Object;
import java.util.HashMap;
import eb7.a;
import android.app.Application;
import o56.a;
import wkd.b;
import c0d.a;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import java.lang.String;
import java.util.Map;
import java.util.List;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public abstract class PostBaseResourceDownloadHelper	// class@001f16
{
    public final Map a;
    public final Map b;
    public final a c;

    public void PostBaseResourceDownloadHelper(){
       super();
       this.b = new HashMap();
       this.c = new a(a.b(), b.a(0x1a7467ca));
       this.a = new ConcurrentHashMap();
    }
    public void a(PostBaseResourceDownloadHelper$InfoWithResource p0){
       this.b.remove(p0.getId());
       this.a.remove(p0.getId());
    }
    public abstract void b(String p0,String p1,PostBaseResourceDownloadHelper$InfoWithResource p2);
    public abstract void c(List p0,PostBaseResourceDownloadHelper$a p1,PostBaseResourceDownloadHelper$InfoWithResource p2,boolean p3);
    public abstract String d();
    public abstract PostBaseResourceDownloadHelper$c e(PostBaseResourceDownloadHelper$InfoWithResource p0);
    public boolean f(PostBaseResourceDownloadHelper$InfoWithResource p0){
       return (TextUtils.x(this.b.get(p0.getId())) ^ 0x01);
    }
}
