package com.kwai.widget.customer.mediapreview.PreviewMediaFragment;
import hka.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.widget.customer.mediapreview.PreviewMediaFragment$b;
import com.kwai.widget.customer.mediapreview.PreviewMediaFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import ix7.p;
import y8c.g;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import im8.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Collection;
import g9c.a;
import com.kwai.widget.customer.mediapreview.widget.KwaiSnappyLinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.widget.customer.mediapreview.s;
import com.kwai.widget.customer.mediapreview.t;
import com.kwai.widget.customer.mediapreview.r;

public class PreviewMediaFragment extends BaseFragment implements a	// class@00112e
{
    public PresenterV2 j;
    public final PreviewMediaFragment$b k;
    public final a0 l;

    public void PreviewMediaFragment(){
       super();
       this.k = new PreviewMediaFragment$b();
       this.l = new PreviewMediaFragment$a(this);
    }
    public boolean onBackPressed(){
       PreviewMediaFragment obj = PatchProxy.apply(null, this, PreviewMediaFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       if (obj.d == null) {
          this.getActivity().finish();
          return true;
       }else {
          obj.h.onNext(Integer.valueOf(0));
          return true;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PreviewMediaFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d1710, p1, false);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PreviewMediaFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       PreviewMediaFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       tj = this.k;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(objArray, tj, PreviewMediaFragment$b.class, "1")) {
          tj.j = objArray;
          PreviewMediaFragment$b b = tj.b;
          if (b != null && !PatchProxy.applyVoid(objArray, b, p.class, "4")) {
             b.Z0();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PreviewMediaFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PreviewMediaFragment$b c = this.k.c;
       if (c == null || c.isEmpty()) {
          if (this.getActivity() != null) {
             this.getActivity().finish();
          }
          return;
       }else if(PatchProxy.applyVoidOneRefs(p0, this, PreviewMediaFragment.class, "4")){
          RecyclerView recyclerView = p0.findViewById(R.id.recycler_view);
          PreviewMediaFragment tk = this.k;
          p op = PatchProxy.apply(null, this, PreviewMediaFragment.class, "6");
          if (op != patchProxyRe) {
          }else {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(new c("PREVIEW_MEDIA_PREVIEW_POSITION", this.k.e));
             uArrayList.add(new c("PREVIEW_MEDIA_PREVIEW_DRAG_STATE", this.k.f));
             uArrayList.add(new c("PREVIEW_MEDIA_PREVIEW_CONTAINERECT", this.k.g));
             uArrayList.add(new c("PREVIEW_MEDIA_PREVIEW_EXIT", this.k.h));
             uArrayList.add(new c("PREVIEW_MEDIA_OPTION_VIEW_CLICK", this.k.i));
             uArrayList.add(new c("PREVIEW_MEDIA_PAGE_INDEX", this.k.j));
             uArrayList.add(new c("PREVIEW_MEDIA_PREVIEW_MEDIA_PREPARED", this.k.l));
             uArrayList.add(new c("PREVIEW_MEDIA_FRAGMENT", this.k.n));
             uArrayList.add(new c("PREVIEW_MEDIA_PREVIEW_POSITION_INIT", Integer.valueOf(this.k.k)));
             op = new p(uArrayList);
          }
          tk.b = op;
          recyclerView.setAdapter(this.k.b);
          tk = this.k;
          tk.b.L0(tk.c);
          recyclerView.setLayoutManager(new KwaiSnappyLinearLayoutManager(this.getContext(), 0, 0));
       }
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, PreviewMediaFragment.class, "5");
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new s());
          presenterV2.U7(new t());
          presenterV2.U7(new r());
          PatchProxy.onMethodExit(PreviewMediaFragment.class, "5");
       }
       this.j = presenterV2;
       presenterV2.f(p0);
       Object[] objArray = new Object[]{this.k};
       this.j.i(objArray);
       return;
    }
}
