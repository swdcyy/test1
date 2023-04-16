package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.f$a;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.view.View;
import ekd.m1;
import android.text.TextPaint;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;
import io.reactivex.subjects.PublishSubject;

public class f extends PresenterV2	// class@001795
{
    public MerchantRecommendUserManager p;
    public PublishSubject q;
    public Button r;
    public Handler s;

    public void f(){
       super();
       this.s = new Handler();
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "3")) {
          return;
       }
       f tr = this.r;
       if (tr != null) {
          tr.setOnClickListener(new f$a(this));
       }
       PatchProxy.onMethodExit(f.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "5")) {
          return;
       }
       f ts = this.s;
       if (ts != null) {
          ts.removeCallbacksAndMessages(null);
       }
       PatchProxy.onMethodExit(f.class, "5");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "2")) {
          return;
       }
       Button uButton = m1.f(p0, R.id.recommend_user_batch_follow);
       this.r = uButton;
       if (uButton != null) {
          uButton.getPaint().setFakeBoldText(true);
       }
       PatchProxy.onMethodExit(f.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(MerchantRecommendUserManager.class);
       this.q = this.r8("FOLLOW_STATUS_CHANGE");
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
}
