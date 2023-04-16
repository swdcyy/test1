package com.yxcorp.gifshow.activity.share.presenter.w2$j;
import im8.f;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class w2$j implements f	// class@00144b
{
    public final w2 b;

    public void w2$j(w2 p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Integer integer = PatchProxy.apply(null, this, w2$j.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          integer = Integer.valueOf(this.b.R);
       }
       return integer;
    }
    public void set(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$j.class, "2")) {
       }else {
          this.b.R = p0.intValue();
       }
       return;
    }
}
