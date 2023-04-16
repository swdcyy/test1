package com.yxcorp.gifshow.relation.intimate.IntimateRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.content.Intent;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ekd.i;
import java.lang.System;
import zac.f;
import java.lang.Runnable;
import ekd.k1;
import android.net.Uri;
import java.lang.StringBuilder;
import cbc.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.x0;
import lnc.o5;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.Log;
import zac.g;
import e17.i;
import zac.d;
import erd.g;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import xh7.b;
import com.yxcorp.gifshow.relation.intimate.a;
import qh7.b;
import qh7.a;
import java.lang.ref.WeakReference;
import zac.e;
import zac.c;
import com.yxcorp.gifshow.relation.intimate.helper.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.intimate.dialog.e;

public class IntimateRouterActivity extends GifshowActivity	// class@0018dd
{
    public long y;
    public static final int z;

    public void IntimateRouterActivity(){
       super();
    }
    public static void w3(IntimateRelationDialogParams p0,boolean p1){
       IntimateRouterActivity intimateRout = IntimateRouterActivity.class;
       if (PatchProxy.isSupport(intimateRout) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, intimateRout, "6")) {
          return;
       }
       Intent intent = new Intent(a.b(), intimateRout);
       intent.addFlags(0x10000000);
       SerializableHook.putExtra(intent, "KEY_DIALOG_PARAM", p0);
       intent.putExtra("KEY_DIALOG_NEED_REQUEST", p1);
       a.b().startActivity(intent);
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, IntimateRouterActivity.class, "8")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, IntimateRouterActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       int i;
       Object obj = this;
       IntimateRouterActivity intimateRout = IntimateRouterActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, intimateRout, "1")) {
          return;
       }
       super.onCreate(p0);
       boolean b = false;
       obj.o3(b);
       obj.overridePendingTransition(b, b);
       i.h(obj, b, this.isDarkImmersiveMode());
       if (!PatchProxy.applyVoid(null, obj, intimateRout, "2")) {
          long l = System.currentTimeMillis();
          try{
             obj.y = l;
             IntimateRelationDialogParams serializable = SerializableHook.getSerializableExtra(this.getIntent(), "KEY_DIALOG_PARAM");
             boolean b1 = true;
             int booleanExtra = this.getIntent().getBooleanExtra("KEY_DIALOG_NEED_REQUEST", b1);
             long l1 = 100;
             if (serializable != null && !booleanExtra) {
                k1.r(new f(obj, serializable), l1);
             }else {
                Uri data = this.getIntent().getData();
                a.a("scheme:"+data);
                if (data != null) {
                   String path = data.getPath();
                   if (!TextUtils.x(path)) {
                      if (serializable == null) {
                         serializable = PatchProxy.applyOneRefs(data, obj, intimateRout, "4");
                         if (serializable != PatchProxyResult.class) {
                         }else {
                            i = -1;
                            boolean i1 = o5.b(x0.a(data, "relationStatus"), i);
                            String str = x0.a(data, "ownerId");
                            String str1 = x0.a(data, "targetId");
                            int i2 = o5.b(x0.a(data, "style"), i);
                            int i3 = o5.b(x0.a(data, "action"), i);
                            int i4 = o5.b(x0.a(data, "source"), b);
                            if (i2 == b1 || (!i3 && !TextUtils.n(QCurrentUser.ME.getId(), str))) {
                               Log.d("IntimateRouterActivity", "ownerId is not current user");
                               serializable = null;
                            }else if(TextUtils.x(str)){
                               str = QCurrentUser.me().getId();
                            }
                            String str2 = x0.a(data, "ks_notify_id");
                            String str3 = x0.a(data, "proposeId");
                            booleanExtra = o5.b(x0.a(data, "toIM"), b1);
                            IntimateRelationDialogParams intimateRela = new IntimateRelationDialogParams(str).setTargetId(str1).setStyle(i2).setRelationStatus(i1).setIntimateType(o5.b(x0.a(data, "intimateType"), i)).setAction(i3);
                            i1 = (o5.b(x0.a(data, "invited"), b) == b1)? true: false;
                            IntimateRelationDialogParams intimateRela1 = intimateRela.setHasInvited(i1).setProposeId(str3).setBizDataId(str2);
                            if (booleanExtra != b1) {
                               b1 = false;
                            }
                            serializable = intimateRela1.setToIM(b1).setSource(i4);
                         }
                      }
                      if (serializable == null) {
                         this.finish();
                      }else if(!serializable.mStartTime){
                         serializable.setStartTime(obj.y);
                      }
                      if (TextUtils.n(path, "/dialog")) {
                         if (serializable.mStyle == 6) {
                            k1.r(new g(obj, serializable), 100);
                         }else {
                            obj.u3(serializable, false);
                         }
                      }else if(TextUtils.n(path, "/event")){
                         IntimateRelationDialogParams mRelationSta = serializable.mRelationStatus;
                         if (mRelationSta == 2) {
                            i.a(R.style.arg_RES_7f11066a, 0x7f10177b);
                         }else if(serializable.mAction == null && mRelationSta == null){
                            i.b(serializable, new d(obj), null);
                         }
                      }else if(TextUtils.n(path, "/notify")){
                         serializable.setSource(7);
                         if (!PatchProxy.applyVoidOneRefs(serializable, obj, intimateRout, "7")) {
                            a.b(b.j(obj, "kwai://notifications"), new a(obj, serializable));
                         }
                      }
                      this.finish();
                   }
                }
                this.finish();
             }
          }catch(java.lang.Exception e0){
             this.finish();
          }
       }
    }
    public final void u3(IntimateRelationDialogParams p0,boolean p1){
       IntimateRouterActivity intimateRout = IntimateRouterActivity.class;
       if (PatchProxy.isSupport(intimateRout) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, intimateRout, "3")) {
          return;
       }
       i.i(new WeakReference(this), p0, new e(this, p1), new c(this));
       return;
    }
    public final void v3(IntimateRelationDialogParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntimateRouterActivity.class, "5")) {
          return;
       }
       PopupInterface$h oh = null;
       if (!PatchProxy.applyVoidThreeRefsWithListener(this, p0, null, null, a.class, "1")) {
          a.a(this, p0, oh).x();
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
}
