package com.yxcorp.gifshow.follow.init.plugin.live.d$b;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView$c;
import com.yxcorp.gifshow.follow.init.plugin.live.d;
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
import java.util.Objects;
import i2b.a;
import com.yxcorp.gifshow.follow.common.data.LiveCommentBulletsResponse$Comment;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import java.lang.CharSequence;

public class d$b extends SimpleDanmakuView$c	// class@0010e7
{
    public List b;
    public final d c;

    public void d$b(d p0,List p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "4")) {
          return;
       }
       super.b();
       this.b.clear();
       return;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public View d(Context p0,int p1,View p2){
       if (PatchProxy.isSupport(d$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, d$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2 == null) {
          Objects.requireNonNull(this.c);
          p2 = a.a(p0, R.layout.arg_RES_7f0d05e0);
       }
       LiveCommentBulletsResponse$Comment uComment = this.b.get(p1);
       if (p2.getTag() == uComment) {
          return p2;
       }else {
          d$b tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidTwoRefs(p2, uComment, tc, d.class, "12")) {
             KwaiImageView kwaiImageVie = p2.findViewById(R.id.image);
             kwaiImageVie.U(uComment.mUserInfo.mHeadUrls);
             kwaiImageVie.setPlaceHolderImage(R.drawable.detail_avatar_secret);
             p2.findViewById(R.id.content).setText(uComment.mContent);
             p2.setTag(uComment);
          }
          return p2;
       }
    }
}
