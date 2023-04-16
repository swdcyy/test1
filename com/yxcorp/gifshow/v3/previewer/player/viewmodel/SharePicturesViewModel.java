package com.yxcorp.gifshow.v3.previewer.player.viewmodel.SharePicturesViewModel;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import swc.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.player.a$a;
import yw8.b;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.lifecycle.LiveData;
import java.util.List;
import swc.d;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import faa.a;
import q87.c;
import di0.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.SharePicturesViewModel$getEditorPictureList$1;
import msd.p;
import di0.b$a;

public final class SharePicturesViewModel extends PicturesViewModel	// class@001606
{

    public void SharePicturesViewModel(f p0){
       a.p(p0, "picturesRepo");
       super(p0);
    }
    public void V(){
       if (PatchProxy.applyVoid(null, this, SharePicturesViewModel.class, "3")) {
          return;
       }
       b.a(this);
       this.u0().setValue(new AtomicBoolean(true));
       Object value = this.u0().getValue();
       a.m(value);
       value.set(false);
       return;
    }
    public void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SharePicturesViewModel.class, "1")) {
          return;
       }
       a.p(p0, "picturesInfoList");
       if (this.x0() instanceof d) {
          this.x0().g(p0);
       }else {
          i1.c(new RuntimeException("updatePictureWithoutDraft not support this method"));
       }
       Object[] objArray = new Object[0];
       a.D().w("SharePicturesViewModel", "updatePictureWithoutDraft", objArray);
       return;
    }
    public b l0(){
       Object obj = PatchProxy.apply(null, this, SharePicturesViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a.a(this.v0(), SharePicturesViewModel$getEditorPictureList$1.INSTANCE);
    }
}
