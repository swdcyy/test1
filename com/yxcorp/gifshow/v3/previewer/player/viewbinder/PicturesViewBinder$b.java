package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import twc.b;
import java.lang.Enum;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import rwc.i;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.Collection;
import g9c.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class PicturesViewBinder$b implements Observer	// class@0015ed
{
    public final PicturesViewBinder b;
    public final AtomicBoolean c;

    public void PicturesViewBinder$b(PicturesViewBinder p0,AtomicBoolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       Object[] objArray;
       PicturesViewBinder p;
       PreviewPlayer mProjects;
       boolean b;
       Object[] objArray1;
       Object[] objArray2;
       PicturesViewBinder p1;
       PreviewPlayer mProjects2;
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder$b.class, "1")) {
       }else {
          String str = "PicturesViewBinder";
          int i = 0;
          if (this.c.get()) {
             objArray = new Object[i];
             a.D().w(str, "init return", objArray);
          }else {
             int i1 = p0.b();
             ListHolder$UpdateType updateType = p0.e();
             if (updateType != null) {
                int i2 = b.a[updateType.ordinal()];
                List list = null;
                int i3 = 1;
                if (i2 != i3) {
                   if (i2 != 2) {
                      int i4 = 3;
                      if (i2 != i4) {
                         if (i2 == 4) {
                            PicturesViewBinder obj = p0.d();
                            p = this.b.P;
                            if (p != null) {
                               mProjects = p.mProjects;
                               if (mProjects != null) {
                                  mProjects.clear();
                               }
                            }
                            p = this.b.P;
                            if (p != null) {
                               mProjects = p.mProjects;
                               if (mProjects != null) {
                                  list = p0.c();
                                  ArrayList uArrayList = new ArrayList(u.Y(list, 10));
                                  Iterator iterator = list.iterator();
                                  while (iterator.hasNext()) {
                                     uArrayList.add(iterator.next().n(a.g(obj, Integer.valueOf(7))));
                                  }
                                  mProjects.addAll(uArrayList);
                               }
                            }
                            obj = this.b.P;
                            if (obj != null) {
                               PreviewPlayer mProjects1 = obj.mProjects;
                               if (mProjects1 != null && (mProjects1.isEmpty() ^ i3) == i3) {
                                  this.b.P.loadProjects(true, false, 0, -1);
                               }
                            }
                            if (a.g(p0.d(), Integer.valueOf(6))) {
                               objArray = new Object[i];
                               a.D().w(str, "changeWorkspace change all update project", objArray);
                            }else if(a.g(p0.d(), Integer.valueOf(5)) && p0.c().size() == this.b.w.getItemCount()){
                               Iterator iterator1 = p0.c().iterator();
                               i2 = 0;
                               while (iterator1.hasNext()) {
                                  Object[] obj1 = iterator1.next();
                                  i4 = i2 + 1;
                                  if (i2 < 0) {
                                     CollectionsKt__CollectionsKt.W();
                                  }
                                  if (i2 == this.b.J.q0()) {
                                     i oi = this.b.w.N0(i2);
                                     if (oi != null) {
                                        Object[] obj2 = PatchProxy.applyOneRefs(obj1, oi, i.class, "5");
                                        if (obj2 != PatchProxyResult.class) {
                                           b = obj2.booleanValue();
                                        }else {
                                           a.p(obj1, "other");
                                           b = a.g(oi.a, obj1.a) ^ i3;
                                        }
                                        if (b == i3) {
                                        label_0156 :
                                           obj2 = new Object[i];
                                           a.D().w(str, "changeWorkspace change all update", obj2);
                                           this.b.N(p0.c(), i2, Integer.valueOf(i3));
                                        label_016e :
                                           obj1 = new Object[i];
                                           a.D().w(str, "changeWorkspace index:"+i2+", CurrentPosition:"+this.b.J.q0()+','+"oldEditorPictureData:"+obj1+", newEditorPictureData:"+this.b.w.N0(i2), obj1);
                                           i2 = i4;
                                        }
                                     }
                                     oi = this.b.w.N0(i2);
                                     if (oi != null && oi.c == null) {
                                        goto label_0156 ;
                                     }
                                  }else {
                                     goto label_0156 ;
                                  }
                               }
                            }else {
                               objArray1 = new Object[i];
                               a.D().w(str, "changeWorkspace change all", objArray1);
                               this.b.w.M0();
                               this.b.w.L0(p0.c());
                               if (a.g(p0.d(), Integer.valueOf(i4)) ^ i3) {
                                  p0 = this.b;
                                  p0.L(p0.G(), this.b.J.q0());
                               }
                            }
                         }
                      }else {
                         objArray2 = new Object[i];
                         a.D().w(str, "changeWorkspace insert index:"+i1, objArray2);
                         p1 = this.b.P;
                         if (p1 != null) {
                            mProjects2 = p1.mProjects;
                            if (mProjects2 != null) {
                               mProjects2.add(i1, i.o(p0.c().get(i1), i, i3, list));
                            }
                         }
                         PicturesViewBinder p2 = this.b.P;
                         if (p2 != null) {
                            p2.loadProjects(true, false, 0, -1);
                         }
                         this.b.w.J0(i1, p0.c().get(i1));
                      }
                   }else {
                      objArray1 = new Object[i];
                      a.D().w(str, "changeWorkspace remove index:"+i1, objArray1);
                      p0 = this.b.P;
                      if (p0 != null) {
                         p0 = p0.mProjects;
                         if (p0 != null) {
                            p0 = p0.remove(i1);
                         }
                      }
                      p0 = this.b.P;
                      if (p0 != null) {
                         p0 = p0.mProjects;
                         if (p0 != null && (p0.isEmpty() ^ i3) == i3) {
                            this.b.P.loadProjects(true, false, 0, -1);
                         }
                      }
                      this.b.w.S0(i1);
                   }
                }else {
                   objArray2 = new Object[i];
                   a.D().w(str, "changeWorkspace change index:"+i1, objArray2);
                   p1 = this.b.P;
                   if (p1 != null) {
                      mProjects2 = p1.mProjects;
                      if (mProjects2 != null) {
                         EditorSdk2V2$VideoEditorProject videoEditorP = mProjects2.set(i1, i.o(p0.c().get(i1), i, i3, list));
                      }
                   }
                   p = this.b.P;
                   if (p != null) {
                      p.loadProjects(true, false, 0, i1);
                   }
                   this.b.N(p0.c(), i1, p0.d());
                }
             }
          }
       }
       return;
    }
}
