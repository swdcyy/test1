package hl9.q;
import x07.b;
import com.yxcorp.gifshow.comment.utils.b;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig$AlertInfo;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.TextView;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig$MultipleLanguage;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig;
import java.lang.CharSequence;
import hl9.o;
import android.view.View$OnClickListener;

public class q extends b	// class@0026db
{
    public final CommentInterceptorConfig$AlertInfo c;
    public final b d;

    public void q(b p0,int p1,CommentInterceptorConfig$AlertInfo p2){
       this.d = p0;
       this.c = p2;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, q.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       q td = this.d;
       q tc = this.c;
       Objects.requireNonNull(td);
       p3 = PatchProxy.applyTwoRefs(view, tc, td, b.class, "12");
       if (p3 != patchProxyRe) {
          view = p3;
       }else {
          TextView textView = view.findViewById(R.id.know_more_text);
          textView.setText(CommentInterceptorConfig.getSuitMultiLanguageText(tc.mLinkText));
          textView.setOnClickListener(new o(td, tc));
       }
       return view;
    }
}
