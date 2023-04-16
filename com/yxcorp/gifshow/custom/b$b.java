package com.yxcorp.gifshow.custom.b$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.custom.b;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pt9.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.custom.ShareCustomRepo;

public class b$b implements ViewModelProvider$Factory	// class@00129e
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       b$b ta = this.a;
       return new o(ta.v, ta.y);
    }
}
