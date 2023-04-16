package com.kuaishou.growth.privacy.dialog.helper.k;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper;
import i2b.a;
import android.widget.TextView;
import lnc.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import java.lang.CharSequence;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import o07.n;

public final class k implements PopupInterface$f	// class@000719
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View view = a.g(p1, R.layout.arg_RES_7f0d030c, p2, false);
       TextView textView = view.findViewById(R.id.content);
       textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), a1.d(R.dimen.arg_RES_7f0702b8));
       SpannableString spannableStr = PatchProxy.apply(null, null, PrivacyDialogHelper.class, "26");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          spannableStr = PrivacyDialogHelper.f("newer_launch");
       }
       textView.setText(spannableStr);
       textView.setHighlightColor(false);
       textView.setMovementMethod(LinkMovementMethod.getInstance());
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
