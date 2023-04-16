package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$i;
import erd.o;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import ssb.e;
import ssb.f;
import fg6.a;
import com.google.gson.Gson;
import w3b.l;
import w3b.q;
import brd.t;
import cjd.e;
import com.yxcorp.gifshow.camera.record.assistant.model.a;
import erd.g;

public final class AssistantDataHelper$i implements o	// class@001d00
{
    public final AssistantDataHelper b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;

    public void AssistantDataHelper$i(AssistantDataHelper p0,String p1,String p2,List p3,boolean p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public Object apply(Object p0){
       Object obj = p0;
       p0 = PatchProxy.applyOneRefs(obj, this, AssistantDataHelper$i.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          a.p(obj, "cpu");
          e uoe = f.a();
          AssistantDataHelper$i tc = this.c;
          AssistantDataHelper$i td = this.d;
          p0 = this.e;
          p0 = (p0 != null)? a.a.q(p0): null;
          p0 = uoe.a(tc, td, p0, this.f, l.e(), q.d, obj).map(new e()).doOnNext(new a(this));
       }
       return p0;
    }
}
