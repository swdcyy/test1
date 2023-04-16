package com.yxcorp.gifshow.activity.share.presenter.f2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kuaishou.android.post.topic.d;
import brd.t;
import t45.d;
import brd.z;
import zw8.p4;
import com.yxcorp.gifshow.activity.share.presenter.d2;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.share.presenter.f2$a;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import xw8.p0;
import zw8.o4;
import com.yxcorp.gifshow.activity.share.presenter.e2;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.util.ArrayList;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import java.util.List;
import q87.c;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import ekd.m1;

public class f2 extends PresenterV2	// class@0013e1
{
    public RelativeLayout p;
    public LinearLayout q;
    public EmojiEditText r;
    public boolean s;
    public p0 t;

    public void f2(){
       super();
       this.s = true;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f2.class, "3")) {
          return;
       }
       b.a(0x73a785a0).o().observeOn(d.a).subscribe(new p4(this), d2.b);
       this.q.setOnClickListener(new f2$a(this));
       this.X7(this.t.m.subscribe(new o4(this), e2.b));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, f2.class, "5");
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f2.class, "4")) {
          return;
       }
       if (this.s == null) {
          this.p.setVisibility(8);
          return;
       }else if(!this.p.getVisibility()){
          return;
       }else {
          ArrayList uArrayList = this.r.getKSTextDisplayHandler().e();
          Object[] objArray1 = new Object[0];
          a.b().w("ShareUnmatchTopicTipsPresenter", "allTags size = "+uArrayList.size(), objArray1);
          if (b.a(0x73a785a0).i(uArrayList)) {
             this.p.setVisibility(0);
             if (!PatchProxy.applyVoid(objArray, objArray, a.class, "89")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "TOP_NOSENSE_TOPIC_REMIND";
                u1.u0(7, uElementPack, objArray);
             }
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f2.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3918);
       this.q = m1.f(p0, 0x7f0a3917);
       this.r = m1.f(p0, 0x7f0a0ca8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f2.class, "1")) {
          return;
       }
       this.t = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       return;
    }
}
