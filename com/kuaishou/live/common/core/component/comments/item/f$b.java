package com.kuaishou.live.common.core.component.comments.item.f$b;
import ml8.d;
import k81.h;
import android.view.View;
import com.kuaishou.live.common.core.component.comments.item.f$a;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.common.core.component.comments.model.LiveAudienceGuideMessage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import hf1.g;
import android.view.View$OnClickListener;
import hf1.h;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.user.User;
import va1.l0;
import ne1.k;
import lnc.a1;
import ekd.m1;

public class f$b extends h implements d	// class@0010a1
{
    public final f$a f;
    public final f$a g;
    public TextView h;
    public TextView i;
    public TextView j;
    public KwaiImageView k;

    public void f$b(View p0,f$a p1,f$a p2){
       super(p0);
       this.doBindView(p0);
       this.f = p1;
       this.g = p2;
    }
    public void a(View p0,QLiveMessage p1,int p2){
       if (!PatchProxy.isSupport(f$b.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, f$b.class, "1")) {
          this.h.setText(p1.mTitleText);
          this.i.setText(p1.mSubtitleText);
          this.j.setText(p1.mActionButtonText);
          this.j.setOnClickListener(new g(this, p1));
          this.k.setOnClickListener(new h(this, p1));
          l0.a(this.k, p1.mAnchorUser);
          if (k.c()) {
             this.h.setTextColor(a1.a(R.color.arg_RES_7f060687));
             this.d(this.h);
             this.d(this.i);
          }
       }
       return;
    }
    public final void d(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "2")) {
          return;
       }
       p0.setShadowLayer((float)a1.e(0x3f800000), (float)a1.e(0), (float)a1.e(0x3f800000), a1.a(R.color.arg_RES_7f060197));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "3")) {
          return;
       }
       this.k = m1.f(p0, 0x7f0a0333);
       this.h = m1.f(p0, 0x7f0a3f2c);
       this.i = m1.f(p0, 0x7f0a3bf5);
       this.j = m1.f(p0, 0x7f0a0093);
       return;
    }
}
