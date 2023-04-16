package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$i;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cia.w;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import bw6.a;
import ow6.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.DynamicLoopEmptyFeed;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import xga.c;

public final class FollowSlideUnFollowPresenter$i implements g	// class@00113d
{
    public final FollowSlideUnFollowPresenter b;

    public void FollowSlideUnFollowPresenter$i(FollowSlideUnFollowPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str;
       int i;
       String str1;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideUnFollowPresenter$i.class, "1")) {
       }else {
          SlidePlayViewModel slidePlayVie = this.b.P8().O();
          if (slidePlayVie != null) {
             List list = slidePlayVie.V0();
             if (list == null || (!q.f(list) && this.b.P8().O() != null)) {
                slidePlayVie = this.b.P8().O();
                QPhoto qPhoto = (slidePlayVie != null)? slidePlayVie.getCurrentPhoto(): null;
                QPhoto mEntity = (qPhoto != null)? qPhoto.mEntity: null;
                if (mEntity != null) {
                   FollowSlideUnFollowPresenter$i tb = this.b;
                   Objects.requireNonNull(tb);
                   mEntity = PatchProxy.applyThreeRefs(list, qPhoto, p0, tb, FollowSlideUnFollowPresenter.class, "6");
                   if (mEntity != patchProxyRe) {
                   }else if(q.f(list)){
                      i = a.b(true, list, qPhoto);
                      if (i != -1) {
                         int i1 = list.size();
                         while (true) {
                            if (i < i1) {
                               QPhoto qPhoto3 = list.get(i);
                               BaseFeed entity2 = (qPhoto3 != null)? qPhoto3.getEntity(): 0;
                               if (!entity2 instanceof DynamicLoopEmptyFeed) {
                                  qPhoto3 = list.get(i);
                                  if (qPhoto3 != null) {
                                     qPhoto3 = qPhoto3.mEntity;
                                     if (qPhoto3 != null) {
                                        str2 = r1.U1(qPhoto3);
                                     label_00a4 :
                                        if (!TextUtils.n(str2, p0)) {
                                           mEntity = list.get(i);
                                           break ;
                                        }
                                     }
                                  }
                                  str2 = null;
                                  goto label_00a4 ;
                               }
                               i = i + 1;
                            }
                         }
                      }
                   }
                   mEntity = null;
                   if (!a.g(qPhoto, mEntity)) {
                      if (mEntity == null) {
                         tb = this.b;
                         Objects.requireNonNull(tb);
                         mEntity = PatchProxy.applyThreeRefs(list, qPhoto, p0, tb, FollowSlideUnFollowPresenter.class, "7");
                         if (mEntity != patchProxyRe) {
                         }else if(q.f(list)){
                            i = a.b(true, list, qPhoto);
                            while (true) {
                               if (i >= 0) {
                                  QPhoto qPhoto2 = list.get(i);
                                  BaseFeed entity1 = (qPhoto2 != null)? qPhoto2.getEntity(): 0;
                                  if (!entity1 instanceof DynamicLoopEmptyFeed) {
                                     qPhoto2 = list.get(i);
                                     if (qPhoto2 != null) {
                                        qPhoto2 = qPhoto2.mEntity;
                                        if (qPhoto2 != null) {
                                           str1 = r1.U1(qPhoto2);
                                        label_0106 :
                                           if (!TextUtils.n(str1, p0)) {
                                              mEntity = list.get(i);
                                              break ;
                                           }
                                        }
                                     }
                                     str1 = null;
                                     goto label_0106 ;
                                  }
                                  i = i - 1;
                               }
                            }
                         }
                         mEntity = null;
                      }
                      ArrayList uArrayList = Lists.b();
                      a.o(uArrayList, "Lists.newArrayList\(\)");
                      ArrayList uArrayList1 = Lists.b();
                      a.o(uArrayList1, "Lists.newArrayList\(\)");
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         QPhoto qPhoto1 = iterator.next();
                         if (mEntity == null && a.g(qPhoto, qPhoto1)) {
                            continue ;
                         }else if(qPhoto1 != null){
                            BaseFeed entity = qPhoto1.getEntity();
                            if (entity != null) {
                               str = r1.U1(entity);
                            label_014e :
                               if (TextUtils.n(str, p0)) {
                                  uArrayList.add(qPhoto1);
                                  c.a("unfollow", "follow_slide_detail", qPhoto1);
                               }else {
                                  uArrayList1.add(qPhoto1);
                               }
                            }
                         }
                         str = null;
                         goto label_014e ;
                      }
                      p0 = this.b.P8().O();
                      if (p0 != null) {
                         p0.J(uArrayList, mEntity, "FollowSlideUnFollowPresenter");
                      }
                   }
                }
             }
          }
       }
    label_0174 :
       return;
    }
}
