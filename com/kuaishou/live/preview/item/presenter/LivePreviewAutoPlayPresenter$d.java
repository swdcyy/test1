package com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$d;
import erd.g;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class LivePreviewAutoPlayPresenter$d implements g	// class@000dfd
{
    public final LivePreviewAutoPlayPresenter b;

    public void LivePreviewAutoPlayPresenter$d(LivePreviewAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewAutoPlayPresenter$d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.C().w("SlidePlayAutoPlay", "Ö±²¥¼ÇÊ±"+p0, objArray);
          LivePreviewAutoPlayPresenter v = this.b.v;
          if (p0 != null && !p0.longValue() - v) {
             p0 = this.b.p;
             if (p0 != null) {
                p0.L(0);
             }
          }
       }
       return;
    }
}
