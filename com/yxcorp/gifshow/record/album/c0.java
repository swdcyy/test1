package com.yxcorp.gifshow.record.album.c0;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import java.util.concurrent.atomic.AtomicReference;
import erd.a;
import java.lang.Object;
import y26.b$a;
import k8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import ekd.k1;
import q87.c;
import tkd.b;
import tkd.d;
import w26.a;
import y26.b;
import android.content.Context;
import w26.c;
import lq.i;
import elb.w;
import org.json.JSONObject;
import haa.f;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Boolean;
import lnc.d7;
import lq.a;
import brd.t;
import k8c.l1;
import com.yxcorp.gifshow.record.album.e0;
import crd.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.Intent;
import android.app.Activity;

public final class c0 implements g	// class@001713
{
    public final long b;
    public final GifshowActivity c;
    public final c d;
    public final b$a[] e;
    public final AtomicReference f;
    public final a g;

    public void c0(long p0,GifshowActivity p1,c p2,b$a[] p3,AtomicReference p4,a p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       w ow;
       JSONObject jSONObject;
       c0 tc = this.c;
       c0 td = this.d;
       c0 te = this.e;
       c0 tf = this.f;
       c0 tg = this.g;
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumUtils", "EditCost share publish cost:"+k1.t(this.b), objArray);
       int i = 0x27e26f6e;
       d.a(i).TS(tc, p0.g());
       if (i.h()) {
          ow = i.m().z("postBenefitGuideData");
          if (ow != null && ow.a()) {
             try{
                jSONObject = new JSONObject();
                jSONObject.put("activityId", String.valueOf(ow.a()));
             }catch(org.json.JSONException e0){
                Object[] objArray1 = new Object[0];
                f.D().A("LocalAlbumUtils", "activityId to Json failed", objArray1);
             }
             td.d1().o0(jSONObject.toString());
          }
          Object obj = i.m().A("fromRecordDraftTab", Boolean.FALSE);
          if (obj instanceof Boolean && obj.booleanValue()) {
             Object[] objArray2 = new Object[0];
             f.D().w("LocalAlbumUtils", "from draft tab", objArray2);
             i.m().Z(td);
          }else {
             i.W(td);
          }
       }else {
          i.W(td);
          ow = null;
       }
       d7.a.q(ow);
       if (te[0] != null) {
          tf.set(i.m().p().init().subscribe(new l1(te), e0.b));
       }
       try{
          tg.run();
       }catch(java.lang.Exception e3){
          PostUtils.D("LocalAlbumUtils", "newBuilder dismissProgress", e3);
       }
       tc.startActivityForResult(d.a(e0).DL(p0.g(), 0), 258);
       tc.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
       return;
    }
}
