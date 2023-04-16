package com.yxcorp.gifshow.v3.editor.cover.v1;
import erd.o;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import android.graphics.Bitmap;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.v3.editor.cover.y1;
import io.reactivex.g;
import t45.d;
import brd.z;

public final class v1 implements o	// class@000ee3
{
    public final VideoCoverEditorPresenter b;

    public void v1(VideoCoverEditorPresenter p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       v1 tb = this.b;
       Objects.requireNonNull(tb);
       Pair first = p0.first;
       Pair pair = first.first;
       Pair pair1 = first.second;
       p0 = p0.second;
       t ot = PatchProxy.applyThreeRefs(pair, pair1, p0, tb, VideoCoverEditorPresenter.class, "14");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new y1(tb, pair1, p0, pair)).observeOn(d.a);
       }
       return ot;
    }
}
