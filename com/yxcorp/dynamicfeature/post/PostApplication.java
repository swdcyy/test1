package com.yxcorp.dynamicfeature.post.PostApplication;
import android.app.Application;
import java.lang.Boolean;
import lnc.p3;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import q87.c;
import java.lang.Throwable;
import w46.b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import tkd.b;
import tkd.d;
import t26.a;
import com.kwai.framework.init.a;
import t26.b;
import om6.r;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import z26.a;
import z26.c;
import a46.c;
import a46.d;
import l26.e;
import l26.f;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import vi7.a;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.utility.Log;
import rg.c;
import com.yxcorp.dynamicfeature.post.PostApplication$a;
import rg.c$c;
import wkd.b;
import a76.d;
import bl0.c;
import r16.e;
import brd.t;
import r16.f;
import com.yxcorp.dynamicfeature.post.a;
import com.yxcorp.dynamicfeature.post.b;
import erd.g;
import crd.b;

public class PostApplication extends Application	// class@0011ca
{
    public static final String TAG = "PostApplication";

    public void PostApplication(){
       super();
    }
    public static void doRegister(){
    }
    public static void doRegisterOnlyInMainProcess(){
    }
    public static void lambda$onCreate$0(Boolean p0){
       Object[] objArray = new Object[0];
       p3.D().w("PostApplication", "preLoadPostWork result: "+p0, objArray);
    }
    public static void lambda$onCreate$1(Throwable p0){
       Object[] objArray = new Object[0];
       p3.D().t("PostApplication", "preLoadPostWork error: "+p0, objArray);
    }
    public final List initModules(boolean p0){
       ArrayList obj;
       if (PatchProxy.isSupport(PostApplication.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PostApplication.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(d.a(-1701890506).oZ());
       obj.add(d.a(-831446984).Md());
       if (p0) {
          obj.add(d.a(-1701890506).Xc());
          obj.add(d.a(-1858110324).j8());
          obj.add(d.a(-93013550).E6());
          obj.add(d.a(-1077260241).KZ());
       }
       return obj;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, PostApplication.class, "1")) {
          return;
       }
       super.onCreate();
       boolean b = SystemUtil.L(a.B);
       Object[] objArray = new Object[0];
       p3.D().w("PostApplication", "onCreate, isInMainProcess: "+b, objArray);
       Collection uCollection = a.a.a("post");
       StringBuilder str = "";
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          str = str+","+iterator.next();
       }
       Log.g("PostPlugin", "feature so list="+str);
       c.a().b(new PostApplication$a(this, uCollection));
       if (b) {
          PostApplication.doRegisterOnlyInMainProcess();
       }
       PostApplication.doRegister();
       Iterator iterator1 = this.initModules(b).iterator();
       while (iterator1.hasNext()) {
          a uoa = iterator1.next();
          if (uoa != null) {
             Object[] objArray1 = new Object[0];
             p3.D().w("PostPlugin", "execute initModule: "+uoa.getClass().getSimpleName(), objArray1);
             b.a(-2118755940).m(uoa);
          }
       }
       if (b) {
          d.a(0x6758ee6d).a2().subscribe(a.b, b.b);
       }
       return;
    }
}
