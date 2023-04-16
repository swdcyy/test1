package com.kwai.framework.model.feed.BaseFeed$a;
import xwd.c;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ClassLoader;
import android.os.Parcelable;
import org.parceler.b;

public class BaseFeed$a implements c	// class@0016b5
{

    public void BaseFeed$a(){
       super();
    }
    public Object a(Parcel p0){
       return this.c(p0);
    }
    public void b(Object p0,Parcel p1){
       this.d(p0, p1);
    }
    public BaseFeed c(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseFeed$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.readParcelable(BaseFeed.class.getClassLoader()));
    }
    public void d(BaseFeed p0,Parcel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseFeed$a.class, "1")) {
          return;
       }
       p1.writeParcelable(b.b(p0.getClass(), p0), 0);
       return;
    }
}
