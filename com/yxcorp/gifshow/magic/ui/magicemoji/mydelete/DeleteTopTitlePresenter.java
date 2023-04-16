package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter$DeleteTopTitleItem;
import java.lang.CharSequence;
import android.widget.TextView;
import v4b.a;
import android.view.View$OnClickListener;
import android.view.View;
import pm6.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class DeleteTopTitlePresenter extends PresenterV2	// class@001bd1
{
    public TextView p;
    public TextView q;
    public TextView r;
    public DeleteTopTitlePresenter$DeleteTopTitleItem s;
    public e t;
    public static final int u;

    static {
       DeleteTopTitlePresenter.u = a1.e(12.00f);
    }
    public void DeleteTopTitlePresenter(e p0){
       super();
       this.t = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, DeleteTopTitlePresenter.class, "3")) {
          return;
       }
       DeleteTopTitlePresenter ts = this.s;
       if (ts == null) {
          return;
       }
       if (this.p != null) {
          String str = (ts.mToDeleteType == 1)? a1.p(R.string.arg_RES_7f10316b): a1.p(R.string.arg_RES_7f103170);
          this.p.setText(str);
       }
       ts = this.q;
       if (ts != null && this.s.mToDeleteType == 1) {
          ts.setText(a1.p(R.string.arg_RES_7f10316c));
          this.q.setVisibility(0);
       }else if(ts != null){
          ts.setVisibility(8);
       }
       ts = this.r;
       if (ts != null) {
          int i = (this.s.mIsSelectAll != null)? 0x7f1004b4: 0x7f10316f;
          ts.setText(i);
          this.r.setOnClickListener(new a(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DeleteTopTitlePresenter.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int u = DeleteTopTitlePresenter.u;
       int i = (int)(l.i * (float)l.g);
       Object obj = PatchProxy.apply(null, null, l.class, "3");
       int i1 = (obj != PatchProxyResult.class)? obj.intValue(): (int)(l.i * (float)l.h) - a1.e(10.00f);
       p0.setPadding(u, i, u, i1);
       this.p = p0.findViewById(0x7f0a3f2c);
       this.q = p0.findViewById(0x7f0a3bf5);
       this.r = p0.findViewById(0x7f0a3810);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, DeleteTopTitlePresenter.class, "1")) {
          return;
       }
       this.s = this.q8(DeleteTopTitlePresenter$DeleteTopTitleItem.class);
       return;
    }
}
