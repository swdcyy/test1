package com.kuaishou.commercial.tach.component.SearchTKEntryIcon$a;
import oy5.b;
import com.kuaishou.commercial.tach.component.SearchTKEntryIcon;
import java.lang.Object;
import com.kwai.feature.component.entry.SearchEntryParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.component.entry.SearchVerticalParams;
import com.kwai.feature.component.entry.SearchSceneSource;
import oy5.i;
import oy5.e;

public class SearchTKEntryIcon$a implements b	// class@00164e
{
    public final SearchTKEntryIcon a;

    public void SearchTKEntryIcon$a(SearchTKEntryIcon p0){
       this.a = p0;
       super();
    }
    public SearchEntryParams a(int p0){
       SearchEntryParams obj;
       SearchTKEntryIcon$a uoa = SearchTKEntryIcon$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SearchEntryParams();
       obj.entrySource(this.a.mEntrySource);
       if (("search_entrance_ksstore").equals(this.a.mEntrySource)) {
          SearchVerticalParams searchVertic = new SearchVerticalParams();
          searchVertic.sceneSource(SearchSceneSource.GOODS_PAGE);
          obj.setVerticalParams(searchVertic);
       }
       return obj;
    }
    public i b(int p0,int p1){
       if (PatchProxy.isSupport(SearchTKEntryIcon$a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchTKEntryIcon$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new i();
    }
    public void c(e p0){
    }
}
