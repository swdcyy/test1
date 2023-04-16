package com.yxcrop.gifshow.v3.editor.crop.vb.DefaultCropFragmentVB;
import com.yxcrop.gifshow.v3.editor.crop.vb.AbsCropFragmentVB;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;

public final class DefaultCropFragmentVB extends AbsCropFragmentVB	// class@000a1f
{

    public void DefaultCropFragmentVB(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultCropFragmentVB.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.e = p0;
       p0 = this.A();
       View view = null;
       ExpandFoldHelperView uExpandFoldH = (p0 != null)? p0.findViewById(R.id.opview): view;
       this.f = uExpandFoldH;
       uExpandFoldH = this.A();
       ScrollToCenterRecyclerView scrollToCent = (uExpandFoldH != null)? uExpandFoldH.findViewById(R.id.aspect_ratio_recycler_view): view;
       this.g = scrollToCent;
       scrollToCent = this.A();
       scrollToCent = (scrollToCent != null)? scrollToCent.findViewById(R.id.rotate_layout): view;
       this.h = scrollToCent;
       scrollToCent = this.A();
       if (scrollToCent != null) {
          view = scrollToCent.findViewById(R.id.timeline_container_view);
       }
       this.i = view;
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultCropFragmentVB.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d04bd, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­o_crop, container, false\)");
       return view;
    }
}
