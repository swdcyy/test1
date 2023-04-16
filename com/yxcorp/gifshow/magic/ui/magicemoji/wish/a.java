package com.yxcorp.gifshow.magic.ui.magicemoji.wish.a;
import m4b.e;
import com.yxcorp.gifshow.magic.ui.magicemoji.wish.a$a;
import java.lang.Object;
import java.util.HashMap;
import m4b.d;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.a;
import com.yxcorp.gifshow.model.WishMagicInfo;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.WishMagicInfo$WishMagicDetailInfo;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import t4b.e;
import java.lang.Integer;
import java.util.Map;
import k4b.a;
import com.kwai.video.westeros.models.EffectDescription;
import n5b.e;
import java.util.Collection;
import ekd.q;
import android.view.View;
import n5b.o;
import n5b.c;
import erd.g;
import com.kwai.video.westeros.models.EffectSlot;
import brd.t;
import java.util.concurrent.TimeUnit;
import n5b.d;
import android.content.Intent;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectHint;
import lnc.b9;

public class a implements e	// class@001c47
{
    public WishMagicInfo b;
    public final a$a c;
    public a d;
    public EffectDescription e;
    public final Map f;

    public void a(a$a p0){
       super();
       this.f = new HashMap();
       this.c = p0;
    }
    public void G(){
       d.e(this);
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       a td = this.d;
       if (td == null || td.isDisposed()) {
          this.d = new a();
       }
       this.d.c(p0);
       return;
    }
    public final void b(WishMagicInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       this.b = p0;
       if (p0 == null) {
          return;
       }
       MagicEmoji$MagicFace magicFace = this.c.o();
       Iterator iterator = p0.mWishMagicDetailInfos.iterator();
       while (iterator.hasNext()) {
          WishMagicInfo$WishMagicDetailInfo wishMagicDet = iterator.next();
          if (magicFace != null && !TextUtils.x(magicFace.mId)) {
             WishMagicInfo$WishMagicDetailInfo mIndex = wishMagicDet.mIndex;
             this.c.D(new e(magicFace.mId, wishMagicDet.mContent, mIndex, TextUtils.n(this.f.get(Integer.valueOf(mIndex)), wishMagicDet.mContent)));
          }
          this.c.h(wishMagicDet.mIndex, wishMagicDet.mContent, wishMagicDet.mFontPath);
       }
       return;
    }
    public final void c(EffectDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       if (!this.c.I0()) {
          return;
       }
       if (p0 == null) {
          this.d(null);
          return;
       }else {
          MagicEmoji$MagicFace magicFace = this.c.o();
          if (magicFace == null) {
             this.d(null);
             return;
          }else {
             WishMagicInfo wishMagicInf = e.a.a(p0, magicFace);
             this.d(wishMagicInf);
             a tb = this.b;
             a uoa = (tb != null && (TextUtils.n(magicFace.mId, tb.mMagicFaceId) && TextUtils.n(magicFace.mChildId, this.b.mChildMagicFaceId)))? 1: null;
             if (!uoa) {
                this.b = (!this.c.Q())? wishMagicInf: null;
             }
          label_005c :
             a tb1 = this.b;
             if (tb1 != null) {
                this.b(tb1);
             }
             return;
          }
       }
    }
    public final void d(WishMagicInfo p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       this.f.clear();
       if (p0 != null && !q.f(p0.mWishMagicDetailInfos)) {
          Iterator iterator = p0.mWishMagicDetailInfos.iterator();
          while (iterator.hasNext()) {
             WishMagicInfo$WishMagicDetailInfo wishMagicDet = iterator.next();
             a tf = this.f;
             Integer integer = Integer.valueOf(wishMagicDet.mIndex);
             wishMagicDet = wishMagicDet.mContent;
             if (wishMagicDet == null) {
                str = "";
             }
             tf.put(integer, str);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a(this.c.b0(o.class, new c(this)));
       return;
    }
    public void e1(int p0){
       d.l(this, p0);
    }
    public void h(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       this.e = p0;
       this.a(t.just("").delay(300, TimeUnit.MILLISECONDS).subscribe(new d(this)));
       return;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       d.d(this, p0, p1, p2);
    }
    public void onDestroy(){
       d.i(this);
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "4")) {
          return;
       }
       this.e = p0;
       this.c(p0);
       return;
    }
    public void onEffectHintUpdated(EffectHint p0){
       d.k(this, p0);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.c(this.e);
       return;
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.e = null;
       b9.a(this.d);
       return;
    }
    public void w(){
       d.f(this);
    }
    public void w1(Intent p0){
       d.h(this, p0);
    }
    public void x1(){
       d.g(this);
    }
    public void y1(){
       d.c(this);
    }
}
