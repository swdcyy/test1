package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.SearchViewElement$mSearchView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.SearchViewElement;
import com.kwai.feature.component.entry.view.SearchIconEntryView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import mr6.b;
import java.util.Objects;

public final class SearchViewElement$mSearchView$2 extends Lambda implements a	// class@001700
{
    public final SearchViewElement this$0;

    public void SearchViewElement$mSearchView$2(SearchViewElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final SearchIconEntryView invoke(){
       View obj = PatchProxy.apply(null, this, SearchViewElement$mSearchView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.j();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.feature.component.entry.view.SearchIconEntryView");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
