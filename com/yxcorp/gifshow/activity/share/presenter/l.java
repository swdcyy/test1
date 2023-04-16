package com.yxcorp.gifshow.activity.share.presenter.l;
import xw8.p0$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xw8.p0;
import java.util.Set;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.util.Collection;
import java.util.List;
import zw8.m;
import com.yxcorp.gifshow.activity.share.presenter.k;
import erd.g;
import crd.b;
import brd.t;
import wkd.b;
import com.kuaishou.android.post.topic.d;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import ekd.q;
import java.lang.Iterable;
import com.google.common.collect.Lists;
import f66.i;
import jq.a;
import q87.c;
import java.util.Iterator;
import gx8.a;
import com.yxcorp.utility.m;
import oq.e;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.yxcorp.gifshow.activity.BasePostActivity;

public class l extends PresenterV2 implements p0$c	// class@0013fe
{
    public p0 p;
    public BasePostActivity q;
    public List r;
    public String s;
    public View t;
    public View u;
    public EmojiEditText v;
    public Set w;
    public List x;
    public List y;

    public void l(){
       super();
       this.w = new HashSet();
       this.x = new ArrayList();
       this.y = new ArrayList();
    }
    public void E8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       this.p.q.add(this);
       if (!PatchProxy.applyVoid(objArray, this, ol, "5")) {
          ArrayList uArrayList = this.v.getKSTextDisplayHandler().e();
          this.x.addAll(uArrayList);
          if (!("review").equalsIgnoreCase(this.s)) {
             this.w.addAll(uArrayList);
          }
       }
       this.X7(this.p.m.subscribe(new m(this), k.b));
       b.a(0x73a785a0).h();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       this.y.clear();
       this.w.clear();
       this.x.clear();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a31f3);
       this.u = m1.f(p0, 0x7f0a3317);
       this.v = m1.f(p0, 0x7f0a0ca8);
       return;
    }
    public void e1(UploadRequest$a p0){
       int i;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "4")) {
          return;
       }
       ArrayList uArrayList = this.v.getKSTextDisplayHandler().e();
       m om = null;
       if (uArrayList.size() > 0) {
          if (!q.f(this.r)) {
             ArrayList uArrayList1 = Lists.c(this.r);
             uArrayList1.containsAll(uArrayList);
             i = uArrayList1.isEmpty() ^ 0x01;
          }else {
             i = 0;
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList, this, ol, "7")) {
             Object[] objArray = new Object[om];
             a.b().w("ShareAdjustPresenter", "filterDefaultTopic", objArray);
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                if (this.w.contains(str) && !this.y.contains(str)) {
                   iterator.remove();
                }
             }
          }
          c.k(new a(e.b(), uArrayList));
          om = i;
       }
       p0.mIsTopic = om;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.q = this.r8("SHARE_ACTIVITY");
       this.r = this.r8("SHARE_TAG");
       this.s = this.t8("SHARE_FROM_PAGE");
       return;
    }
}
