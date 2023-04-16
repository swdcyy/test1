package com.yxcorp.gifshow.album.viewbinder.MultiSelectPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import j79.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectPreviewFragmentViewBinder$onInterceptUserEventAlbum$1;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectPreviewFragmentViewBinder$onInterceptUserEventAlbum$2;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import kotlin.TypeCastException;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import o79.i;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import java.lang.Integer;
import r79.c;
import w69.d;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$Companion;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import java.util.List;

public class MultiSelectPreviewFragmentViewBinder extends AbsPreviewFragmentViewBinder	// class@001af3
{
    public View j;

    public void MultiSelectPreviewFragmentViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public boolean b(l0 p0){
       MultiSelectPreviewFragmentViewBinder obj = PatchProxy.applyOneRefs(p0, this, MultiSelectPreviewFragmentViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       if (obj != null) {
          obj.setOnClickListener(new MultiSelectPreviewFragmentViewBinder$onInterceptUserEventAlbum$1(this, p0));
       }
       View view = this.m();
       if (view != null) {
          view.setOnClickListener(new MultiSelectPreviewFragmentViewBinder$onInterceptUserEventAlbum$2(p0));
       }
       return true;
    }
    public void e(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectPreviewFragmentViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       this.j = p0.findViewById(0x7f0a2c59);
       Fragment uFragment = this.n();
       if (uFragment == null) {
          throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.preview.MediaPreviewFragment");
       }
       ViewModel viewModel = uFragment.Zg();
       if (viewModel == null) {
          throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.preview.MediaPreviewViewModel");
       }
       Object obj = PatchProxy.apply(null, viewModel, l0.class, "18");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(viewModel.m >= viewModel.p.d()){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          MultiSelectPreviewFragmentViewBinder tj = this.j;
          if (tj != null) {
             tj.setAlpha(0x3f000000);
          }
       }
       this.t(p0.findViewById(R.id.close_back));
       this.v(p0.findViewById(R.id.view_pager));
       this.u(p0.findViewById(R.id.title_bar));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MultiSelectPreviewFragmentViewBinder.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.o(p0, R.layout.arg_RES_7f0d0703, p1, false);
       a.h(view, "CommonUtil.inflate\(infla¡­agment, container, false\)");
       return view;
    }
    public void onDestroy(){
    }
    public boolean w(l0 p0,MediaPreviewInfo p1,int p2){
       Bundle obj;
       AlbumLimitOption uAlbumLimitO1;
       MediaFilterList mediaFilterL1;
       String nonselectabl;
       if (PatchProxy.isSupport(MultiSelectPreviewFragmentViewBinder.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, MultiSelectPreviewFragmentViewBinder.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.q(p0, "viewModel");
       a.q(p1, "item");
       if (p1.getMedia().isVideoType()) {
          obj = p0.p0().b();
          long l = 0;
          if (obj != null) {
             long[] longArray = obj.getLongArray(MultiSelectSelectedItemViewBinder.l.a());
             if (longArray != null && longArray.length > p2) {
                l = longArray[p2];
             }
          }
          if (p1.getMedia().getDuration() - l < 0) {
             s.h(i.q(R.string.arg_RES_7f1018d0, String.valueOf((l / (long)1000))));
             return false;
          }
       }
       AlbumLimitOption uAlbumLimitO = p0.q0();
       if (uAlbumLimitO != null) {
          MediaFilterList mediaFilterL = uAlbumLimitO.u();
          if (mediaFilterL != null && !mediaFilterL.isSelectable(p1.getMedia(), p0.D0())) {
             uAlbumLimitO = p0.q0();
             if (uAlbumLimitO != null) {
                mediaFilterL = uAlbumLimitO.u();
                if (mediaFilterL != null && !mediaFilterL.isClickable(p1.getMedia())) {
                   return true;
                }
             }
             uAlbumLimitO1 = p0.q0();
             if (uAlbumLimitO1 != null) {
                mediaFilterL1 = uAlbumLimitO1.u();
                if (mediaFilterL1 != null) {
                   nonselectabl = mediaFilterL1.getNonselectableAlert();
                   if (nonselectabl != null) {
                   label_00c7 :
                      s.h(nonselectabl);
                      return false;
                   }
                }
             }
             nonselectabl = i.p(R.string.arg_RES_7f1018dc);
             a.h(nonselectabl, "CommonUtil.string\(R.stri¡­salbum_video_not_support\)");
             goto label_00c7 ;
          }
       }
       uAlbumLimitO1 = p0.q0();
       if (uAlbumLimitO1 != null) {
          mediaFilterL1 = uAlbumLimitO1.u();
          if (mediaFilterL1 != null) {
             nonselectabl = mediaFilterL1.getNonselectableAlert();
             if (nonselectabl != null) {
             label_00e5 :
                s.h(nonselectabl);
                return false;
             }
          }
       }
       nonselectabl = i.p(R.string.arg_RES_7f1018dc);
       a.h(nonselectabl, "CommonUtil.string\(R.stri¡­salbum_video_not_support\)");
       goto label_00e5 ;
    }
}
