package com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$Companion;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.kwai.moved.impls.widget.KsAlbumScaleLayout;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import q79.d;
import java.lang.Boolean;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$2;
import android.widget.FrameLayout;
import ec7.a;
import java.util.List;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import android.content.Context;
import java.util.Iterator;
import r79.c;
import com.yxcorp.gifshow.models.EmptyQMedia;
import androidx.core.content.ContextCompat;
import r79.a;
import w69.d;
import java.lang.StringBuilder;
import o79.q;
import java.lang.CharSequence;
import android.widget.ImageView;
import kotlin.TypeCastException;

public class MultiSelectSelectedItemViewBinder extends AbsSelectedItemViewBinder	// class@001af9
{
    public final long i;
    public TextView j;
    public static final String k = "ksa_multi_select_list";
    public static final MultiSelectSelectedItemViewBinder$Companion l;

    static {
       MultiSelectSelectedItemViewBinder.l = new MultiSelectSelectedItemViewBinder$Companion(null);
       MultiSelectSelectedItemViewBinder.k = "ksa_multi_select_list";
    }
    public void MultiSelectSelectedItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
       this.i = 100;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectSelectedItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       this.t(p0.findViewById(R.id.media_preview));
       this.s(p0.findViewById(R.id.scale_layout));
       this.r(p0.findViewById(R.id.media_duration));
       this.q(p0.findViewById(R.id.delete_img));
       this.j = p0.findViewById(0x7f0a0d1e);
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MultiSelectSelectedItemViewBinder.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d0704, p1, false);
       a.h(view, "CommonUtil.inflate\(infla¡­d_item, container, false\)");
       return view;
    }
    public boolean g(d p0){
       View obj = PatchProxy.applyOneRefs(p0, this, MultiSelectSelectedItemViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k();
       if (obj != null) {
          obj.setOnClickListener(new MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1(this, p0));
       }
       KsAlbumScaleLayout ksAlbumScale = this.m();
       if (ksAlbumScale != null) {
          ksAlbumScale.setOnClickListener(new MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$2(this, p0));
       }
       return true;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       int i;
       KsAlbumScaleLayout ksAlbumScale;
       long[] longArray;
       CompatImageView uCompatImage;
       TextView textView1;
       View view;
       MultiSelectSelectedItemViewBinder tj1;
       if (PatchProxy.isSupport(MultiSelectSelectedItemViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, MultiSelectSelectedItemViewBinder.class, "5")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       super.i(p0, p1, p2, p3);
       Context context = this.j().getContext();
       if (context != null) {
          d uod = (!p3 instanceof d)? null: p3;
          if (uod) {
             List list = uod.m();
             if (list != null) {
                Iterator iterator = list.iterator();
                i = 0;
                while (true) {
                   if (iterator.hasNext()) {
                      if (iterator.next() instanceof EmptyQMedia) {
                      label_005e :
                         if (i == p1) {
                            ksAlbumScale = this.m();
                            if (ksAlbumScale != null) {
                               ksAlbumScale.setStrokeColor(ContextCompat.getColor(context, R.color.arg_RES_7f060b5d));
                            }
                         }
                      }else {
                         i = i + 1;
                      }
                   }else {
                      i = -1;
                      goto label_005e ;
                   }
                }
             }
          }
          ksAlbumScale = this.m();
          if (ksAlbumScale != null) {
             ksAlbumScale.setStrokeColor(ContextCompat.getColor(context, R.color.arg_RES_7f060b27));
          }
       }
    label_0081 :
       if (p3 != null) {
          Bundle uBundle = p3.s0().c().b();
          if (uBundle != null) {
             longArray = uBundle.getLongArray(MultiSelectSelectedItemViewBinder.k);
             if (longArray != null) {
             label_009e :
                a.h(longArray, "\(vm as AlbumAssetViewMod\x20\x02ECT_LIST\) ?: LongArray\(0\)\x00");
                long l = (p1 >= longArray.length)? 0: longArray[p1];
                String str = q.i(l)+i.p(0x7f1045e8);
                TextView textView = this.l();
                if (textView != null) {
                   textView.setText(str);
                }
                MultiSelectSelectedItemViewBinder tj = this.j;
                if (tj != null) {
                   tj.setText(str);
                }
                if (p0.L0(p1) instanceof EmptyQMedia) {
                   uCompatImage = this.n();
                   if (uCompatImage != null) {
                      uCompatImage.setVisibility(8);
                   }
                   textView1 = this.l();
                   if (textView1 != null) {
                      textView1.setVisibility(8);
                   }
                   view = this.k();
                   if (view != null) {
                      view.setVisibility(8);
                   }
                   tj1 = this.j;
                   if (tj1 != null) {
                      tj1.setVisibility(0);
                   }
                }else {
                   uCompatImage = this.n();
                   if (uCompatImage != null) {
                      uCompatImage.setVisibility(0);
                   }
                   textView1 = this.l();
                   if (textView1 != null) {
                      textView1.setVisibility(0);
                   }
                   view = this.k();
                   if (view != null) {
                      view.setVisibility(0);
                   }
                   tj1 = this.j;
                   if (tj1 != null) {
                      tj1.setVisibility(8);
                   }
                }
                return;
             }
          }
          longArray = new long[0];
          goto label_009e ;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.vm.AlbumAssetViewModel");
       }
    }
    public void onDestroy(){
    }
}
