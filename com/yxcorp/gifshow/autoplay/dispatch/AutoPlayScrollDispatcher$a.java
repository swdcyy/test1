package com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher$a;
import java.lang.Object;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView;
import r99.i;
import com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class AutoPlayScrollDispatcher$a	// class@001be1
{

    public void AutoPlayScrollDispatcher$a(){
       super();
    }
    public void AutoPlayScrollDispatcher$a(u p0){
       super();
    }
    public final AutoPlayScrollDispatcher a(RecyclerView p0,i p1,int p2,int p3,int p4){
       Object obj;
       AutoPlayScrollDispatcher$a uoa = AutoPlayScrollDispatcher$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "recyclerView");
       AutoPlayScrollDispatcher uAutoPlayScr = new AutoPlayScrollDispatcher(p0, p1, p2, p3, p4);
       return obj;
    }
}
