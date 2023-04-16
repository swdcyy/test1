package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$d;
import qvb.f;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.share.copywriting.CopyWritingList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Collection;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import cx8.h;
import cx8.g;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$d$a;
import erd.g;
import qvb.n0;

public final class ShareCopyWritingListFragment$d extends f	// class@001383
{
    public final ShareCopyWritingListFragment p;

    public void ShareCopyWritingListFragment$d(ShareCopyWritingListFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       t ot;
       Object[] objArray = null;
       ShareCopyWritingListFragment$d obj = PatchProxy.apply(objArray, this, ShareCopyWritingListFragment$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj.N == null && obj.O != obj.P) {
          ot = t.just(new CopyWritingList(new ArrayList()));
          a.o(ot, "Observable.just\(CopyWritingList\(ArrayList\(\)\)\)");
          return ot;
       }else {
          CopyWritingList uCopyWriting = obj.Ih();
          if (uCopyWriting != null) {
             objArray = uCopyWriting.getItems();
          }
          obj = null;
          String str = (objArray == null || objArray.isEmpty())? 1: null;
          if (!str) {
             ot = t.just(this.p.Ih());
             a.o(ot, "Observable.just\(recommendList\)");
             return ot;
          }else {
             Object[] objArray1 = new Object[obj];
             a.b().w("ShareCopyWritingListFg", "onCreateRequest: "+this.p.Gh()+",  "+this.p.Hh()+", "+' '+this.p.Jh()+", "+this.p.Kh(), objArray1);
             obj = this.p;
             ot = g.a().j(this.p.Gh(), this.p.Hh(), this.p.Jh(), obj.G, obj.Kh()).map(new e()).doOnNext(new ShareCopyWritingListFragment$d$a(this));
             a.o(ot, "PublishApi.getApiService¡­mShowIfNeed\(\)\n          }");
             return ot;
          }
       }
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ShareCopyWritingListFragment$d.class, "2")) {
          return;
       }
       this.p0();
       super.a();
       return;
    }
}
