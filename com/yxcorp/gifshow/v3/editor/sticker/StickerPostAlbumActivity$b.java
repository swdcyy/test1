package com.yxcorp.gifshow.v3.editor.sticker.StickerPostAlbumActivity$b;
import w69.k0;
import com.yxcorp.gifshow.v3.editor.sticker.StickerPostAlbumActivity;
import java.lang.Object;
import w69.j0;
import java.util.List;
import java.lang.String;
import jlb.b;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o79.q;
import tkd.b;
import tkd.d;
import om6.j;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import om6.k;
import java.util.Objects;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.widget.Button;
import itc.d3;
import android.view.View$OnClickListener;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import brd.t;
import dc7.e;
import dc7.d;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo;
import com.yxcorp.gifshow.v3.editor.sticker.StickerPostAlbumActivity$b$a;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$a;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;

public final class StickerPostAlbumActivity$b implements k0	// class@00120b
{
    public final StickerPostAlbumActivity a;

    public void StickerPostAlbumActivity$b(StickerPostAlbumActivity p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return j0.c(this);
    }
    public void b(List p0,boolean p1,String p2,String p3,String p4){
       j0.d(this, p0, p1, p2, p3, p4);
    }
    public void c(){
       j0.g(this);
    }
    public void d(boolean p0){
       j0.h(this, p0);
    }
    public void e(b p0){
       j0.a(this, p0);
    }
    public void f(List p0,Activity p1){
       AttrAnimProgressFragment q;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerPostAlbumActivity$b.class, "1")) {
          return;
       }
       a.p(p0, "selectedList");
       p1.V = q.f(p0);
       StickerPostAlbumActivity$b ta = this.a;
       if (ta.U != null) {
          StickerPostAlbumActivity$b ta1 = this.a;
          d.a(0x2538349d).fv(ta1, ta1.V, ta1.I3(), this.a.R, "", "", Boolean.FALSE, false);
       }else {
          Objects.requireNonNull(ta);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, ta, StickerPostAlbumActivity.class, "7")) {
             StickerPostAlbumActivity w = ta.W;
             Objects.requireNonNull(w);
             if (PatchProxy.isSupport(AttrAnimProgressFragment.class) && PatchProxy.applyOneRefs(Integer.valueOf(0x7f1004b4), w, AttrAnimProgressFragment.class, "4") != PatchProxyResult.class) {
             }else {
                w.u = objArray;
                w.v = 0x7f1004b4;
                q = w.q;
                if (q != null) {
                   q.setText(R.string.cancel);
                }
             }
             ta.W.th(new d3(ta));
             ta.W.show(ta.getSupportFragmentManager(), "StickerPostAlbumActivity");
          }
       }
       return;
    }
    public void g(boolean p0){
       j0.b(this, p0);
    }
    public void h(t p0){
       d.a(this, p0);
    }
    public void i(QMedia p0,String p1){
       j0.f(this, p0, p1);
    }
    public void j(){
       j0.e(this);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, StickerPostAlbumActivity$b.class, "2")) {
          return;
       }
       EditStickerRepo.b(new EditStickerRepo(), new StickerPostAlbumActivity$b$a(this), null, false, 6, null);
       return;
    }
    public void l(boolean p0,boolean p1){
       j0.i(this, p0, p1);
    }
    public void m(boolean p0){
       j0.k(this, p0);
    }
}
