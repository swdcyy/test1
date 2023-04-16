package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$10;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Object;
import zwc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.PreviewTextureView;
import lq.i;
import lq.a;
import kotlin.jvm.internal.a;
import x59.g;
import faa.a;
import q87.c;
import java.lang.StringBuilder;
import java.lang.Boolean;
import rwc.j;
import g9c.a;
import uwc.b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Map;
import qsc.g;
import t36.f;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$10$a;
import t36.f$a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import android.app.Activity;
import lwc.h;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import qwc.i;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import com.kwai.video.clipkit.log.ClipEditImagePreviewLog;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.video.clipkit.log.ClipEditLogger;

public final class PicturesViewBinder$10 implements LifecycleObserver	// class@0015eb
{
    public final PicturesViewBinder b;
    public final Workspace$Type c;

    public void PicturesViewBinder$10(PicturesViewBinder p0,Workspace$Type p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onResume(){
       a uoa1;
       Object[] objArray1;
       Map map;
       a uoa = a.class;
       String str = "UPDATE_PICTURES_WHEN_RESUME";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PicturesViewBinder$10.class, "1")) {
          return;
       }
       try{
          PicturesViewBinder$10 tb = this.b;
          int i = 0;
          if (tb.u != null) {
             PicturesViewBinder t = tb.t;
             if (t != null) {
                t.setPreviewPlayer(tb.P);
                uoa1 = i.m().p();
                a.o(uoa1, "PostSession.current\(\).editSession\(\)");
                g og = uoa1.d();
                if (og != null) {
                   og.d();
                }
                objArray1 = new Object[i];
                a.D().w("PicturesViewBinder", "fragment lifecycle resume recycle", objArray1);
             }
             this.b.u = i;
          label_0047 :
             PicturesViewBinder p = this.b.P;
             if (p != null) {
                p.setVisibleSubViewsDirty();
             }
             objArray1 = new Object[i];
             a.D().w("PicturesViewBinder", "fragment lifecycle resume goToShare:"+this.b.u, objArray1);
             Boolean tRUE = Boolean.TRUE;
             boolean b = true;
             if (!a.g(i.m().z(str), tRUE)) {
                p = this.b.M;
                Boolean value = (p != null)? p.getValue(): objArray;
                if (!a.g(value, tRUE) || !this.b.w.R0()) {
                label_009e :
                   if (i) {
                      p = this.b.J;
                      if (p instanceof b) {
                         p.a1(b);
                         p = this.b.K;
                         if (p != null) {
                            EditorDelegate value1 = p.getValue();
                            if (value1 != null) {
                               map = value1.u();
                            label_00c1 :
                               f.p0(map, g.class).s0(PicturesViewBinder$10$a.a);
                               uoa1 = ViewModelProviders.of(this.b.J()).get(uoa);
                               Objects.requireNonNull(uoa1);
                               if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, uoa1, uoa, "2")) {
                                  uoa1.a.setValue(Boolean.FALSE);
                               }
                               value = Boolean.FALSE;
                               i.m().Q(str, value);
                               PicturesViewBinder$10 tb1 = this.b;
                               PicturesViewBinder l = tb1.L;
                               if (l != null) {
                                  l.O0(tb1.J().getActivity(), this.c, this.b.J.r0(), this.b.J.w0());
                               }
                               PicturesViewBinder m = this.b.M;
                               if (m != null) {
                                  objArray = m.getValue();
                               }
                               if (a.g(objArray, tRUE)) {
                                  this.b.M.setValue(value);
                               }
                            }
                         }
                         map = objArray;
                         goto label_00c1 ;
                      }
                   }
                }
             }
             i = 1;
             goto label_009e ;
          }else {
             goto label_0047 ;
          }
       }catch(java.lang.Exception e0){
          PostUtils.D("PicturesViewBinder", "fragment onResume\(\): ", e0);
       }
       return;
    }
    public final void onStop(){
       if (PatchProxy.applyVoid(null, this, PicturesViewBinder$10.class, "2")) {
          return;
       }
       PicturesViewBinder$10 tb = this.b;
       PicturesViewBinder w = tb.w;
       PicturesViewBinder y = tb.y;
       PicturesViewBinder z = tb.z;
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoidTwoRefs(y, z, w, i.class, "7")) {
          a.p(y, "taskId");
          a.p(z, "source");
          Iterator iterator = w.n.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             ClipEditImagePreviewLog value = uEntry.getValue();
             value.mPos = uEntry.getKey().intValue();
             if (value.mImageType > null) {
                if (w.r == Workspace$Type.SINGLE_PICTURE) {
                   if (z == Workspace$Source.CAPTURE) {
                      value.mImageType = 6;
                   }else if(z == Workspace$Source.IMPORT){
                      value.mImageType = 2;
                   }
                }
                ClipEditLogger.reportImagePreviewLog(y, value);
             }
          }
       }
       return;
    }
}
