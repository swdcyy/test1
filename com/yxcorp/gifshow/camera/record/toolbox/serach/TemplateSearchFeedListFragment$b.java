package com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$b;
import kh9.a$b;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import k90.a;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.View;
import i2b.a;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import mh9.a;

public final class TemplateSearchFeedListFragment$b implements a$b	// class@000f65
{
    public final TemplateSearchFeedListFragment a;

    public void TemplateSearchFeedListFragment$b(TemplateSearchFeedListFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TemplateSearchFeedListFragment$b.class, "1")) {
          return;
       }
       TemplateSearchFeedListFragment$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, TemplateSearchFeedListFragment.class, "11")) {
          if (ta.K.a()) {
             ta.Ih();
          }else if(ta.L == null){
             ta.L = a.a(ta.getContext(), 0x7f0d15c0);
          }
          d uod = ta.ia();
          if (uod != null) {
             uod.P0(ta.L);
          }
          uod = ta.ia();
          if (uod != null) {
             uod.R0(ta.h0());
          }
          ta.M.f(true);
       }
       return;
    }
}
