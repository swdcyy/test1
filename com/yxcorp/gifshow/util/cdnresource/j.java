package com.yxcorp.gifshow.util.cdnresource.j;
import java.lang.Object;
import com.yxcorp.gifshow.util.cdnresource.k;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import java.lang.String;
import com.yxcorp.gifshow.util.cdnresource.CdnResource;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.io.File;
import com.yxcorp.utility.Log;
import e17.i;
import pnc.d;
import io.reactivex.g;
import brd.t;
import com.yxcorp.gifshow.util.cdnresource.i;
import erd.o;
import t45.d;
import brd.z;
import pnc.h;
import pnc.g;
import erd.g;
import crd.b;

public final class j	// class@001f72
{
    public CdnResource a;
    public k b;
    public static j c;

    static {
       j.c = new j();
    }
    public void j(){
       super();
       this.b = new k();
    }
    public static j b(){
       return j.c;
    }
    public String a(CdnResource$ResourceKey p0){
       this.b.e();
       String str = null;
       if (p0 != null) {
          j ta = this.a;
          if (ta != null) {
             String str1 = ta.a.get(p0);
             if (!TextUtils.x(str1)) {
                str = ta.b.getAbsolutePath()+File.separator+str1;
             }
          }
       }
       return str;
    }
    public final void c(CdnResource p0){
       this.a = p0;
       this.b.d(false);
       Log.d("LoadingResourceManager", "CDN资源已加载");
    }
    public void d(String p0){
       if (TextUtils.x(p0)) {
          return;
       }
       if (this.b.b()) {
          return;
       }
       this.b.d(true);
       i.d(R.style.arg_RES_7f11066a, "开始下载刷新资源");
       t.create(new d(p0)).flatMap(new i(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new h(this), new g(this));
       return;
    }
}
