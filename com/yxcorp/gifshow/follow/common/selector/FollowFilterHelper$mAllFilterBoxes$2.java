package com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper$mAllFilterBoxes$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.data.d;
import java.lang.reflect.Type;
import kha.a;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;

public final class FollowFilterHelper$mAllFilterBoxes$2 extends Lambda implements a	// class@001085
{
    public static final FollowFilterHelper$mAllFilterBoxes$2 INSTANCE;

    static {
       FollowFilterHelper$mAllFilterBoxes$2.INSTANCE = new FollowFilterHelper$mAllFilterBoxes$2();
    }
    public void FollowFilterHelper$mAllFilterBoxes$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, this, FollowFilterHelper$mAllFilterBoxes$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b(d.e);
       List list = KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowSelectorHelper");
       if (obj != null) {
          objArray = obj.toString();
       }
       c.j(list, "load all filter configs", "filters", objArray);
       return obj;
    }
}
