package com.yxcorp.gifshow.music.widget.search.SearchMusicSuggestFragment$b;
import qvb.f;
import com.yxcorp.gifshow.music.widget.search.SearchMusicSuggestFragment;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import upb.c;
import upb.e;
import cjd.e;
import erd.o;
import java.util.List;
import com.yxcorp.gifshow.music.network.model.response.SearchMusicSuggestResponse;
import la6.b;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.music.widget.search.a;

public class SearchMusicSuggestFragment$b extends f	// class@0020ac
{
    public final SearchMusicSuggestFragment p;

    public void SearchMusicSuggestFragment$b(SearchMusicSuggestFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SearchMusicSuggestFragment$b obj = PatchProxy.apply(objArray, this, SearchMusicSuggestFragment$b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.p;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(objArray, obj, SearchMusicSuggestFragment.class, "8");
       if (ot != patchProxyRe) {
       }else {
          SearchMusicSuggestFragment f = obj.F;
          if (f != 2) {
             ot = (f != 3)? e.a().a(obj.G).map(new e()): e.a().c(obj.G).map(new e());
          }else {
             ot = e.a().f(obj.G).map(new e());
          }
       }
       return ot;
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(SearchMusicSuggestResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchMusicSuggestFragment$b.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       if (this.p.g7() instanceof a) {
          this.p.g7().s1(p0.mSearchSid);
          this.p.g7().r1(this.p.G);
       }
       return;
    }
}
