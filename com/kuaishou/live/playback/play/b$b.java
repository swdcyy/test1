package com.kuaishou.live.playback.play.b$b;
import k51.c;
import com.kuaishou.live.playback.play.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.entity.QPhoto;
import jp.a;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import jd.c;
import wb5.g;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.playback.LivePlaybackPlayState;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import ki3.s0;
import android.view.View$OnClickListener;
import ki3.t0;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b$b extends c	// class@000d30
{
    public KwaiImageView p;
    public View q;
    public TextView r;
    public ImageView s;
    public TextView t;
    public QPhoto u;
    public final b v;

    public void b$b(b p0){
       this.v = p0;
       super();
    }
    public void E8(){
       b$b uob = b$b.class;
       if (PatchProxy.applyVoid(null, this, uob, "3")) {
          return;
       }
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-live:live-external:live-playback");
       uoa.d(ImageSource.DETAIL_COVER_VIDEO);
       a uoa1 = uoa.a();
       g.m(this.p, this.u.mEntity, a.d, null, null, uoa1, a1.a(R.color.arg_RES_7f060c9a));
       this.q.setSelected(this.u.equals(this.v.x));
       if (this.u.equals(this.v.x)) {
          this.s.setVisibility(0);
          LivePlaybackPlayState value = this.v.y.getValue();
          if (!PatchProxy.applyVoidOneRefs(value, this, uob, "4")) {
             if (value == LivePlaybackPlayState.PLAYING) {
                this.s.setImageResource(R.drawable.arg_RES_7f0813d6);
             }else if(value == LivePlaybackPlayState.PAUSE){
                this.s.setImageResource(R.drawable.arg_RES_7f0813d7);
             }
          }
       }else {
          this.s.setVisibility(8);
       }
       if (!TextUtils.x(r1.p0(this.u.mEntity))) {
          this.r.setText(r1.p0(this.u.mEntity));
       }else {
          this.r.setText("");
       }
       if (!this.v.r1(this.u)) {
          this.t.setVisibility(0);
       }else {
          this.t.setVisibility(8);
       }
       this.s.setOnClickListener(new s0(this));
       this.p.setOnClickListener(new t0(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a2306);
       this.p = m1.f(p0, 0x7f0a231e);
       this.q = m1.f(p0, 0x7f0a231f);
       this.s = m1.f(p0, 0x7f0a2312);
       this.t = m1.f(p0, 0x7f0a230c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       this.u = this.q8(QPhoto.class);
       return;
    }
}
