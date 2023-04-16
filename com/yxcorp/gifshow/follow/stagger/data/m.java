package com.yxcorp.gifshow.follow.stagger.data.m;
import o26.c;
import com.yxcorp.gifshow.follow.stagger.data.i;
import nga.h;
import iia.o1;
import e50.i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import com.yxcorp.gifshow.follow.stagger.data.j;
import tkd.b;
import tkd.d;
import lv5.d;
import o26.d;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import jb5.d;
import qvb.n0;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import yga.c;
import com.google.common.collect.ImmutableList;
import java.lang.Iterable;
import qk.m;
import pia.x;
import ok.o;
import java.lang.StringBuilder;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Map;
import java.lang.Integer;
import com.yxcorp.gifshow.follow.stagger.data.l;
import java.util.Comparator;
import java.util.Collections;
import com.kwai.robust.PatchProxyResult;
import rja.c;
import o26.b;
import java.util.Set;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import la6.b;
import com.yxcorp.gifshow.follow.stagger.data.k;
import java.lang.Number;
import pia.w;
import qk.y;
import vja.b;
import ok.n;
import qvb.a;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.kcube.TabIdentifier;
import r26.a;
import on5.b;
import com.kuaishou.android.model.mix.PhotoMeta;

public class m extends i implements c	// class@00117c
{
    public final List T;
    public final List U;
    public final d U0;
    public c V;
    public boolean W;
    public int X;
    public long Y;
    public j Z;
    public static final int V0;

    public void m(h p0,o1 p1,i p2,RecyclerView p3){
       super(p1, p2, p3);
       this.T = new ArrayList();
       this.U = new ArrayList();
       this.W = true;
       this.Z = new j();
       d uod = d.a(-447917650).XV();
       this.U0 = uod;
       uod.J5(this);
       this.Y = 0xea60;
       this.E = p0;
    }
    public void Dc(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "9")) {
          return;
       }
       this.U.add(p0);
       return;
    }
    public void K2(HomeFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "6")) {
          return;
       }
       super.K2(p0, p1);
       if (!this.K()) {
          return;
       }
       KsLogFollowTag fOLLOW_POST = KsLogFollowTag.FOLLOW_POST;
       String str = "NewPublishHomeFollowPageList";
       fOLLOW_POST.appendTag(str);
       c.i(fOLLOW_POST, "onLoadItemFromResponse");
       this.X = p0.mLiveStreamStrategy;
       if (this.W != null) {
          this.W = false;
          this.k3();
          ImmutableList immutableLis = m.s(this.i3(this.U0.se())).p(new x(this)).B();
          c.i(fOLLOW_POST.appendTag(str), "filterCompletedProfileMockFeeds size "+immutableLis.size());
          this.T.addAll(immutableLis);
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = this.T.iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (qPhoto == null || !r1.b3(qPhoto.mEntity)) {
             continue ;
          }else {
             m tZ = this.Z;
             HomeFeedResponse mMasterNewPh = p0.mMasterNewPhotoPendingStatus;
             int i = 1;
             int i1 = 3;
             boolean b = (this.H == i1)? true: false;
             Objects.requireNonNull(tZ);
             j oj = j.class;
             if (PatchProxy.isSupport(oj)) {
                Object[] objArray = new Object[6];
                objArray[0] = mMasterNewPh;
                objArray[i] = p1;
                objArray[2] = uArrayList;
                objArray[i1] = uArrayList1;
                objArray[4] = qPhoto;
                objArray[5] = Boolean.valueOf(b);
                if (PatchProxy.applyVoid(objArray, tZ, oj, "3")) {
                   continue ;
                }
             }
             if (mMasterNewPh != null && (mMasterNewPh.size() > 0 && mMasterNewPh.get(qPhoto.getPhotoId()) == Boolean.FALSE)) {
                uArrayList1.add(qPhoto);
                j.a.remove(qPhoto.getPhotoId());
             }else {
                Map a = j.a;
                if (a.containsKey(qPhoto.getPhotoId())) {
                   Integer integer = a.get(qPhoto.getPhotoId());
                   if (integer == null || !integer.intValue()) {
                      uArrayList1.add(qPhoto);
                      a.remove(qPhoto.getPhotoId());
                   }else if(b){
                      i1 = integer.intValue() - i;
                      a.put(qPhoto.getPhotoId(), Integer.valueOf(i1));
                   }
                   tZ.a(p1, uArrayList, uArrayList1, qPhoto);
                }else {
                   tZ.a(p1, uArrayList, uArrayList1, qPhoto);
                }
             }
          }
       }
       Iterator iterator1 = uArrayList1.iterator();
       while (iterator1.hasNext()) {
          this.U0.c5(iterator1.next());
       }
       this.T.removeAll(uArrayList1);
       Collections.sort(uArrayList, l.b);
       p1.addAll(false, uArrayList);
       iterator1 = this.U.iterator();
       while (iterator1.hasNext()) {
          iterator1.next().setProductsNeedBoostFansTop(false);
       }
       this.U.clear();
       return;
    }
    public String L(){
       Object obj = PatchProxy.apply(null, this, m.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.M.e()) {
          return "default";
       }
       if (this.M.j()) {
          return "time";
       }
       return "default";
    }
    public void M1(Object p0,List p1){
       this.K2(p0, p1);
    }
    public void S9(){
       b.b(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, m.class, "5")) {
          return;
       }
       c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("NewPublishHomeFollowPageList"), "refresh");
       super.a();
       return;
    }
    public String b3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, m.class, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Z;
       Objects.requireNonNull(obj);
       ArrayList obj1 = PatchProxy.apply(objArray, obj, j.class, "2");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          String str = "";
          obj1 = new ArrayList(j.a.keySet());
          int i = 0;
          while (i < obj1.size()) {
             String str1 = obj1.get(i);
             str = (!i)? str+str1: str+","+str1;
             i = i + 1;
          }
          str = str;
          if (!TextUtils.x(str)) {
             objArray = str;
          }
       }
       return objArray;
    }
    public void d2(b p0,List p1){
       this.K2(p0, p1);
    }
    public final ImmutableList i3(ImmutableList p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m.s(p0).p(k.b).B();
    }
    public final int j3(List p0,QPhoto p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return y.o(p0, new w(p1));
    }
    public void k3(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.U0.Y5();
       return;
    }
    public boolean l3(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       c.i(KsLogFollowTag.FOLLOW_POST.appendTag("NewPublishHomeFollowPageList"), "removeUploadPhoto");
       this.U0.ec(p0);
       if (!this.U0.c5(p0) || !p0.isMine()) {
          return false;
       }
       this.n3(this.U0.Id());
       return true;
    }
    public void m3(c p0){
       this.V = p0;
    }
    public final void n3(ImmutableList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "12")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_POST.appendTag("NewPublishHomeFollowPageList"), "setMockFeedDataAndUpdate");
       ArrayList uArrayList = new ArrayList();
       boolean b = (b.c() == 8)? true: false;
       Iterator iterator = this.T.iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (this.j3(p0, qPhoto) < 0) {
             uArrayList.add(qPhoto);
          }
       }
       this.T.clear();
       n.j(p0);
       this.T.addAll(p0);
       this.p1();
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          this.remove(iterator1.next());
       }
       uArrayList.clear();
       iterator1 = this.T.iterator();
       while (iterator1.hasNext()) {
          QPhoto qPhoto1 = iterator1.next();
          if (qPhoto1 == null || !r1.b3(qPhoto1.mEntity)) {
             continue ;
          }else {
             int i = this.j3(this.getItems(), qPhoto1);
             qPhoto1.setEnableV4Head(b);
             if (i < 0) {
                this.add(0, qPhoto1);
             }else {
                this.set(i, qPhoto1);
             }
          }
       }
       this.J();
       return;
    }
    public void tc(PostStatus p0,int p1,float p2,TabIdentifier p3){
       b.c(this, p0, p1, p2, p3);
    }
    public void u4(ImmutableList p0,a p1,boolean p2){
       boolean b;
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, m.class, "7")) {
          return;
       }
       TabIdentifier tabIdentifie = b.e(p1);
       TabIdentifier c = b.c;
       if (!c.equals(tabIdentifie)) {
          return;
       }
       if (!c.equals(tabIdentifie) && p1.getStatus() != PostStatus.UPLOAD_COMPLETE) {
          return;
       }
       p0 = this.i3(p0);
       b = this.isEmpty();
       this.n3(p0);
       m tZ = this.Z;
       Objects.requireNonNull(tZ);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tZ, j.class, "1") && (p1 != null && p1.getStatus() == PostStatus.UPLOAD_COMPLETE)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (!TextUtils.x(qPhoto.getPhotoId()) && (qPhoto.getPhotoMeta() != null && qPhoto.getPhotoMeta().mPostWorkStatus == PostStatus.UPLOAD_COMPLETE)) {
                Map a = j.a;
                if (!a.containsKey(qPhoto.getPhotoId())) {
                   a.put(qPhoto.getPhotoId(), Integer.valueOf(3));
                }
             }
          }
       }
       tZ = this.V;
       if (tZ != null) {
          tZ.u4(p0, p1, p2);
       }
       if (p2 && b) {
          m tV = this.V;
          if (tV != null) {
             tV.S9();
          }
       }
       return;
    }
}
