package com.yxcorp.gifshow.detail.view.switcher.RewardInfoViewSwitcher;
import android.widget.ViewSwitcher;
import android.content.Context;
import android.util.AttributeSet;
import o9a.a;
import android.widget.ViewSwitcher$ViewFactory;
import mz5.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.net.Uri;
import ekd.x0;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.util.DateUtils;
import lnc.a1;
import java.util.List;
import com.yxcorp.gifshow.detail.view.switcher.RewardInfoViewSwitcher$a;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;

public class RewardInfoViewSwitcher extends ViewSwitcher	// class@001a77
{
    public List b;
    public int c;
    public RewardInfoViewSwitcher$a d;
    public static final int e;

    public void RewardInfoViewSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setFactory(new a(p0));
    }
    public final void a(a p0,View p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RewardInfoViewSwitcher.class, "7")) {
          return;
       }
       KwaiImageView kwaiImageVie = p1.findViewById(R.id.reward_info_avatar);
       int i = 0;
       if (p0.a != null) {
          kwaiImageVie.setVisibility(i);
          g.a(kwaiImageVie, QCurrentUser.me(), HeadImageSize.ADJUST_MIDDLE);
       }else {
          kwaiImageVie.setVisibility(i);
          kwaiImageVie.setPlaceHolderImage(R.drawable.detail_avatar_secret);
          Uri uri = x0.f(p0.mIconUrl);
          if (uri != null) {
             kwaiImageVie.setImageURI(uri);
          }
       }
       p1.findViewById(R.id.reward_info_detail).setText(p0.mRewardInfo);
       TextView textView = p1.findViewById(R.id.reward_info_message);
       if (TextUtils.isEmpty(p0.mMessage)) {
          textView.setText(DateUtils.w(this.getContext(), p0.mTime));
       }else if(p0.mPrivateMsg != null){
          str = a1.r(R.string.arg_RES_7f1042e3, p0.mMessage);
       }else {
          p0 = p0.mMessage;
       }
       textView.setText(str);
       if (this.c == (this.b.size() - 1)) {
          RewardInfoViewSwitcher td = this.d;
          if (td != null) {
             td.a();
          }
       }
       return;
    }
    public void setRewardInfos(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardInfoViewSwitcher.class, "1")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       this.b = p0;
       int i = 0;
       this.c = i;
       if (!PatchProxy.isSupport(RewardInfoViewSwitcher.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, RewardInfoViewSwitcher.class, "5")) {
          this.a(this.b.get(this.c), this.getChildAt(i));
       }
       return;
    }
    public void setSwitchFinishCallback(RewardInfoViewSwitcher$a p0){
       this.d = p0;
    }
}
