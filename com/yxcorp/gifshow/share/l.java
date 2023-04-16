package com.yxcorp.gifshow.share.l;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lic.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lic.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.OperationModel;
import uo7.k;
import com.yxcorp.gifshow.share.l$a;
import java.lang.Runnable;
import ekd.k1;

public class l	// class@001bc8
{

    public void l(){
       super();
    }
    public static void a(User[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, l.class, "3")) {
          return;
       }
       new a(a.a().a()).b(p0);
       return;
    }
    public static void b(GifshowActivity p0,OperationModel p1,k p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, null, l.class, "5")) {
          return;
       }
       k1.o(new l$a(p0, p0, p1, p2));
       PatchProxy.onMethodExit(l.class, "5");
       return;
    }
}
