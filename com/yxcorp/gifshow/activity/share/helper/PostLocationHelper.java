package com.yxcorp.gifshow.activity.share.helper.PostLocationHelper;
import tw8.a;
import java.lang.Object;
import com.yxcorp.gifshow.activity.share.helper.PostLocationHelper$supportKrn$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.activity.share.helper.PostLocationHelper$krnLocationHelper$2;
import com.yxcorp.gifshow.activity.share.helper.PostLocationHelper$nativeLocationHelper$2;
import java.lang.String;
import com.kuaishou.android.model.mix.Location;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tw8.a$a;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper;
import java.util.Objects;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import tw8.c;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import f66.i;
import jq.a;
import q87.c;
import tw8.b;

public final class PostLocationHelper implements a	// class@001390
{
    public final p a;
    public final p b;
    public final p c;

    public void PostLocationHelper(){
       super();
       this.a = s.c(PostLocationHelper$supportKrn$2.INSTANCE);
       this.b = s.c(PostLocationHelper$krnLocationHelper$2.INSTANCE);
       this.c = s.c(PostLocationHelper$nativeLocationHelper$2.INSTANCE);
    }
    public Location a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLocationHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a$a.a(this, p0);
    }
    public Intent b(Bundle p0,Context p1){
       boolean b2;
       PostLocationHelper postLocation = PostLocationHelper.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "4";
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, postLocation, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "bundle";
       a.p(p0, obj);
       a.p(p1, "context");
       String str1 = "1";
       Boolean uBoolean = PatchProxy.apply(null, this, postLocation, str1);
       if (uBoolean == patchProxyRe) {
          uBoolean = this.a.getValue();
       }
       if (uBoolean.booleanValue()) {
          KrnLocationHelper krnLocationH = this.d();
          Objects.requireNonNull(krnLocationH);
          Object obj1 = PatchProxy.applyOneRefs(p0, krnLocationH, KrnLocationHelper.class, "3");
          boolean b = true;
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             a.p(p0, obj);
             if (SerializableHook.getSerializable(p0, "photo_location") == null) {
                Object obj2 = PatchProxy.apply(null, null, c.class, str1);
                boolean b1 = (obj2 != patchProxyRe)? obj2.booleanValue(): a.t().d("enablePublishPoiOffsite", false);
                if (!b1) {
                   Object obj3 = PatchProxy.apply(null, krnLocationH, KrnLocationHelper.class, str);
                   if (obj3 != patchProxyRe) {
                      b2 = obj3.booleanValue();
                   }else if(!TextUtils.isEmpty(krnLocationH.d().downLoadUri) && !TextUtils.isEmpty(krnLocationH.d().a())){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                   if (b2) {
                   label_00a3 :
                      if (b) {
                         try{
                            return this.d().b(p0, p1);
                         }catch(com.google.gson.JsonSyntaxException e1){
                            a.b().e(v0, "uri something wrong check kSwitch", e1);
                            return this.e().b(p0, p1);
                         }catch(java.lang.Exception e1){
                            PostUtils.D(v0, "krn get Intent failed", e1);
                         }
                      }
                   }
                }
             }
          label_0058 :
             b = false;
             goto label_00a3 ;
          }
       }
    }
    public boolean c(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLocationHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "bundle");
       return a$a.b(this, p0);
    }
    public final KrnLocationHelper d(){
       Object obj = PatchProxy.apply(null, this, PostLocationHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final b e(){
       Object obj = PatchProxy.apply(null, this, PostLocationHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
}
