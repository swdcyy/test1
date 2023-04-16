package com.yxcorp.gifshow.camera.record.SchemePairedPhotoVideoHelper;
import java.lang.Object;
import qb9.z;
import android.net.Uri;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import lnc.c7;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.android.model.mix.Location;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import j8c.a;
import q87.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pm6.o;
import pm6.a;
import jkd.c;
import n3d.a;
import qb9.g0;
import brd.t;
import tkd.b;
import tkd.d;
import t5b.a;
import ixc.c;
import com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import java.lang.Throwable;
import s3b.a;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.k;
import erd.o;
import qb9.l0;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class SchemePairedPhotoVideoHelper	// class@001c99
{

    public void SchemePairedPhotoVideoHelper(){
       super();
    }
    public static Bundle a(z p0,Uri p1){
       Intent obj = PatchProxy.applyTwoRefs(p0, p1, null, SchemePairedPhotoVideoHelper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Intent();
       c7.a.c(p1, obj);
       Bundle uBundle = new Bundle();
       if (obj.getExtras() != null) {
          uBundle.putAll(obj.getExtras());
       }
       SerializableHook.putSerializable(uBundle, "conversionTaskList", p0.A);
       SerializableHook.putSerializable(uBundle, "serviceLinkData", p0.B);
       if (p0.n) {
          Location location = new Location();
          location.latitude = p0.q;
          location.longitude = p0.p;
          location.mAddress = p0.o;
          location.mId = p0.n;
          location.mTitle = p0.r;
          location.mCity = p0.s;
          SerializableHook.putSerializable(uBundle, "location", location);
       }
       uBundle.putBoolean("key_count_down_enable", p0.C);
       uBundle.putBoolean("pauseToEditPage", p0.D);
       uBundle.putBoolean("discard_current_post_session", p1.getBooleanQueryParameter("discardPostSession", true));
       return uBundle;
    }
    public static void b(ProgressFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, SchemePairedPhotoVideoHelper.class, "8")) {
          return;
       }
       if (p0 != null && (p0.getFragmentManager() != null && p0.isAdded())) {
          Object[] objArray = new Object[0];
          a.D().s("SchemePairedPhotoVideoHelper", "dismiss ProgressFragment", objArray);
          p0.dismissAllowingStateLoss();
       }
    label_002b :
       return;
    }
    public static boolean c(z p0,QPhoto p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SchemePairedPhotoVideoHelper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.n(p0.a, "sameFrame")) {
          return o.a(p1, true);
       }
       if (TextUtils.n(p0.a, "followShoot") || TextUtils.n(p0.a, "lipsSync")) {
          return a.a(p1.disableFollowShoot(), p1.isVideoAndNotKtv());
       }
       return false;
    }
    public static a d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SchemePairedPhotoVideoHelper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g0(p0);
    }
    public static t e(z p0,boolean p1){
       t obj;
       SchemePairedPhotoVideoHelper schemePaired = SchemePairedPhotoVideoHelper.class;
       if (PatchProxy.isSupport(schemePaired)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, schemePaired, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null || TextUtils.x(p0.f)) {
          return t.just(new MagicEmoji$MagicFace());
       }else if(("followShoot").equals(p0.a) || ("lipsSync").equals(p0.a)){
          return t.just(new MagicEmoji$MagicFace());
       }else {
          int i = 0x3bf0d115;
          if (!d.a(i).XQ()) {
             return t.error(new UnSupportedMagicException("UnSupportedMagicException mobile does not support magic"));
          }else {
             obj = d.a(i).KA().g(p0.f, p0.g, MagicBusinessId.VIDEO, false);
             if (!p1) {
                return obj;
             }else {
                return obj.observeOn(d.c).concatMap(k.b).onErrorResumeNext(new l0(p0));
             }
          }
       }
    }
}
