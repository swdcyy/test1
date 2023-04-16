package com.kuaishou.live.core.show.profilecard.widget.LiveProfileAvatarImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import lnc.a1;
import android.widget.ImageView;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveProfileAvatarImageView extends KwaiImageView	// class@000dfe
{
    public final Drawable x;

    public void LiveProfileAvatarImageView(Context p0){
       super(p0, null);
    }
    public void LiveProfileAvatarImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveProfileAvatarImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = ContextCompat.getDrawable(p0, 0x7f0813ef);
       this.setPadding(a1.e(0.30f), a1.e(0.30f), a1.e(0.30f), a1.e(0.30f));
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileAvatarImageView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       this.x.setBounds(0, 0, this.getWidth(), this.getHeight());
       this.x.draw(p0);
       return;
    }
}
