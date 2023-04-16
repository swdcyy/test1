package com.kwai.tokenshare.presenter.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import fu7.y;
import android.view.View$OnClickListener;
import fu7.z;
import com.kwai.tokenshare.KwaiTokenDialog;

public class m extends PresenterV2	// class@001949
{
    public TextView p;
    public TextView q;
    public ShareTokenInfo r;
    public KwaiTokenDialog s;

    public void m(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.p.setText(this.r.mTokenDialog.mSource);
       this.q.setText(this.r.mTokenDialog.mErrorMessage);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0a92);
       this.p = m1.f(p0, 0x7f0a3a8f);
       m1.a(p0, new y(this), R.id.close);
       m1.a(p0, new z(this), R.id.source);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.r = this.q8(ShareTokenInfo.class);
       this.s = this.q8(KwaiTokenDialog.class);
       return;
    }
}
