package com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import j79.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder$c;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.os.Bundle;
import qrd.l1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;

public final class MultiPicPreviewFragmentViewBinder extends AbsPreviewFragmentViewBinder	// class@000ec1
{
    public b j;
    public static final MultiPicPreviewFragmentViewBinder$a k;

    static {
       MultiPicPreviewFragmentViewBinder.k = new MultiPicPreviewFragmentViewBinder$a(null);
    }
    public void MultiPicPreviewFragmentViewBinder(Fragment p0,int p1){
       a.p(p0, "fragment");
       super(p0, p1);
    }
    public boolean b(l0 p0){
       b uob;
       MutableLiveData obj = PatchProxy.applyOneRefs(p0, this, MultiPicPreviewFragmentViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.b(p0);
       if (p0 != null) {
          obj = p0.w0();
          if (obj != null) {
             obj.observe(this.n(), new MultiPicPreviewFragmentViewBinder$b(this));
          }
       }
       if (p0 != null) {
          p0 = p0.G;
          if (p0 != null) {
             uob = p0.subscribe(new MultiPicPreviewFragmentViewBinder$c(this));
          label_003b :
             this.j = uob;
             return false;
          }
       }
       uob = null;
       goto label_003b ;
    }
    public void e(View p0){
       ViewGroup$LayoutParams layoutParams;
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiPicPreviewFragmentViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.e(p0);
       this.q(p0.findViewById(R.id.choice_circle));
       this.r(p0.findViewById(R.id.choice_circle_layout));
       this.s(p0.findViewById(R.id.choice_text));
       this.t(p0.findViewById(R.id.close_back));
       this.v(p0.findViewById(R.id.view_pager));
       this.u(p0.findViewById(R.id.title_bar));
       p0 = this.o();
       if (p0 != null) {
          View view = this.o();
          if (view != null) {
             layoutParams = view.getLayoutParams();
             if (layoutParams != null) {
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   ViewGroup$LayoutParams layoutParams1 = layoutParams;
                   Bundle arguments = this.n().getArguments();
                   int i = 0;
                   if (arguments != null) {
                      i = arguments.getInt("KEY_PREVIEW_TITLE_BAR_MARGIN_TOP", i);
                   }
                   layoutParams1.topMargin = i;
                }
                a = l1.a;
             label_0083 :
                p0.setLayoutParams(layoutParams);
             }
          }
          layoutParams = null;
          goto label_0083 ;
       }
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MultiPicPreviewFragmentViewBinder.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d06fa, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­agment, container, false\)");
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MultiPicPreviewFragmentViewBinder.class, "3")) {
          return;
       }
       super.onDestroy();
       MultiPicPreviewFragmentViewBinder tj = this.j;
       if (tj != null) {
          tj.dispose();
       }
       return;
    }
}
