package com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$b;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.relation.select.SelectUsersFragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class SelectUsersTabHostFragment$b extends b	// class@001989
{
    public final SelectUsersTabHostFragment d;

    public void SelectUsersTabHostFragment$b(SelectUsersTabHostFragment p0,PagerSlidingTabStrip$d p1,Class p2,Bundle p3){
       this.d = p0;
       super(p1, p2, p3);
    }
    public void d(int p0,Fragment p1){
       if (!PatchProxy.isSupport(SelectUsersTabHostFragment$b.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, SelectUsersTabHostFragment$b.class, "1")) {
          p1.H = this.d.F;
       }
       return;
    }
}
