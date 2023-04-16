package com.yxcorp.gifshow.relation.util.f;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Runnable;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import rfc.a;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import cjd.e;
import erd.o;
import hcc.v;
import com.yxcorp.gifshow.relation.util.f$a;
import android.content.Context;
import erd.g;
import crd.b;
import y8c.g;
import hcc.x;
import com.yxcorp.gifshow.relation.util.e;
import com.yxcorp.gifshow.relation.util.f$b;
import com.yxcorp.gifshow.retrofit.tools.NonNullValueMap;
import jga.c;
import wca.b;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import jga.a;
import java.util.Map;
import hcc.u;
import hcc.w;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.explore.fragment.SimpleUserListFragment;

public final class f	// class@001a59
{

    public void f(){
       super();
    }
    public static void a(GifshowActivity p0,Runnable p1,User p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "2")) {
          return;
       }
       b.a(0x4a533fa).a(QCurrentUser.me().getId(), p2.getId(), p0.getUrl(), null).map(new e()).subscribe(new v(p2, p0, p1), new f$a(p0, p2));
       return;
    }
    public static void b(GifshowActivity p0,g p1,User p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "1")) {
          return;
       }
       f.a(p0, new x(p2, p1), p2);
       return;
    }
    public static void c(GifshowActivity p0,g p1,User p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "4")) {
          return;
       }
       f.d(p0, p1, p2, e.a);
       return;
    }
    public static void d(GifshowActivity p0,g p1,User p2,f$b p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, null, f.class, "5")) {
          return;
       }
       NonNullValueMap nonNullValue = new NonNullValueMap();
       String str = FollowHelper.g(p2.getId());
       nonNullValue.put("touid", p2.getId());
       nonNullValue.put("ftype", String.valueOf(3));
       nonNullValue.put("followContent", FollowHelper.a(b.g(p2.getId()), str, ""));
       u ou = new u(p2, p0, p1, p3, nonNullValue, str);
       b.a(0x1d5ac2c4).a(nonNullValue).map(new e()).subscribe(v10, new w(p3, p2, nonNullValue, str));
       PatchProxy.onMethodExit(f.class, "5");
       return;
    }
    public static String e(Fragment p0,User p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof SimpleUserListFragment) {
          return p0.Hh(p1);
       }
       return "";
    }
}
