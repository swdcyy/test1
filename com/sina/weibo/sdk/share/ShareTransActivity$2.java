package com.sina.weibo.sdk.share.ShareTransActivity$2;
import com.sina.weibo.sdk.share.b;
import com.sina.weibo.sdk.share.ShareTransActivity;
import java.lang.Object;
import com.sina.weibo.sdk.share.c;
import android.widget.FrameLayout;
import java.lang.String;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class ShareTransActivity$2 implements b	// class@000bd0
{
    public final ShareTransActivity y;

    public void ShareTransActivity$2(ShareTransActivity p0){
       this.y = p0;
       super();
    }
    public final void a(c p0){
       ShareTransActivity.b(this.y).setVisibility(4);
       if (p0 == null) {
          ShareTransActivity.a(this.y, "Trans result is null.");
          return;
       }else if(p0.z != null){
          ShareTransActivity.a(this.y, p0.A);
          return;
       }else if(TextUtils.isEmpty(p0.errorMessage)){
          ShareTransActivity.a(this.y, "Trans resource fail.");
          return;
       }else {
          ShareTransActivity.a(this.y, p0.errorMessage);
          return;
       }
    }
}
