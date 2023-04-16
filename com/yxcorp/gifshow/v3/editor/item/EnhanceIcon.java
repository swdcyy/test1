package com.yxcorp.gifshow.v3.editor.item.EnhanceIcon;
import com.yxcorp.gifshow.v3.editor.item.EditIcon;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ooc.g;
import yvc.a;
import soc.j$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.item.PostBaseIcon;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import saa.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import android.widget.ImageView;

public final class EnhanceIcon extends EditIcon	// class@000fb1
{

    public void EnhanceIcon(EditorItemFunc p0,int p1,int p2){
       a.p(p0, "func");
       super(p0, p1, p2);
    }
    public void bindIconView(a p0,EditorItemFunc p1,j$b p2,EditorDelegate p3,Context p4){
       if (PatchProxy.isSupport(EnhanceIcon.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, EnhanceIcon.class, "1")) {
             return;
          }
       }
       a.p(p0, "item");
       a.p(p1, "model");
       a.p(p2, "holder");
       a.p(p3, "editorDelegate");
       a.p(p4, "context");
       super.bindIconView(p0, p1, p2, p3, p4);
       j$b b = p2.b;
       a.o(b, "holder.iconView");
       c uoc = p3.N();
       a.o(uoc, "editorDelegate.workspaceDraft");
       uoc = uoc.x0();
       boolean b1 = (uoc != null)? uoc.E(): 1;
       b.setSelected((b1 ^ 1));
       return;
    }
}
