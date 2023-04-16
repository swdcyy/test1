package com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import ixb.y;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$d;
import com.yxcorp.gifshow.photo.download.widget.k;
import crd.a;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$a;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.util.Map;
import com.yxcorp.gifshow.entity.QPhoto;
import java.io.File;
import k2b.e0;
import kxb.e;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicButton;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import android.widget.Button;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import lxb.l;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import android.widget.ImageView;
import com.kwai.library.widget.viewpager.indicator.CircleIndicator;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import lxb.h;
import android.content.DialogInterface$OnCancelListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import android.content.DialogInterface;
import java.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$j;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import java.util.HashMap;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$g;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$i;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import android.view.ViewGroup$LayoutParams;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kxb.a;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ekd.q;
import ekd.j;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$c;
import h3.a;
import androidx.viewpager.widget.ViewPager$i;
import androidx.fragment.app.Fragment;
import android.graphics.Typeface;
import ekd.d0;
import fxb.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.photo.download.widget.l;
import lxb.n;
import erd.o;
import java.lang.Iterable;
import com.yxcorp.gifshow.photo.download.widget.j;
import com.yxcorp.gifshow.photo.download.widget.i;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.photo.download.utils.e;
import com.yxcorp.gifshow.photo.download.widget.m;
import exb.b;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.yxcorp.gifshow.photo.download.task.a0;
import lxb.m;
import lxb.i;
import java.util.concurrent.Callable;
import java.lang.Math;
import lxb.o;
import java.lang.Runnable;
import ekd.k1;
import lxb.p;
import java.lang.Boolean;

public class DownloadPicDialog extends BaseDialogFragment implements y, d	// class@000f38
{
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public ImageMeta$AtlasCoverSize[] J;
    public List K;
    public Map L;
    public List M;
    public a N;
    public ClientContent$PhotoPackage O;
    public ClientContent$AtlasPackage P;
    public String Q;
    public ViewPager$i R;
    public DownloadPicDialog$i S;
    public View p;
    public TextView q;
    public TextView r;
    public ViewPager s;
    public ImageView t;
    public DownloadPicButton u;
    public CircleIndicator v;
    public View w;
    public BaseFeed x;
    public DownloadPhotoInfoResponse y;
    public GifshowActivity z;
    public static String T = "DownloadPicDialog";
    public static DownloadPicDialog$d U;

    static {
       DownloadPicDialog.U = new DownloadPicDialog$d(null);
    }
    public void DownloadPicDialog(){
       super();
       this.D = 1;
       this.G = 1;
       this.I = false;
       this.N = new a();
       this.R = new DownloadPicDialog$a(this);
       this.S = new DownloadPicDialog$b(this);
    }
    public boolean Ah(int p0){
       boolean b = (this.A == null && p0 == 2)? true: false;
       return b;
    }
    public float Bh(){
       Object obj = PatchProxy.apply(null, this, DownloadPicDialog.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       int i = 0;
       DownloadPicDialog tE = this.E;
       int i1 = tE + 1;
       while (i1 <= this.B) {
          if (this.L.containsKey(Integer.valueOf(i1)) && this.L.get(Integer.valueOf(i1)).intValue() == 100) {
             i = i + 1;
          }
       }
       return ((float)i / (float)this.C);
    }
    public void Ch(QPhoto p0,int p1,File p2){
       DownloadPicDialog uDownloadPic = this;
       if (PatchProxy.isSupport(DownloadPicDialog.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, DownloadPicDialog.class, "26")) {
          return;
       }
       DownloadPicDialog q = uDownloadPic.Q;
       if (q == null) {
          q = "";
       }
       DownloadPicDialog uDownloadPic1 = q;
       this.vh();
       if (p1 == (uDownloadPic.C - 1)) {
          if (uDownloadPic.H != null) {
             int i = (this.zh())? 8: 7;
             e.l(p0, p2, 0, i, false, null, uDownloadPic.G, null, uDownloadPic1, uDownloadPic.C, uDownloadPic.z);
          }
          uDownloadPic.H = false;
       }
       return;
    }
    public void Dh(int p0){
       if (PatchProxy.isSupport(DownloadPicDialog.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DownloadPicDialog.class, "19")) {
          return;
       }
       this.u.setDownloadPicProgress(0);
       this.u.setText((a.B.getString(R.string.arg_RES_7f100aa1)).replace("%1$s", "100"));
       t.timer(200, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new l(this, p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicDialog.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0785);
       this.q = m1.f(p0, 0x7f0a3f2c);
       this.r = m1.f(p0, 0x7f0a2f66);
       this.s = m1.f(p0, 0x7f0a308e);
       this.t = m1.f(p0, 0x7f0a308a);
       this.u = m1.f(p0, 0x7f0a0c09);
       this.v = m1.f(p0, 0x7f0a2f6d);
       return;
    }
    public boolean isCanceled(){
       return this.I;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicDialog.class, "13")) {
          return;
       }
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       Window window = (dialog == null)? null: dialog.getWindow();
       if (window != null) {
          window.setLayout(-1, -2);
          window.setGravity(17);
       }
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f1103bf);
          window.setGravity(81);
          window.setBackgroundDrawable(new ColorDrawable(0));
          window.setDimAmount(0.30f);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadPicDialog.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(true);
       this.setStyle(true, R.style.arg_RES_7f110362);
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCanceledOnTouchOutside(true);
       this.oh(new h(this));
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DownloadPicDialog.class, "14");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d031e, p1, false);
       this.w = view;
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, DownloadPicDialog.class, "5")) {
          return;
       }
       super.onDestroyView();
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicDialog.class, "6")) {
          return;
       }
       super.onDismiss(p0);
       DownloadPicDialog$d u = DownloadPicDialog.U;
       Objects.requireNonNull(u);
       if (!PatchProxy.applyVoid(null, u, DownloadPicDialog$d.class, "2")) {
          u.c = false;
          u.d = null;
          if (!u.a.isEmpty()) {
             DownloadPicDialog$d a = u.a;
             _monitor_enter(a);
             Iterator iterator = u.a.values().iterator();
             while (iterator.hasNext()) {
                Map map = iterator.next();
                if (map == null) {
                }else {
                   Iterator iterator1 = map.values().iterator();
                   while (iterator1.hasNext()) {
                      iterator1.next().b = null;
                   }
                }
             }
             _monitor_exit(a);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       DownloadPicDialog$e uoe;
       DownloadPicDialog uDownloadPic;
       String id;
       DownloadPicDialog$d uod3;
       Map map;
       HashMap obj;
       int i = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, i, DownloadPicDialog.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       String str = "3";
       View view = 1;
       if (!PatchProxy.applyVoid(null, i, DownloadPicDialog.class, str)) {
          i.F = n.c(a.b(), 211.00f);
          i.J = r1.n0(i.x);
          i.O = w1.f(i.x);
          ClientContent$AtlasPackage uAtlasPackag = new ClientContent$AtlasPackage();
          i.P = uAtlasPackag;
          int i6 = (i.A != null)? 1: 2;
          uAtlasPackag.type = i6;
          DownloadPicDialog$d u = DownloadPicDialog.U;
          id = i.x.getId();
          uDownloadPic = i.C;
          DownloadPicDialog b = i.B;
          DownloadPicDialog s = i.S;
          Objects.requireNonNull(u);
          DownloadPicDialog$d uod2 = DownloadPicDialog$d.class;
          if (PatchProxy.isSupport(uod2)) {
             uod3 = uod2;
             map = PatchProxy.applyFourRefs(id, Integer.valueOf(uDownloadPic), Integer.valueOf(b), s, u, DownloadPicDialog$d.class, "5");
             if (map != PatchProxyResult.class) {
             }else {
             label_0089 :
                u.d = s;
                u.c = view;
                map = u.b.get(id);
                Map map1 = u.a.get(id);
                if (map1 != null) {
                   Iterator iterator = map1.values().iterator();
                   int i8 = 0;
                   uod2 = 1;
                   while (iterator.hasNext()) {
                      obj = iterator.next();
                      if (obj.c != null) {
                         i8 = 1;
                      }
                      if (!obj.d()) {
                         uod2 = 0;
                      }
                   }
                   if (i8 && uod2) {
                      map = null;
                   }
                }
                if (map == null) {
                   obj = new HashMap(uDownloadPic);
                   for (int i9 = 1; i9 <= b; i9 = i9 + 1) {
                      obj.put(Integer.valueOf(i9), Integer.valueOf(0));
                   }
                   u.b.put(id, obj);
                   map = obj;
                }
                if (!PatchProxy.applyVoidTwoRefs(id, s, u, uod3, str)) {
                   Map map2 = u.a.get(id);
                   if (map2 != null) {
                      Iterator iterator1 = map2.values().iterator();
                      while (iterator1.hasNext()) {
                         DownloadPicDialog$j oj = iterator1.next();
                         if (oj.d()) {
                            continue ;
                         }
                         oj.b = s.a(oj.a);
                      }
                   }
                }
             }
          }else {
             uod3 = uod2;
             goto label_0089 ;
          }
          i.L = map;
          int i7 = (i.y.mNotNeedWaterMark == null)? 1: 3;
          i.G = i7;
       }
       if (!PatchProxy.applyVoid(null, i, DownloadPicDialog.class, "33")) {
          ViewGroup$LayoutParams layoutParams = i.s.getLayoutParams();
          layoutParams.width = n.z(i.z);
          layoutParams.height = n.z(i.z);
          i.s.setLayoutParams(layoutParams);
          int i1 = 1;
          i.s.setOffscreenPageLimit(i1);
          i.K = new ArrayList();
          int i2 = 0;
          while (i2 < i.B) {
             int i3 = 5;
             if (i2 == i1 && i.A == null) {
                view = a.c(i.z, R.layout.arg_RES_7f0d031a, null);
                if (!PatchProxy.applyVoidOneRefs(view, i, DownloadPicDialog.class, "36")) {
                   View view1 = view.findViewById(0x7f0a0c18);
                   DownloadPicDialog$e uoe1 = new DownloadPicDialog$e(this, i.z, i.x, view.findViewById(0x7f0a0c19), view.findViewById(0x7f0a29a0));
                   view1.setAdapter(v13);
                   view1.setLayoutManager(new LinearLayoutManager(i.z));
                   view1.setItemViewCacheSize(i3);
                }
                i.K.add(view);
             }else {
                View view2 = a.c(i.z, R.layout.arg_RES_7f0d031f, null);
                KwaiImageView kwaiImageVie = view2.findViewById(R.id.dim_pic_iv);
                KwaiImageView kwaiImageVie1 = view2.findViewById(R.id.target_pic);
                uDownloadPic = 100;
                if (!i2) {
                   if (!PatchProxy.applyVoidTwoRefs(kwaiImageVie1, kwaiImageVie, i, DownloadPicDialog.class, "35")) {
                      kwaiImageVie1.U(r1.G0(i.x));
                      d uod = Fresco.newDraweeControllerBuilder();
                      uod.y(kwaiImageVie.getController());
                      uod.w(a.a(ImageRequestBuilder.d(d.b(r1.G0(i.x))[0]), kwaiImageVie, uDownloadPic));
                      kwaiImageVie.setController(uod.e());
                   }
                   i.K.add(view2);
                }else {
                   int i4 = i2 - i.E;
                   List list = r1.m0(i.x, i4);
                   if (!q.f(list)) {
                      CDNUrl[] uCDNUrlArray = new CDNUrl[list.size()];
                      ImageRequest[] imageRequest = d.b(list.toArray(uCDNUrlArray));
                      if (!j.h(imageRequest)) {
                         int i5 = i2 - i.E;
                         if (PatchProxy.isSupport(DownloadPicDialog.class)) {
                            Object[] objArray = new Object[i3];
                            objArray[0] = kwaiImageVie1;
                            objArray[1] = kwaiImageVie;
                            objArray[2] = list;
                            objArray[3] = imageRequest;
                            objArray[4] = Integer.valueOf(i5);
                            if (PatchProxy.applyVoid(objArray, i, DownloadPicDialog.class, "34")) {
                            label_0294 :
                               i.K.add(view2);
                            label_0299 :
                               i2 = i2 + 1;
                               i1 = 1;
                            }
                         }else {
                            uoe = 3;
                         }
                         d uod1 = Fresco.newDraweeControllerBuilder();
                         uod1.y(kwaiImageVie.getController());
                         uod1.w(a.a(ImageRequestBuilder.d(imageRequest[0]), kwaiImageVie, uDownloadPic));
                         kwaiImageVie.setController(uod1.e());
                         kwaiImageVie1.P(list);
                         goto label_0294 ;
                      }
                   }
                }
             }
             uoe = 3;
             goto label_0299 ;
          }
          i.s.setAdapter(new DownloadPicDialog$c(i, i.z, i.K));
          i.s.addOnPageChangeListener(i.R);
          i.v.setViewPager(i.s);
       }
       if (!PatchProxy.applyVoid(null, i, DownloadPicDialog.class, "32")) {
          i.r.setText(a.B.getString(R.string.arg_RES_7f100aa2));
       }
       if (!PatchProxy.applyVoid(null, i, DownloadPicDialog.class, "31")) {
          i.t.setVisibility(0);
          i.t.setImageResource(R.drawable.arg_RES_7f0809fa);
       }
       if (!PatchProxy.applyVoid(null, i, DownloadPicDialog.class, "9")) {
          i.r.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       }
       if (!PatchProxy.applyVoid(null, i, DownloadPicDialog.class, "10")) {
          a.f(i.O, i.P);
          a.e("PHOTO_DOWNLOAD_IMAGE_DIALOG_ALL_BUTTON", i.O, i.P, this.uh(), i.C);
       }
       i.setCancelable(true);
       if (!PatchProxy.applyVoid(null, i, DownloadPicDialog.class, "7")) {
          i.p.setOnClickListener(new k(i));
       }
       if (!PatchProxy.applyVoid(null, i, DownloadPicDialog.class, "8")) {
          i.u.setOnClickListener(new l(i));
       }
       return;
    }
    public void th(){
       DownloadPicDialog obj;
       DownloadPicDialog q;
       int i;
       DownloadPicDialog uDownloadPic;
       DownloadPicDialog uDownloadPic1;
       DownloadPicDialog d;
       List list = this;
       if (PatchProxy.applyVoid(null, list, DownloadPicDialog.class, "18")) {
          return;
       }
       QPhoto qPhoto = new QPhoto(list.x);
       boolean b = true;
       if (list.yh(list.D)) {
          if (!PatchProxy.applyVoidOneRefs(qPhoto, list, DownloadPicDialog.class, "20")) {
             if (PatchProxy.applyOneRefs(qPhoto, list, DownloadPicDialog.class, "25") != PatchProxyResult.class) {
             }else {
                q = list.Q;
                if (q == null) {
                   q = "";
                }
                list.M = new ArrayList();
                list.H = b;
                list.L.put(Integer.valueOf(b), Integer.valueOf(b));
                e.l(qPhoto, null, 0, 1, false, null, list.G, null, q, list.C, list.z);
                i = 0;
                while (i < list.C) {
                   int i1 = list.E + i;
                   i1 = i1 + b;
                   if (list.L.containsKey(Integer.valueOf(i1))) {
                      i1 = list.E + i;
                      i1 = i1 + b;
                      if (list.L.get(Integer.valueOf(i1)).intValue() > b) {
                      label_00c8 :
                         i = i + 1;
                      }
                   }
                   i1 = list.E + i;
                   i1 = i1 + b;
                   list.L.put(Integer.valueOf(i1), Integer.valueOf(b));
                   list.M.add(t.just(Integer.valueOf(i)).map(new n(list, qPhoto)).subscribeOn(d.c).observeOn(d.a));
                   goto label_00c8 ;
                }
                if (list.L.get(Integer.valueOf(b)).intValue() <= b) {
                   list.L.put(Integer.valueOf(b), Integer.valueOf(b));
                }
             }
             list.N.c(t.fromIterable(list.M).concatMap(j.b).subscribe(i.b, Functions.d()));
          }
       }else if(list.Ah(list.D)){
          if (!PatchProxy.applyVoidOneRefs(qPhoto, list, DownloadPicDialog.class, "21")) {
             q = (!TextUtils.x(list.Q))? list.Q: "downloadSingleLongPicFromDialog";
             uDownloadPic = q;
             File uFile = e.b(qPhoto);
             uDownloadPic1 = uDownloadPic;
             DownloadPicDialog uDownloadPic2 = uDownloadPic;
             e.o(qPhoto, uFile, 0, 1, false, null, list.G, null, uDownloadPic1, "", list.z, "PHOTO_DOWNLOAD_IMAGE_DIALOG_LONG_BUTTON", 0);
             b uob = a0.g(qPhoto, uFile, (list.y.mNotNeedWaterMark ^ 0x01), new StatModel(uDownloadPic2), DownloadPicDialog.U.a(qPhoto, -1, new m(list, list.L)), list.z);
             list.N.c(uob);
             list.N.c(t.timer(30, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new m(list, uob)));
          }
       }else {
          d = list.D;
          if (!PatchProxy.isSupport(DownloadPicDialog.class) || !PatchProxy.applyVoidTwoRefs(qPhoto, Integer.valueOf(d), list, DownloadPicDialog.class, "23")) {
             q = list.Q;
             if (q == null) {
                String str = "downloadSinglePicFromDialog";
             }
             uDownloadPic = q;
             uDownloadPic1 = uDownloadPic;
             DownloadPicDialog uDownloadPic3 = uDownloadPic;
             e.o(qPhoto, null, 0, 1, false, null, list.G, null, uDownloadPic1, Integer.toString((d - list.E)), list.z, "PHOTO_DOWNLOAD_IMAGE_DIALOG_ONE_BUTTON", 0);
             obj = this;
             obj.N.c(t.fromCallable(new i(obj, uDownloadPic3, d, qPhoto)).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), Functions.d()));
          label_0208 :
             return;
          }
       }
       obj = list;
       goto label_0208 ;
    }
    public String uh(){
       DownloadPicDialog obj = PatchProxy.apply(null, this, DownloadPicDialog.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L;
       if (obj == null || obj.get(Integer.valueOf(this.D)) == null) {
          return "INITIAL";
       }
       int i = this.L.get(Integer.valueOf(this.D)).intValue();
       if (i == -1) {
          return "RETRY";
       }
       if (i == 100) {
          return "DONE";
       }
       if (!i) {
          return "INITIAL";
       }
       return "DOWNLOADING";
    }
    public void vh(){
       if (PatchProxy.applyVoid(null, this, DownloadPicDialog.class, "27")) {
          return;
       }
       int i = Math.round((this.Bh() * 100.00f));
       if (!i) {
          return;
       }
       k1.o(new o(this, i));
       return;
    }
    public void wh(int p0,int p1){
       if (PatchProxy.isSupport(DownloadPicDialog.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DownloadPicDialog.class, "24")) {
          return;
       }
       if (!p1) {
          return;
       }
       k1.o(new p(this, p0, p1));
       return;
    }
    public boolean xh(){
       Object obj = PatchProxy.apply(null, this, DownloadPicDialog.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = this.E + 1;
       while (true) {
          if (i > this.B) {
             return 1;
          }
          if (this.L.containsKey(Integer.valueOf(i)) && (this.L.get(Integer.valueOf(i)).intValue() != -1 && (this.L.get(Integer.valueOf(i)).intValue() != 100 && this.L.get(Integer.valueOf(i)).intValue()))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public boolean yh(int p0){
       int i = 1;
       if (p0 == i) {
       }else {
          i = false;
       }
       return i;
    }
    public boolean zh(){
       Object obj = PatchProxy.apply(null, this, DownloadPicDialog.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = this.E + 1;
       while (true) {
          if (i > this.B) {
             return false;
          }
          if (this.L.containsKey(Integer.valueOf(i)) && this.L.get(Integer.valueOf(i)).intValue() == -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return 1;
    }
}
