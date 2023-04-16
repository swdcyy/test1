package com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$a;
import vpc.b;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment;
import java.lang.Object;
import com.kuaishou.edit.draft.CropOptions;
import vpc.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import qaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$b;
import java.util.HashMap;

public class PhotosCoverEditorV3Fragment$a implements b	// class@000e28
{
    public final PhotosCoverEditorV3Fragment a;

    public void PhotosCoverEditorV3Fragment$a(PhotosCoverEditorV3Fragment p0){
       this.a = p0;
       super();
    }
    public void a(int p0,CropOptions p1,CropOptions p2){
       a.e(this, p0, p1, p2);
    }
    public void b(int p0,String p1){
       if (PatchProxy.isSupport(PhotosCoverEditorV3Fragment$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, PhotosCoverEditorV3Fragment$a.class, "1")) {
          return;
       }
       if (!p0) {
          a uoa = this.a.t.N().s0();
          if (uoa == null || uoa.v() == null) {
             uoa.i = true;
          }
       }
       return;
    }
    public void c(){
       a.b(this);
    }
    public void d(HashMap p0,boolean p1){
       a.c(this, p0, p1);
    }
    public void e(){
       this.a.J.i = true;
    }
}
