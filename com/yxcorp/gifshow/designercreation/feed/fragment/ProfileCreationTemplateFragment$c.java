package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$c;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;

public final class ProfileCreationTemplateFragment$c extends GridLayoutManager$b	// class@0012d7
{
    public final ProfileCreationTemplateFragment e;
    public final int f;

    public void ProfileCreationTemplateFragment$c(ProfileCreationTemplateFragment p0,int p1){
       this.e = p0;
       this.f = p1;
       super();
    }
    public int f(int p0){
       d obj;
       ProfileCreationTemplateFragment$c tf;
       ProfileCreationTemplateFragment$c uoc = ProfileCreationTemplateFragment$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.e.ia();
       String str = "headerFooterAdapter";
       a.o(obj, str);
       if (p0 >= obj.b1()) {
          obj = this.e.ia();
          a.o(obj, str);
          d uod = this.e.ia();
          a.o(uod, str);
          if (p0 < (obj.getItemCount() - uod.Z0())) {
             p0 = 1;
          label_0050 :
             return tf;
          }
       }
       tf = this.f;
       goto label_0050 ;
    }
}
