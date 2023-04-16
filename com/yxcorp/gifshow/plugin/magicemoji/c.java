package com.yxcorp.gifshow.plugin.magicemoji.c;
import s3b.a;
import java.lang.Object;
import z3b.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z3b.a0;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.io.File;
import brd.t;
import com.yxcorp.gifshow.plugin.magicemoji.b;
import erd.o;
import java.lang.Exception;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import w3b.l;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import e4b.b;
import f4b.k;
import uyb.f;
import com.yxcorp.gifshow.plugin.magicemoji.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import w3b.h;
import w3b.g;
import t45.d;
import brd.z;
import uyb.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import uyb.g;
import elb.h0;
import w46.b;
import java.lang.Integer;
import uyb.e;
import io.reactivex.g;

public final class c implements a	// class@000fef
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public a H0(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a0.o();
    }
    public t a(MagicEmoji$MagicFace p0,File p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t(p0, p1).flatMap(new b(this, p1));
    }
    public Exception b(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.k(p0);
    }
    public t c(SimpleMagicFace p0,MagicBusinessId p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.n(p0, p1, p2);
    }
    public t d(String p0,MagicBusinessId p1,boolean p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return l.t(p0, p1, p2);
    }
    public t e(List p0,MagicBusinessId p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.w(p0, p1);
    }
    public t f(String p0,MagicBusinessId p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, "25");
       if (obj != patchProxyRe) {
       }else {
          obj = l.g(p0, "", p1);
       }
       return obj;
    }
    public t g(String p0,String p1,MagicBusinessId p2,boolean p3){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, c.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return l.u(p0, p1, p2, p3);
    }
    public boolean h(SimpleMagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l.q(p0);
    }
    public void i(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       l.o(p0);
       return;
    }
    public void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       l.a(p0);
       return;
    }
    public void k(MagicBusinessId p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "9")) {
          return;
       }
       MagicEmojiResponse magicEmojiRe = b.b(p0);
       if (magicEmojiRe != null) {
          magicEmojiRe.mIsFromNetwork = false;
       }
       k.c(p0, p1, "").subscribe(new f(p0), a.b);
       return;
    }
    public t l(MagicEmoji$MagicFace p0,MagicBusinessId p1){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "6";
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, str);
       if (obj != patchProxyRe) {
       }else if(!l.q(p0)){
          ot = t.just(Boolean.FALSE);
       }else {
          MagicEmojiResponse magicEmojiRe = l.c(MagicBusinessId.VIDEO);
          ot = (p0.isNotFullInfo() && (magicEmojiRe != null && l.p(p0, magicEmojiRe)))? t.just(Boolean.TRUE): l.u(p0.mId, p0.mChildId, p1, false).concatMap(new h(p0)).onErrorResumeNext(new g(p0));
       }
       obj = ot.subscribeOn(d.c).observeOn(d.a);
       return obj;
    }
    public MagicEmoji$MagicFace m(String p0,MagicBusinessId p1,boolean p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return l.i(p0, p1, p2);
    }
    public t n(String p0,String p1,MagicBusinessId p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.g(p0, p1, p2);
    }
    public t o(MagicEmoji$MagicFace p0,File p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t(p0, p1).map(new j(this, p1, p0));
    }
    public List p(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.m(p0);
    }
    public MagicEmoji$MagicFace q(String p0,String p1,MagicBusinessId p2,boolean p3){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, c.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return l.j(p0, p1, p2, p3);
    }
    public void r(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       l.r(p0);
       return;
    }
    public t s(SimpleMagicFace p0,MagicBusinessId p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, "29");
       if (obj != patchProxyRe) {
       }else if(p0 != null && !TextUtils.x(p0.mId)){
          obj = l.u(p0.mId, p0.mChildId, p1, true);
       }else {
          obj = t.error(l.k(p0));
       }
       return obj;
    }
    public final t t(MagicEmoji$MagicFace p0,File p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.D();
       StringBuilder str = "checkMagicResource magicFace:"+p0+" , oldFile:";
       String absolutePath = (p1 != null)? p1.getAbsolutePath(): "null";
       Object[] objArray = new Object[0];
       obj.w("MagicFaceController", str+absolutePath, objArray);
       return t.just(p0).subscribeOn(d.c).doOnNext(new g(this, p0));
    }
    public final boolean u(MagicEmoji$MagicFace p0,File p1){
       Object[] objArray;
       boolean b;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "file";
       if (p1 == null || !p1.exists()) {
          objArray = new Object[0];
          b.D().t("MagicFaceController", obj+p1+" is invalid!", objArray);
          return 0;
       }else {
          b = h0.a(p1, p0.mFileMd5CheckList);
          if (!b) {
             objArray = new Object[0];
             b.D().t("MagicFaceController", obj+p1+" check md5 failed!", objArray);
          }
          return b;
       }
    }
    public final t v(MagicEmoji$MagicFace p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.create(new e(this, p0, p1));
    }
}
