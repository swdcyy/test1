package com.yxcorp.gifshow.music.widget.search.SearchMusicSuggestFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.music.widget.search.SearchMusicSuggestFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;

public class SearchMusicSuggestFragment$a extends RecyclerView$r	// class@0020ab
{
    public final SearchMusicSuggestFragment a;

    public void SearchMusicSuggestFragment$a(SearchMusicSuggestFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(SearchMusicSuggestFragment$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, SearchMusicSuggestFragment$a.class, "1")) {
          return;
       }
       if (p1 == 1) {
          Activity uActivity = a.b(this.a.getContext());
          if (uActivity != null) {
             n.C(uActivity);
          }
       }
       return;
    }
}
