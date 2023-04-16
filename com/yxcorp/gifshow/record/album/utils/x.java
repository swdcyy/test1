package com.yxcorp.gifshow.record.album.utils.x;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.Arrays;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Boolean;
import brd.a0;

public final class x implements o	// class@00177b
{
    public static final x b;

    static {
       x.b = new x();
    }
    public void x(){
       super();
    }
    public final Object apply(Object p0){
       int i;
       c uoc;
       Workspace$Type[] typeArray;
       p0 = p0.iterator();
       do {
          i = 1;
          int i1 = 0;
          if (p0.hasNext()) {
             uoc = p0.next();
             if (!uoc.E() && !DraftUtils.Y(uoc)) {
             }
          }else {
             i = false;
             break ;
          }
          typeArray = new Workspace$Type[3];
          typeArray[i1] = Workspace$Type.ATLAS;
          typeArray[i] = Workspace$Type.PHOTO_MOVIE;
          typeArray[2] = Workspace$Type.LONG_PICTURE;
       } while (Arrays.asList(typeArray).contains(uoc.a1()) && !DraftFileManager.E().H(uoc).exists());
       return a0.B(Boolean.valueOf(i));
    }
}
