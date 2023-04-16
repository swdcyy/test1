package com.kuaishou.android.live.doublelist.danmaku.b$b;
import op.j;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import android.view.View;
import java.lang.Integer;
import i2b.a;
import com.kuaishou.android.live.doublelist.danmaku.LiveCommentBulletsResponse$Comment;
import java.util.Collection;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import java.lang.CharSequence;

public class b$b extends j	// class@0007ca
{
    public List b;

    public void b$b(List p0){
       super();
       this.b = p0;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "5")) {
          return;
       }
       super.b();
       this.b.clear();
       return;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public View e(Context p0,int p1,View p2){
       if (PatchProxy.isSupport(b$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, b$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2 == null) {
          p2 = a.a(p0, R.layout.arg_RES_7f0d0af0);
       }
       LiveCommentBulletsResponse$Comment uComment = this.b.get(p1);
       if (p2.getTag() == uComment) {
          return p2;
       }else {
          this.h(p2, uComment);
          return p2;
       }
    }
    public void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       this.b.addAll(p0);
       return;
    }
    public final void h(View p0,LiveCommentBulletsResponse$Comment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "2")) {
          return;
       }
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.image);
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-live:live-external:live-doublelist-basic");
       kwaiImageVie.X(p1.mUserInfo.mHeadUrls, uoa.a());
       kwaiImageVie.setPlaceHolderImage(R.drawable.detail_avatar_secret);
       p0.findViewById(R.id.content).setText(p1.mContent);
       p0.setTag(p1);
       return;
    }
}
