package com.yxcorp.gifshow.v3.editor.sticker.l;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public final class l implements Comparator	// class@001269
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.getLayerIndex() - p1.getLayerIndex());
    }
}
