package com.yxcorp.gifshow.v3.editor.decoration.a;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class a implements Comparator	// class@000f0a
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.getLayerIndex() - p1.getLayerIndex());
    }
}
