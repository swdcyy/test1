package com.yxcorp.plugin.setting.presenter.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.presenter.m$a;
import com.yxcorp.plugin.setting.presenter.m$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View$OnClickListener;
import android.view.View;
import tgd.w;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.krn.event.a;
import oj0.a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.plugin.setting.presenter.l;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import zw5.a;
import java.util.List;
import tgd.x;
import sfc.a;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import android.util.Pair;
import ekd.m1;
import android.widget.ImageView;

public class m extends PresenterV2	// class@0008e6
{
    public final a A;
    public TextView p;
    public View q;
    public int r;
    public ImageView s;
    public int t;
    public int u;
    public int v;
    public PublishSubject w;
    public g x;
    public j y;
    public View$OnClickListener z;

    public void m(){
       super();
       this.z = new m$a(this);
       this.A = new m$b(this);
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "3")) {
          return;
       }
       int newsPrivate = QCurrentUser.ME.getNewsPrivate();
       this.r = newsPrivate;
       this.S8(newsPrivate, this.v);
       this.q.setOnClickListener(this.z);
       this.X7(this.w.subscribe(new w(this), this.x));
       if (!PatchProxy.applyVoid(objArray, this, om, "14")) {
          a.b().a("news_setting_privacy", this.A);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.w = PublishSubject.g();
       this.t = QCurrentUser.ME.getNewsPrivate();
       QCurrentUser.ME.getNewsPrivate();
       this.v = QCurrentUser.ME.getPrivateNewsBlackCount();
       this.x = l.b;
       return;
    }
    public void J8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "15")) {
          a.b().c("news_setting_privacy", this.A);
       }
       return;
    }
    public final void P8(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "12")) {
          return;
       }
       this.X7(d.a(0x2001f24e).r8(p0, null).subscribe(new x(this, p0), new a()));
       return;
    }
    public int R8(int p0){
       int i = 2;
       if (p0 == 1) {
          return i;
       }
       if (p0 == i) {
          return 1;
       }
       if (p0 != 3) {
          return 0;
       }
       return 3;
    }
    public final void S8(int p0,int p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, om, "5")) {
          return;
       }
       p1 = 0x7f103afd;
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                label_0048 :
                   this.p.setText(p1);
                }else {
                   this.p.setText(R.string.arg_RES_7f1003c5);
                }
             }else {
                this.p.setText(R.string.arg_RES_7f103ae1);
             }
          }else {
             this.p.setText(R.string.arg_RES_7f1017e4);
          }
       }else {
          this.p.setText(p1);
          goto label_0048 ;
       }
       return;
    }
    public final void V8(int p0,List p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "17")) {
          return;
       }
       this.t = p0;
       p0 = (q.f(p1))? 0: p1.size();
       this.v = p0;
       QCurrentUser.ME.startEdit().setPrivateNews(this.t).setPrivateNewsBlackCount(this.v).commitChanges();
       this.w.onNext(new Pair(Integer.valueOf(this.t), Integer.valueOf(this.v)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       this.s = m1.f(p0, 0x7f0a0d61);
       this.q = m1.f(p0, 0x7f0a38a9);
       return;
    }
}
