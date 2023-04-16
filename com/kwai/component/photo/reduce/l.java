package com.kwai.component.photo.reduce.l;
import android.view.View$OnClickListener;
import com.kwai.component.photo.reduce.m;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import bg5.a;
import com.kuaishou.android.model.mix.QRecoTag;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import cg5.c;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.i3;
import cjd.e;
import erd.o;
import yf5.t1;
import sfc.a;
import erd.g;
import crd.b;
import java.util.Collection;
import ag5.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import wkd.b;
import l66.a;
import dda.i;
import m66.a;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import gda.a;
import com.yxcorp.gifshow.action.c;

public final class l implements View$OnClickListener	// class@000af0
{
    public final m b;

    public void l(m p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       t ot;
       l tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, m.class, "5")) {
       }else {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          int i = 1;
          if (tb.x.isEmpty()) {
             uArrayList.add(String.valueOf(i));
          }else {
             Iterator iterator1 = tb.x.iterator();
             while (iterator1.hasNext()) {
                a uoa = iterator1.next();
                String str2 = String.valueOf(uoa.a);
                if (!uArrayList.contains(str2)) {
                   uArrayList.add(str2);
                }
                uoa = uoa.b;
                if (uoa != null) {
                   uArrayList1.add(uoa.mId);
                }
             }
          }
          String str = TextUtils.join(",", uArrayList);
          String str1 = TextUtils.join(",", uArrayList1);
          String url = tb.getActivity().getUrl();
          m s = tb.s;
          m u = tb.u;
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             Object[] objArray1 = new Object[]{s,Integer.valueOf(u),url,str,str1};
             ot = PatchProxy.apply(objArray1, objArray, uoc, "3");
             if (ot != PatchProxyResult.class) {
             label_00aa :
                ot.subscribe(new t1(tb), new a());
                m s1 = tb.s;
                m v = tb.v;
                ArrayList uArrayList2 = new ArrayList(tb.x);
                if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(s1, Integer.valueOf(v), uArrayList2, null, b.class, "2")) {
                   ArrayList uArrayList3 = new ArrayList();
                   Iterator iterator = uArrayList2.iterator();
                   while (iterator.hasNext()) {
                      uArrayList3.add(iterator.next().c);
                   }
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.type = i;
                   uElementPack.name = TextUtils.join("&", uArrayList3);
                   int i1 = (q.f(uArrayList2))? 1169: 828;
                   uElementPack.action = i1;
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.photoPackage = w1.g(s1.getEntity(), v);
                   u1.u(i, uElementPack, uContentPack);
                }
                b.a(0x6d2a4fdd).b(new i(tb.s.mEntity, TextUtils.join("&", uArrayList)));
                RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
                uExtParams.mNegativeType = a.b(TextUtils.join("&", uArrayList), tb.s.mEntity);
                c.b(9, tb.s.mEntity, uExtParams);
                m t = tb.t;
                if (t != null) {
                   t.onClick(tb.p);
                }
             }
          }
          ot = c.a(s, u, url, str, str1, -1, null, null).map(new e());
          goto label_00aa ;
       }
       return;
    }
}
