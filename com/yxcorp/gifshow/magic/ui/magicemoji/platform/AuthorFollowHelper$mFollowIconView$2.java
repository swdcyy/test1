package com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$mFollowIconView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper;
import android.widget.ImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import kotlin.jvm.internal.a;

public final class AuthorFollowHelper$mFollowIconView$2 extends Lambda implements a	// class@001be2
{
    public final AuthorFollowHelper this$0;

    public void AuthorFollowHelper$mFollowIconView$2(AuthorFollowHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final ImageView invoke(){
       View obj = PatchProxy.apply(null, this, AuthorFollowHelper$mFollowIconView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.n.findViewById(R.id.follow_icon);
       a.o(obj, "mAuthorView.findViewById\(R.id.follow_icon\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
