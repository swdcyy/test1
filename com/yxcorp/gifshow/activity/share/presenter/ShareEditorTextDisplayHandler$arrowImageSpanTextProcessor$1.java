package com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$arrowImageSpanTextProcessor$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.a;
import y17.a;

public final class ShareEditorTextDisplayHandler$arrowImageSpanTextProcessor$1 extends Lambda implements a	// class@0013a0
{
    public final ShareEditorTextDisplayHandler this$0;

    public void ShareEditorTextDisplayHandler$arrowImageSpanTextProcessor$1(ShareEditorTextDisplayHandler p0){
       this.this$0 = p0;
       super(0);
    }
    public final Object invoke(){
       Drawable uDrawable;
       Object obj = PatchProxy.apply(null, this, ShareEditorTextDisplayHandler$arrowImageSpanTextProcessor$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a1.d(R.dimen.arg_RES_7f070271);
       if (this.this$0.w()) {
          uDrawable = a1.f(R.drawable.arg_RES_7f080a86);
          int i1 = 0;
          uDrawable.setBounds(i1, i1, i, i);
          a.o(uDrawable, "drawable");
          uDrawable.setAlpha(i1);
       }else {
          uDrawable = a1.f(R.drawable.arg_RES_7f082006);
       }
       a uoa = new a(uDrawable, ">");
       uoa.c(i, i);
       a.o(uoa, "CenterImageSpan\(image, S¡­tImageRect\(bounds,bounds\)");
       return uoa;
    }
}
