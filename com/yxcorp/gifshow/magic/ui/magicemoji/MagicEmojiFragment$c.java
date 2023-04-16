package com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$c;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import m4b.n;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.yxcorp.retrofit.model.RetrofitException;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import android.text.TextUtils;
import e17.i;
import android.widget.TextView;
import q5b.g;

public class MagicEmojiFragment$c implements g	// class@001ba5
{
    public final MagicEmojiFragment b;

    public void MagicEmojiFragment$c(MagicEmojiFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       KwaiException mErrorMessag;
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment$c.class, "1")) {
       }else {
          MagicEmojiFragment$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, MagicEmojiFragment.class, "19")) {
             tb.x();
             if (!PatchProxy.applyVoidOneRefs(p0, tb, MagicEmojiFragment.class, "22")) {
                if (tb.Y == null) {
                   if (tb.getContext() != null) {
                      KwaiPlayerFailedStateView kwaiPlayerFa = new KwaiPlayerFailedStateView(tb.getContext());
                      tb.Y = kwaiPlayerFa;
                      kwaiPlayerFa.f(new n(tb));
                   }
                }
                if (!PatchProxy.applyVoidOneRefs(p0, tb, MagicEmojiFragment.class, "24") && tb.Y != null) {
                   Throwable throwable = PatchProxy.applyOneRefs(p0, tb, MagicEmojiFragment.class, "63");
                   if (throwable != PatchProxyResult.class) {
                   }else if(p0.getCause() != null){
                      throwable = p0.getCause().getCause();
                   }else {
                      mErrorMessag = null;
                   }
                   String str = a1.p(R.string.arg_RES_7f100d25);
                   int i = 0x7f0a41f1;
                   if (!throwable instanceof RetrofitException) {
                      tb.Y.findViewById(i).setVisibility(8);
                   }else {
                      tb.Y.findViewById(i).setVisibility(0);
                   }
                   if (throwable instanceof KwaiException) {
                      mErrorMessag = throwable.mErrorMessage;
                      if (!TextUtils.isEmpty(mErrorMessag)) {
                         Throwable cause = p0.getCause();
                         while (cause != null) {
                            p0 = cause;
                         }
                         if (!p0 instanceof KwaiException) {
                            i.d(R.style.arg_RES_7f110668, mErrorMessag);
                         }
                         str = mErrorMessag;
                      }
                   }
                   tb.Y.findViewById(R.id.tv_empty_desc).setText(str);
                }
                g.b(tb.E, tb.Y);
             }
          }
       }
       return;
    }
}
