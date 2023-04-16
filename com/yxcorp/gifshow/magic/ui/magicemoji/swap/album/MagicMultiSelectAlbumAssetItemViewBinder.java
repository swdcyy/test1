package com.yxcorp.gifshow.magic.ui.magicemoji.swap.album.MagicMultiSelectAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.album.MagicMultiSelectAlbumAssetItemViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import q79.d;
import java.lang.Boolean;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.album.MagicMultiSelectAlbumAssetItemViewBinder$c;
import android.view.View$OnClickListener;
import ec7.a;
import java.util.List;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Iterator;
import java.lang.Iterable;
import r79.c;
import com.yxcorp.gifshow.models.EmptyQMedia;
import p79.c;
import android.widget.TextView;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.album.MagicMultiSelectAlbumAssetItemViewBinder$b;
import p79.f;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import r79.a;
import w69.d;

public final class MagicMultiSelectAlbumAssetItemViewBinder extends MultiSelectAlbumAssetItemViewBinder	// class@001c33
{
    public View t;
    public static final String u;
    public static final MagicMultiSelectAlbumAssetItemViewBinder$a v;

    static {
       MagicMultiSelectAlbumAssetItemViewBinder.v = new MagicMultiSelectAlbumAssetItemViewBinder$a(null);
       MagicMultiSelectAlbumAssetItemViewBinder.u = "ksa_is_spark_template";
    }
    public void MagicMultiSelectAlbumAssetItemViewBinder(Fragment p0,int p1){
       a.p(p0, "fragment");
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicMultiSelectAlbumAssetItemViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.e(p0);
       this.t = p0.findViewById(0x7f0a3837);
       this.s(p0.findViewById(R.id.media_pick_num));
       this.t(p0.findViewById(R.id.media_pick_num_area));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicMultiSelectAlbumAssetItemViewBinder.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d0ec1, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­t_item, container, false\)");
       return view;
    }
    public boolean g(d p0){
       View obj = PatchProxy.applyOneRefs(p0, this, MagicMultiSelectAlbumAssetItemViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o();
       if (obj != null) {
          obj.setOnClickListener(new MagicMultiSelectAlbumAssetItemViewBinder$c(this, p0));
       }
       return super.g(p0);
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(MagicMultiSelectAlbumAssetItemViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, MagicMultiSelectAlbumAssetItemViewBinder.class, "3")) {
          return;
       }
       a.p(p0, "adapter");
       a.p(p2, "payloads");
       super.i(p0, p1, p2, p3);
       p0 = p0.M0(p1);
       if (p0 instanceof QMedia && p3 instanceof d) {
          List list = p3.m();
          int i = 0;
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                Object obj1 = obj;
                obj1 = (!obj1 instanceof EmptyQMedia && a.g(obj1.getPath(), p0.path))? 1: null;
                if (obj1) {
                   i = obj;
                   break ;
                }
             }
          }
          MagicMultiSelectAlbumAssetItemViewBinder magicMultiSe = (i != null)? 1: null;
          if (magicMultiSe) {
             magicMultiSe = this.t;
             if (magicMultiSe == null || magicMultiSe.getVisibility()) {
                c.e(this.t, true);
             }
          }else {
             magicMultiSe = this.t;
             if (magicMultiSe != null && !magicMultiSe.getVisibility()) {
                c.e(this.t, false);
             }
             SizeAdjustableTextView sizeAdjustab = this.n();
             if (sizeAdjustab != null && !sizeAdjustab.getVisibility()) {
                c.b(this.n(), false, new MagicMultiSelectAlbumAssetItemViewBinder$b(this));
             }
          }
       }
    label_00ab :
       return;
    }
    public void x(d p0,View p1){
       AlbumFragment uAlbumFragme1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicMultiSelectAlbumAssetItemViewBinder.class, "4")) {
          return;
       }
       a.p(p0, "viewModel");
       AlbumFragment uAlbumFragme = null;
       AlbumFragment tag = (p1 != null)? p1.getTag(R.id.ksa_media_item): uAlbumFragme;
       if (!tag instanceof QMedia) {
          tag = uAlbumFragme;
       }
       if (tag != null && p0.d0(tag) != -1) {
          boolean b = false;
          this.w(b);
          p0.A(new EmptyQMedia(3), p0.d0(tag), b);
          Fragment parentFragme = this.j().getParentFragment();
          parentFragme = (parentFragme != null)? parentFragme.getParentFragment(): uAlbumFragme;
          if (parentFragme instanceof AlbumFragment) {
             uAlbumFragme = parentFragme;
          }
          if (uAlbumFragme != null) {
             uAlbumFragme.Sh(tag);
          }
          return;
       }else {
          super.x(p0, p1);
          return;
       }
    }
    public boolean z(d p0,QMedia p1,int p2){
       Bundle obj;
       if (PatchProxy.isSupport(MagicMultiSelectAlbumAssetItemViewBinder.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, MagicMultiSelectAlbumAssetItemViewBinder.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "viewModel");
       a.p(p1, "item");
       obj = p0.s0().c().b();
       Boolean uBoolean = (obj != null)? Boolean.valueOf(obj.getBoolean(MagicMultiSelectAlbumAssetItemViewBinder.u)): null;
       if (a.g(uBoolean, Boolean.FALSE)) {
          return true;
       }else {
          return super.z(p0, p1, p2);
       }
    }
}
