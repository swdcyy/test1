package com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import hb0.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment$Tab;
import java.lang.Enum;
import android.view.View;
import com.yxcorp.utility.n;

public class PostTemplateTabHostFragment$a extends ViewPager$l	// class@000f59
{
    public final PostTemplateTabHostFragment b;

    public void PostTemplateTabHostFragment$a(PostTemplateTabHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       PostTemplateTabHostFragment$a uoa = PostTemplateTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostTemplateTabHostFragment", "onPageSelected position is "+p0, objArray);
       if (p0 == PostTemplateTabHostFragment$Tab.TEMPLATE.ordinal()) {
          n.Y(this.b.F, 0, 0);
       }else if(p0 == PostTemplateTabHostFragment$Tab.FOLLOW_KRN.ordinal()){
          n.Y(this.b.F, 4, 0);
       }
       return;
    }
}
