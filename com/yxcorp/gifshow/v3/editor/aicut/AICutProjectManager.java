package com.yxcorp.gifshow.v3.editor.aicut.AICutProjectManager;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import h69.b;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.aicut.AICutProjectManager$1;
import xvc.b;

public final class AICutProjectManager	// class@000da5
{

    public void AICutProjectManager(){
       super();
    }
    public static void a(EditorSdk2V2$VideoEditorProject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AICutProjectManager.class, "1")) {
          return;
       }
       d.a(-873393519).sU(p0, p1);
       return;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, AICutProjectManager.class, "5")) {
          return;
       }
       d.a(-873393519).release();
       return;
    }
    public static void c(float p0){
       AICutProjectManager uAICutProjec = AICutProjectManager.class;
       if (PatchProxy.isSupport(uAICutProjec) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), null, uAICutProjec, "4")) {
          return;
       }
       d.a(-873393519).P3((double)p0);
       return;
    }
    public static void d(EditorDelegate p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AICutProjectManager.class, "2")) {
          return;
       }
       f.l(p0.q()).t0(new AICutProjectManager$1());
       return;
    }
}
