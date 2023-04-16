package com.kuaishou.commercial.home.PhotoAdAroundInfoPresenter$mAroundInfoListener$2$a;
import qx.a;
import com.kuaishou.commercial.home.PhotoAdAroundInfoPresenter$mAroundInfoListener$2;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.commercial.home.PhotoAdAroundInfoPresenter;
import qvb.i;
import java.util.Collection;
import java.util.ArrayList;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Math;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.Rect;

public final class PhotoAdAroundInfoPresenter$mAroundInfoListener$2$a implements a	// class@0014cb
{
    public final PhotoAdAroundInfoPresenter$mAroundInfoListener$2 a;

    public void PhotoAdAroundInfoPresenter$mAroundInfoListener$2$a(PhotoAdAroundInfoPresenter$mAroundInfoListener$2 p0){
       this.a = p0;
       super();
    }
    public List a(BaseFeed p0){
       List list;
       int i5;
       int i6;
       int i7;
       PhotoAdAroundInfoPresenter obj = this;
       PhotoAdAroundInfoPresenter obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoAdAroundInfoPresenter$mAroundInfoListener$2 obj2 = PatchProxy.applyOneRefs(obj1, obj, PhotoAdAroundInfoPresenter$mAroundInfoListener$2$a.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj1, "feed");
       obj2 = obj.a.this$0;
       Objects.requireNonNull(obj2);
       obj1 = PatchProxy.applyOneRefs(obj1, obj2, PhotoAdAroundInfoPresenter.class, "9");
       if (obj1 != patchProxyRe) {
          list = obj1;
       }else {
          obj1 = obj2.s;
          if (obj1 != null) {
             a.m(obj1);
             List items = obj1.getItems();
             int i = 1;
             View view = (items == null || items.isEmpty())? 1: null;
             if (!view) {
                ArrayList uArrayList = new ArrayList();
                view = obj2.m8();
                a.o(view, "rootView");
                int width = view.getWidth();
                PhotoAdAroundInfoPresenter q = obj2.q;
                if (q == null) {
                   a.S("mPhoto");
                }
                int i1 = items.indexOf(q);
                int i2 = Math.min((items.size() - i), (i1 + 3));
                if (i1 >= 0) {
                   i2 = i2 + i;
                   i1 = 0;
                   int i3 = 0;
                   int i4 = 0;
                   Rect rect = null;
                   while (true) {
                      if (i1 < i2) {
                         QPhoto qPhoto = q.d(items, i1);
                         if (qPhoto != null) {
                            a.o(qPhoto, "CollectionUtils.getItem\(photoList, i\) ?: break");
                            float f = (float)width * qPhoto.getCoverAspectRatioPrioritizeAdCover();
                            if (i3 <= i4) {
                               float f1 = (float)i3 + f;
                               i5 = (int)f1;
                               uArrayList.add(new Rect(0, i3, width, i5));
                               i3 = i5;
                            }else {
                               i7 = width * 2;
                               float f2 = (float)i4 + f;
                               i6 = (int)f2;
                               uArrayList.add(new Rect(width, i4, i7, i6));
                               i4 = i6;
                            }
                            obj = obj2.q;
                            if (obj == null) {
                               a.S("mPhoto");
                            }
                            if (a.g(qPhoto, obj)) {
                               i6 = uArrayList.size() - 1;
                               rect = uArrayList.get(i6);
                            }
                            i1 = i1 + 1;
                            Rect rect1 = 1;
                         }else if(rect == null){
                            ArrayList uArrayList1 = PatchProxy.applyThreeRefs(uArrayList, items, rect, obj2, PhotoAdAroundInfoPresenter.class, "10");
                            if (uArrayList1 != patchProxyRe) {
                            }else {
                               uArrayList1 = new ArrayList();
                               int i8 = uArrayList.size();
                               i7 = 0;
                               while (i7 < i8) {
                                  PhotoAdAroundInfoPresenter obj3 = uArrayList.get(i7);
                                  a.o(obj3, "rectList[i]");
                                  QPhoto qPhoto1 = items.get(i7);
                                  if (obj3.left <= rect.right && rect.left <= obj3.right) {
                                     PhotoAdAroundInfoPresenter r = obj2.r;
                                     i1 = obj3.top - r;
                                     if (i1 <= rect.bottom) {
                                        i5 = obj3.bottom + r;
                                        if (rect.top <= i5 && qPhoto1.isVideoType()) {
                                           obj3 = obj2.q;
                                           if (obj3 == null) {
                                              a.S("mPhoto");
                                           }
                                           i5 = a.g(qPhoto1, obj3) ^ 1;
                                           if (i5) {
                                              uArrayList1.add(qPhoto1);
                                           label_013c :
                                              i7 = i7 + 1;
                                           }
                                        }
                                     }
                                  }
                                  Rect rect2 = 1;
                                  goto label_013c ;
                               }
                            }
                            list = uArrayList1;
                            break ;
                         }
                      }else {
                         goto label_00d3 ;
                      }
                   }
                }
             }
          }
       label_0032 :
          list = null;
       }
       return list;
    }
}
