package com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog;
import ml8.d;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.HashSet;
import com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog$a;
import com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog$b;
import com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog$c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.viewpager2.widget.ViewPager2;
import com.yxcorp.gifshow.photo.download.widget.ImageDownloadButton;
import android.widget.TextView;
import android.widget.ImageView;
import com.kwai.library.widget.viewpager.indicator.CircleIndicator;
import android.os.Bundle;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import androidx.viewpager2.widget.ViewPager2$h;
import dxb.b;
import dxb.o;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DownloadBottomSheetBehavior;
import dxb.k;
import com.google.android.material.bottomsheet.DownloadBottomSheetBehavior$a;
import dxb.f;
import android.view.View$OnClickListener;
import dxb.g;
import dxb.c;
import android.content.DialogInterface$OnKeyListener;
import com.yxcorp.gifshow.photo.download.image.a;
import android.widget.Button;
import com.yxcorp.gifshow.photo.download.image.c;
import dxb.h;
import dxb.i;
import dxb.j;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.kwai.robust.PatchProxyResult;
import lxb.a;
import android.content.Context;
import android.view.LayoutInflater;
import i2b.a;
import java.util.Objects;
import crd.b;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import fxb.a;
import java.lang.Boolean;
import kzc.d;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import u07.t$a;
import dxb.m;
import u07.u;
import dxb.l;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import dxb.n;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class ImageDownloadForSearchDialog extends KwaiDialogFragment implements d	// class@000ed2
{
    public TextView A;
    public ImageView B;
    public CircleIndicator C;
    public TextView[] D;
    public final HashSet E;
    public final ViewPager2$h F;
    public final PagerIndicator$d G;
    public final c$a H;
    public final int p;
    public o q;
    public c r;
    public ViewPager2 s;
    public ImageDownloadButton t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public ImageView y;
    public TextView z;
    public static final int I;

    public void ImageDownloadForSearchDialog(){
       super();
       this.p = 0x7f0d061c;
       this.E = new HashSet();
       this.F = new ImageDownloadForSearchDialog$a(this);
       this.G = new ImageDownloadForSearchDialog$b(this);
       this.H = new ImageDownloadForSearchDialog$c(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageDownloadForSearchDialog.class, "2")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a136f);
       this.t = p0.findViewById(0x7f0a0c09);
       this.u = p0.findViewById(0x7f0a40f2);
       this.v = p0.findViewById(0x7f0a41ca);
       this.w = p0.findViewById(0x7f0a427d);
       this.x = p0.findViewById(0x7f0a16e2);
       this.y = p0.findViewById(0x7f0a14ee);
       this.z = p0.findViewById(0x7f0a40f3);
       this.A = p0.findViewById(0x7f0a41a8);
       this.B = p0.findViewById(0x7f0a0785);
       this.C = p0.findViewById(0x7f0a2f6d);
       TextView[] textViewArra = new TextView[]{this.u,this.v,this.w};
       this.D = textViewArra;
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageDownloadForSearchDialog.class, "9")) {
          return;
       }
       super.onActivityCreated(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ImageDownloadForSearchDialog.class, "10")) {
          ViewGroup$LayoutParams layoutParams = this.s.getLayoutParams();
          layoutParams.height = n.k(this.getActivity()) + a1.d(0x7f07045f);
          this.s.setLayoutParams(layoutParams);
          this.s.j(this.F);
          this.s.setOffscreenPageLimit(1);
          this.s.setAdapter(new b(this.q));
          this.C.setPager(this.G);
          ImageDownloadForSearchDialog tv = this.v;
          int i = (this.q.k != null)? 0: 8;
          tv.setVisibility(i);
       }
       if (!PatchProxy.applyVoid(objArray, this, ImageDownloadForSearchDialog.class, "13")) {
          BottomSheetBehavior.from(this.getDialog().getWindow().findViewById(R.id.design_bottom_sheet)).d(new k(this));
          this.getDialog().findViewById(R.id.container).setOnClickListener(new f(this));
          this.B.setOnClickListener(new g(this));
          this.getDialog().setOnKeyListener(new c(this));
          this.t.setOnClickListener(new a(this));
          p0.g = this.H;
          this.u.setOnClickListener(new h(this));
          this.v.setOnClickListener(new i(this));
          this.w.setOnClickListener(new j(this));
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageDownloadForSearchDialog.class, "3")) {
          return;
       }
       super.onCreate(p0);
       o oo = new o(SerializableHook.getSerializable(this.getArguments(), "feed"), SerializableHook.getSerializable(this.getArguments(), "stat"), SerializableHook.getSerializable(this.getArguments(), "response"));
       this.q = oo;
       this.r = new c(oo);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ImageDownloadForSearchDialog.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new a(this.requireContext(), 0x7f11010d);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ImageDownloadForSearchDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, this.p, p1, false);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ImageDownloadForSearchDialog.class, "7")) {
          return;
       }
       super.onDestroyView();
       ImageDownloadForSearchDialog tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, c.class, "2")) {
          tr.f = true;
          int i = 0;
          if (tr.c[i]) {
             tr.h(9);
          }
          c e = tr.e;
          int len = e.length;
          while (i < len) {
             object oobject = e[i];
             if (oobject != null && !oobject.isDisposed()) {
                oobject.dispose();
             }
             i = i + 1;
          }
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ImageDownloadForSearchDialog.class, "6")) {
          return;
       }
       super.onStart();
       Window window = this.getDialog().getWindow();
       window.setLayout(-1, -1);
       window.setBackgroundDrawable(new ColorDrawable(0));
       window.setDimAmount(0.30f);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageDownloadForSearchDialog.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       ImageDownloadForSearchDialog tq = this.q;
       a.f(tq.e, tq.f);
       return;
    }
    public final boolean sh(boolean p0){
       ImageDownloadForSearchDialog obj;
       if (PatchProxy.isSupport(ImageDownloadForSearchDialog.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ImageDownloadForSearchDialog.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.q;
       a.b("PHOTO_DOWNLOAD_IMAGE_DIALOG_CLOSE_BUTTON", obj.e, obj.f);
       c b = this.r.b;
       int len = b.length;
       int i = 0;
       while (true) {
          if (i < len) {
             int i1 = b[i];
             if (i1 == -2 || (i1 >= 0 && i1 < 100)) {
                b = 1;
             label_0046 :
                if (b) {
                   if (!PatchProxy.applyVoid(null, this, ImageDownloadForSearchDialog.class, "15") && this.getActivity() != null) {
                      ImageDownloadForSearchDialog tq = this.q;
                      a.c(tq.e, tq.f);
                      d uod = new d(this.getActivity());
                      uod.z0(a.B.getString(R.string.arg_RES_7f100a9d));
                      uod.T0(a.B.getString(R.string.arg_RES_7f100a9b));
                      uod.R0(a.B.getString(R.string.arg_RES_7f100a9c));
                      uod.t0(new m(this));
                      uod.u0(new l(this));
                      uod.z(false);
                      t$a uoa = f.e(uod);
                      uoa.v(true);
                      uoa.Y(new n(this));
                      break ;
                   }
                   break ;
                }else if(p0){
                   this.dismissAllowingStateLoss();
                }
                return false;
             }else {
                i = i + 1;
             }
          }else {
             b = 0;
             goto label_0046 ;
          }
       }
       return true;
    }
}
