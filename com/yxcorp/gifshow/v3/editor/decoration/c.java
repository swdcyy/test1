package com.yxcorp.gifshow.v3.editor.decoration.c;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class c implements Comparator	// class@000f0c
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.getLayerIndex() - p1.getLayerIndex());
    }
}
