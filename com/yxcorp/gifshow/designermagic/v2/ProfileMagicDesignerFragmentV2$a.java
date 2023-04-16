package com.yxcorp.gifshow.designermagic.v2.ProfileMagicDesignerFragmentV2$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.yxcorp.gifshow.designermagic.v2.ProfileMagicDesignerFragmentV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class ProfileMagicDesignerFragmentV2$a extends GridLayoutManager$b	// class@00132a
{
    public final ProfileMagicDesignerFragmentV2 e;

    public void ProfileMagicDesignerFragmentV2$a(ProfileMagicDesignerFragmentV2 p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       ProfileMagicDesignerFragmentV2$a uoa = ProfileMagicDesignerFragmentV2$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 < this.e.ia().b1() || p0 >= (this.e.ia().getItemCount() - this.e.ia().Z0())) {
          return 3;
       }else {
          return 1;
       }
    }
}
