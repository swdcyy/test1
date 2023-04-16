package hl9.e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.utils.b;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig$AlertInfo;
import java.lang.Object;
import android.view.View;
import wkd.b;
import nf6.i;
import java.lang.String;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;

public final class e implements View$OnClickListener	// class@0026ca
{
    public final b b;
    public final CommentInterceptorConfig$AlertInfo c;

    public void e(b p0,CommentInterceptorConfig$AlertInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       e tb = this.b;
       tb.a.startActivity(b.a(0x66dce92a).a(tb.a, w0.f(this.c.mLinkUrl)));
    }
}
