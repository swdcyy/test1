package com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH;
import eq4.a;
import android.view.View;
import zuc.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$rectBackGround$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$fontImage$2;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$stateLayout$2;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$downloadArrow$2;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$downloadProgressBar$2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import d0c.d;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontPayload;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import d0c.a;
import e17.i;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
import android.widget.ProgressBar;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$a;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$b;
import java.util.Collection;
import ekd.q;
import d0c.e;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Boolean;
import com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$c;
import java.lang.Runnable;

public final class MoodRemoteFontVH extends a	// class@000af9
{
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final c g;
    public static final int h;

    public void MoodRemoteFontVH(View p0,c p1){
       a.p(p0, "itemView");
       super(p0);
       this.g = p1;
       this.b = s.c(new MoodRemoteFontVH$rectBackGround$2(p0));
       this.c = s.c(new MoodRemoteFontVH$fontImage$2(p0));
       this.d = s.c(new MoodRemoteFontVH$stateLayout$2(p0));
       this.e = s.c(new MoodRemoteFontVH$downloadArrow$2(p0));
       this.f = s.c(new MoodRemoteFontVH$downloadProgressBar$2(p0));
    }
    public View a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MoodRemoteFontVH moodRemoteFo = MoodRemoteFontVH.class;
       Object obj = PatchProxy.apply(null, this, moodRemoteFo, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, moodRemoteFo, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.b.getValue();
       }
       a.o(obj1, "rectBackGround");
       return obj1;
    }
    public void c(int p0,d p1,List p2,FontViewModel p3){
       Object this;
       boolean b;
       boolean b1;
       Object[] objArray;
       FrameLayout uFrameLayout;
       if (PatchProxy.isSupport(MoodRemoteFontVH.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, MoodRemoteFontVH.class, "7")) {
          return;
       }
       a.p(p1, "item");
       a.p(p2, "payloads");
       a.p(p3, "fontVM");
       View$OnClickListener onClickListe = null;
       this.k().setOnClickListener(onClickListe);
       if (!p2.isEmpty()) {
          try{
             FontPayload pROGRESS = FontPayload.PROGRESS;
             this = p2.get(0);
             if (this instanceof FontPayload) {
                onClickListe = this;
             }
             b1 = (pROGRESS == onClickListe)? true: false;
             try{
                b = (FontPayload.DOWNLOAD_SUCCESS_WITH_SELECT == p2.get(0))? true: false;
                try{
                   Object[] objArray1 = new Object[0];
                   a.D().w("MoodRemoteFontVH", "onlyUpdateProgress: "+b1+" isDownloadSelect:"+b, objArray1);
                }catch(java.lang.Exception e1){
                }
             }catch(java.lang.Exception e1){
                b = false;
             }
          }catch(java.lang.Exception e1){
             b = false;
             b1 = false;
          }
       }else {
          b = false;
          b1 = false;
       }
    }
    public final void e(d p0,FontViewModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MoodRemoteFontVH.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodRemoteFontVH", "addDownloadListenerAndChangeState position: "+this.getAdapterPosition()+' '+p0.c(), objArray);
       ImageView imageView = this.i();
       a.o(imageView, "downloadArrow");
       imageView.setVisibility(0);
       MagicFaceDownloadProgressBar magicFaceDow = this.j();
       a.o(magicFaceDow, "downloadProgressBar");
       magicFaceDow.setVisibility(8);
       this.k().setOnClickListener(new MoodRemoteFontVH$a(this, p0, p1));
       return;
    }
    public final void f(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodRemoteFontVH.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodRemoteFontVH", "addSelectListenerAndChangeState position: "+this.getAdapterPosition()+' '+p0.c(), objArray);
       FrameLayout uFrameLayout = this.l();
       a.o(uFrameLayout, "stateLayout");
       uFrameLayout.setVisibility(8);
       this.k().setOnClickListener(new MoodRemoteFontVH$b(this, p0));
       return;
    }
    public final void g(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodRemoteFontVH.class, "9")) {
          return;
       }
       boolean b = (p0.l() && p0.j())? true: false;
       this.d(b);
       if (!q.f(p0.a())) {
          List list = e.a.a(p0.a());
          if (list.isEmpty() ^ 1) {
             this.k().P(list);
          }
       }
       return;
    }
    public final void h(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodRemoteFontVH.class, "8")) {
          return;
       }
       ImageView imageView = this.i();
       a.o(imageView, "downloadArrow");
       imageView.setVisibility(8);
       MagicFaceDownloadProgressBar magicFaceDow = this.j();
       a.o(magicFaceDow, "downloadProgressBar");
       magicFaceDow.setVisibility(0);
       magicFaceDow = this.j();
       a.o(magicFaceDow, "downloadProgressBar");
       magicFaceDow.setProgress(p0.i());
       return;
    }
    public final ImageView i(){
       Object obj = PatchProxy.apply(null, this, MoodRemoteFontVH.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final MagicFaceDownloadProgressBar j(){
       Object obj = PatchProxy.apply(null, this, MoodRemoteFontVH.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final KwaiImageView k(){
       Object obj = PatchProxy.apply(null, this, MoodRemoteFontVH.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final FrameLayout l(){
       Object obj = PatchProxy.apply(null, this, MoodRemoteFontVH.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final void m(d p0,boolean p1){
       MoodRemoteFontVH moodRemoteFo = MoodRemoteFontVH.class;
       if (PatchProxy.isSupport(moodRemoteFo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, moodRemoteFo, "11")) {
          return;
       }
       if (!p0.l()) {
          Object[] objArray = new Object[0];
          a.D().w("MoodRemoteFontVH", "selectItem: "+p0, objArray);
          boolean b = true;
          p0.q(b);
          this.g(p0);
          if (p1) {
             this.itemView.post(new MoodRemoteFontVH$c(this, p0));
          }else {
             MoodRemoteFontVH tg = this.g;
             if (tg != null) {
                tg.D1(b, this.getAdapterPosition(), p0);
             }
          }
       }
       return;
    }
}
