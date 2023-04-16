package com.yxcorp.gifshow.v3.editor.sticker.k;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public final class k implements Comparator	// class@001267
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.getLayerIndex() - p1.getLayerIndex());
    }
}
