package com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import gvc.a$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$imageIcon$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$stateLayout$2;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$downloadArrow$2;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$downloadProgressBar$2;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$indicator$2;
import ypc.a;
import huc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$b;
import java.util.List;
import java.lang.Integer;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.graphics.drawable.Drawable;
import lnc.a1;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.text.dynamic.util.TextDownloadPayload;
import java.lang.Throwable;
import lnc.i1;
import nuc.a;
import ekd.q;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import w46.b;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$c;
import java.lang.Runnable;
import android.content.Context;
import java.util.Objects;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditOperationPackage;
import k2b.u1;

public final class TextTemplateBaseVH extends RecyclerView$ViewHolder	// class@0014e4
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public int f;
    public final a$a g;
    public final boolean h;
    public final boolean i;
    public static final int j;

    public void TextTemplateBaseVH(View p0,a$a p1,boolean p2,boolean p3){
       a.p(p0, "itemView");
       super(p0);
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.a = s.c(new TextTemplateBaseVH$imageIcon$2(p0));
       this.b = s.c(new TextTemplateBaseVH$stateLayout$2(p0));
       this.c = s.c(new TextTemplateBaseVH$downloadArrow$2(p0));
       this.d = s.c(new TextTemplateBaseVH$downloadProgressBar$2(p0));
       this.e = s.c(new TextTemplateBaseVH$indicator$2(p0));
    }
    public final void a(a p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextTemplateBaseVH.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextTemplateViewHolder", "addDownloadListenerAndChangeState position: "+this.getAdapterPosition()+' '+p0.b(), objArray);
       ImageView imageView = this.e();
       a.o(imageView, "downloadArrow");
       imageView.setVisibility(0);
       MagicFaceDownloadProgressBar magicFaceDow = this.f();
       a.o(magicFaceDow, "downloadProgressBar");
       magicFaceDow.setVisibility(8);
       this.g().setOnClickListener(new TextTemplateBaseVH$a(this, p0, p1));
       return;
    }
    public final void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateBaseVH.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextTemplateViewHolder", "addSelectListenerAndChangeState position: "+this.getAdapterPosition()+' '+p0.b(), objArray);
       FrameLayout uFrameLayout = this.i();
       a.o(uFrameLayout, "stateLayout");
       uFrameLayout.setVisibility(8);
       this.g().setOnClickListener(new TextTemplateBaseVH$b(this, p0));
       return;
    }
    public final void c(int p0,a p1,List p2,b p3){
       KwaiImageView kwaiImageVie;
       boolean b;
       boolean b1;
       List list;
       KwaiImageView kwaiImageVie2;
       TextTemplateBaseVH textTemplate = TextTemplateBaseVH.class;
       if (PatchProxy.isSupport(textTemplate) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, TextTemplateBaseVH.class, "6")) {
          return;
       }
       a.p(p1, "item");
       a.p(p2, "payloads");
       a.p(p3, "vmDelegate");
       if (PostExperimentUtils.t1() && this.i != null) {
          if (this.h != null) {
             kwaiImageVie = this.h();
             a.o(kwaiImageVie, "indicator");
             kwaiImageVie.setBackground(a1.f(R.drawable.arg_RES_7f080892));
             kwaiImageVie = this.g();
             a.o(kwaiImageVie, "imageIcon");
             kwaiImageVie.setBackground(a1.f(R.drawable.arg_RES_7f0823fb));
          }else {
             kwaiImageVie = this.h();
             a.o(kwaiImageVie, "indicator");
             kwaiImageVie.setBackground(a1.f(R.drawable.arg_RES_7f080895));
             kwaiImageVie = this.g();
             a.o(kwaiImageVie, "imageIcon");
             kwaiImageVie.setBackground(a1.f(R.drawable.arg_RES_7f0823fe));
          }
       }
       View$OnClickListener onClickListe = null;
       this.g().setOnClickListener(onClickListe);
       if (p2.isEmpty() ^ 1) {
          TextDownloadPayload pROGRESS = TextDownloadPayload.PROGRESS;
          Object obj = p2.get((p2.size() - 1));
          if (obj instanceof TextDownloadPayload) {
             onClickListe = obj;
          }
          b = (pROGRESS == onClickListe)? true: false;
          b1 = (TextDownloadPayload.DOWNLOAD_SUCCESS_WITH_SELECT == p2.get((p2.size() - 1)))? true: false;
          Object[] objArray = new Object[0];
          a.D().s("TextTemplateViewHolder", "onlyUpdateProgress: "+b+" isDownloadSelect: "+b1, objArray);
       }else {
          b1 = false;
          b = false;
       }
       if (b) {
          this.d(p1);
          return;
       }else if(PatchProxy.applyVoidOneRefs(p1, this, textTemplate, "7")){
          if (p1.t()) {
             kwaiImageVie2 = this.h();
             a.o(kwaiImageVie2, "indicator");
             kwaiImageVie2.setVisibility(0);
          }else {
             kwaiImageVie2 = this.h();
             a.o(kwaiImageVie2, "indicator");
             kwaiImageVie2.setVisibility(8);
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().s("TextTemplateViewHolder", p0+" bind "+p1.b()+" isSelected = "+p1.t(), objArray1);
       if (p1.s()) {
          if (PostExperimentUtils.t1() && (this.i != null && !q.f(p1.l().b()))) {
             KwaiImageView kwaiImageVie1 = this.g();
             a.o(kwaiImageVie1, "imageIcon");
             a hierarchy = kwaiImageVie1.getHierarchy();
             a.o(hierarchy, "imageIcon.hierarchy");
             hierarchy.u(t$b.e);
             list = p1.l().b();
             a.m(list);
             this.g().P(list);
          }else if(!q.f(p1.l().a())){
             list = p1.l().a();
             a.m(list);
             this.g().P(list);
          }else {
             this.g().P(p1.n());
          }
       }else if(a.g(p1.b(), "shadow_01")){
          if (PostExperimentUtils.t1() && this.i != null) {
             this.g().setImageResource(R.drawable.arg_RES_7f081f96);
          }else {
             this.g().setImageResource(R.drawable.arg_RES_7f081f97);
          }
       }else {
          this.g().setImageResource(p1.o());
       }
       if (p1.isAvailable()) {
          this.f = 0;
          this.b(p1);
          if (b1) {
             this.j(p1, 1);
          }
       }else {
          FrameLayout uFrameLayout = this.i();
          a.o(uFrameLayout, "stateLayout");
          uFrameLayout.setVisibility(0);
          uFrameLayout = p1.g();
          if (uFrameLayout != -2) {
             if (uFrameLayout != -1) {
                if (uFrameLayout != 200) {
                   this.d(p1);
                }else {
                   this.f = 0;
                   this.b(p1);
                }
             }else {
                this.f = 0;
                this.a(p1, p3);
             }
          }else {
             this.f = 0;
             Object[] objArray2 = new Object[0];
             a.D().t("TextTemplateViewHolder", "download fail", objArray2);
             i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
             this.a(p1, p3);
          }
       }
       return;
    }
    public final void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateBaseVH.class, "8")) {
          return;
       }
       ImageView imageView = this.e();
       a.o(imageView, "downloadArrow");
       imageView.setVisibility(8);
       MagicFaceDownloadProgressBar magicFaceDow = this.f();
       String str = "downloadProgressBar";
       a.o(magicFaceDow, str);
       magicFaceDow.setVisibility(0);
       if (this.f <= p0.g()) {
          magicFaceDow = this.f();
          a.o(magicFaceDow, str);
          magicFaceDow.setProgress(p0.g());
          this.f = p0.g();
       }
       return;
    }
    public final ImageView e(){
       Object obj = PatchProxy.apply(null, this, TextTemplateBaseVH.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final MagicFaceDownloadProgressBar f(){
       Object obj = PatchProxy.apply(null, this, TextTemplateBaseVH.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final KwaiImageView g(){
       Object obj = PatchProxy.apply(null, this, TextTemplateBaseVH.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final KwaiImageView h(){
       Object obj = PatchProxy.apply(null, this, TextTemplateBaseVH.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final FrameLayout i(){
       Object obj = PatchProxy.apply(null, this, TextTemplateBaseVH.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void j(a p0,boolean p1){
       TextTemplateBaseVH textTemplate = TextTemplateBaseVH.class;
       if (PatchProxy.isSupport(textTemplate) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, textTemplate, "10")) {
          return;
       }
       String str = "itemView";
       if (p1) {
          this.itemView.post(new TextTemplateBaseVH$c(this, p0));
       }else {
          TextTemplateBaseVH tg = this.g;
          if (tg != null) {
             RecyclerView$ViewHolder titemView1 = this.itemView;
             a.o(titemView1, str);
             tg.a(titemView1, p0, this.getAdapterPosition());
          }
       }
       RecyclerView$ViewHolder titemView = this.itemView;
       a.o(titemView, str);
       Context context = titemView.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       if (!PatchProxy.applyVoidTwoRefs(context, p0, this, textTemplate, "11")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RECORD_VIDEO_EDIT_OPERATION";
          uElementPack.name = "select_text";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$VideoEditOperationPackage videoEditOpe = new ClientContent$VideoEditOperationPackage();
          videoEditOpe.type = 10;
          videoEditOpe.subType = "EDIT_HIGH_TEXT";
          videoEditOpe.name = p0.b();
          uContentPack.videoEditOperationPackage = videoEditOpe;
          u1.L("", context, 1, uElementPack, uContentPack);
       }
       return;
    }
}
