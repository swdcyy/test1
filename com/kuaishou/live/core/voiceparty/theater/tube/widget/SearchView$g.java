package com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$g;
import android.text.TextWatcher;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import java.lang.Integer;

public final class SearchView$g implements TextWatcher	// class@001a48
{
    public boolean b;
    public final SearchView c;

    public void SearchView$g(SearchView p0){
       this.c = p0;
       super();
    }
    public final void a(boolean p0){
       this.b = p0;
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchView$g.class, "3")) {
          return;
       }
       a.p(p0, "s");
       if (this.b == null) {
          return;
       }
       if (!TextUtils.x(this.c.c) && a.g(this.c.c, p0.toString())) {
          return;
       }
       SearchView$g tc = this.c;
       tc.c = tc.g(tc.d);
       ImageView clearButton = this.c.getClearButton();
       int i = (TextUtils.x(this.c.c))? 8: 0;
       clearButton.setVisibility(i);
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SearchView$g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SearchView$g.class, "1")) {
          return;
       }
       a.p(p0, "s");
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SearchView$g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SearchView$g.class, "2")) {
          return;
       }
       a.p(p0, "s");
       return;
    }
}
