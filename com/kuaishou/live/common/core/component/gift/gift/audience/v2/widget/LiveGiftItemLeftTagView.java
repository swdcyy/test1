package com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftItemLeftTagView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveClipBoundTextView;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftItemLeftTagData;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemRightPictureInfo;
import java.util.Collection;
import ekd.q;
import java.util.List;
import rm1.e;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import ml1.b;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.text.TextPaint;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class LiveGiftItemLeftTagView extends FrameLayout	// class@001297
{
    public KwaiImageView b;
    public LiveClipBoundTextView c;
    public LiveGiftItemLeftTagData d;
    public static final int e;

    static {
       LiveGiftItemLeftTagView.e = a1.e(24.00f);
    }
    public void LiveGiftItemLeftTagView(Context p0){
       super(p0, null);
    }
    public void LiveGiftItemLeftTagView(Context p0,AttributeSet p1){
       super(p0, p1);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0b37, this);
       if (PatchProxy.applyVoid(null, this, LiveGiftItemLeftTagView.class, "7")) {
       }else {
          this.b = this.findViewById(0x7f0a1d4c);
          this.c = this.findViewById(0x7f0a1d45);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveGiftItemLeftTagView.class, "1")) {
          return;
       }
       LiveGiftItemLeftTagView td = this.d;
       int i = 8;
       if (td == null || (td.mShouldGoneOnSelected != null && this.isSelected())) {
          this.b.setVisibility(i);
          this.c.setVisibility(i);
          return;
       }else if(this.d.isDynamicTag()){
          this.b.setVisibility(i);
          this.c.setVisibility(0);
          this.c.setBackgroundColor(this.d.mDynamicBackgroundColor);
          this.c.setText(this.d.mShortDynamicText);
       }else {
          this.c.setVisibility(i);
          LiveGiftItemLeftTagView tb = this.b;
          if (!PatchProxy.applyVoidOneRefs(tb, this, LiveGiftItemLeftTagView.class, "3")) {
             LiveGiftItemLeftTagData mGiftPanelIt = this.d.mGiftPanelItemRightPictureInfo;
             if (mGiftPanelIt == null || q.f(mGiftPanelIt.mPictureUrls)) {
                mGiftPanelIt = this.d.mStaticDefaultIcons;
                if (!PatchProxy.applyVoidTwoRefs(tb, mGiftPanelIt, this, LiveGiftItemLeftTagView.class, "4")) {
                   if (q.f(mGiftPanelIt)) {
                      tb.setVisibility(i);
                   }else {
                      tb.setVisibility(0);
                      if (!(mGiftPanelIt.get(0).getUrl()).equals(tb.getTag())) {
                         i = mGiftPanelIt.size();
                         CDNUrl[] uCDNUrlArray = new CDNUrl[i];
                         for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                            uCDNUrlArray[i1] = mGiftPanelIt.get(i1);
                         }
                         a$a uoa = a.d();
                         uoa.b(":ks-features:ft-live:live-features:live-common");
                         uoa.d(ImageSource.ICON);
                         tb.Y(uCDNUrlArray, uoa.a(), new b(this, tb));
                         tb.setTag(mGiftPanelIt.get(0).getUrl());
                      }
                   }
                }
             }else {
                tb.setVisibility(0);
                e.b(tb, mGiftPanelIt.mPictureUrls, a1.e((float)mGiftPanelIt.mWidth), a1.e((float)mGiftPanelIt.mHeight), (float)a1.e(mGiftPanelIt.mCornerRadius), (float)a1.e((float)mGiftPanelIt.mBorderWidth), mGiftPanelIt.mBorderColor, -1, -1);
             }
          }
       }
       return;
    }
    public LiveGiftItemLeftTagData getLeftTagData(){
       return this.d;
    }
    public TextPaint getTextPaint(){
       Object obj = PatchProxy.apply(null, this, LiveGiftItemLeftTagView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getPaint();
    }
    public void setLeftTagData(LiveGiftItemLeftTagData p0){
       this.d = p0;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(LiveGiftItemLeftTagView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftItemLeftTagView.class, "5")) {
          return;
       }
       super.setSelected(p0);
       this.a();
       return;
    }
}
