package com.kwai.feature.component.SearchStateLogic$SearchActionImpl$3;
import com.kwai.feature.component.SearchStateLogic$SearchActionImpl;
import java.lang.String;
import com.kwai.feature.component.SearchStateLogic$a;
import com.kwai.feature.component.SearchStateLogic;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.feature.component.widget.SearchEditorLayout;
import ty5.d;

public final class SearchStateLogic$SearchActionImpl$3 extends SearchStateLogic$SearchActionImpl	// class@0011db
{

    public void SearchStateLogic$SearchActionImpl$3(String p0,int p1){
       super(p0, p1, null);
    }
    public void doStateAction(SearchStateLogic p0,int p1){
       SearchStateLogic$SearchActionImpl$3 searchAction = SearchStateLogic$SearchActionImpl$3.class;
       if (PatchProxy.isSupport(searchAction) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, searchAction, "1")) {
          return;
       }
       if (p0.c().e()) {
          p0.h(true);
          p0.i(false);
       }else {
          p0.i(true);
          p0.h(false);
       }
       if (p0.d() != null) {
          p0.d().ke(p0.c().getKeyword(), false);
       }
       return;
    }
}
