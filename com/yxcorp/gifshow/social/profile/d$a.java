package com.yxcorp.gifshow.social.profile.d$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import xh7.b;
import com.yxcorp.gifshow.social.profile.d$a$a;
import qh7.b;
import qh7.a;
import com.yxcorp.gifshow.social.profile.Material;
import z5c.y1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class d$a	// class@001d72
{

    public void d$a(){
       super();
    }
    public void d$a(u p0){
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "6")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity != null && !uActivity.isFinishing()) {
          if (TextUtils.x(p0)) {
             return;
          }else {
             int i = p0.length() - 1;
             int i1 = 0;
             int i2 = 0;
             while (true) {
                if (i1 <= i) {
                   int i3 = (!i2)? i1: i;
                   i3 = (a.t(p0.charAt(i3), 32) <= 0)? 1: 0;
                   if (!i2) {
                      if (!i3) {
                         i2 = 1;
                      }else {
                         i1 = i1 + 1;
                      }
                   }else if(!i3){
                   label_0056 :
                      b uob = b.j(uActivity, p0.subSequence(i1, (i + 1)).toString());
                      a.o(uob, "UriRequest.create\(activity, url\)");
                      a.b(uob, d$a$a.a);
                      break ;
                   }else {
                      i = i - 1;
                   }
                }else {
                   goto label_0056 ;
                }
             }
          }
       }
       return;
    }
    public final void b(Material p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "5")) {
          return;
       }
       this.a(p0.getButtonLinkUrl());
       if (!PatchProxy.applyVoidOneRefs(p0, null, y1.class, "117")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "VIDEO_REC_MATERIAL_ITEM";
          uElementPack.params = y1.c(p0);
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
