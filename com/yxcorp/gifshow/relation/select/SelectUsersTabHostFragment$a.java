package com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;

public class SelectUsersTabHostFragment$a implements ViewPager$i	// class@001988
{
    public final SelectUsersTabHostFragment b;

    public void SelectUsersTabHostFragment$a(SelectUsersTabHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(SelectUsersTabHostFragment$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, SelectUsersTabHostFragment$a.class, "1")) {
          return;
       }
       SelectUsersTabHostFragment$a tb = this.b;
       if (tb.G != null) {
          tb.Uh(p0);
          p0.G = false;
       }
       return;
    }
    public void onPageSelected(int p0){
       SelectUsersTabHostFragment$a uoa = SelectUsersTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b.Uh(p0);
       return;
    }
}
