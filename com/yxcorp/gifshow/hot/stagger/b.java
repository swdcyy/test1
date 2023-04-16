package com.yxcorp.gifshow.hot.stagger.b;
import on5.m$a;
import java.lang.String;
import java.lang.Object;
import zr6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.hot.stagger.b$a;
import zr6.g;
import com.kwai.framework.model.channel.HotChannel;
import lnc.g0;
import wn5.b;
import wq6.e;
import android.content.Intent;
import java.lang.Boolean;
import android.net.Uri;
import on5.n;
import on5.o;

public class b extends m$a	// class@00189f
{

    public void b(){
       super("ato_hot");
    }
    public b d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b$a(p0);
    }
    public void e(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       Object obj = p0.f();
       if (obj instanceof HotChannel) {
          p0.a("KEY_TAB_NAME_DEST", new b(g0.a(obj))).a("KEY_TAB_HOT_CHANNEL", obj);
       }else {
          p0.a("KEY_TAB_NAME_DEST", new b(obj, R.string.arg_RES_7f10155f));
       }
       return;
    }
    public boolean f(e p0,Intent p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (super.f(p0, p1)) {
          return true;
       }
       b = n.d(p1.getData(), "kwai", "home", "hot");
       if (b) {
          o.a("hot", false);
       }
       return b;
    }
}
