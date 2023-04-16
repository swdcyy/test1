package eca.e;
import pn9.a;
import android.view.View;
import dzc.a;
import kotlin.Pair;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import voc.c0;
import com.yxcorp.gifshow.v3.widget.MarqueeTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.DownloadProgressBar;
import android.widget.TextView;
import lnc.a1;
import pn9.g$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import java.lang.Integer;
import android.widget.ProgressBar;
import nn9.b;
import java.util.List;
import mn9.a;
import java.util.Objects;
import eca.g;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.ImageView;
import zsd.u;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import java.lang.Throwable;
import w46.b;
import fzc.a;
import ezc.e;
import ezc.a;
import ezc.b;
import android.graphics.RectF;
import ezc.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ezc.d;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import java.lang.NullPointerException;
import eca.f;
import jd.c;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.util.PostUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import eca.d;
import java.lang.Runnable;
import ac.a;
import s0d.f;
import s0d.a;
import s0d.e;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;

public final class e extends a	// class@00210a
{
    public c0 f;
    public final MarqueeTextView g;
    public final KwaiImageView h;
    public final DownloadProgressBar i;
    public final View j;
    public final View k;
    public final TextView l;
    public final View m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final a r;
    public final boolean s;

    public void e(View p0,a p1,boolean p2,Pair p3,int p4,u p5){
       a.p(p0, "itemView");
       super(p0);
       this.r = p1;
       this.s = p2;
       this.f = new c0();
       View view = p0.findViewById(R.id.name);
       a.o(view, "itemView.findViewById\(R.id.name\)");
       this.g = view;
       view = p0.findViewById(R.id.icon);
       a.o(view, "itemView.findViewById\(R.id.icon\)");
       this.h = view;
       view = p0.findViewById(R.id.progress_bar);
       a.o(view, "itemView.findViewById\(R.id.progress_bar\)");
       this.i = view;
       view = p0.findViewById(R.id.selected_view);
       a.o(view, "itemView.findViewById\(R.id.selected_view\)");
       this.j = view;
       view = p0.findViewById(R.id.new_icon);
       a.o(view, "itemView.findViewById\(R.id.new_icon\)");
       this.k = view;
       this.l = p0.findViewById(0x7f0a2ad7);
       this.m = p0.findViewById(0x7f0a2ad9);
       this.n = a1.d(0x7f07032a);
       this.o = a1.d(0x7f070340);
       this.p = a1.e(117.00f);
       this.q = a1.e(156.00f);
    }
    public void a(g$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.a(p0);
       RecyclerView$ViewHolder titemView = this.itemView;
       String str = "itemView";
       a.o(titemView, str);
       this.f.g(titemView);
       if (this.s != null) {
          RecyclerView$ViewHolder titemView1 = this.itemView;
          a.o(titemView1, str);
          ViewGroup$LayoutParams layoutParams = titemView1.getLayoutParams();
          layoutParams.width = this.p;
          layoutParams.height = this.q;
          titemView1 = this.itemView;
          a.o(titemView1, str);
          FrameLayout uFrameLayout = titemView1.findViewById(R.id.content_view);
          a.o(uFrameLayout, "itemView.content_view");
          layoutParams = uFrameLayout.getLayoutParams();
          layoutParams.width = this.p - a1.e(4.00f);
          layoutParams.height = this.q - a1.e(4.00f);
       }
       return;
    }
    public void e(View p0,int p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, e.class, "5")) {
          return;
       }
       this.i.setProgress(p1);
       return;
    }
    public void f(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       a.p(p1, "newState");
       return;
    }
    public void g(b p0,b p1,List p2){
       int i;
       Object[] this;
       String str;
       String str1;
       float this1;
       int i1;
       e l;
       int i2;
       e uoe1;
       String str2;
       String str3;
       List cover;
       Object[] objArray1;
       Object[] objArray2;
       CDNUrl[] uCDNUrlArray2;
       Object[] objArray3;
       Object obj = this;
       Object obj1 = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "3")) {
          return;
       }
       a.p(obj1, "newState");
       a.p(p2, "payloads");
       a uoa = p1.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.ui.item.VideoTemplateUIItem");
       VideoTemplate videoTemplat = uoa.b();
       if (videoTemplat != null) {
          try{
             i = 0;
             this = new Object[i];
             str = "VideoTemplateItemHolder";
             a.D().w(str, "id="+videoTemplat.getName()+" onStateChanged "+obj1, this);
             str1 = "#";
             this1 = 0x3f800000;
             CDNUrl[] obj2 = null;
             if (PatchProxy.applyVoidOneRefs(videoTemplat, obj, e.class, "4") || a.g(videoTemplat.getId(), obj.h.getTag())) {
                i = 1;
             }else {
                e k = obj.k;
                int i4 = (videoTemplat.isNew())? 0: 8;
                k.setVisibility(i4);
                obj.h.setTag(videoTemplat.getId());
                try{
                   k = 2;
                   str1 = (u.q2(videoTemplat.getColor(), str1, i, k, obj2))? videoTemplat.getColor(): str1+videoTemplat.getColor();
                   obj.h.getHierarchy().F(new ColorDrawable(Color.parseColor(str1)));
                }catch(java.lang.IllegalArgumentException e0){
                   a.D().e(str, "update: "+videoTemplat.getName()+" style color is wrong", e0);
                }
                l = obj.s;
                e p = (l != null)? obj.p: obj.n;
                l = (l != null)? obj.q: obj.o;
                uoe1 = l;
                if (videoTemplat.getCover() != null) {
                   str2 = "null cannot be cast to non-null type kotlin.Array<T>";
                   if (obj.r != null) {
                      a[] uoaArray = new a[k];
                      b uob = new b(new RectF(0, 0x3f266666, this1, this1), 0.10f, false, 4, null);
                      uoaArray[i] = v22;
                      c uoc = new c(0, new RectF(0, 0x3f19999a, this1, this1), 0.15f, false, 9, null);
                      try{
                         i = 1;
                         uoaArray[i] = v6;
                         i2 = 0;
                         uoa = new a(new e(CollectionsKt__CollectionsKt.L(uoaArray)), obj.r, i2);
                         if (obj.s != null) {
                            cover = videoTemplat.getCover();
                            if (cover != null) {
                               CDNUrl[] uCDNUrlArray1 = new CDNUrl[i2];
                               objArray1 = cover.toArray(uCDNUrlArray1);
                               if (objArray1 != null) {
                               }else {
                                  throw new NullPointerException(str2);
                               }
                            }else {
                               uCDNUrlArray2 = null;
                            }
                            obj.h(null, p, uoe1, f.a(objArray1));
                         }else {
                            k = obj.h;
                            List cover2 = videoTemplat.getCover();
                            if (cover2 != null) {
                               obj2 = new CDNUrl[0];
                               objArray3 = cover2.toArray(obj2);
                               if (objArray3 != null) {
                               }else {
                                  throw new NullPointerException(str2);
                               }
                            }else {
                               objArray3 = null;
                            }
                            e uoe2 = k;
                            List list = f.a(objArray3);
                            e uoe3 = p;
                            e uoe4 = uoe1;
                            try{
                               a uoa1 = uoa;
                               uoe2.Q(list, uoe3, uoe4, uoa1, null, null);
                            }catch(java.lang.Exception e0){
                            }
                         }
                      }catch(java.lang.Exception e0){
                         str3 = str2;
                         i1 = uoe1;
                      }
                   }else {
                      str3 = str2;
                      k = uoe1;
                      i = 1;
                      i2 = 0;
                      if (obj.s != null) {
                         cover = videoTemplat.getCover();
                         if (cover != null) {
                            obj2 = new CDNUrl[i2];
                            objArray1 = cover.toArray(obj2);
                            Objects.requireNonNull(objArray1, str3);
                         }else {
                            uCDNUrlArray2 = new CDNUrl[i2];
                         }
                         obj.h(null, p, k, f.a(objArray1));
                      }else {
                         l = obj.h;
                         List cover1 = videoTemplat.getCover();
                         if (cover1 != null) {
                            CDNUrl[] uCDNUrlArray = new CDNUrl[i2];
                            objArray2 = cover1.toArray(uCDNUrlArray);
                            Objects.requireNonNull(objArray2, str3);
                         }else {
                            obj2 = new CDNUrl[i2];
                         }
                         l.W(objArray2, p, k, null);
                      }
                   }
                }else {
                   i = 1;
                   obj.h.setActualImageResource(0);
                }
             }
          }catch(java.lang.Exception e0){
             str3 = str2;
             i1 = uoe1;
             i = 1;
          }
          i1 = 17;
          if (obj.s != null) {
             l = obj.l;
             if (l != null) {
                l.setGravity(i1);
                i1 = 7;
                str1 = ((videoTemplat.getName()).length() <= i1)? videoTemplat.getName(): TextUtils.A(videoTemplat.getName(), i1)+"...";
                obj.l.setText(str1);
                i2 = 0;
                obj.l.setVisibility(i2);
                l = obj.m;
                if (l != null) {
                   l.setVisibility(i2);
                }
                obj.g.setVisibility(8);
             }else {
             label_029b :
                obj.g.setVisibility(0);
                l = obj.l;
                if (l != null) {
                   l.setVisibility(8);
                }
                obj.g.setGravity(i1);
                obj.g.setText(videoTemplat.getName());
                if (!p1.d()) {
                   obj.g.s();
                }
             }
          }else {
             goto label_029b ;
          }
          if (p1.i()) {
             if (!PatchProxy.applyVoid(null, obj, e.class, "6")) {
                int i3 = 4;
                if (obj.i.getVisibility() != i3 && obj.i.getVisibility()) {
                   obj.i.setVisibility(i3);
                   Object[] objArray = new Object[0];
                   a.D().s(str, "showProgressBarLaterIfNeed: ", objArray);
                   obj.i.postDelayed(new d(obj), 260);
                }
             }
             e uoe = null;
          }else {
             obj.i.setVisibility(8);
          }
          if (p0 != null && p0.d() == p1.d()) {
             i = 0;
          }
          if (i) {
             if (p1.d()) {
                obj.f.b(obj.j);
             }else {
                obj.f.a(obj.j);
             }
          }else {
             obj.f.d();
             l = obj.j;
             if (!p1.d()) {
                this1 = 0;
             }
             l.setAlpha(this1);
          }
       }
       return;
    }
    public final void h(a p0,int p1,int p2,List p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(null, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, e.class, "7")) {
          return;
       }
       a uoa = null;
       if (p3.isEmpty()) {
          this.h.setController(uoa);
          return;
       }else {
          f uof = f.x();
          f uof1 = uof.u(p3).o(p1, p2);
          uof1.y(false);
          uof1.l(uoa);
          d uod = this.h.g0(uoa, uoa, uof.w());
          if (uod != null) {
             uod.q(true);
          }
          e th = this.h;
          if (uod != null) {
             uoa = uod.e();
          }
          th.setController(uoa);
          return;
       }
    }
}
