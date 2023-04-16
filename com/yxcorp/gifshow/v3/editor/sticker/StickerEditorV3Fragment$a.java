package com.yxcorp.gifshow.v3.editor.sticker.StickerEditorV3Fragment$a;
import itc.l0;
import com.yxcorp.gifshow.v3.editor.sticker.StickerEditorV3Fragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.sticker.h;
import java.util.Map;

public class StickerEditorV3Fragment$a extends l0	// class@001207
{
    public StickerEditorV3Fragment v;
    public final StickerEditorV3Fragment w;

    public void StickerEditorV3Fragment$a(StickerEditorV3Fragment p0){
       this.w = p0;
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerEditorV3Fragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, StickerEditorV3Fragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(StickerEditorV3Fragment$a.class, new h());
       }else {
          obj.put(StickerEditorV3Fragment$a.class, null);
       }
       return obj;
    }
}
