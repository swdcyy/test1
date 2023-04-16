package com.yxcorp.gifshow.visible.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.visible.PhotoVisibilityController;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.activity.share.bubble.PublishBubbleItem;
import ra9.c;
import zf6.k;
import android.view.View;
import rxc.e;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.visible.b;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class c implements Runnable	// class@0016c5
{
    public final PhotoVisibilityController b;

    public void c(PhotoVisibilityController p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       PhotoVisibilityController j = tb.j;
       if (j == null || j.isFinishing()) {
          Object[] objArray = new Object[0];
          a.b().A("PhotoVisibilityController", "showIntimateTipBubbleIfNeeded error : mActivity = "+tb.j, objArray);
       }else {
          b uob = new b(PublishBubbleItem.INTIMATE_TIP);
          uob.m(k.d());
          uob.b(tb.d);
          uob.l(new e(tb));
          uob.k(b.a);
          PostBubbleManager.e(tb.j).n(uob);
       }
       return;
    }
}
