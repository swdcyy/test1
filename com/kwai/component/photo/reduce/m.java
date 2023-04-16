package com.kwai.component.photo.reduce.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.reduce.m$a;
import com.kwai.robust.PatchProxyResult;
import bg5.a;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import ip.b;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.android.model.mix.QRecoTag;
import android.app.Application;
import o56.a;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import eg5.b;
import android.content.Context;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$l;
import ag5.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import java.util.Set;
import android.widget.Button;
import android.widget.TextView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.content.res.Resources;
import com.yxcorp.gifshow.log.h;
import android.view.View;
import ekd.m1;
import com.kwai.component.photo.reduce.l;
import android.view.View$OnClickListener;

public class m extends PresenterV2	// class@000af3
{
    public m$a A;
    public Button p;
    public TextView q;
    public RecyclerView r;
    public QPhoto s;
    public View$OnClickListener t;
    public int u;
    public int v;
    public boolean w;
    public final Set x;
    public final boolean y;
    public List z;

    public void m(boolean p0){
       super();
       this.x = new HashSet();
       this.y = p0;
    }
    public void E8(){
       ArrayList uArrayList;
       Iterator iterator;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "4")) {
          return;
       }
       this.A = new m$a(this);
       m ts = this.s;
       m tu = this.u;
       m tw = this.w;
       if (PatchProxy.isSupport(a.class)) {
          uArrayList = PatchProxy.applyThreeRefs(ts, Integer.valueOf(tu), Boolean.valueOf(tw), null, a.class, "4");
          if (uArrayList != PatchProxyResult.class) {
          }else {
          label_003e :
             uArrayList = new ArrayList();
             int i = 0x7f103c47;
             int i1 = 4;
             if (ts.isLiveStream()) {
                uArrayList.add(a.a(i1, i));
                uArrayList.add(a.a(6, R.string.arg_RES_7f103c41));
             }else {
                int i2 = 0x7f103c4b;
                if (b.a(-570058679).b(ts.mEntity)) {
                   uArrayList.add(a.b(tw));
                   uArrayList.add(a.a(2, i2));
                   uArrayList.add(a.a(i1, i));
                }else {
                   uArrayList.add(a.a(2, i2));
                   uArrayList.add(a.b(tw));
                   uArrayList.add(a.a(i1, i));
                   uArrayList.add(a.a(7, R.string.arg_RES_7f103c4d));
                }
             }
             if (!q.f(ts.getRecoTags())) {
                iterator = ts.getRecoTags().iterator();
                while (iterator.hasNext()) {
                   QRecoTag qRecoTag = iterator.next();
                   a uoa = PatchProxy.applyOneRefs(qRecoTag, objArray, a.class, "3");
                   if (uoa != PatchProxyResult.class) {
                   }else {
                      Object[] objArray1 = new Object[]{qRecoTag.mName};
                      uoa = new a(5, a.b().getString(0x7f103c42, objArray1), qRecoTag);
                   }
                   uArrayList.add(uoa);
                }
             }
          }
       }else {
          goto label_003e ;
       }
       this.z = uArrayList;
       this.A.W0(uArrayList);
       this.r.setAdapter(this.A);
       this.r.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
       this.r.addItemDecoration(new b(2, 0, 0, n.c(a.b(), 3.00f)));
       this.r.setItemAnimator(objArray);
       ts = this.z;
       if (!PatchProxy.applyVoidOneRefs(ts, objArray, b.class, "1")) {
          ArrayList uArrayList1 = new ArrayList();
          iterator = ts.iterator();
          while (iterator.hasNext()) {
             a c = iterator.next().c;
             if (c != null) {
                uArrayList1.add(c);
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 18;
          uElementPack.name = TextUtils.join("&", uArrayList1);
          uElementPack.action = 1179;
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.elementPackage = uElementPack;
          u1.g0(showEvent);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       SpannableString spannableStr;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "7")) {
          return;
       }
       int i = this.x.size();
       if (!i) {
          this.p.setVisibility(0);
          this.p.setText(R.string.arg_RES_7f103c43);
          this.q.setText(R.string.arg_RES_7f103c4c);
       }else if(i <= 1){
          this.p.setText(R.string.arg_RES_7f1007e2);
       }
       if (i >= 1) {
          m tq = this.q;
          int i1 = 0x7f103c44;
          if (PatchProxy.isSupport(om)) {
             spannableStr = PatchProxy.applyTwoRefs(Integer.valueOf(i1), Integer.valueOf(i), objArray, om, "8");
             if (spannableStr != PatchProxyResult.class) {
             label_0090 :
                tq.setText(spannableStr);
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.type = 1;
                uElementPack.action = 828;
                uElementPack.name = "photo_reduce_reason_confirm";
                ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
                showEvent.elementPackage = uElementPack;
                showEvent.type = 6;
                b.a(0x4b316083).h(showEvent);
             }
          }
          Application uApplication = a.b();
          String str = String.valueOf(i);
          String str1 = uApplication.getString(i1);
          int i2 = str1.indexOf("%1$s");
          SpannableString spannableStr1 = new SpannableString(str1.replace("%1$s", str));
          if (i2 >= 0) {
             spannableStr1.setSpan(new ForegroundColorSpan(uApplication.getResources().getColor(R.color.arg_RES_7f060751)), i2, (str.length() + i2), 33);
          }
          spannableStr = spannableStr1;
          goto label_0090 ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a08fe);
       this.r = m1.f(p0, 0x7f0a34da);
       this.q = m1.f(p0, 0x7f0a3f2c);
       m1.a(p0, new l(this), R.id.confirm_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.s = this.q8(QPhoto.class);
       this.t = this.q8(View$OnClickListener.class);
       this.u = this.r8("SOURCE").intValue();
       this.v = this.v8("POSITION", Integer.class).intValue();
       this.w = this.r8("feed_channel").booleanValue();
       return;
    }
}
