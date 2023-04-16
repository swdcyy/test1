package com.yxcorp.gifshow.v3.i;
import erd.g;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo;
import com.yxcorp.gifshow.v3.EditorActivity$g;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import uwc.b;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import androidx.lifecycle.LiveData;
import com.kuaishou.edit.draft.Workspace$Type;
import nwc.k;
import java.util.Map;
import t36.f;
import lwc.s0;
import t36.f$a;
import java.util.concurrent.CountDownLatch;
import brd.y;

public final class i implements g	// class@00153d
{
    public final EditorActivity b;

    public void i(EditorActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, EditorActivity.class, "25")) {
       }else if(p0.a().a() - tb.Z){
          int i = EditorActivity$g.b[p0.b().ordinal()];
          int i1 = 0;
          if (i != 1) {
             if (i != 2 && i != 3) {
                if (i == 4) {
                   EditorActivity v = tb.V;
                   int len = v.length;
                   while (i1 < len) {
                      object oobject = v[i1];
                      if (oobject instanceof PhotosEditPreviewV3Fragment) {
                         Objects.requireNonNull(oobject);
                         if (PatchProxy.applyVoidOneRefs(p0, oobject, PhotosEditPreviewV3Fragment.class, "48")) {
                            break ;
                         }else if(oobject.p1 != null){
                            if (PostExperimentUtils.p1()) {
                               oobject.p1.Z0(6);
                            }else if(oobject.p1.t0().getValue() == Workspace$Type.LONG_PICTURE){
                               oobject.p1.Z0(4);
                            }
                         }
                         f.p0(oobject.X0, k.class).s0(new s0(p0));
                         break ;
                      }
                      i1 = i1 + 1;
                   }
                   p0 = tb.Y;
                   if (p0 != null) {
                      p0.countDown();
                   }
                }
             }else {
                p0 = tb.Y;
                if (p0 != null) {
                   p0.countDown();
                }
             }
          }else {
             EditorActivity v1 = tb.V;
             i = v1.length;
             while (i1 < i) {
                object oobject1 = v1[i1];
                if (oobject1 instanceof PhotosEditPreviewV3Fragment) {
                   Objects.requireNonNull(oobject1);
                   if (!PatchProxy.applyVoidOneRefs(p0, oobject1, PhotosEditPreviewV3Fragment.class, "50")) {
                      oobject1.F1.onNext(p0);
                      break ;
                   }
                }
                i1 = i1 + 1;
             }
          }
       }
       return;
    }
}
