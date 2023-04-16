package com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper$b;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class MultiPicturePreviewHelper$b implements Comparator	// class@000ec4
{

    public void MultiPicturePreviewHelper$b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MultiPicturePreviewHelper$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p0.isSelected()), Integer.valueOf(p1.isSelected()));
    }
}
