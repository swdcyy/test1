package com.yxcorp.gifshow.photo.download.task.h;
import ok.h;
import java.lang.Object;
import nxc.c;
import kxb.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Void;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;

public final class h implements h	// class@000eff
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = null;
       i3 obj1 = PatchProxy.applyOneRefs(p0, obj, e.class, "39");
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else {
          obj1 = i3.f();
          obj1.c("is_file_size_bigger_15M", Integer.valueOf(p0.d));
          obj1.c("set_download_overtime", Integer.valueOf(p0.c));
          obj1.c("is_download_overtime", Integer.valueOf(p0.e));
          if (!TextUtils.x(p0.b)) {
             obj1.d("file_size", p0.b);
          }
          e.h(p0.a, "PHOTO_DOWNLOAD_CANCEL", obj1.e(), 6);
       }
       return obj;
    }
}
