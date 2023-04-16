package com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$d;
import android.widget.TextView$OnEditorActionListener;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import java.util.Objects;
import android.widget.EditText;
import android.view.View;
import a27.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$f;

public final class SearchView$d implements TextView$OnEditorActionListener	// class@001a45
{
    public final SearchView a;

    public void SearchView$d(SearchView p0){
       this.a = p0;
       super();
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       boolean b;
       if (PatchProxy.isSupport(SearchView$d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, SearchView$d.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       SearchView$d ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.isSupport(SearchView.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, ta, SearchView.class, "13");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          label_007b :
             return b;
          }
       }
       if (3 == p1 && !PatchProxy.applyVoid(null, ta, SearchView.class, "29")) {
          c.d(ta.getEditorView());
          ta.a();
          String str = ta.g(ta.d);
          ta.c = str;
          if (!TextUtils.x(str)) {
             SearchView b1 = ta.b;
             if (b1 != null) {
                a.m(b1);
                b1.a(ta.c);
             }
          }
       }
       b = false;
       goto label_007b ;
    }
}
