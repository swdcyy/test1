package com.kuaishou.live.core.basic.widget.LiveKwaiImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.model.CDNUrl;

public class LiveKwaiImageView extends KwaiImageView	// class@000907
{
    public String x;
    public UserInfo y;

    public void LiveKwaiImageView(Context p0){
       super(p0);
    }
    public void LiveKwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveKwaiImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void L(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKwaiImageView.class, "1")) {
          return;
       }
       if (TextUtils.n(p0, this.x)) {
          return;
       }
       this.x = p0;
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-live:live-libraries:live-widget");
       uoa.d(ImageSource.WIDGET_IMAGE);
       this.M(p0, uoa.a());
       return;
    }
    public void p0(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKwaiImageView.class, "2")) {
          return;
       }
       LiveKwaiImageView ty = this.y;
       if (ty != null && TextUtils.n(ty.mId, p0.mId)) {
          return;
       }
       this.y = p0;
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-live:live-libraries:live-widget");
       uoa.d(ImageSource.WIDGET_IMAGE);
       this.X(p0.mHeadUrls, uoa.a());
       return;
    }
}
