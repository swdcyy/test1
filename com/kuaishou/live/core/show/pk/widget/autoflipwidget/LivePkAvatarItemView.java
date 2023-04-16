package com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarItemView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;

public class LivePkAvatarItemView extends ConstraintLayout	// class@000db1
{
    public LiveUserView B;

    public void LivePkAvatarItemView(Context p0){
       super(p0, null);
    }
    public void LivePkAvatarItemView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LivePkAvatarItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0cf2, this);
       LiveUserView liveUserView = this.findViewById(R.id.live_pk_avatar_image_view);
       this.B = liveUserView;
       liveUserView.getHierarchy().D(R.drawable.detail_avatar_secret);
    }
    public void L(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkAvatarItemView.class, "1")) {
          return;
       }
       if (p0 instanceof UserInfo) {
          this.B.p0(p0, HeadImageSize.SMALL, false);
       }else if(p0 instanceof String){
          d0.c(this.B, p0, true);
       }
       return;
    }
}
