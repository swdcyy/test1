package com.yxcorp.gifshow.camera.record.album.v;
import erd.g;
import com.yxcorp.gifshow.camera.record.album.x;
import java.lang.Object;
import pr3.d;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import android.content.Context;
import java.lang.CharSequence;
import sb9.g0;
import android.view.View$OnClickListener;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public final class v implements g	// class@001ce0
{
    public final x b;

    public void v(x p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       d b = p0.b;
       int i = p0.a();
       x ox = x.class;
       if (!PatchProxy.isSupport(ox) || (PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Integer.valueOf(i), tb, ox, "4") || (i <= 0 || (tb.b == null && (!PatchProxy.isSupport(ox) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, ox, "5")))))) {
          Object[] objArray = new Object[0];
          a.D().w("ImportVideoHandler", "showWaitDialog: mContext = "+tb.a+", disableSkipDialog = "+b, objArray);
          if (tb.a != null) {
             i = new AttrAnimProgressFragment();
             tb.b = i;
             i.wh(tb.a.getString(R.string.arg_RES_7f100b18));
             tb.d = b;
             if (b == null) {
                tb.b.sh(tb.a.getString(R.string.arg_RES_7f104838));
             }else {
                tb.b.sh(tb.a.getString(R.string.cancel));
             }
             tb.b.th(new g0(tb));
             tb.b.setCancelable(0);
             tb.b.show(tb.a.getSupportFragmentManager(), "ImportVideoHandler");
          }
       }
    label_00bc :
       return;
    }
}
