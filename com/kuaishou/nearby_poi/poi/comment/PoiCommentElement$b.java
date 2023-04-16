package com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$b;
import qp7.b1;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import lv5.d;
import o26.d;
import java.util.ArrayList;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.util.Collection;
import qn4.a;
import java.util.List;
import java.util.Comparator;
import trd.x;
import qp7.b;
import zsd.u;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;
import com.kuaishou.android.model.mix.Location;
import xw5.c;
import brd.t;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$b$a;
import erd.g;
import crd.b;
import qp7.a1;

public final class PoiCommentElement$b implements b1	// class@000a17
{
    public final PoiCommentElement a;

    public void PoiCommentElement$b(PoiCommentElement p0){
       this.a = p0;
       super();
    }
    public void a(){
       PoiCommentElement a;
       Object[] partData;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PoiCommentElement$b.class, "1")) {
          return;
       }
       PoiCommentElement$b ta = this.a;
       Objects.requireNonNull(ta);
       QPhoto qPhoto = PatchProxy.apply(objArray, ta, PoiCommentElement.class, "8");
       boolean b = false;
       if (qPhoto != PatchProxyResult.class) {
       }else {
          b uob = d.a(-447917650);
          a.o(uob, "PluginManager.get\(MockFeedRepoPlugin::class.java\)");
          d uod = uob.XV();
          ArrayList uArrayList = new ArrayList();
          a = 1;
          if (uod != null) {
             ImmutableList immutableLis = uod.Id();
             if (immutableLis != null) {
                ArrayList uArrayList1 = new ArrayList();
                Iterator iterator = immutableLis.iterator();
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   Object obj1 = obj;
                   a.o(obj1, "it");
                   obj1 = (obj1.getFeedStatus() == PostStatus.UPLOAD_COMPLETE || obj1.getFeedStatus() == null)? 1: null;
                   if (obj1) {
                      uArrayList1.add(obj);
                   }
                }
                uArrayList.addAll(uArrayList1);
             }
          }
          if (uArrayList.size() > 0) {
             if (uArrayList.size() > a) {
                x.p0(uArrayList, new a());
             }
             qPhoto = uArrayList.get(b);
          }else {
             partData = objArray;
          }
       }
       PoiCommentElement$b ta1 = this.a;
       a = ta1.A;
       if (a != null && qPhoto != null) {
          a.m(a);
          if (ta1.s0(a)) {
             this.a.b0();
             return;
          }else {
             PoiCommentElement a1 = this.a.A;
             String photoId = (a1 != null)? a1.getPhotoId(): objArray;
             if (u.J1(photoId, qPhoto.getPhotoId(), b, 2, objArray)) {
                PoiCommentElement a2 = this.a.A;
                if (a2 != null) {
                   BaseFeed entity = a2.getEntity();
                   if (entity != null) {
                      partData = entity.getPartData("BUTTON_CLOSED");
                   label_00d6 :
                      if (a.g(partData, Boolean.TRUE)) {
                         this.a.b0();
                         return;
                      }else {
                         a2 = this.a.A;
                         if (a2 != null) {
                            objArray = a2.getEntity();
                         }
                         int i = w1.r(objArray).toInt();
                         PoiCommentElement a3 = this.a.A;
                         if (a3 != null) {
                            String photoId1 = a3.getPhotoId();
                            if (photoId1 != null) {
                               a1 = this.a.A;
                               if (a1 != null) {
                                  Location location = a1.getLocation();
                                  if (location != null) {
                                     d.a(0x1e777b83).Mr(photoId1, location.getId(), i).subscribe(new PoiCommentElement$b$a(photoId1, this, i));
                                  }
                               }
                            }
                         }
                      }
                   }
                }
                partData = objArray;
                goto label_00d6 ;
             }
          }
       }
    label_0127 :
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, PoiCommentElement$b.class, "2")) {
          return;
       }
       PoiCommentElement$b ta = this.a;
       ta.y = "";
       PoiCommentElement a = ta.A;
       if (a != null) {
          BaseFeed entity = a.getEntity();
          if (entity != null) {
             entity.setPartData("BUTTON_CLOSED", Boolean.TRUE);
          }
       }
       this.a.r0();
       return;
    }
    public void c(boolean p0){
       a1.b(this, p0);
    }
    public void d(boolean p0){
       a1.h(this, p0);
    }
    public void e(boolean p0){
       a1.f(this, p0);
    }
    public void f(boolean p0){
       a1.d(this, p0);
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       a1.c(this);
    }
}
