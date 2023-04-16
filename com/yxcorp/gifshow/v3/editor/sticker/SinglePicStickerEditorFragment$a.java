package com.yxcorp.gifshow.v3.editor.sticker.SinglePicStickerEditorFragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.sticker.SinglePicStickerEditorFragment;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.sticker.d0;
import java.util.Map;
import java.util.HashMap;

public class SinglePicStickerEditorFragment$a implements g	// class@001205
{
    public SinglePicStickerEditorFragment b;
    public int c;
    public i d;
    public Set e;
    public List f;
    public a g;
    public PublishSubject h;
    public z i;
    public EditDecorationContainerView j;
    public final SinglePicStickerEditorFragment k;

    public void SinglePicStickerEditorFragment$a(SinglePicStickerEditorFragment p0){
       this.k = p0;
       super();
       this.c = 7;
       this.e = new HashSet();
       this.f = Lists.b();
       this.g = a.g();
       this.h = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SinglePicStickerEditorFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SinglePicStickerEditorFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SinglePicStickerEditorFragment$a.class, new d0());
       }else {
          obj.put(SinglePicStickerEditorFragment$a.class, null);
       }
       return obj;
    }
}
