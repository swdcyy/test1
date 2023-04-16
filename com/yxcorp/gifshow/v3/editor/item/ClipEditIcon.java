package com.yxcorp.gifshow.v3.editor.item.ClipEditIcon;
import com.yxcorp.gifshow.v3.editor.item.EditIcon;
import ooc.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class ClipEditIcon extends EditIcon	// class@000faf
{
    public static final long serialVersionUID = 0x6ce3e3b4138e6422;

    public void ClipEditIcon(g p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public int getOriginTextId(){
       Object obj = PatchProxy.apply(null, this, ClipEditIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f100c90;
    }
}
