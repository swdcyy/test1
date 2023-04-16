package com.yxcorp.gifshow.activity.share.presenter.m0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xw8.p0;
import zw8.m1;
import com.yxcorp.gifshow.activity.share.presenter.k0;
import erd.g;
import crd.b;
import brd.t;
import zw8.l1;
import com.yxcorp.gifshow.activity.share.presenter.l0;
import com.yxcorp.gifshow.activity.share.presenter.m0$a;
import android.text.TextWatcher;
import android.widget.EditText;
import f66.i;
import jq.a;
import q87.c;
import android.widget.TextView;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.edit.draft.Workspace$Type;
import ow8.c;
import com.kuaishou.edit.draft.Workspace$Source;
import android.text.TextPaint;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.activity.share.presenter.m0$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;

public class m0 extends PresenterV2	// class@001401
{
    public c p;
    public QPhoto q;
    public EmojiEditText r;
    public TextView s;
    public p0 t;
    public RelativeLayout u;
    public boolean v;
    public int w;
    public int x;

    public void m0(){
       super();
       this.v = PostExperimentUtils.A1();
       this.w = a1.e(12.00f);
       this.x = a1.e(20.00f);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "3")) {
          return;
       }
       this.X7(this.t.j.subscribe(new m1(this), k0.b));
       this.X7(this.t.b.subscribe(new l1(this), l0.b));
       this.r.addTextChangedListener(new m0$a(this));
       return;
    }
    public void P8(String p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "4")) {
          return;
       }
       m0 om0 = 1;
       if (this.v != null && (("@").equalsIgnoreCase(p0) || ("£À").equalsIgnoreCase(p0))) {
          objArray = new Object[0];
          a.b().s("ShareEditorTopicHintPresenter", "at hint shown", objArray);
          this.s.setText(R.string.arg_RES_7f104038);
       }else if(("#").equalsIgnoreCase(p0)){
          objArray = new Object[0];
          a.b().s("ShareEditorTopicHintPresenter", "topic hint shown", objArray);
          this.s.setText(R.string.arg_RES_7f104015);
       }else {
          om0 = null;
       }
       if (om0) {
          if (this.u != null) {
             int i = (int)this.r.getPaint().measureText(p0);
             m0 tx = (c.q(c.i(this.p, this.q), c.f(this.p)))? this.x: 0;
             this.u.getViewTreeObserver().addOnGlobalLayoutListener(new m0$b(this, (i + tx)));
          }
          this.s.setVisibility(0);
       }else {
          Object[] objArray1 = new Object[0];
          a.b().s("ShareEditorTopicHintPresenter", "hint hide", objArray1);
          this.s.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0ca8);
       this.s = m1.f(p0, 0x7f0a42e2);
       this.u = m1.f(p0, 0x7f0a307b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "1")) {
          return;
       }
       this.t = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.p = this.t8("WORKSPACE");
       this.q = this.t8("SHARE_QPHOTO");
       return;
    }
}
