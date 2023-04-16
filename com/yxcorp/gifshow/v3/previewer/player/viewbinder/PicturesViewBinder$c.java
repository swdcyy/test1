package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import com.yxcorp.utility.n;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import twc.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;

public final class PicturesViewBinder$c implements Observer	// class@0015ee
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$c(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i1;
       Object obj = this;
       PicturesViewBinder$c obj1 = p0;
       PicturesViewBinder picturesView = PicturesViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, PicturesViewBinder$c.class, "1")) {
       }else {
          a.o(obj1, "it");
          obj.b.F(obj1);
          if (PostExperimentUtils.Y0() && obj.b.J() instanceof PhotosEditPreviewV3Fragment) {
             if (obj1 == Workspace$Type.LONG_PICTURE) {
                obj1 = obj.b;
                Objects.requireNonNull(obj1);
                Object[] objArray = null;
                PicturesViewBinder obj2 = PatchProxy.apply(objArray, obj1, picturesView, "21");
                boolean b = false;
                if (obj2 != PatchProxyResult.class) {
                   b = obj2.booleanValue();
                }else {
                   obj2 = obj1.G;
                   if (obj2 == null) {
                      obj2 = obj1.F;
                      FragmentActivity uFragmentAct = (obj2 != null)? obj2.requireActivity(): objArray;
                   }
                label_005a :
                   if (!obj2 instanceof Activity) {
                      Object[] objArray1 = new Object[b];
                      a.D().A("PicturesViewBinder", "currentActivity: currentActivity = "+obj2, objArray1);
                   }else {
                      int i2 = obj1.J.r0().size();
                      int i3 = n.k(obj2);
                      int i4 = n.j(obj2);
                      float f = 0;
                      int i5 = 0;
                      while (i5 < i2) {
                         Iterator iterator = obj1.J.r0().iterator();
                         while (iterator.hasNext()) {
                            Size size = iterator.next();
                            float f1 = (float)size.b;
                            float f2 = (float)size.c;
                            float f3 = (float)i3 / f1;
                            f3 = f3 * f2;
                            f = f + f3;
                            Object[] objArray2 = new Object[b];
                            a.D().w("PicturesViewBinder", "pictureWidth: "+f1+", pictureHeight: "+f2+", "+"subPreviewHeight: "+f+" + screenHeight: "+i4, objArray2);
                            i1 = 0;
                         }
                         i5 = i5 + 1;
                         String str = null;
                      }
                      if (f - (float)i4 >= 0) {
                         b = true;
                      }
                   }
                }
                if (b) {
                   obj1 = obj.b;
                   Objects.requireNonNull(obj1);
                   if (!PatchProxy.applyVoid(null, obj1, picturesView, "19")) {
                      if (obj1.H()) {
                         obj1.D();
                      }else {
                         obj1.j.getViewTreeObserver().addOnGlobalLayoutListener(new c(obj1));
                      }
                   }
                }
             }
             PicturesViewBinder p = obj.b.p;
             int i = 8;
             if (p != null) {
                p.setVisibility(i);
             }
             p = obj.b.q;
             if (p != null) {
                p.setVisibility(i);
             }
             ViewGroup$LayoutParams layoutParams = obj.b.j.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
             ViewGroup$LayoutParams layoutParams1 = obj.b.j.getLayoutParams();
             if (layoutParams1 != null) {
                i1 = (obj.b.G() || obj.b.J.t0().getValue() == Workspace$Type.SINGLE_PICTURE)? -1: -2;
                layoutParams1.height = i1;
             }
             layoutParams.gravity = 17;
             obj.b.j.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
