package com.kuaishou.nearby_poi.poi.http.a$a;
import qvb.q;
import com.kuaishou.nearby_poi.poi.http.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.n0;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import xn4.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import xn4.a;
import msd.a;
import c15.b;
import android.content.Intent;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.w0;
import e17.i;
import qvb.p;
import qvb.a;
import java.util.Collection;
import ekd.q;

public class a$a implements q	// class@000a1e
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       if (this.b.K() && p0.C(a.b())) {
          Activity uActivity = ActivityContext.g().e();
          if (uActivity != null) {
             a p = this.b.p;
             Object obj = PatchProxy.applyTwoRefs(uActivity, p, null, b.class, "1");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }else if(TextUtils.x(p)){
                b.d(KsLogTunaCoreTag.TUNA_CLOG.appendTag("jumpProfile"), a.b);
             }else {
                uActivity.startActivity(new Intent("android.intent.action.VIEW", w0.f("kwai://work/"+p)));
             }
             uActivity.finish();
          }
       }else {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, a$a.class, "1")) {
          return;
       }
       if (!q.f(this.b.getItems())) {
          this.b.f(this);
       }
       return;
    }
}
