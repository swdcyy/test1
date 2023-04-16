package com.yxcorp.gifshow.fragment.user.l;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import m8c.e;
import com.yxcorp.gifshow.fragment.user.l$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.io.File;
import k8c.a;
import q87.c;
import com.yxcorp.gifshow.album.LocalAlbumParams;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.CharSequence;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import oa0.a;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import lnc.x6;
import lnc.y6;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.record.album.utils.LocalAlbumBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.fragment.user.j;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.fragment.user.k;
import android.view.View$OnClickListener;
import ika.i;
import brd.t;
import t45.d;
import brd.z;
import ika.k;
import erd.o;
import ika.j;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.record.album.model.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.gifshow.fragment.user.l$a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;
import com.yxcorp.gifshow.record.album.model.c;
import com.yxcorp.gifshow.publish.ShareProject;
import com.yxcorp.gifshow.model.j;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;

public class l extends RecyclerView$ViewHolder	// class@00128d
{
    public View a;
    public KwaiImageView b;
    public ImageView c;
    public ImageView d;
    public TextView e;
    public TextView f;
    public ImageView g;
    public View h;
    public int i;
    public LocalAlbumParams j;
    public l$b k;
    public TextView l;
    public boolean m;
    public static final int n;

    public void l(boolean p0,View p1){
       super(p1);
       this.m = false;
       this.m = p0;
       this.a = p1;
       this.b = p1.findViewById(0x7f0a300b);
       this.c = p1.findViewById(0x7f0a136c);
       this.d = p1.findViewById(0x7f0a002e);
       this.e = p1.findViewById(0x7f0a06cf);
       this.f = p1.findViewById(0x7f0a2bdb);
       this.g = p1.findViewById(0x7f0a2ee7);
       this.h = p1.findViewById(0x7f0a09ea);
       this.l = p1.findViewById(0x7f0a095d);
    }
    public void a(e p0,boolean p1,boolean p2,l$b p3,int p4){
       long l;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ol, "1")) {
             return;
          }
       }
       this.k = p3;
       this.b.setPlaceHolderImage(R.drawable.arg_RES_7f081aca);
       File coverFile = p0.getCoverFile();
       if (coverFile != null && coverFile.exists()) {
          this.e(this.b, coverFile.getAbsolutePath());
       }else if(p0.j() != null && p0.j().exists()){
          Object[] objArray1 = new Object[0];
          a.D().w("LocalAlbumHolder", "firstAssetFile instead of coverFile", objArray1);
          this.e(this.b, p0.j().getAbsolutePath());
       }
       this.d(p1, p2);
       this.d.setVisibility(8);
       this.f(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, ol, "6")) {
          this.f.setVisibility(8);
          if (this.j.isNeedShowModifyTime()) {
             l = p0.i();
             if (DateUtils.H(l)) {
                this.f.setText(DateUtils.i(l));
             }else if(DateUtils.F(l)){
                this.f.setText(DateUtils.h(l, null));
             }else {
                String str = "yyyy ";
                _monitor_enter(str);
                _monitor_exit(str);
                this.f.setText(DateUtils.n("yyyy ").format(new Date(l)));
             }
             this.f.setVisibility(0);
          }
       }
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p4), this, l.class, "7")) {
          if (this.j.isNeedShowOptionButton() && !p1) {
             if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p4), this, ol, "8")) {
                GifshowActivity gifshowActiv = this.b();
                if (gifshowActiv != null && (!p4 && (!a.V() && !y6.r(RecordPostPlugin.class).B8(gifshowActiv)))) {
                   b uob = new b(LocalAlbumBubbleItem.SAVE_TO_ALBUM);
                   uob.b(this.g);
                   uob.k(j.a);
                   PostBubbleManager.e(gifshowActiv).n(uob);
                }
             }
          label_014e :
             this.g.setVisibility(0);
             this.g.setOnClickListener(new k(this, p0));
          }else {
             this.g.setVisibility(8);
          }
       }
       this.a.setOnClickListener(new i(this, p3, p4, p0));
       if (this.m != null) {
          t.just(Integer.valueOf(1)).subscribeOn(d.c).map(new k(p0)).observeOn(d.a).subscribe(new j(this));
       }
       return;
    }
    public Activity b(){
       Object obj = PatchProxy.apply(null, this, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return n.d(this.itemView);
    }
    public final String c(e p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof d) {
          Workspace workspace = p0.k().v();
          if (workspace != null) {
             str = "task_id="+workspace.getTaskId();
          label_0039 :
             return str;
          }
       }
       str = "";
       goto label_0039 ;
    }
    public void d(boolean p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ol, "3")) {
          return;
       }
       int i = 4;
       if (!p0) {
          this.h.setVisibility(8);
          this.e.setVisibility(i);
          return;
       }else if(p1){
          this.h.setVisibility(0);
          this.e.setBackgroundResource(R.drawable.arg_RES_7f0815b3);
          this.e.setText("");
          this.e.setVisibility(0);
       }else {
          this.h.setVisibility(8);
          this.e.setVisibility(i);
       }
       return;
    }
    public final void e(KwaiImageView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "2")) {
          return;
       }
       Uri uri = (p1.startsWith("http") || p1.startsWith("file"))? w0.f(p1): w0.c(new File(p1));
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(uri);
       l ti = this.i;
       if (ti > null) {
          imageRequest.v(new d(ti, ti));
       }
       d uod = Fresco.newDraweeControllerBuilder();
       uod.w(imageRequest.a());
       AbstractDraweeController uAbstractDra = uod.e();
       if (!uAbstractDra.a(p0.getController())) {
          p0.setController(uAbstractDra);
       }
       return;
    }
    public void f(e p0){
       boolean b;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "4")) {
          return;
       }
       if (!this.j.isNeedShowTypeIcon()) {
          this.c.setVisibility(8);
          return;
       }else {
          int i = l$a.a[p0.getType().ordinal()];
          int i1 = 1;
          if (i != i1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4 && i != 5) {
                      this.c.setVisibility(8);
                      if (p0 instanceof c) {
                         ShareProject shareProject = p0.k();
                         Object obj = PatchProxy.applyOneRefs(shareProject, this, ol, "5");
                         if (obj != PatchProxyResult.class) {
                            b = obj.booleanValue();
                         }else if(shareProject instanceof j && shareProject.j() == null){
                            i1 = 0;
                         }
                         b = i1;
                         if (b) {
                            this.d.setVisibility(0);
                         }
                      }
                   }else {
                      this.c.setVisibility(0);
                      this.c.setImageResource(R.drawable.arg_RES_7f080dc3);
                   }
                }else {
                   this.c.setVisibility(0);
                   this.c.setImageResource(R.drawable.arg_RES_7f080dc0);
                }
             }else {
                this.c.setVisibility(0);
                this.c.setImageResource(R.drawable.arg_RES_7f080dbb);
             }
          }else {
             this.c.setVisibility(0);
             this.c.setImageResource(R.drawable.arg_RES_7f080dc1);
          }
          return;
       }
    }
}
