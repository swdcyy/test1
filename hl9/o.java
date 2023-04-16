package hl9.o;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.utils.b;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig$AlertInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;

public class o implements View$OnClickListener	// class@0026d9
{
    public final CommentInterceptorConfig$AlertInfo b;
    public final b c;

    public void o(b p0,CommentInterceptorConfig$AlertInfo p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.c.a.startActivity(b.a(0x66dce92a).a(this.c.a, w0.f(this.b.mLinkUrl)));
       return;
    }
}
