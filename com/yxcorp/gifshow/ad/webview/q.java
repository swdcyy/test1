package com.yxcorp.gifshow.ad.webview.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.webview.q$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tw.j;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mxb.c;
import android.view.View;
import android.widget.RelativeLayout;
import ekd.i;
import com.yxcorp.gifshow.webview.helper.StateListImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import k59.a3;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.Integer;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;

public class q extends PresenterV2	// class@001915
{
    public KwaiActionBar p;
    public BaseFeed q;
    public int r;
    public KwaiYodaWebViewFragment s;
    public KwaiYodaWebViewFragment t;
    public final WebViewFragment$a u;

    public void q(){
       super();
       this.u = new q$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       q tq = this.q;
       if (tq == null || (j.k(tq) == null || (this.getActivity() instanceof GifshowActivity && !c.a0(this.q)))) {
          PhotoAdvertisement photoAdverti = j.k(this.q);
          View view = this.p.findViewById(R.id.right_btn);
          int i = (("4").equals(String.valueOf(this.r)) && i.c())? 0x7f080093: 0x7f080092;
          if (view instanceof StateListImageView) {
             View view1 = view;
             view1.a(i);
             view1.c(i);
             view.setVisibility(0);
             this.R8(photoAdverti, view);
          }else if(view instanceof ImageView){
             view.setImageResource(i);
             view.setVisibility(0);
             this.R8(photoAdverti, view);
          }
          this.P8().ch(this.u);
       }
    label_007f :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       this.P8().fh(this.u);
       return;
    }
    public final KwaiYodaWebViewFragment P8(){
       q ts = this.s;
       if (ts != null) {
          return ts;
       }
       return this.t;
    }
    public final void R8(PhotoAdvertisement p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "4")) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          p1.setOnClickListener(new a3(this, p0));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.p = this.r8("YODA_ACTION_BAR_DELEGATE");
       this.q = this.s8(BaseFeed.class);
       this.r = this.r8("LAYOUT_TYPE").intValue();
       this.s = this.s8(AdYodaFragment.class);
       this.t = this.s8(AdYodaFragment2.class);
       return;
    }
}
