package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1;
import exb.e;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import uo7.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1$onSuccess$1;
import msd.a;
import tb7.b;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1$onSuccess$2;
import java.lang.Long;
import java.lang.Float;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1$onProgress$1;
import java.lang.Throwable;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1$onError$1;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import exb.d;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1$onStart$1;

public final class ShareStyleSelectHelper$listener$1 implements e	// class@001ba8
{
    public final ShareStyleSelectHelper a;
    public final k b;

    public void ShareStyleSelectHelper$listener$1(ShareStyleSelectHelper p0,k p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void b(String p0,String p1){
       ShareStyleSelectHelper q;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareStyleSelectHelper$listener$1.class, "1")) {
          return;
       }
       ShareStyleSelectHelper$listener$1 ta = this.a;
       Boolean uBoolean = null;
       if (ta.n == null) {
          q = ta.q;
          Boolean uBoolean1 = (q != null)? Boolean.valueOf(q.K()): uBoolean;
          if (!uBoolean1.booleanValue()) {
             b.j(new ShareStyleSelectHelper$listener$1$onSuccess$1(this));
          }
       }
       q = this.a.q;
       if (q != null) {
          uBoolean = Boolean.valueOf(q.K());
       }
       if (uBoolean.booleanValue()) {
          b.j(new ShareStyleSelectHelper$listener$1$onSuccess$2(this));
       }else {
          q.l = true;
       }
       return;
    }
    public void c(long p0,float p1){
       if (PatchProxy.isSupport(ShareStyleSelectHelper$listener$1.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Float.valueOf(p1), this, ShareStyleSelectHelper$listener$1.class, "2")) {
          return;
       }
       int i = 100;
       int i1 = (int)(p1 * (float)i);
       ShareStyleSelectHelper q = this.a.q;
       Boolean uBoolean = (q != null)? Boolean.valueOf(q.K()): null;
       if (uBoolean.booleanValue() && (i1 >= 0 && i1 <= i)) {
          b.j(new ShareStyleSelectHelper$listener$1$onProgress$1(this, i1));
       }
    label_0041 :
       return;
    }
    public void d(Throwable p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ShareStyleSelectHelper$listener$1.class, "3")) {
          return;
       }
       ShareStyleSelectHelper q = this.a.q;
       Boolean uBoolean = (q != null)? Boolean.valueOf(q.K()): null;
       if (uBoolean.booleanValue()) {
          b.j(new ShareStyleSelectHelper$listener$1$onError$1(this));
       }
       return;
    }
    public void e(ClientStat$CdnResourceLoadStatEvent p0){
       d.b(this, p0);
    }
    public boolean f(){
       return true;
    }
    public void onCancel(String p0){
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareStyleSelectHelper$listener$1.class, "4")) {
          return;
       }
       b.j(new ShareStyleSelectHelper$listener$1$onStart$1(this));
       return;
    }
}
