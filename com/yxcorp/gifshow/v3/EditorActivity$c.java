package com.yxcorp.gifshow.v3.EditorActivity$c;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ooc.j0;
import t36.f;

public class EditorActivity$c implements ViewModelProvider$Factory	// class@000d13
{
    public final EditorActivity a;

    public void EditorActivity$c(EditorActivity p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, EditorActivity$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new j0(new f());
    }
}
