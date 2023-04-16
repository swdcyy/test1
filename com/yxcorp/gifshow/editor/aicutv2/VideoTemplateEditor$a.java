package com.yxcorp.gifshow.editor.aicutv2.VideoTemplateEditor$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.editor.aicutv2.VideoTemplateEditor;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dca.s;
import com.yxcorp.gifshow.v3.editor.j;
import jn9.b;
import com.yxcorp.gifshow.v3.editor.i;

public final class VideoTemplateEditor$a implements ViewModelProvider$Factory	// class@001b73
{
    public final VideoTemplateEditor a;

    public void VideoTemplateEditor$a(VideoTemplateEditor p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       VideoTemplateEditor obj = PatchProxy.applyOneRefs(p0, this, VideoTemplateEditor$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       obj = this.a.w;
       a.m(obj);
       j s = this.a.s;
       a.o(s, "mEditorHelperContract");
       return new s(obj, s);
    }
}
