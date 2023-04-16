package com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.b;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment$a;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment;

public class b extends b	// class@000e52
{
    public final CoverTextLibraryFragment$a d;
    public final CoverTextLibraryFragment e;

    public void b(CoverTextLibraryFragment p0,PagerSlidingTabStrip$d p1,Class p2,Bundle p3,CoverTextLibraryFragment$a p4){
       this.e = p0;
       this.d = p4;
       super(p1, p2, p3);
    }
    public void d(int p0,Fragment p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       if (p1 instanceof CoverTextGroupFragment) {
          p1.m = this.d;
          b te = this.e;
          p1.k = te.H;
          p1.l = te.I;
          p1.o = te.K;
          p1.s = te.L;
       }
       return;
    }
}
