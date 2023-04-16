package com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$frameChangeListener$1$onFrameChanged$1;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class MusicEditor$frameChangeListener$1$onFrameChanged$1 extends EditSdkAction	// class@001048
{

    public void MusicEditor$frameChangeListener$1$onFrameChanged$1(){
       super();
    }
    public List targetLoader(){
       Loader[] obj = PatchProxy.apply(null, this, MusicEditor$frameChangeListener$1$onFrameChanged$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Loader[]{Loader.Music};
       return CollectionsKt__CollectionsKt.P(obj);
    }
}
