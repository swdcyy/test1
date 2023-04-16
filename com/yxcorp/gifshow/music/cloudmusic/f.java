package com.yxcorp.gifshow.music.cloudmusic.f;
import erd.g;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment$d;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import lob.c0;
import android.view.View$OnClickListener;
import java.lang.String;
import lnc.a1;
import com.yxcorp.retrofit.model.RetrofitException;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class f implements g	// class@002014
{
    public final MusicFragment$d b;

    public void f(MusicFragment$d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       MusicFragment$d b;
       KwaiException mErrorMessag;
       KwaiException kwaiExceptio;
       f tb = this.b;
       int i = 1;
       b[] uobArray = new b[i];
       uobArray[0] = b.d;
       c.d(tb.b.r, uobArray);
       b = tb.b;
       View view = c.h(b.r, b.P);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.p(new c0(tb));
       String str = a1.p(R.string.arg_RES_7f1038e5);
       if (p0 instanceof RetrofitException) {
          uoa.a(view).d(i);
       }else if(p0 instanceof KwaiException){
          mErrorMessag = p0.mErrorMessage;
          kwaiExceptio = mErrorMessag;
       }else {
          kwaiExceptio = str;
          mErrorMessag = null;
       }
       if (!TextUtils.x(mErrorMessag)) {
          uoa.i(mErrorMessag);
       }
       uoa.a(view).d(2);
       mErrorMessag = kwaiExceptio;
       i.d(R.style.arg_RES_7f110668, str);
       ExceptionHandler.handleUserNotLoginFirstTimeAlert(p0, view);
       return;
    }
}
