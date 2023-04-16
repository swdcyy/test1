package com.kwai.live.gzone.emotion.f$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.emotion.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import java.lang.Integer;
import com.kwai.live.gzone.emotion.f$a$a;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class f$a extends PresenterV2	// class@000cdd
{
    public EmotionInfo p;
    public TextView q;
    public KwaiImageView r;
    public TextView s;
    public TextView t;
    public final f u;

    public void f$a(f p0){
       this.u = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "3")) {
          return;
       }
       this.q.setText(this.p.mEmotionName);
       this.r.P(this.p.mEmotionImageSmallUrl);
       Object[] objArray = new Object[]{Integer.valueOf(this.p.mPrice)};
       this.s.setText(String.format(a1.p(R.string.arg_RES_7f1018e6), objArray));
       if (this.p.mPayStatus == null) {
          this.t.setText(R.string.arg_RES_7f102412);
          this.t.setEnabled(1);
       }else {
          this.t.setText(R.string.arg_RES_7f102419);
          this.t.setEnabled(0);
       }
       this.t.setOnClickListener(new f$a$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1f36);
       this.r = m1.f(p0, 0x7f0a1edd);
       this.q = m1.f(p0, 0x7f0a1edc);
       this.t = m1.f(p0, 0x7f0a1edf);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       this.p = this.q8(EmotionInfo.class);
       return;
    }
}
