package com.kwai.component.newuseraction.NewUserActionInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import wkd.b;
import l66.a;
import zc5.b;
import dda.g;
import uh5.e;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import kp.r1;

public class NewUserActionInitModule extends a	// class@0009e6
{

    public void NewUserActionInitModule(){
       super();
    }
    public int f0(){
       return 14;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, NewUserActionInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, NewUserActionInitModule.class, "1")) {
          return;
       }
       b.a(0x6d2a4fdd).a(this);
       b.a(-869999145).init();
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewUserActionInitModule.class, "3")) {
          return;
       }
       String str = p0.b();
       if (!(String.valueOf(8)).equals(str) && ((String.valueOf(90)).equals(str) || (e.f() && (String.valueOf(82)).equals(str)))) {
          PhotoMeta photoMeta = r1.u1(p0.a);
          if (photoMeta != null) {
             if (photoMeta.isLiked()) {
                b.a(-869999145).e(r1.t1(p0.a));
             }else {
                b.a(-869999145).i(r1.t1(p0.a));
             }
          }
       }
       return;
    }
}
