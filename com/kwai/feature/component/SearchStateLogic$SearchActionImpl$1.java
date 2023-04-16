package com.kwai.feature.component.SearchStateLogic$SearchActionImpl$1;
import com.kwai.feature.component.SearchStateLogic$SearchActionImpl;
import java.lang.String;
import com.kwai.feature.component.SearchStateLogic$a;
import com.kwai.feature.component.SearchStateLogic;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import android.view.View;
import com.kwai.feature.component.widget.SearchEditorLayout;
import ty5.d;

public final class SearchStateLogic$SearchActionImpl$1 extends SearchStateLogic$SearchActionImpl	// class@0011d9
{

    public void SearchStateLogic$SearchActionImpl$1(String p0,int p1){
       super(p0, p1, null);
    }
    public void doStateAction(SearchStateLogic p0,int p1){
       SearchStateLogic$SearchActionImpl$1 searchAction = SearchStateLogic$SearchActionImpl$1.class;
       if (PatchProxy.isSupport(searchAction) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, searchAction, "1")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, SearchStateLogic.class, "12")) {
          p0.d.f(null, false);
          p0.h(false);
          p0.i(false);
       }
       if (p0.d() != null) {
          p0.d().s7(false);
       }
       return;
    }
}
