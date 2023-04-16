package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$d;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class EditDecorationContainerViewV2$d implements Comparator	// class@000efb
{
    public static final EditDecorationContainerViewV2$d b;

    static {
       EditDecorationContainerViewV2$d.b = new EditDecorationContainerViewV2$d();
    }
    public void EditDecorationContainerViewV2$d(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EditDecorationContainerViewV2$d.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(p0, "o1");
          a.p(p1, "o2");
          i = p0.getLayerIndex() - p1.getLayerIndex();
       }
       return i;
    }
}
