package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$a;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$c;
import java.util.List;

public class StickerLibraryFragment$a extends b	// class@001295
{
    public final StickerGroupInfo d;
    public final StickerLibraryFragment e;

    public void StickerLibraryFragment$a(StickerLibraryFragment p0,PagerSlidingTabStrip$d p1,Class p2,Bundle p3,StickerGroupInfo p4){
       this.e = p0;
       this.d = p4;
       super(p1, p2, p3);
    }
    public void d(int p0,Fragment p1){
       StickerLibraryFragment$a uoa = StickerLibraryFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (p1 instanceof StickerGroupFragment) {
          StickerLibraryFragment$a te = this.e;
          StickerLibraryFragment e = te.E;
          p1.s = e.f;
          p1.l = e.b;
          p1.r = e.e;
          p1.k = this.d;
          p1.eh(te.J);
          p1.q = this.e.K;
       }
       return;
    }
}
