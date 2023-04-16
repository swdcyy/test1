package com.kuaishou.growth.privacy.dialog.helper.l;
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
import java.lang.String;
import android.text.SpannableString;
import java.lang.CharSequence;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import o07.n;

public final class l implements PopupInterface$f	// class@00071a
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View view = a.g(p1, R.layout.arg_RES_7f0d030c, p2, false);
       TextView textView = view.findViewById(R.id.content);
       textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), a1.d(R.dimen.arg_RES_7f0702b8));
       textView.setText(PrivacyDialogHelper.f("second_launch"));
       textView.setHighlightColor(false);
       textView.setMovementMethod(LinkMovementMethod.getInstance());
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
