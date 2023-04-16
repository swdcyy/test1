package com.kwai.feature.component.widget.SearchEditorLayout$a;
import com.kwai.feature.component.SearchStateLogic$b;
import com.kwai.feature.component.widget.SearchEditorLayout;
import java.lang.Object;
import iy5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class SearchEditorLayout$a implements SearchStateLogic$b	// class@0012a9
{
    public final SearchEditorLayout a;

    public void SearchEditorLayout$a(SearchEditorLayout p0){
       this.a = p0;
       super();
    }
    public void a(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEditorLayout$a.class, "1")) {
          return;
       }
       this.a.setConfigOptions(p0);
       return;
    }
}
