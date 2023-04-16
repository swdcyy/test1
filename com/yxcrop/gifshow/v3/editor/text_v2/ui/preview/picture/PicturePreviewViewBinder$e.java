package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$e;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder;
import uwc.b;
import java.lang.Object;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import androidx.fragment.app.Fragment;
import kod.a;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import android.app.Activity;
import kotlin.jvm.internal.a;
import ei0.a;

public final class PicturePreviewViewBinder$e implements Observer	// class@000b4a
{
    public final PicturePreviewViewBinder b;
    public final b c;

    public void PicturePreviewViewBinder$e(PicturePreviewViewBinder p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturePreviewViewBinder$e.class, "1")) {
       }else {
          Log.b("PicturePreviewViewBinder", "changeWorkspaceType: "+p0);
          f.l(this.b.R()).O0(this.b.R().getActivity(), p0, this.c.r0(), this.c.w0());
          PicturePreviewViewBinder$e tb = this.b;
          a.o(p0, "it");
          tb.s0(tb.v0(p0));
       }
       return;
    }
}
