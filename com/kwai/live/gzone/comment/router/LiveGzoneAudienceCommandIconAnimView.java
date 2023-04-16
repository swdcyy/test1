package com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import lnc.a1;
import com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.net.Uri;
import com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView$b;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;

public class LiveGzoneAudienceCommandIconAnimView extends RelativeLayout	// class@000ca3
{
    public int b;
    public int c;
    public final List d;
    public String e;
    public int f;
    public int g;
    public Random h;
    public float i;
    public LinkedBlockingQueue j;
    public final int k;
    public final int l;
    public final List m;
    public boolean n;
    public Runnable o;

    public void LiveGzoneAudienceCommandIconAnimView(Context p0){
       super(p0, null);
    }
    public void LiveGzoneAudienceCommandIconAnimView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneAudienceCommandIconAnimView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       ArrayList uArrayList = new ArrayList();
       this.d = uArrayList;
       this.h = new Random();
       this.j = new LinkedBlockingQueue();
       int i = a1.e(15.00f);
       this.k = i;
       int i1 = a1.e(50.00f);
       this.l = i1;
       ArrayList uArrayList1 = new ArrayList();
       this.m = uArrayList1;
       this.o = new LiveGzoneAudienceCommandIconAnimView$a(this);
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceCommandIconAnimView.class, "3")) {
       }else if(PatchProxy.applyVoid(null, this, LiveGzoneAudienceCommandIconAnimView.class, "8")){
          if (!uArrayList.size()) {
             uArrayList.add("https://static.yximgs.com/udata/pkg/kwai-client-image/gzone/spring/live_gzone_audience_command_lottery_new_anim_icon1.webp");
             uArrayList.add("https://static.yximgs.com/udata/pkg/kwai-client-image/gzone/spring/live_gzone_audience_command_lottery_new_anim_icon2.webp");
             uArrayList.add("https://static.yximgs.com/udata/pkg/kwai-client-image/gzone/spring/live_gzone_audience_command_lottery_new_anim_icon3.webp");
          }
          this.e = this.getRandomBitmapPath();
          if (!uArrayList1.size()) {
             uArrayList1.add(Integer.valueOf(a1.e(40.00f)));
             uArrayList1.add(Integer.valueOf(a1.e(45.00f)));
             uArrayList1.add(Integer.valueOf(a1.e(50.00f)));
          }
       }
       this.b = i1;
       this.c = i1 + (i * 2);
       return;
    }
    public final void a(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceCommandIconAnimView.class, "6")) {
          return;
       }
       if (this.n != null) {
          p0.setImageResource(R.drawable.arg_RES_7f08122c);
          return;
       }else {
          p0.B(Uri.parse(this.e), 0, 0, new LiveGzoneAudienceCommandIconAnimView$b(this, p0));
          return;
       }
    }
    public String getRandomBitmapPath(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAudienceCommandIconAnimView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.get(this.h.nextInt(this.d.size()));
    }
    public int getRandomBitmapSize(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAudienceCommandIconAnimView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.m.get(this.h.nextInt(this.m.size())).intValue();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceCommandIconAnimView.class, "15")) {
          return;
       }
       super.onDetachedFromWindow();
       this.j.clear();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveGzoneAudienceCommandIconAnimView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGzoneAudienceCommandIconAnimView.class, "4")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.g = this.getMeasuredWidth();
       this.f = this.getMeasuredHeight();
       return;
    }
}
