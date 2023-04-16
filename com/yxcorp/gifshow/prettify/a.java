package com.yxcorp.gifshow.prettify.a;
import com.yxcorp.gifshow.camera.bubble.b$d;
import com.yxcorp.gifshow.prettify.e;
import com.kwai.feature.post.api.componet.prettify.PrettyGuideInfo;
import java.lang.Object;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.view.ViewGroup;
import android.os.Bundle;
import java.util.Objects;
import android.widget.TextView;
import java.lang.String;
import java.lang.CharSequence;
import l0c.g;
import android.view.View$OnClickListener;

public final class a implements b$d	// class@0010e7
{
    public final e a;
    public final PrettyGuideInfo b;

    public void a(e p0,PrettyGuideInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(View p0,c p1,ViewGroup p2,Bundle p3){
       a ta = this.a;
       a tb = this.b;
       Objects.requireNonNull(ta);
       p0.findViewById(R.id.guide_message).setText(tb.c());
       TextView textView = p0.findViewById(R.id.guide_check_btn);
       int i = (tb.e())? 0: 8;
       textView.setVisibility(i);
       if (tb.e()) {
          textView.setText(R.string.arg_RES_7f101c39);
       }
       p0.setOnClickListener(new g(ta, p1));
       return;
    }
}
