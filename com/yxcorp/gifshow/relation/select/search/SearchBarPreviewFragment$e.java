package com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$e;
import y8c.g;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.yxcorp.gifshow.model.ContactTargetItem;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$e$a;
import ml8.c;

public class SearchBarPreviewFragment$e extends g	// class@0019ba
{
    public final SearchBarPreviewFragment w;

    public void SearchBarPreviewFragment$e(SearchBarPreviewFragment p0){
       this.w = p0;
       super();
    }
    public int f0(int p0){
       SearchBarPreviewFragment$e uoe = SearchBarPreviewFragment$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       ContactTargetItem uContactTarg = this.N0(p0);
       if (uContactTarg != null) {
          return uContactTarg.mType;
       }else {
          return 0;
       }
    }
    public f h1(ViewGroup p0,int p1){
       SearchBarPreviewFragment$e uoe = SearchBarPreviewFragment$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0f58), new SearchBarPreviewFragment$e$a(this));
    }
}
