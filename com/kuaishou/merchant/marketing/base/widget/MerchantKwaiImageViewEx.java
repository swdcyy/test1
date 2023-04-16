package com.kuaishou.merchant.marketing.base.widget.MerchantKwaiImageViewEx;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class MerchantKwaiImageViewEx extends MerchantKwaiImageView	// class@001afa
{

    public void MerchantKwaiImageViewEx(Context p0){
       super(p0);
    }
    public void MerchantKwaiImageViewEx(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void MerchantKwaiImageViewEx(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKwaiImageViewEx.class, "1")) {
          return;
       }
       super.onDraw(p0);
       if (Build$VERSION.SDK_INT < 30 && this.getDrawable() != null) {
          this.getDrawable().setVisible(true, false);
       }
       return;
    }
}
