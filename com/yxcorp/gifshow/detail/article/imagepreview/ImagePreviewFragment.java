package com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewFragment;
import hka.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewFragment$a;
import androidx.viewpager.widget.ViewPager;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Parcelable;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.PreviewModel;
import java.util.List;
import com.yxcorp.gifshow.detail.article.imagepreview.h;

public class ImagePreviewFragment extends BaseFragment implements a	// class@00134a
{
    public ViewPager j;
    public PresenterV2 k;
    public ImagePreviewFragment$a l;

    public void ImagePreviewFragment(){
       super();
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, ImagePreviewFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.l.d.onNext(Integer.valueOf(this.j.getCurrentItem()));
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ImagePreviewFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d07e3, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ImagePreviewFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       this.k.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImagePreviewFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.j = p0.findViewById(0x7f0a4540);
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, ImagePreviewFragment.class, "4")) {
          this.l = new ImagePreviewFragment$a();
          p1 = this.getArguments();
          this.l.e = SerializableHook.getSerializable(p1, "PREVIEW_KEY_QPHOTO");
          this.l.c = p1.getInt("PREVIEW_KEY_POSITION");
          Parcelable[] parcelableAr = p1.getParcelableArray("PREVIEW_KEY_MODELS");
          this.l.b = new ArrayList();
          int len = parcelableAr.length;
          int i1 = 0;
          while (i1 < len) {
             object oobject = parcelableAr[i1];
             if (oobject instanceof PreviewModel) {
                this.l.b.add(oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ImagePreviewFragment.class, "3")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.k = presenterV2;
          presenterV2.U7(new h());
          this.k.f(p0);
       }
       Object[] objArray = new Object[]{this.l,this.getActivity()};
       this.k.i(objArray);
       return;
    }
}
