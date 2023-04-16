package cya.d;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import android.content.Context;
import lnc.n3;
import java.lang.Exception;
import q87.c;
import com.kwai.plugin.dva.install.b;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import android.content.ContextWrapper;
import android.app.Activity;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler;
import cya.d$a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import ae6.h;
import com.kwai.plugin.dva.work.c;
import cya.e;
import com.kwai.plugin.dva.work.c$c;
import e3a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.activitycontext.ActivityContext;
import android.view.Window;
import kya.b;
import java.util.Iterator;
import java.util.List;
import kya.b$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import kya.e;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qn9.b;
import java.net.URLDecoder;
import kya.d;
import kya.a;
import flb.a;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import gw8.a;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import o56.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class d	// class@002404
{
    public QPhoto a;
    public QComment b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public void d(String p0,String p1){
       super();
       this.g = false;
       this.i = false;
       this.n = false;
       this.e = p0;
       this.f = p1;
    }
    public void a(View p0){
       String str = "tag_plugin";
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (VisitorModeManager.g(7)) {
          return;
       }
       try{
          if (g.e(str) || Dva.instance().isLoaded(str)) {
             this.c(p0);
          }else {
             this.b(p0.getContext(), p0);
          }
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          n3.C().t("DefaultSpanClickListene", e4.getMessage(), objArray);
       }
       return;
    }
    public final void b(Context p0,View p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "6")) {
          return;
       }
       boolean b = Dva.instance().getPluginInstallManager().g("tag_plugin");
       Object obj = PatchProxy.applyOneRefs(p0, this, uod, "8");
       if (obj != PatchProxyResult.class) {
       }else {
          while (true) {
             if (p0 instanceof ContextWrapper) {
                if (p0 instanceof FragmentActivity) {
                   obj = p0;
                }else {
                   p0 = p0.getBaseContext();
                }
             }else {
                obj = null;
             }
          }
       }
       if (b || obj == null) {
          if (!PatchProxy.applyVoidOneRefs(p1, this, uod, "7")) {
             Dva.instance().getPluginInstallManager().j("tag_plugin").a(new e(this, p1));
          }
          return;
       }else {
          h.a(Dva.instance().getPluginInstallManager(), "tag_plugin", PluginInstallerUIHandler.d(obj).d(new d$a(this, p1)));
          return;
       }
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       Activity uActivity = a.a(p0);
       d td = this.d;
       if (td != null && uActivity instanceof GifshowActivity) {
          uActivity.m3(td);
          this.f(p0);
          uActivity.m3(null);
       }else {
          this.f(p0);
       }
       return;
    }
    public d d(int p0,int p1){
       this.l = p0;
       this.m = p1;
       return this;
    }
    public d e(int p0,int p1){
       this.j = p0;
       this.k = p1;
       return this;
    }
    public final void f(View p0){
       d a;
       d d;
       View view;
       String str3;
       d obj2;
       boolean b1;
       Activity uActivity3;
       Intent intent;
       Object obj = this;
       d obj1 = p0;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uod, str)) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       if (uActivity == null) {
          return;
       }
       Activity uActivity1 = a.a(p0);
       if (uActivity1 == null) {
          return;
       }
       String str1 = (v2 = uActivity1 instanceof GifshowActivity)? uActivity1.U2(): "";
       String str2 = str1;
       View decorView = uActivity.getWindow().getDecorView();
       a = obj.a;
       d b = obj.b;
       d = obj.d;
       d c = obj.c;
       d e = obj.e;
       d f = obj.f;
       d uod1 = uod;
       b uob = b.class;
       Activity uActivity2 = uActivity1;
       boolean i = 0;
       PatchProxyResult patchProxyRe1 = patchProxyRe;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[10];
          objArray[i] = uActivity;
          objArray[1] = a;
          objArray[2] = b;
          objArray[3] = decorView;
          objArray[4] = obj1;
          objArray[5] = d;
          objArray[6] = c;
          objArray[7] = str2;
          objArray[8] = e;
          objArray[9] = f;
          if (PatchProxy.applyVoid(objArray, null, uob, str)) {
          label_00d0 :
             view = decorView;
             str3 = str2;
          }
       }
       Iterator iterator1 = b.a.iterator();
       while (true) {
          if (iterator1.hasNext()) {
             uod = f;
             d uod2 = e;
             d uod3 = c;
             d uod4 = d;
             d uod5 = b;
             d uod6 = a;
             view = decorView;
             str3 = str2;
             if (iterator1.next().a(uActivity, a, b, decorView, p0, uod4, uod3, str3, uod2, uod)) {
                break ;
             }else {
                e = uod2;
                f = uod;
                c = uod3;
                d = uod4;
                b = uod5;
                a = uod6;
                decorView = view;
                str2 = str3;
             }
          }else {
             goto label_00d0 ;
          }
       }
       if (v2 && obj.n == null) {
          obj1 = obj.e;
          str1 = str3;
          obj2 = PatchProxy.applyTwoRefs(str1, obj1, null, e.class, str);
          patchProxyRe = patchProxyRe1;
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
             uActivity3 = null;
          }else if(TextUtils.x(str1) || TextUtils.x(obj1)){
             uActivity3 = null;
          }else {
             str = obj1.replace(b.a, "ks://tagdetail");
             if ((URLDecoder.decode(str, "UTF-8")).contains(str1)) {
                uActivity3 = null;
             }else {
                int i1 = obj1.indexOf(63);
                if (i1 < 0) {
                   obj2 = obj1;
                   uActivity3 = null;
                }else {
                   str = obj1.substring(0, i1);
                }
                if (!str1.contains(obj2) || 47 != str1.charAt(obj2.length())) {
                   Iterator iterator = e.a.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (!iterator.next().a(str1, obj1)) {
                            continue ;
                         }
                      }
                   }
                }
             }
             b1 = true;
          }
          if (b1) {
             uActivity2.finish();
             return;
          }
       }else {
          patchProxyRe = patchProxyRe1;
          uActivity3 = null;
       }
       obj1 = obj.f;
       obj2 = obj.e;
       a uoa = a.class;
       Object obj3 = PatchProxy.applyTwoRefs(obj1, obj2, null, uoa, "1");
       if (obj3 != patchProxyRe) {
          i = obj3.booleanValue();
       }else {
          ActivityInfo uActivityInf = a.b(a.e.a(), obj1);
          if (uActivityInf != null) {
             if (!TextUtils.x(uActivityInf.mUrl) && uActivityInf.mForceRedirectUrl != null) {
                intent = b.a(0x66dce92a).a(ActivityContext.g().e(), w0.f(uActivityInf.mUrl));
                if (intent != null) {
                   ActivityContext.g().e().startActivity(intent);
                }
             }else if(uActivityInf.mTagType == 1){
                if (!PatchProxy.applyVoidTwoRefs(uActivityInf, obj2, null, uoa, "2")) {
                   Intent intent1 = new Intent("android.intent.action.VIEW", w0.f(obj2));
                   intent1.putExtra("tag_name", uActivityInf.mKeyword);
                   intent1.putExtra("tag_url", obj2);
                   intent1.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100d4);
                   ActivityContext.g().e().startActivity(intent1);
                }
             }
             i = true;
          }
       label_0190 :
          i = false;
       }
       if (i) {
          return;
       }else if(obj.h != null){
          c.i(uActivity, KwaiWebViewActivity.N3(uActivity, obj.e).a());
          return;
       }else {
          Activity uActivity4 = uActivity2;
          Activity uActivity5 = uActivity;
          PatchProxyResult patchProxyRe2 = patchProxyRe;
          b = uod1;
          if (!PatchProxy.applyVoidThreeRefs(uActivity2, uActivity, view, this, d.class, "4")) {
             intent = PatchProxy.applyOneRefs(uActivity4, obj, b, "5");
             if (intent != patchProxyRe2) {
             }else {
                intent = new Intent("android.intent.action.VIEW", w0.f(obj.e));
                obj2 = obj.m;
                if (obj2 >= null) {
                   intent.putExtra("activityCloseEnterAnimation", obj2);
                }
                obj2 = obj.l;
                if (obj2 >= null) {
                   intent.putExtra("activityOpenExitAnimation", obj2);
                }
                if (obj.g != null) {
                   intent.setPackage(a.v);
                }
                obj2 = obj.a;
                if (obj2 != null) {
                   intent.putExtra("arg_photo_exp_tag", obj2.getExpTag());
                }
                obj2 = obj.a;
                if (obj2 != null && (obj2.getEntity() != null && obj.i != null)) {
                   SerializableHook.putExtra(intent, "arg_refer_photo", obj.a.getEntity());
                }
             label_0287 :
                intent.putExtra("com.android.browser.application_id", uActivity4.getPackageName());
             }
             if (uActivity5 instanceof GifshowActivity) {
                uActivity5.q3(intent, 1001, view);
             }
             Activity uActivity6 = a.b(uActivity4);
             if (uActivity6 != null) {
                obj2 = obj.j;
                if (obj2 >= null) {
                   d k = obj.k;
                   if (k >= null) {
                      uActivity6.overridePendingTransition(obj2, k);
                   }
                }
             }
          }
       label_02af :
          return;
       }
    }
    public d g(String p0){
       this.d = p0;
       return this;
    }
    public d h(QComment p0){
       this.b = p0;
       return this;
    }
    public d i(String p0){
       this.c = p0;
       return this;
    }
    public d j(boolean p0){
       this.n = p0;
       return this;
    }
    public d k(boolean p0){
       this.h = p0;
       return this;
    }
    public d l(QPhoto p0){
       this.a = p0;
       return this;
    }
    public d m(boolean p0){
       this.g = p0;
       return this;
    }
}
