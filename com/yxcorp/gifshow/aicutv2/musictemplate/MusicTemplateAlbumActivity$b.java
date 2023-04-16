package com.yxcorp.gifshow.aicutv2.musictemplate.MusicTemplateAlbumActivity$b;
import i69.h;
import com.yxcorp.gifshow.aicutv2.musictemplate.MusicTemplateAlbumActivity;
import java.lang.Object;
import brd.v;
import i69.g;
import android.graphics.Bitmap;
import java.lang.String;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.aicut.logic.b;
import s69.i;
import u69.d;
import i69.d;
import j69.a;
import j69.c;
import android.app.Activity;
import java.lang.Integer;
import java.util.Objects;
import w46.b;
import u69.a;
import kzc.d;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import u69.b;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import u69.c;
import com.kwai.library.widget.popup.common.c;

public final class MusicTemplateAlbumActivity$b implements h	// class@0019b0
{
    public final MusicTemplateAlbumActivity a;

    public void MusicTemplateAlbumActivity$b(MusicTemplateAlbumActivity p0){
       this.a = p0;
       super();
    }
    public void a(v p0){
       g.l(this, p0);
    }
    public void b(Bitmap p0){
       g.c(this, p0);
    }
    public void c(){
       g.a(this);
    }
    public void d(String p0,int p1){
       g.k(this, p0, p1);
    }
    public void e(String p0,AICutErrorCode p1){
       g.h(this, p0, p1);
    }
    public void f(AICutErrorCode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicTemplateAlbumActivity$b.class, "3")) {
          return;
       }
       a.p(p0, "error");
       Object[] objArray = new Object[0];
       g.D().w("MusicTemplateAlbumActivity", "onEnd\(\) called with: error = ["+p0+']', objArray);
       if (p0 == AICutErrorCode.CANCEL_BY_USER) {
          return;
       }
       MusicTemplateAlbumActivity s = this.a.S;
       if (s != null) {
          s.b();
       }
       i.a.i(p0);
       if (p0 == AICutErrorCode.NO_ERROR || p0 == AICutErrorCode.NOT_USE_PRESELECT) {
          d d = d.d;
          Bitmap uBitmap = d.a().c().k2();
          uBitmap = (uBitmap != null)? Bitmap.createBitmap(uBitmap): null;
          d.a().c().f2();
          d.a().c().l2(uBitmap, this.a);
       }else {
          MusicTemplateAlbumActivity r = this.a.R;
          if (r != null) {
             r.f(2);
          }
       }
       return;
    }
    public void g(int p0){
       MusicTemplateAlbumActivity$b uob = MusicTemplateAlbumActivity$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       MusicTemplateAlbumActivity s = this.a.S;
       if (s != null) {
          s.c(p0);
       }
       return;
    }
    public void h(String p0){
       g.f(this, p0);
    }
    public void i(String p0,String p1){
       g.g(this, p0, p1);
    }
    public void j(){
       g.i(this);
    }
    public void onFrameResult(Bitmap p0){
       g.d(this, p0);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicTemplateAlbumActivity$b.class, "1")) {
          return;
       }
       MusicTemplateAlbumActivity$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, MusicTemplateAlbumActivity.class, "9")) {
          int i = 0;
          if (ta.R != null) {
             objArray = new Object[i];
             g.D().t("MusicTemplateAlbumActivity", "showLoadingView: mLoadingView is not null", objArray);
          }else {
             d uod = new d();
             ta.R = uod;
             a uoa = new a(ta);
             if (!PatchProxy.applyVoidOneRefs(uoa, uod, d.class, "3")) {
                a.p(uoa, "callback");
                uod.d = uoa;
             }
             d uod1 = new d(ta);
             uod1.x(i);
             uod1.A(i);
             uod1.z(1);
             uod1.L(uod);
             uod1.G(b.a);
             uod1.O(c.a);
             uod1.X();
          }
       }
       MusicTemplateAlbumActivity r = this.a.R;
       if (r != null) {
          r.f(1);
       }
       r = this.a.S;
       if (r != null) {
          r.a();
       }
       return;
    }
}
