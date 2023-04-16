package com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import java.lang.Object;
import ba3.i$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.comment.model.SimpleCommentMessage;
import mz6.b;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import android.content.Context;
import java.util.ArrayList;
import mz6.b$d;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import java.util.Collection;
import ba3.f;
import android.content.DialogInterface$OnClickListener;
import ba3.g;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import ba3.h;
import android.content.DialogInterface$OnDismissListener;
import s93.r;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import xp5.i;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;

public final class SimpleCommentMessageViewController$b implements Observer	// class@00081f
{
    public final SimpleCommentMessageViewController b;

    public void SimpleCommentMessageViewController$b(SimpleCommentMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleCommentMessageViewController$b.class, "1")) {
       }else {
          SimpleCommentMessageViewController$b tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, SimpleCommentMessageViewController.class, "6")) {
             SimpleCommentMessage simpleCommen = p0.a();
             b uob = new b(tb.B2());
             ArrayList uArrayList = new ArrayList();
             if (p0.b != null) {
                uArrayList.add(b$d.d(R.string.arg_RES_7f101fbc));
             }
             uArrayList.add(b$d.d(R.string.arg_RES_7f1007b5));
             if (p0.c != null) {
                uArrayList.add(b$d.d(R.string.arg_RES_7f10169b));
             }
             uob.o(simpleCommen.getUserInfo().mName+": "+simpleCommen.getContent());
             uob.b(uArrayList);
             uob.l(new f(tb, simpleCommen));
             uob.k(new g(tb, simpleCommen));
             Dialog uDialog = uob.q();
             tb.s = uDialog;
             a.m(uDialog);
             uDialog.setOnDismissListener(new h(tb));
          }
          r.a.d(this.b.V2().e(), p0.a().isAnonymous(), true);
       }
       return;
    }
}
