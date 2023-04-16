package com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController;
import java.lang.Object;
import da3.h$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.comment.model.AuthorReplyMessage;
import mz6.b;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import android.content.Context;
import java.util.ArrayList;
import mz6.b$d;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.User;
import lu7.f;
import java.lang.CharSequence;
import java.util.Collection;
import da3.e;
import android.content.DialogInterface$OnClickListener;
import da3.f;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import da3.g;
import android.content.DialogInterface$OnDismissListener;
import s93.r;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import xp5.i;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;

public final class AuthorReplyMessageViewController$b implements Observer	// class@000838
{
    public final AuthorReplyMessageViewController b;

    public void AuthorReplyMessageViewController$b(AuthorReplyMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthorReplyMessageViewController$b.class, "1")) {
       }else {
          AuthorReplyMessageViewController$b tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, AuthorReplyMessageViewController.class, "6")) {
             AuthorReplyMessage uAuthorReply = p0.a();
             b uob = new b(tb.B2());
             ArrayList uArrayList = new ArrayList();
             if (p0.b != null) {
                uArrayList.add(b$d.d(R.string.arg_RES_7f101fbc));
             }
             uArrayList.add(b$d.d(R.string.arg_RES_7f1007b5));
             if (p0.c != null) {
                uArrayList.add(b$d.d(R.string.arg_RES_7f10169b));
             }
             uob.o(f.a(UserInfo.convertToQUser(uAuthorReply.getAuthorUserInfo()))+": Ð»Ð»ÄãËÍµÄ"+uAuthorReply.getGiftName());
             uob.b(uArrayList);
             uob.l(new e(tb, uAuthorReply));
             uob.k(new f(tb, uAuthorReply));
             Dialog uDialog = uob.q();
             tb.s = uDialog;
             a.m(uDialog);
             uDialog.setOnDismissListener(new g(tb));
          }
          r.a.d(this.b.V2().e(), p0.a().isAnonymous(), true);
       }
       return;
    }
}
