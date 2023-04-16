package com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject$1;
import java.util.Comparator;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Object;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeEffectParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;

public class EditorSdk2V2$VideoEditorProject$1 implements Comparator	// class@0009f5
{
    public final EditorSdk2V2$VideoEditorProject this$0;

    public void EditorSdk2V2$VideoEditorProject$1(EditorSdk2V2$VideoEditorProject p0){
       this.this$0 = p0;
       super();
    }
    public int compare(Minecraft$TimeEffectParam p0,Minecraft$TimeEffectParam p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EditorSdk2V2$VideoEditorProject$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)(p0.range().start() - p1.range().start());
    }
    public int compare(Object p0,Object p1){
       return this.compare(p0, p1);
    }
}
