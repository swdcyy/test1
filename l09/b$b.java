package l09.b$b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.kuaishou.commercial.component.TransparentBgDialogFragment;
import l09.b;
import mrd.c;
import com.kwai.framework.model.feed.BaseFeed;
import nx8.l;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class b$b implements DialogContainerFragment$b	// class@002c60
{
    public final TransparentBgDialogFragment a;
    public final b b;
    public final c c;
    public final BaseFeed d;
    public final l e;
    public final FragmentActivity f;

    public void b$b(TransparentBgDialogFragment p0,b p1,c p2,BaseFeed p3,l p4,FragmentActivity p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public final Fragment a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$b obj = PatchProxy.applyWithListener(null, this, b$b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       b$b tb = this.b;
       obj = this.a;
       b$b tc = this.c;
       b$b td = this.d;
       b$b te = this.e;
       Objects.requireNonNull(tb);
       PopShowFragment popShowFragm = PatchProxy.applyFourRefs(obj, tc, td, te, tb, b.class, "2");
       if (popShowFragm != patchProxyRe) {
       }else {
          popShowFragm = new PopShowFragment();
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "photo_id", td);
          popShowFragm.setArguments(uBundle);
          popShowFragm.n = obj;
          popShowFragm.o = tc;
          popShowFragm.p = te;
       }
       PatchProxy.onMethodExit(b$b.class, "1");
       return popShowFragm;
    }
}
