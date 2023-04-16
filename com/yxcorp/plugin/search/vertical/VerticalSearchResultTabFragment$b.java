package com.yxcorp.plugin.search.vertical.VerticalSearchResultTabFragment$b;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.plugin.search.vertical.VerticalSearchResultTabFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.plugin.search.result.fragment.VerticalSceneSearchResultFragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.kwai.feature.component.entry.SearchSceneSource;
import e7d.a;

public class VerticalSearchResultTabFragment$b extends b	// class@0007bb
{
    public final VerticalSearchResultTabFragment d;

    public void VerticalSearchResultTabFragment$b(VerticalSearchResultTabFragment p0,PagerSlidingTabStrip$d p1,Class p2,Bundle p3){
       this.d = p0;
       super(p1, p2, p3);
    }
    public void d(int p0,Fragment p1){
       VerticalSearchResultTabFragment$b uob = VerticalSearchResultTabFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       p1.s1 = this.d.E;
       p1.b1.y(SearchSceneSource.MY_PROFILE);
       p1.ii(p0);
       p1.gi("");
       return;
    }
}
