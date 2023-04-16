package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$adapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment;
import ew9.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qrd.p;
import java.lang.Number;
import s1c.r0;
import com.kwai.framework.model.user.User;

public final class ProfileCreationTemplateFragment$adapter$2 extends Lambda implements a	// class@0012d5
{
    public final ProfileCreationTemplateFragment this$0;

    public void ProfileCreationTemplateFragment$adapter$2(ProfileCreationTemplateFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final a invoke(){
       String id;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ProfileCreationTemplateFragment$adapter$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       ProfileCreationTemplateFragment$adapter$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Number number = PatchProxy.apply(objArray, tthis$0, ProfileCreationTemplateFragment.class, "4");
       if (number == patchProxyRe) {
          number = tthis$0.N.getValue();
       }
       int i = number.intValue();
       ProfileCreationTemplateFragment i1 = this.this$0.I;
       if (i1 != null) {
          r0 b = i1.b;
          if (b != null) {
             id = b.getId();
             if (id != null) {
             label_0041 :
                return new a(i, id);
             }
          }
       }
       id = "";
       goto label_0041 ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
