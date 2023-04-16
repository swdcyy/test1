package com.yxcorp.gifshow.growth.halfscreenfollow.l$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import tna.o;
import android.view.View$OnClickListener;
import tna.q;
import tna.p;
import o07.n;

public class l$b implements PopupInterface$f	// class@001393
{
    public final String b;
    public final int c;

    public void l$b(String p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, l$b.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       View view = a.c(p1, R.layout.arg_RES_7f0d0558, p2, false);
       TextView textView = view.findViewById(R.id.growth_follow_guide_content);
       if (TextUtils.x(this.b)) {
          textView.setText(R.string.arg_RES_7f101383);
       }else {
          Object[] objArray = new Object[]{this.b};
          textView.setText(view.getContext().getString(R.string.arg_RES_7f10137c, objArray));
       }
       view.findViewById(R.id.growth_follow_guide_close).setOnClickListener(new o(p0));
       view.findViewById(R.id.growth_follow_guide_positive_btn).setOnClickListener(new q(this, p0));
       view.findViewById(R.id.growth_follow_guide_negative_btn).setOnClickListener(new p(this, p0));
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
