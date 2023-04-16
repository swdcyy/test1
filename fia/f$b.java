package fia.f$b;
import androidx.viewpager.widget.ViewPager$l;
import fia.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public final class f$b extends ViewPager$l	// class@0028fd
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, f$b.class, "1")) {
          return;
       }
       this.b.Z8();
       return;
    }
}
