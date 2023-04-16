package com.yxcorp.gifshow.follow.common.data.PymiLivingFixedPageList;
import mb5.c;
import qvb.f;
import com.yxcorp.gifshow.follow.common.data.PymiLivingFixedPageList$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.follow.common.data.PymiLivingFixedPageList$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import qvb.n0;
import com.yxcorp.gifshow.follow.common.data.FeedsLiveResponse;
import qvb.a;
import mb5.b;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import yga.c;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.o;
import java.lang.Boolean;

public final class PymiLivingFixedPageList extends f implements c	// class@001024
{
    public List p;
    public static final PymiLivingFixedPageList$a q;

    static {
       PymiLivingFixedPageList.q = new PymiLivingFixedPageList$a(null);
    }
    public void PymiLivingFixedPageList(List p0){
       a.p(p0, "mLivingPhotos");
       super();
       this.p = p0;
       this.p = SequencesKt___SequencesKt.W2(SequencesKt___SequencesKt.b1(CollectionsKt___CollectionsKt.l1(p0), PymiLivingFixedPageList$1.INSTANCE));
       FeedsLiveResponse uFeedsLiveRe = this.L0();
       if (uFeedsLiveRe == null) {
          uFeedsLiveRe = new FeedsLiveResponse();
          uFeedsLiveRe.mQPhotos = this.p;
       }
       this.S1(uFeedsLiveRe);
       this.b(this.p);
       return;
    }
    public void B(){
       b.a(this);
    }
    public boolean E1(){
       return false;
    }
    public t I1(){
       FeedsLiveResponse obj = PatchProxy.apply(null, this, PymiLivingFixedPageList.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_PYMI.appendTag("PymiLivingFixedPageList"), "onCreateRequest");
       obj = new FeedsLiveResponse();
       obj.mQPhotos = this.p;
       t ot = t.just(obj);
       a.o(ot, "Observable.just\(response\)");
       return ot;
    }
    public void h0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PymiLivingFixedPageList.class, "3")) {
          return;
       }
       a.p(p0, "list");
       Iterator iterator = p0.iterator();
       a uoa = null;
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (!qPhoto.isShowed() && !qPhoto.isRecShowed()) {
             int i = this.b.indexOf(qPhoto);
             if (i > -1) {
                this.b.remove(i);
             }
          }
          uoa = 1;
       }
       if (uoa != null) {
          this.c.k(false);
       }
       return;
    }
    public boolean i(){
       return false;
    }
    public boolean remove(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, PymiLivingFixedPageList.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "item");
          c.i(KsLogFollowTag.FOLLOW_PYMI.appendTag("PymiLivingFixedPageList"), "remove");
          this.p.remove(p0);
          b = super.remove(p0);
       }
       return b;
    }
}
