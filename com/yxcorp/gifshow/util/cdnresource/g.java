package com.yxcorp.gifshow.util.cdnresource.g;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.util.cdnresource.j;
import com.yxcorp.gifshow.loading.PullDownActivityResourceConfig;
import java.lang.reflect.Type;
import m0b.a;
import pnc.n;
import brd.g;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;

public final class g implements g	// class@001f6f
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void subscribe(v p0){
       String str;
       PullDownActivityResourceConfig pullDownActi = a.b(PullDownActivityResourceConfig.class);
       if (pullDownActi != null && n.a(pullDownActi.mStartTimestamp, pullDownActi.mEndTimestamp)) {
          p0.onNext(pullDownActi);
       }else if(pullDownActi == null){
          str = "未下发CDN资源";
       }else {
          str = "CDN资源不在当前时间段使用 config = "+pullDownActi.toString();
       }
       p0.onError(new FileNotFoundException(str));
       return;
    }
}
