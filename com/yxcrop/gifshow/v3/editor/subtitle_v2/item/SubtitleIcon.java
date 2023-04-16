package com.yxcrop.gifshow.v3.editor.subtitle_v2.item.SubtitleIcon;
import com.yxcorp.gifshow.v3.editor.item.EditIcon;
import ooc.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.item.PostBaseIcon;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import hnd.f;
import gnd.b;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import java.util.List;
import java.util.Collection;

public final class SubtitleIcon extends EditIcon	// class@000ae8
{

    public void SubtitleIcon(g p0,int p1,int p2){
       a.p(p0, "model");
       super(p0, p1, p2);
    }
    public int getOriginIconId(){
       EditorDelegate obj = PatchProxy.apply(null, this, SubtitleIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getEditorDelegate() == null) {
          return super.getOriginIconId();
       }
       try{
          obj = this.getEditorDelegate();
          a.o(obj, "editorDelegate");
          BaseFragment uBaseFragmen = obj.q();
          a.o(uBaseFragmen, "editorDelegate.previewFragment");
          if (b.a(uBaseFragmen).o0().i().isEmpty() ^ 0x01) {
             return this.getStatusIconByKey("HAS_CONTENT");
          }
          return super.getOriginIconId();
       }catch(java.lang.RuntimeException e0){
          return super.getOriginIconId();
       }
    }
}
