package com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV3;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.constraintlayout.widget.Group;
import android.widget.ImageView;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveFancyRankResultViewV3 extends LiveFancyRankResultViewV2	// class@000bf2
{
    public TextView r;
    public TextView s;
    public TextView t;
    public KwaiImageView u;
    public Group v;

    public void LiveFancyRankResultViewV3(Context p0){
       super(p0);
    }
    public void LiveFancyRankResultViewV3(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveFancyRankResultViewV3(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public String e(TopDistrictRank p0){
       return p0.extraInfo;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveFancyRankResultViewV3.class, "1")) {
          return;
       }
       super.f();
       this.r = this.findViewById(0x7f0a1c62);
       this.s = this.findViewById(0x7f0a1c64);
       this.t = this.findViewById(0x7f0a1c66);
       this.u = this.findViewById(0x7f0a1c74);
       this.v = this.findViewById(0x7f0a1c63);
       return;
    }
    public void g(TopDistrictRank p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFancyRankResultViewV3.class, "2")) {
          return;
       }
       super.g(p0);
       int i = 0;
       if (p0.enableBenefit != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, LiveFancyRankResultViewV3.class, "3")) {
             this.v.setVisibility(i);
             this.u.setVisibility(8);
             this.h(this.r, p0.benefitTextFirst);
             this.h(this.s, p0.benefitTextSecond);
             this.h(this.t, p0.benefitTextThird);
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, this, LiveFancyRankResultViewV3.class, "5")){
          this.v.setVisibility(8);
          this.u.setVisibility(i);
          if (!j.h(p0.noBenefitPicUrls)) {
             this.u.U(e0.i(p0.noBenefitPicUrls));
          }
       }
       return;
    }
    public int getResourceLayout(){
       return 0x7f0d0aff;
    }
    public final void h(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFancyRankResultViewV3.class, "4")) {
          return;
       }
       if (!TextUtils.x(p1)) {
          p0.setText(p1);
          p0.setVisibility(0);
       }else {
          p0.setVisibility(8);
       }
       return;
    }
}
