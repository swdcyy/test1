package com.kwai.feature.component.SearchStateLogic$SearchActionImpl$4;
import com.kwai.feature.component.SearchStateLogic$SearchActionImpl;
import java.lang.String;
import com.kwai.feature.component.SearchStateLogic$a;
import com.kwai.feature.component.SearchStateLogic;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import ty5.d;
import com.kwai.feature.component.widget.SearchEditorLayout;

public final class SearchStateLogic$SearchActionImpl$4 extends SearchStateLogic$SearchActionImpl	// class@0011dc
{

    public void SearchStateLogic$SearchActionImpl$4(String p0,int p1){
       super(p0, p1, null);
    }
    public void doStateAction(SearchStateLogic p0,int p1){
       SearchStateLogic$SearchActionImpl$4 searchAction = SearchStateLogic$SearchActionImpl$4.class;
       if (PatchProxy.isSupport(searchAction) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, searchAction, "1")) {
          return;
       }
       boolean b = false;
       p0.h(b);
       p0.i(b);
       if (p0.d() != null) {
          d uod = p0.d();
          String keyword = p0.c().getKeyword();
          if (p0.b == 4) {
             b = true;
          }
          uod.qc(keyword, b, "");
       }
       return;
    }
}
