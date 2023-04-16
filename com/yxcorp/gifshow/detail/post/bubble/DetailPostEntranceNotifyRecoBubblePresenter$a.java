package com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import v4a.a;
import java.lang.reflect.Type;
import uw9.c;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.List;
import e0a.j;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class DetailPostEntranceNotifyRecoBubblePresenter$a	// class@0016a5
{

    public void DetailPostEntranceNotifyRecoBubblePresenter$a(){
       super();
    }
    public void DetailPostEntranceNotifyRecoBubblePresenter$a(u p0){
       super();
    }
    public final boolean a(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, DetailPostEntranceNotifyRecoBubblePresenter$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c.e(a.class);
       boolean b = true;
       if (obj == null || (DateUtils.I(obj.a(), System.currentTimeMillis()) && (obj.b().size() >= j.m() || CollectionsKt___CollectionsKt.H1(obj.b(), p0)))) {
          b = false;
       }
    label_0045 :
       return b;
    }
}
