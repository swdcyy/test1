package com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH;
import zuc.a;
import android.view.View;
import zuc.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$fontImageWrapper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$fontImage$2;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$stateLayout$2;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$downloadArrow$2;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$downloadProgressBar$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.image.KwaiImageView;
import d0c.d;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Integer;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontPayload;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import w46.b;
import d0c.a;
import android.widget.FrameLayout;
import e17.i;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$a;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$b;
import java.io.File;
import com.yxcorp.gifshow.postfont.FontEnv;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Collection;
import ekd.q;
import d0c.e;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$c;
import java.lang.Runnable;

public final class RemoteFontVH extends a	// class@001446
{
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final c g;
    public static final int h;

    public void RemoteFontVH(View p0,c p1){
       a.p(p0, "itemView");
       super(p0);
       this.g = p1;
       this.b = s.c(new RemoteFontVH$fontImageWrapper$2(p0));
       this.c = s.c(new RemoteFontVH$fontImage$2(p0));
       this.d = s.c(new RemoteFontVH$stateLayout$2(p0));
       this.e = s.c(new RemoteFontVH$downloadArrow$2(p0));
       this.f = s.c(new RemoteFontVH$downloadProgressBar$2(p0));
    }
    public View a(){
       KwaiImageView obj = PatchProxy.apply(null, this, RemoteFontVH.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l();
       a.o(obj, "fontImage");
       return obj;
    }
    public void c(int p0,d p1,List p2,FontViewModel p3){
       Object this;
       boolean b;
       boolean b1;
       if (PatchProxy.isSupport(RemoteFontVH.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, RemoteFontVH.class, "8")) {
          return;
       }
       a.p(p1, "item");
       a.p(p2, "payloads");
       a.p(p3, "fontVM");
       View$OnClickListener onClickListe = null;
       this.l().setOnClickListener(onClickListe);
       if (!p2.isEmpty()) {
          FontPayload pROGRESS = FontPayload.PROGRESS;
          this = p2.get(0);
          if (this instanceof FontPayload) {
             onClickListe = this;
          }
          b = (pROGRESS == onClickListe)? true: false;
          b1 = (FontPayload.DOWNLOAD_SUCCESS_WITH_SELECT == p2.get(0))? true: false;
          Object[] objArray = new Object[0];
          a.D().s("FontBIZ", "onlyUpdateProgress: "+b+" isDownloadSelect: "+b1, objArray);
       }else {
          b1 = false;
          b = false;
       }
       if (b) {
          this.i(p1);
          return;
       }else {
          Object[] objArray1 = new Object[0];
          a.D().s("FontBIZ", p0+" bind "+p1.c()+' '+p1.l()+' '+p1.k()+' '+p1.b(), objArray1);
          this.h(p1);
          if (p1.j()) {
             this.g(p1);
             if (b1) {
                this.n(p1, true);
             }
          }else {
             FrameLayout uFrameLayout = this.m();
             a.o(uFrameLayout, "stateLayout");
             uFrameLayout.setVisibility(0);
             uFrameLayout = p1.i();
             if (uFrameLayout != -2) {
                if (uFrameLayout != -1) {
                   if (uFrameLayout != 200) {
                      this.i(p1);
                   }else {
                      p1.n(-1);
                      this.g(p1);
                   }
                }else {
                   this.f(p1, p3);
                }
             }else {
                i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
                p1.n(-1);
                this.f(p1, p3);
             }
          }
          return;
       }
    }
    public View e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RemoteFontVH remoteFontVH = RemoteFontVH.class;
       Object obj = PatchProxy.apply(null, this, remoteFontVH, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, remoteFontVH, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.b.getValue();
       }
       a.o(obj1, "fontImageWrapper");
       return obj1;
    }
    public final void f(d p0,FontViewModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RemoteFontVH.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("FontBIZ", "addDownloadListenerAndChangeState position: "+this.getAdapterPosition()+' '+p0.c(), objArray);
       ImageView imageView = this.j();
       a.o(imageView, "downloadArrow");
       imageView.setVisibility(0);
       MagicFaceDownloadProgressBar magicFaceDow = this.k();
       a.o(magicFaceDow, "downloadProgressBar");
       magicFaceDow.setVisibility(8);
       this.l().setOnClickListener(new RemoteFontVH$a(this, p0, p1));
       return;
    }
    public final void g(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RemoteFontVH.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("FontBIZ", "addSelectListenerAndChangeState position: "+this.getAdapterPosition()+' '+p0.c(), objArray);
       FrameLayout uFrameLayout = this.m();
       a.o(uFrameLayout, "stateLayout");
       uFrameLayout.setVisibility(8);
       this.l().setOnClickListener(new RemoteFontVH$b(this, p0));
       return;
    }
    public final void h(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RemoteFontVH.class, "10")) {
          return;
       }
       this.d(p0.l());
       if (p0.l()) {
          String str = p0.b();
          if (str != null) {
             this.l().v(new File(FontEnv.a(), str), -1, -1);
          }
       }else if(!q.f(p0.a())){
          List list = e.a.a(p0.a());
          if (list.isEmpty() ^ 0x01) {
             this.l().P(list);
          }
       }
       return;
    }
    public final void i(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RemoteFontVH.class, "9")) {
          return;
       }
       ImageView imageView = this.j();
       a.o(imageView, "downloadArrow");
       imageView.setVisibility(8);
       MagicFaceDownloadProgressBar magicFaceDow = this.k();
       a.o(magicFaceDow, "downloadProgressBar");
       magicFaceDow.setVisibility(0);
       magicFaceDow = this.k();
       a.o(magicFaceDow, "downloadProgressBar");
       magicFaceDow.setProgress(p0.i());
       return;
    }
    public final ImageView j(){
       Object obj = PatchProxy.apply(null, this, RemoteFontVH.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final MagicFaceDownloadProgressBar k(){
       Object obj = PatchProxy.apply(null, this, RemoteFontVH.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final KwaiImageView l(){
       Object obj = PatchProxy.apply(null, this, RemoteFontVH.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final FrameLayout m(){
       Object obj = PatchProxy.apply(null, this, RemoteFontVH.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final void n(d p0,boolean p1){
       RemoteFontVH remoteFontVH = RemoteFontVH.class;
       if (PatchProxy.isSupport(remoteFontVH) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, remoteFontVH, "12")) {
          return;
       }
       if (!p0.l()) {
          boolean b = true;
          p0.q(b);
          this.h(p0);
          if (p1) {
             this.itemView.post(new RemoteFontVH$c(this, p0));
          }else {
             RemoteFontVH tg = this.g;
             if (tg != null) {
                tg.D1(b, this.getAdapterPosition(), p0);
             }
          }
       }
       return;
    }
}
