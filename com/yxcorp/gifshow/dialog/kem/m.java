package com.yxcorp.gifshow.dialog.kem.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.dialog.DialogItemViewResponse;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.View;
import x9a.l0;
import android.view.View$OnClickListener;
import x9a.m0;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CheckBox;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import x9a.n0;

public class m extends PresenterV2	// class@001ac8
{
    public KwaiImageView p;
    public CheckBox q;
    public TextView r;
    public TextView s;
    public DialogItemViewResponse t;
    public n0 u;

    public void m(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       this.p.L(this.t.mIconUrl);
       this.r.setText(this.t.mName);
       if (TextUtils.isEmpty(this.t.mDescription)) {
          this.s.setVisibility(8);
       }else {
          this.s.setVisibility(0);
          this.s.setText(this.t.mDescription);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.m8().setOnClickListener(new l0(this));
       this.q.setOnCheckedChangeListener(new m0(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3f7d);
       this.q = m1.f(p0, 0x7f0a382a);
       this.p = m1.f(p0, 0x7f0a1382);
       this.s = m1.f(p0, 0x7f0a3bd6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.t = this.q8(DialogItemViewResponse.class);
       this.u = this.t8("item_click_listener");
       return;
    }
}
