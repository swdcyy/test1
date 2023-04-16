package com.yxcorp.gifshow.growth.widget.pip.BaseGuidePipHelper;
import com.yxcorp.gifshow.growth.widget.pip.BaseGuidePipHelper$a;
import nsd.u;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.e;
import cg6.b;
import java.util.List;
import com.yxcorp.gifshow.widget.popup.c;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import u07.t;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import kzc.c;
import com.kwai.library.widget.popup.bubble.a;
import kzc.f;
import com.kwai.library.widget.popup.common.a;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.WeakHashMap;
import com.yxcorp.gifshow.growth.widget.pip.BaseGuidePipHelper$clearPopup$4;
import msd.l;
import trd.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.AppOpsManager;
import android.os.Build$VERSION;
import android.os.Process;
import android.content.res.Resources;
import android.content.res.Configuration;
import wh5.c;
import m3a.x;
import e17.i;
import hga.b;
import hga.c;
import com.yxcorp.gifshow.growth.widget.pip.EncourageGuidePipActivity;
import java.util.Objects;
import com.yxcorp.gifshow.growth.widget.pip.EncourageGuidePipActivity$a;
import android.content.Intent;
import android.content.Context;

public abstract class BaseGuidePipHelper	// class@0015f3
{
    public static final BaseGuidePipHelper$a a;

    static {
       BaseGuidePipHelper.a = new BaseGuidePipHelper$a(null);
    }
    public void BaseGuidePipHelper(){
       super();
    }
    public final void a(Activity p0){
       Object[] objArray;
       Iterator iterator;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseGuidePipHelper.class, "2")) {
          return;
       }
       List list = b.b().l(p0);
       if (list != null) {
          objArray = new Object[0];
          w.C().w(this.c(), "dialog queue size: "+list.size(), objArray);
          iterator = list.iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             a.o(ot, "popup");
             if (ot.K()) {
                objArray1 = new Object[0];
                w.C().w(this.c(), "clear dialog: "+ot, objArray1);
                ot.o();
             }
          }
       }
       list = b.a().l(p0);
       if (list != null) {
          objArray = new Object[0];
          w.C().w(this.c(), "bubble queue size: "+list.size(), objArray);
          iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             a.o(uoa, "popup");
             if (uoa.K()) {
                objArray1 = new Object[0];
                w.C().w(this.c(), "clear bubble: "+uoa, objArray1);
                uoa.o();
             }
          }
       }
       f uof = b.c();
       a.o(uof, "KwaiPopupManagerHolder.getPopupManager\(\)");
       list = uof.i().d(p0);
       a.o(list, "KwaiPopupManagerHolder.g¡­er.getPopupList\(activity\)");
       if (list != null) {
          objArray = new Object[0];
          w.C().w(this.c(), "popup queue size: "+list.size(), objArray);
          iterator = list.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             a.o(uoc, "popup");
             if (uoc.K()) {
                objArray1 = new Object[0];
                w.C().w(this.c(), "clear popup: "+uoc, objArray1);
                uoc.o();
             }
          }
       }
       List list1 = KwaiDialogFragment.o.get(p0.getSupportFragmentManager());
       if (list1 != null) {
          y.K0(list1, new BaseGuidePipHelper$clearPopup$4(this));
       }
       return;
    }
    public abstract String b();
    public abstract String c();
    public abstract boolean d();
    public final boolean e(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseGuidePipHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          AppOpsManager systemServic = p0.getSystemService("appops");
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= 26) {
             if (sDK_INT >= 29) {
                if (systemServic == null || systemServic.unsafeCheckOpNoThrow("android:picture_in_picture", Process.myUid(), p0.getPackageName())) {
                label_004e :
                   return b;
                }
             }else if(systemServic != null && !systemServic.checkOpNoThrow("android:picture_in_picture", Process.myUid(), p0.getPackageName())){
             }
             b = true;
             goto label_004e ;
          }else {
             goto label_004e ;
          }
       }else {
          goto label_004e ;
       }
    }
    public final void f(Activity p0){
       Object[] objArray2;
       EncourageGuidePipActivity$a a;
       Intent intent;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseGuidePipHelper.class, "4")) {
          return;
       }
       if (!this.d()) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       w.C().w(this.c(), "enterSmallWindowMode", objArray);
       if (p0 != null) {
          Resources resources = p0.getResources();
          a.o(resources, "activity.resources");
          Object[] objArray1 = new Object[i];
          w.C().w(this.c(), "activity orientation "+resources.getConfiguration().orientation, objArray1);
          Resources resources1 = p0.getResources();
          a.o(resources1, "activity.resources");
          if (resources1.getConfiguration().orientation == 2) {
             objArray2 = new Object[i];
             w.C().w(this.c(), "onUserLeaveHint: ORIENTATION_LANDSCAPE not support", objArray2);
             return;
          }else if(c.b()){
             objArray2 = new Object[i];
             w.C().w(this.c(), "child lock enable", objArray2);
             return;
          }else if(x.b.b() && this.e(p0)){
             this.a(p0);
             i oi = i.l();
             if (oi != null) {
                oi.h();
             }
             c.c("FEATURED_PIP");
             String str = this.b();
             a = EncourageGuidePipActivity.A;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidTwoRefs(p0, str, a, EncourageGuidePipActivity$a.class, "1")) {
                a.p(p0, "activity");
                a.p(str, "cdnUrl");
                intent = new Intent(p0, EncourageGuidePipActivity.class);
                intent.addFlags(0x10000000);
                intent.putExtra("", str);
                p0.startActivity(intent);
                p0.overridePendingTransition(i, i);
             }
          }else {
             Intent intent1 = new Intent("android.intent.action.MAIN");
             intent1.addCategory("android.intent.category.HOME");
             p0.startActivity(intent1);
          }
       }
       return;
    }
}
